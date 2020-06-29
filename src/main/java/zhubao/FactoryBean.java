package zhubao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 1.数据在哪里
 * 2.处理数据（需要什么数据）
 * 3.得到数据
 * Created by Administrator on 2020/6/26.
 */

public class FactoryBean {
    private static Properties properties;
    static {
        properties = new Properties();
        InputStream in = FactoryBean.class.getClassLoader(). getResourceAsStream("bean.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String beanName){
        Object object=null;
        try {
            String str = properties.getProperty(beanName);
            Class c = Class.forName(str);
            object = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }


}
