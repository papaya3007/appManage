package shirodemo;


import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.*;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.SimpleByteSource;
import sun.applet.Main;

public class shiroMD5 {
    String pwd = "hanyu";
    String salt = "123";
    //shiro提供的md5加密 加上salt进行混合更加难以破解
    String md5 = new Md5Hash(pwd, salt).toString();

    String shamd5 = new Sha256Hash(pwd, salt).toString();

    String simpleHash = new SimpleHash("SHA-1", pwd, salt).toString();

    public static void main(String[] args) {
        //shiro提供的hashservice
        DefaultHashService hashService = new DefaultHashService();
        //默认的算法为sha-512
        //algorithm 算法
        hashService.setHashAlgorithmName("SHA-512");
        //private salt 私盐 用于和密码组合加强密码加密强度 默认为无
        hashService.setPrivateSalt(new SimpleByteSource("123"));
        //是否生成公盐 默认为false
        hashService.setGeneratePublicSalt(true);
        //默认的生成公盐
        hashService.setRandomNumberGenerator(new SecureRandomNumberGenerator());
        //hash值的迭代次数 加密次数
        hashService.setHashIterations(2);



        //创建一个hashrequest 来传入算法 迭代次数 盐
        HashRequest hashRequest = new HashRequest.Builder().setAlgorithmName("MD5").setSource(ByteSource.Util.bytes("hanyu")).setIterations(2).setSalt(ByteSource.Util.bytes("234")).build();

        String hex = hashService.computeHash(hashRequest).toHex();
        System.out.println(hex);
        HashRequest hashRequest1 = new HashRequest.Builder().setAlgorithmName("SHA-1").setSource(ByteSource.Util.bytes("hanyu")).setIterations(1).setSalt(ByteSource.Util.bytes("234")).build();
        String hex1 = hashService.computeHash(hashRequest1).toHex();
        System.out.println(hex1);

    }
}
