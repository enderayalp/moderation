package com.asmcm.moderation.comment.adapter.out.persistence;

import com.asmcm.moderation.comment.application.model.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommentsRepositoryImpl {
    private final CommentsRepository commentsRepository;

    public void delete(Comment comment) {

        //  commentsRepository.delete()
    }
}
