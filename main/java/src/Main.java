package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Moy on ����03  003.
 */
@Configuration //���������SpringBoot�������࣬����ͨ�������ô���ԭ�е�XML���÷�ʽ
@EnableAutoConfiguration //����bean�Զ�ע��
@ComponentScan //�����Զ�����bean
public class Main extends WebMvcConfigurerAdapter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class);
    }
}