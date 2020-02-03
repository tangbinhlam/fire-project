package edu.mum.cs544.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableDiscoveryClient
public class AppConfiguration {

    @Bean
   // @LoadBalanced //TODO check again
    RestTemplate registerRestTemplate() {
        return new RestTemplate();
    }
}
