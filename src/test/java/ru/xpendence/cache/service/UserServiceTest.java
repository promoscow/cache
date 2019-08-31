package ru.xpendence.cache.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.xpendence.cache.AbstractTest;
import ru.xpendence.cache.domain.User;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 31.08.19
 * Time: 10:59
 * e-mail: slava_rossii@list.ru
 */
@Slf4j
public class UserServiceTest extends AbstractTest {

    @Autowired
    private UserService service;

    private User user1;
    private User user2;

    @Before
    public void init() {
        user1 = service.create(new User("Vasya", "vasya@mail.ru"));
        user2 = service.create(new User("Kolya", "kolya@mail.ru"));
    }

    @Test
    public void get() {
        getAndPrint(user1.getId());
        getAndPrint(user2.getId());
        getAndPrint(user1.getId());
        getAndPrint(user2.getId());
    }

    private void getAndPrint(Long id) {
        log.info("user found: {}", service.get(id));
    }
}
