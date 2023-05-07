package com.asmcm.moderation.comment.application.port.out.persistence;

import com.asmcm.moderation.comment.model.application.Comment;

import java.util.List;

public interface CommentsRepositoryPort {
        void save();
        List<String> getHateComments();

        void delete(Comment comment);
}
