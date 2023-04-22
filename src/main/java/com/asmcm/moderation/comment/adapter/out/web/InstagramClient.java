package com.asmcm.moderation.comment.adapter.out.web;

import com.asmcm.moderation.comment.application.port.out.GetCommentsPort;
import com.asmcm.moderation.comment.model.application.Comment;

import java.util.Collections;
import java.util.List;

public class InstagramClient implements GetCommentsPort {
    @Override
    public List<Comment> getComments() {
        return Collections.emptyList();
    }
}
