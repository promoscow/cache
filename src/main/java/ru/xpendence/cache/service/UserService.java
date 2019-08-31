package ru.xpendence.cache.service;

import ru.xpendence.cache.domain.User;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 31.08.19
 * Time: 10:55
 * e-mail: v.chernyshov@pflb.ru
 */
public interface UserService {

    User create(User user);

    User get(Long id);
}
