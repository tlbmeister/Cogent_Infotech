package cogent.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{

}
