package com.servicepola.version_2.repositaries;

import com.servicepola.version_2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
