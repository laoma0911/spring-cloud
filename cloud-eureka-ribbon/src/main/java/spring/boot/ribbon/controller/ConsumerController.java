package spring.boot.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spring.boot.ribbon.service.ConsumerService;

/**
 * Created by mazhenbang on 16/8/26.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String add() {
//        return restTemplate.getForEntity("http://compute-service/test?a=10&b=20", String.class).getBody();
        return consumerService.addService();
    }
}
