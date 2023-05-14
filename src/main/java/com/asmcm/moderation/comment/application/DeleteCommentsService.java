package com.asmcm.moderation.comment.application;

import com.asmcm.moderation.comment.application.model.Account;
import com.asmcm.moderation.comment.application.model.Comment;
import com.asmcm.moderation.comment.application.model.CommentFilter;
import com.asmcm.moderation.comment.application.port.in.DeleteCommentsUseCase;
import com.asmcm.moderation.comment.application.port.out.persistence.CommentsRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DeleteCommentsService implements DeleteCommentsUseCase {

    private final GetCommentsService getCommentsService;
    private final CommentsRepositoryPort commentsRepositoryPort;

    @Override
    public List<Comment> deleteComments(Account account, double postId, CommentFilter commentFilter) {
        //getCommentsService.getComments(); instagram client
        //Call ChatGPT with comments in order to get rating over comments
        //Delete negative comments according the CommentFilter
        commentsRepositoryPort.delete(new Comment());
        return Collections.emptyList();
    }


}
