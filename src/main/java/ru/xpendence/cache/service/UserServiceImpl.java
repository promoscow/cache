package ru.xpendence.cache.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.xpendence.cache.domain.User;
import ru.xpendence.cache.repository.UserRepository;

import javax.persistence.EntityNotFoundException;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 31.08.19
 * Time: 10:56
 * e-mail: v.chernyshov@pflb.ru
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    @Cacheable("users")
    public User get(Long id) {
        log.info("getting user by id: {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found by id " + id));
    }
}
