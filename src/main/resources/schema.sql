    create table article (
        id bigint not null,
        main_title varchar(255),
        sub_title varchar(255),
        content text,
        author varchar(255),
        create_date date,
        update_date date,
        primary key (id)
    );

    comment on table article is '게시글 정보';

    comment on column article.id is '게시글 아이디';

    comment on column article.main_title is '게시글 제목';

    comment on column article.sub_title is '게시글 부제목';

    comment on column article.content is '게시글 본문';

    comment on column article.author is '작성자';

    comment on column article.create_date is '작성일자';

    comment on column article.update_date is '수정일자';
