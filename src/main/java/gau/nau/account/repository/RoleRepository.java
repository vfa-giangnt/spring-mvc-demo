package gau.nau.account.repository;

import gau.nau.account.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

interface RoleRepository extends JpaRepository<Role, Long> {
}
