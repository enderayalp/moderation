package com.asmcm.moderation.comment.application.port.in;

import com.asmcm.moderation.comment.model.application.Account;
import com.asmcm.moderation.comment.model.application.Comment;
import com.asmcm.moderation.comment.model.application.CommentFilter;

import java.util.List;

public interface DeleteCommentsUseCase {

    List<Comment> deleteComments(Account account, double postId,  CommentFilter commentFilter);
}
