import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by h on 16/8/24.
 */

@RestController
@EnableAutoConfiguration
public class Application {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);

        // Spring Boot 所提供的配置优先级顺序
        /**
         *
           1. 命令行参数。
           2. 通过 System.getProperties() 获取的 Java 系统参数。
           3. 操作系统环境变量。
           4. 从 java:comp/env 得到的 JNDI 属性。
           5. 通过 RandomValuePropertySource 生成的“random.*”属性。
           6. 应用 Jar 文件之外的属性文件。
           7. 应用 Jar 文件内部的属性文件。
           8. 在应用配置 Java 类（包含“@Configuration”注解的 Java 类）中通过“@PropertySource”注解声明的属性文件。
           9. 通过“SpringApplication.setDefaultProperties”声明的默认属性。
         *
         **/
    }
}
