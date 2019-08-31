package ru.xpendence.cache.service;

import ru.xpendence.cache.domain.User;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 31.08.19
 * Time: 10:55
 * e-mail: slava_rossii@list.ru
 */
public interface UserService {

    User create(User user);

    User get(Long id);
}
