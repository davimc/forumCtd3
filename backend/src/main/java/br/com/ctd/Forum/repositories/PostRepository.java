package br.com.ctd.Forum.repositories;

import br.com.ctd.Forum.entities.SamplePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<SamplePost, Long> {
}
