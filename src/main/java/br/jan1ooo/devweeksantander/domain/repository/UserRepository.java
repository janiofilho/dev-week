package br.jan1ooo.devweeksantander.domain.repository;

import br.jan1ooo.devweeksantander.domain.model.Account;
import br.jan1ooo.devweeksantander.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByAccount(Account account);
}
