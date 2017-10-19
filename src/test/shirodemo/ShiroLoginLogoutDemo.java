package shirodemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;

import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

public class ShiroLoginLogoutDemo {
    //shiro身份验证测试类
    //1 获取securitymanager 工厂
    private Logger logger = LogManager.getLogger(ShiroLoginLogoutDemo.class);

    /*Subject 可以理解为一个机场安检的盒子 所有东西必须放入盒子后才能进入下一步的安检程序
    * */

    @Test
    public void shiroTest() {

        logger.info("shiro学习demo");

        //获取shiro工厂
        //要注意导入的包SecurityManager要导入的是shiro包 而不是java。lang。securityManager
        //使用IniSecurityManagerFactory导入shiro的ini配置文件
        Factory<SecurityManager> factory =  new IniSecurityManagerFactory("F:/giteeProject/appManage/src/main/resources/shiro-realam.ini");

        //通过反射实例创建SecurityManager实例
        SecurityManager securityManager = factory.getInstance();

        //保存的静态内存区，单例模式
        //到这里shiro的基本设置好了
        SecurityUtils.setSecurityManager(securityManager);

        //谁是合法的用户又或者合法的用户可以做些什么？
        //在shiro里合法的用户使用subject这个概念进行封装
        //s使用securityUtils.getSubject 我们可以获取当前正在运行subject
        Subject currentUser = SecurityUtils.getSubject();

        //但你有了subject后就可以获取他的session了
        //需要注意的是shiro的session不需要http 环境 像这个项目不需要部署到服务器上也能用
        Session session = currentUser.getSession();
        session.setAttribute("key", "value");

        //接下对用户进行认证
        if(!currentUser.isAuthenticated()){
            //如果用户还未认证（还未登陆） 进行认证
            //username和password 即 ini配置文件里设置 后期我们直接使用数据库里的
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("lonestarr", "vespa");

            //记住我 认证成功后记住用户信息避免用户需要重复登陆
            usernamePasswordToken.setRememberMe(true);

            //用户登陆  需要对登陆进行异常处理 如登陆失败
            try {
                currentUser.login(usernamePasswordToken);
            } catch (UnknownAccountException e) {
                //未知账号异常 用户名不存在异常
                e.printStackTrace();
            } catch (IncorrectCredentialsException e) {
                //密码不匹配异常
                e.printStackTrace();
            } catch (AuthenticationException e) {
                //意外错误发生
                e.printStackTrace();
            }
            logger.info( "User [" + currentUser.getPrincipal() + "] logged in successfully." );

        }
        //登陆成功后我们可以对用户进行角色认证
        if(currentUser.hasRole("schwartz")){
            logger.info("schwartz with you...");

        }else{
            logger.info("hack!!!");
        }

        //test a typed permission (not instance-level)
        //用户权限查看
        if (currentUser.isPermitted("lightsaber:weild")) {
            logger.info("用户有");
        } else {
            logger.info("对不起你的权限不狗.");
        }

        //a (very powerful) Instance Level permission:
        //最高权限
        if (currentUser.isPermitted("winnebago:drive:eagle5")) {
            logger.info("You are permitted to 'drive' the winnebago with license plate (id) 'eagle5'.  " +
                    "Here are the keys - have fun!");
        } else {
            logger.info("Sorry, you aren't allowed to drive the 'eagle5' winnebago!");
        }

        //all done - log out!
        currentUser.logout();

        System.exit(0);
    }
}
