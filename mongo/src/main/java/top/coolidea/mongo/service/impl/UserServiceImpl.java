package top.coolidea.mongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.coolidea.mongo.entity.User;
import top.coolidea.mongo.repository.UserRepository;
import top.coolidea.mongo.service.UserService;

import java.util.Iterator;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    private Pageable pageable = PageRequest.of(0,10);

    @Override
    public void createIndex() {

    }

    @Override
    public void deleteIndex(String index) {

    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void saveAll(List<User> list) {
        userRepository.saveAll(list);
    }

    @Override
    public Iterator<User> findAll() {
        return userRepository.findAll().iterator();
    }

    @Override
    public Page<User> query(String key) {
        return userRepository.findByUserName(key,pageable);
    }
}
