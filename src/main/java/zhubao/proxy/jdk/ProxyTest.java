package zhubao.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2020/6/26.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Advice advice = new Advice();
        Target target = new Target();
        //返回值 就是动态代理生成的代理对象
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),//目标对象类加载器
                target.getClass().getInterfaces(),  //目标对象相同的接口字节码对象数组
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强
                        advice.before();
                      Object invoke = method.invoke(target,args);//执行目标方法
                        return invoke;
                    }
                });

        proxy.save();
    }
}
