package BlogMapper.BlogMapper.mapper;


import BlogMapper.BlogMapper.dto.BlogDTO;
import BlogMapper.BlogMapper.entity.BlogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BlogMapper {
    BlogMapper INSTANCE = Mappers.getMapper(BlogMapper.class);
    BlogEntity toEntity(BlogDTO dto);
    BlogDTO toDTO(BlogEntity entity);
}
