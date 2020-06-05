package top.coolidea.es.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "demo")
public class User {
    @Id
    private Long id;
    @Field(type = FieldType.Keyword)
    private String userName;
    @Field(type = FieldType.Keyword,analyzer = "ik_max_word")
    private String password;
}
