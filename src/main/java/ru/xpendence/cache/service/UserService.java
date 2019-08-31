package ru.xpendence.cache.service;

import ru.xpendence.cache.domain.User;

import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 31.08.19
 * Time: 10:55
 * e-mail: slava_rossii@list.ru
 */
public interface UserService {

    User create(User user);

    User createOrReturnCached(User user);

    User createAndRefreshCache(User user);

    User create(String name, String email);

    User get(Long id);

    List<User> getAll();

    void delete(Long id);

    void deleteAndEvict(Long id);
}
