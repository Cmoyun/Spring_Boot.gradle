package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Moy on 六月03  003.
 */
@Configuration //标明这个是SpringBoot的配置类，可以通过类配置代替原有的XML配置方式
@EnableAutoConfiguration //启动bean自动注入
@ComponentScan //启动自动搜索bean
public class Main extends WebMvcConfigurerAdapter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class);
    }
}