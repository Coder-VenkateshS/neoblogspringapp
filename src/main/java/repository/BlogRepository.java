package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import model.Blogs;

@Repository
public interface BlogRepository extends JpaRepository<Blogs, Long>{
	
}
