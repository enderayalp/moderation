package com.asmcm.moderation.comment.application.port.out;

import com.asmcm.moderation.comment.model.application.Comment;

import java.util.List;

public interface GetCommentsPort {
    List<Comment> getComments();
}
