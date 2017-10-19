package shirodemo;
//自定义个人realm

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

public class MyRealm implements Realm {
    @Override
    //返回realm的名字 类似bean id
    public String getName() {
        return "MyRealm";
    }

    @Override
    //判断realm是否支持token
    public boolean supports(AuthenticationToken authenticationToken) {
        //仅支持UsernamePasswordToken类型的Token
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    //根据token获取认证信息
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username =(String)authenticationToken.getPrincipal();//获取用户名
        String password =(String)authenticationToken.getCredentials();//获取密码
        if (!"lonestarr".equals(username)) {
            throw new UnknownAccountException();
        }
        if (!"vespa".equals(password)) {
            throw new IncorrectCredentialsException();
        }
        //如果成功返回一个authenticcationinfo实现
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
