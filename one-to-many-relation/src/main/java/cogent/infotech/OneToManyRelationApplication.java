package cogent.infotech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.entity.Comment;
import cogent.infotech.entity.Post;
import cogent.infotech.repository.PostRepository;

@SpringBootApplication
public class OneToManyRelationApplication implements CommandLineRunner{
	
	@Autowired
	PostRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyRelationApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		
		Post post=new Post("Cogent Infotech","Cogent Infotech is IT company");
		
		Comment comment1=new Comment("Good IT company");
		Comment comment2=new Comment("Its also a university known as Cogent University");
		Comment comment3=new Comment("Informative");
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		repository.save(post);
		System.out.println("Post saved.");
	}

}
