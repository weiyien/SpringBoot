package top.coolidea.mongo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.coolidea.mongo.entity.User;
import top.coolidea.mongo.service.UserService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("init")
    public void init() {
        // userService.createIndex();
        List<User> userList = new ArrayList<>();
        userList.add(User.builder().id(1L).userName("李雷").password("李雷是个男孩子").build());
        userList.add(User.builder().id(2L).userName("韩梅梅").password("韩梅梅是个女孩子").build());
        userService.saveAll(userList);
    }

    @GetMapping("all")
    public Iterator<User> all() {
        return userService.findAll();
    }

    @GetMapping("search/{content}")
    public Page<User> search(@PathVariable String content) {
        return userService.query(content);
    }
}
