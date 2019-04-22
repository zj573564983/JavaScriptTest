package annotation;

import java.lang.reflect.Method;

/***
 * 测试注解的使用
 * @author zhangjie
 * @date 2019/4/22 10:09
 */
@MyAnno(className = "reflect.Person",methodName = "study")
public class AnnoDemo1 {
    //这个就跟reflect.ReflectTest是一样的，只是使用了注解替换了配置文件
    public static void main(String[] args) throws Exception {
        //解析注解
        Class<AnnoDemo1> annoDemo1Class = AnnoDemo1.class;
        //获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        MyAnno annotation = annoDemo1Class.getAnnotation(MyAnno.class);
        //调用注解对象中定义的抽象方法，获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();

        //加载该类进内存
        Class cla=Class.forName(className);
        //创建对象
        Object obj = cla.newInstance();
        //获取方法对象
        Method method=cla.getMethod(methodName);
        method.invoke(obj);
    }
}
