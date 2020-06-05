package top.coolidea.es;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.coolidea.es.controller.UserController;
@RunWith(SpringRunner.class)
@SpringBootTest
class EsApplicationTests {
    @Autowired
    private UserController userController;
    @Test
    void contextLoads() {
        userController.init();
        System.out.println(userController.all());
        System.out.println(userController.search("男"));
        System.out.println("");
        System.out.println(userController.search("孩子"));
        System.out.println();
        System.out.println(userController.search("女孩子"));
    }

}
