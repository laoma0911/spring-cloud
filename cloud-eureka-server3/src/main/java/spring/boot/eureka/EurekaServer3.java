package spring.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by mazhenbang on 16/8/26.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer3 {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaServer3.class, args);
    }
}
