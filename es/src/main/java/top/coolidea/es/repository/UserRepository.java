package top.coolidea.es.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.coolidea.es.entity.User;

public interface UserRepository extends ElasticsearchRepository<User,Long> {
    Page<User> findByUserName(String key,Pageable pageable);

    Page<User> findByPassword(String key, Pageable pageable);
}
