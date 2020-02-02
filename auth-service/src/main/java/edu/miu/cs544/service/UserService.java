package edu.miu.cs544.service;

import edu.miu.cs544.dao.UserJpaRepository;
import edu.miu.cs544.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserJpaRepository userDao;

    public User createUser(User user) {
        return this.userDao.save(user);
    }

    public User readUser(String userName) {
        return this.userDao.findByUsername(userName);
    }

    public List<User> findAll() {
        return this.userDao.findAll();
    }

}
