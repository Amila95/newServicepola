package com.servicepola.version_2.repositaries;

import com.servicepola.version_2.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
