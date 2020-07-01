package gau.nau.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gau.nau.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}


