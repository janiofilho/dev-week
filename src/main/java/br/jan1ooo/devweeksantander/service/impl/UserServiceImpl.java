package br.jan1ooo.devweeksantander.service.impl;

import br.jan1ooo.devweeksantander.domain.model.User;
import br.jan1ooo.devweeksantander.domain.repository.UserRepository;
import br.jan1ooo.devweeksantander.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccount(user.getAccount())){
            throw new IllegalArgumentException("This Account already exists.");
        }
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
