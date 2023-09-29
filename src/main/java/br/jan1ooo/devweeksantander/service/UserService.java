package br.jan1ooo.devweeksantander.service;

import br.jan1ooo.devweeksantander.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User user);

    List<User> findAll();

}
