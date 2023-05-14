package com.asmcm.moderation.comment.application.port.out.web;

import com.asmcm.moderation.comment.application.model.Comment;

import java.util.List;

public interface GetCommentsPort {
    List<Comment> getComments();
}
