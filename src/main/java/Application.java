import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhu on 2017/11/8.
 */
@RestController
@SpringBootApplication
@ComponentScan({"com.xuhu.demo"})
@MapperScan(basePackages = {"com.xuhu.demo.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello world!";
    }
}
