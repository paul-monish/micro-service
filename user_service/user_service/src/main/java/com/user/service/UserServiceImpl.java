package com.user.service;

import com.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users=List.of(
            new User(1L,"monish","12345"),
            new User(2L,"monish1","12346"),
            new User(3L,"monish2","12347")
    );
    @Override
    public User getUserById(Long id) {
        return users.stream().filter(user->user.getId().equals(id)).findAny().orElse(null);
    }
}
