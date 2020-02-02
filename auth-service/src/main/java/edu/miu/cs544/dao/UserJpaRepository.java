package edu.miu.cs544.dao;

import edu.miu.cs544.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Integer> {
    User findByUsername(String userName);
}
