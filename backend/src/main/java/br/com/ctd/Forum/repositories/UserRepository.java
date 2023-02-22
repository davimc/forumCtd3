package br.com.ctd.Forum.repositories;

import br.com.ctd.Forum.entities.SamplePost;
import br.com.ctd.Forum.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
