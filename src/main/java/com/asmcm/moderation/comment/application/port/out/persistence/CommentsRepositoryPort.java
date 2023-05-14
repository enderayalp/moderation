package com.asmcm.moderation.comment.application.port.out.persistence;

import com.asmcm.moderation.comment.application.model.Comment;

public interface CommentsRepositoryPort {

    void delete(Comment comment);
}
