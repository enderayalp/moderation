package com.asmcm.moderation.comment.adapter.out.persistence;

import com.asmcm.moderation.comment.application.port.out.persistence.CommentsRepositoryPort;
import com.asmcm.moderation.comment.model.persistence.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

//Mongodb imports
public interface CommentsRepository  extends JpaRepository<Comment, Long>, CommentsRepositoryPort{

}
