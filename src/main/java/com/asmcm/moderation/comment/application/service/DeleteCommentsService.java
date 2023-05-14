package com.asmcm.moderation.comment.application.service;

import com.asmcm.moderation.comment.application.port.in.DeleteCommentsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeleteCommentsService implements DeleteCommentsUseCase {

    private final GetCommentsService getCommentsService;
    //hier ein event auslösen und in chatgpt auf das event mit einem handler reagieren
    // private final CommentsRepositoryPort commentsRepositoryPort;
    //hier ein event auslösen und in chatgpt auf das event mit einem handler reagieren
    //private final RateCommentsPort rateCommentsPort;


    @Override
    public void deleteComments(List<String> comments) {
        //getCommentsService.getComments(); instagram client
        //Call ChatGPT with comments in order to get rating over comments
        //Delete negative comments according the CommentFilter
        //event auslösen
        // Flux<String> ratedComments = rateCommentsPort.rateComments(comments);
        // commentsRepositoryPort.delete(null);
    }


}
