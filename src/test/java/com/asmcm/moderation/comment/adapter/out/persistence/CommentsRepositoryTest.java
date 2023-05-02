package com.asmcm.moderation.comment.adapter.out.persistence;

import com.asmcm.moderation.comment.model.persistence.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CommentsRepositoryTest {
        @Autowired
        CommentsRepository commentsRepository;
        @Test
        void bekirHatKleineCükTest(){
            Comment comment = new Comment();
            String name = "bekirCükLecker";
            comment.setName(name);
            commentsRepository.save(comment);

            Optional<Comment> commentFromDatabase = commentsRepository.findById(comment.getId());

            assertThat(commentFromDatabase.get().getName()).isEqualTo(name);

            commentsRepository.flush();
            Comment comment2 = new Comment();
            comment2.setId(comment.getId());
            comment2.setName("BekirIstDochGöttLecker");

            commentsRepository.save(comment2);

            List<Comment> comments = commentsRepository.findAll();

            int i=0;
            i++;


        }
}