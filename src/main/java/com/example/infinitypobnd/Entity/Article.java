package com.example.infinitypobnd.Entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Data
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자를 생성하며, 영속성을 지키기 위해 protected 설정
@AllArgsConstructor // 전체 필드에 대한 생성자를 생성하며, @Builder를 사용할 수 있게 한다.
@Table(name = "article")
public class Article {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "main_title", nullable = false)
    private String mainTitle;

    @Column(name = "sub_title")
    private String subTitle;

    @Column(name = "content")
    private String content;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "create_date")
    @CreatedDate
    private LocalDateTime createDate;

    @Column(name = "update_date")
    @LastModifiedDate
    private LocalDateTime updateDate;

}
