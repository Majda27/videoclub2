package formation.sopra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formation.sopra.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
	
	

}
