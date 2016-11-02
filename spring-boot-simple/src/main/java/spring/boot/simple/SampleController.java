package spring.boot.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mazhenbang on 16/8/24.
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class SampleController {

    

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/test")
    public String home(@RequestParam String a, @RequestParam String b) {


        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("***" + instance.getHost() + "***");
        System.out.println("***" + instance.getServiceId() + "***");
        System.out.println("***" + instance.getMetadata() + "***");
        System.out.println("***" + instance.getPort() + "***");
        System.out.println("***" + instance.getUri() + "***");


        System.out.println("=============================");
        System.out.println(a);
        System.out.println(b);


        return a + b;
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}
