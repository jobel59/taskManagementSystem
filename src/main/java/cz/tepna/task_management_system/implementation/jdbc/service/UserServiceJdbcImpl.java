package cz.tepna.task_management_system.implementation.jdbc.service;

import cz.tepna.task_management_system.api.UserService;
import cz.tepna.task_management_system.api.request.UserAddRequest;
import cz.tepna.task_management_system.domain.User;
import cz.tepna.task_management_system.implementation.jdbc.repository.UserJdbcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceJdbcImpl implements UserService {
private final UserJdbcRepository userJdbcRepository;

    public UserServiceJdbcImpl(UserJdbcRepository userJdbcRepository) {
        this.userJdbcRepository = userJdbcRepository;
    }

    @Override
    public long add(UserAddRequest request) {
        return 0;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return userJdbcRepository.getAll();
    }
}
