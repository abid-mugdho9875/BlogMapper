package BlogMapper.BlogMapper.entity;

import jakarta.persistence.*;

@Entity
@Table(name="blogs")

public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;
    private  String title;
    private  String content;
    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }



    public void setId(Long id) {
        Id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
