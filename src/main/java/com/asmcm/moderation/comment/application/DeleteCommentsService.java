package com.asmcm.moderation.comment.application;

import com.asmcm.moderation.comment.application.port.in.DeleteCommentsUseCase;
import com.asmcm.moderation.comment.model.application.Account;
import com.asmcm.moderation.comment.model.application.Comment;
import com.asmcm.moderation.comment.model.application.CommentFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DeleteCommentsService implements DeleteCommentsUseCase {

    private final GetCommentsService getCommentsService;

    @Override
    public List<Comment> deleteComments(Account account, double postId, CommentFilter commentFilter) {
    //    getCommentsService.getComments();
        //Call ChatGPT with comments in order to get rating over comments
        //Delete negative comments according the CommentFilter
        return Collections.emptyList();
    }
}
