package com.asmcm.moderation.chatgpt.application.port.in;

import org.openapitools.model.CreateCompletionResponse;
import reactor.core.publisher.Flux;

import java.util.List;

public interface RateCommentsUseCase {
    Flux<CreateCompletionResponse> rateComments(List<String> comments);
}
