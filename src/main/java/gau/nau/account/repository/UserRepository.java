package gau.nau.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gau.nau.account.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
