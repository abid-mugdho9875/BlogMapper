package BlogMapper.BlogMapper.repository;


import BlogMapper.BlogMapper.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {
}
