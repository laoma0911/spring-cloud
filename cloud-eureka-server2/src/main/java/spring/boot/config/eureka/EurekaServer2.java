package spring.boot.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by mazhenbang on 16/8/26.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2 {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaServer2.class, args);
    }
}
