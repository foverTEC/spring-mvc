package zhubao.controller1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2020/6/23.
 */
@Configuration
public class Config {

    @Bean
    public User user(){
        return new User();
    }

}
