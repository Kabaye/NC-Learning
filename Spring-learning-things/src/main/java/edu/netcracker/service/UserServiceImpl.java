package edu.netcracker.service;

import edu.netcracker.entity.User;
import edu.netcracker.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author svku0919
 * @version 07/12/2023-12:42
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveAll(List<User> users) {
        List<User> createdUsers = new ArrayList<>();
        for (User user : users) {
            createdUsers.add(save(user));
        }
        return createdUsers;
    }

}
