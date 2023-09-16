package BlogMapper.BlogMapper.controller;

import BlogMapper.BlogMapper.dto.BlogDTO;
import BlogMapper.BlogMapper.entity.BlogEntity;
import BlogMapper.BlogMapper.mapper.BlogMapper;
import BlogMapper.BlogMapper.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
    private final BlogRepository blogRepository;

    @Autowired
    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @PostMapping
    public BlogDTO createBlog(@RequestBody BlogDTO dto) {
        BlogEntity entity = BlogMapper.INSTANCE.toEntity(dto);
        entity = blogRepository.save(entity);
        return BlogMapper.INSTANCE.toDTO(entity);
    }

   @GetMapping("/{id}")
    public BlogDTO getBlog(@PathVariable Long id) {
        BlogEntity entity = blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found"));
        return BlogMapper.INSTANCE.toDTO(entity);
    }
}
