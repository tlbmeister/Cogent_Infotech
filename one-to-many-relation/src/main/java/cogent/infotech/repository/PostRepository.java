package cogent.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long>{

}
