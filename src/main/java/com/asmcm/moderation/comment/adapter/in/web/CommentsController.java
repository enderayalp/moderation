package com.asmcm.moderation.comment.adapter.in.web;

import com.asmcm.moderation.comment.application.model.Account;
import com.asmcm.moderation.comment.application.model.Comment;
import com.asmcm.moderation.comment.application.model.CommentFilter;
import com.asmcm.moderation.comment.application.port.in.DeleteCommentsUseCase;
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
