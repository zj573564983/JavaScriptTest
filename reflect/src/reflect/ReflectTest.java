package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest{
    public static void main(String[] args) throws Exception {

        //创建properties对象
        Properties pro=new Properties();
        //加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        ClassLoader classLoader=ReflectTest.class.getClassLoader();
        InputStream inputStream=classLoader.getResourceAsStream("pro.properties");
        pro.load(inputStream);

        //获取配置文件中定义的数据
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");

        //加载该类进内存
        Class cla=Class.forName(className);
        //创建对象
        Object obj = cla.newInstance();
        //获取方法对象
        Method method=cla.getMethod(methodName);
        method.invoke(obj);

    }
}