package edu.miu.cs544.cofig;

import edu.miu.cs544.dao.UserJpaRepository;
import edu.miu.cs544.domain.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = UserJpaRepository.class)
@EntityScan(basePackageClasses = User.class)
@EnableDiscoveryClient
public class UserConfiguration {

}
