package io.github.lmikoto.pattern;

import io.github.lmikoto.pattern.factory.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author liuyang
 * 2020-04-28 19:56
 */
@SpringBootTest
public class Factor {

    @Autowired
    private User user;

    @Test
    public void name(){
        System.out.println(user.getName());
    }
}
