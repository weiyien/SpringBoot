package top.coolidea.mongo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import top.coolidea.mongo.entity.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User,Long> {
    Page<User> findByUserName(String key,Pageable pageable);

    Page<User> findByPassword(String key, Pageable pageable);
    List<User> getById(Long id);
}
