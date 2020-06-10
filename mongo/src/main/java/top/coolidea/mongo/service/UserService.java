package top.coolidea.mongo.service;

import org.springframework.data.domain.Page;
import top.coolidea.mongo.entity.User;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    void createIndex();

    void deleteIndex(String index);

    void save(User user);

    void saveAll(List<User> list);

    Iterator<User> findAll();

    Page<User> query(String key);
}
