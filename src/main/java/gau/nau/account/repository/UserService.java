package gau.nau.account.repository;

import gau.nau.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
