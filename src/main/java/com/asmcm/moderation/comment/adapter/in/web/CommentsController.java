package com.asmcm.moderation.comment.adapter.in.web;

import com.asmcm.moderation.comment.application.port.in.DeleteCommentsUseCase;
import com.asmcm.moderation.comment.model.application.Account;
import com.asmcm.moderation.comment.model.application.Comment;
import com.asmcm.moderation.comment.model.application.CommentFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommentsController {

    private final DeleteCommentsUseCase deleteCommentsUseCase;

    @DeleteMapping
    public List<Comment> deleteComments(Account account, double postId, CommentFilter commentFilter) {
        deleteCommentsUseCase.deleteComments(account, postId, commentFilter);
        return Collections.emptyList();
    }
}
