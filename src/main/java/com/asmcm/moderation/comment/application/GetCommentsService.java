package com.asmcm.moderation.comment.application;

import com.asmcm.moderation.comment.application.port.out.web.GetCommentsPort;


import com.asmcm.moderation.comment.model.application.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetCommentsService {
    private final GetCommentsPort getCommentsPort;
     List<Comment> getComments(){
         return getCommentsPort.getComments();
     }
}
