package ru.xpendence.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.xpendence.cache.domain.User;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 31.08.19
 * Time: 10:55
 * e-mail: v.chernyshov@pflb.ru
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
