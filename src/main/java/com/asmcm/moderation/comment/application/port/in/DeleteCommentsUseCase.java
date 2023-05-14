package com.asmcm.moderation.comment.application.port.in;

import com.asmcm.moderation.comment.application.model.Account;
import com.asmcm.moderation.comment.application.model.Comment;
import com.asmcm.moderation.comment.application.model.CommentFilter;

import java.util.List;

public interface DeleteCommentsUseCase {

    List<Comment> deleteComments(Account account, double postId, CommentFilter commentFilter);
}
