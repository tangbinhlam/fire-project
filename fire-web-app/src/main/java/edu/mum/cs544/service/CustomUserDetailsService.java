package edu.mum.cs544.service;

import com.netflix.discovery.EurekaClient;
import edu.mum.cs544.domain.CustomUserDetails;
import edu.mum.cs544.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.client.RestTemplate;

public class CustomUserDetailsService implements UserDetailsService {

    private RestTemplate restTemplate;
    private EurekaClient eurekaClient;

    public CustomUserDetailsService(RestTemplate restTemplate, EurekaClient eurekaClient) {
        this.restTemplate = restTemplate;
        this.eurekaClient = eurekaClient;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = restTemplate.getForObject(getUrl() + "users/{0}", User.class, userName);
        return new CustomUserDetails(user);
    }

    public String getUrl() {
        return this.eurekaClient.getNextServerFromEureka("auth-fire-service", false).getHomePageUrl();
    }
}
