package com.asmcm.moderation.chatgpt.application.service;

import com.asmcm.moderation.chatgpt.application.port.in.RateCommentsUseCase;
import org.openapitools.model.CreateCompletionResponse;
import reactor.core.publisher.Flux;

import java.util.List;

public class RateCommentsService implements RateCommentsUseCase {
    @Override
    public Flux<CreateCompletionResponse> rateComments(List<String> comments) {
        return null;
    }
}
