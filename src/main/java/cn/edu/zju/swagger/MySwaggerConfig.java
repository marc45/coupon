package cn.edu.zju.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by succe on 2018/1/9.
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"cn.edu.zju.controller"})
public class MySwaggerConfig {

    @Bean
    public Docket customDocket() {
        //
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

     private ApiInfo apiInfo() {
         return new ApiInfoBuilder()
                 .title("API Test  ")
                 .description("MyAPITest Description")
                 .contact(new Contact("haoyifen", "http://blog.csdn.net/haoyifen", "haoyifen@yy.com"))
                 .license("Apache 2.0")
                 .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                 .version("1.0.0")
                 .build();
     }
}
