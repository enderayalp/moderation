package com.asmcm.moderation.comment.adapter.in.web;

import com.asmcm.moderation.comment.application.model.Comment;
import com.asmcm.moderation.comment.application.port.in.DeleteCommentsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("comments")
public class CommentsController {

    private final DeleteCommentsUseCase deleteCommentsUseCase;

    @DeleteMapping
    public List<Comment> delete(@RequestBody List<String> comments) {
        deleteCommentsUseCase.deleteComments(comments);
        return Collections.emptyList();
    }
}
