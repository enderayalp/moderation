package com.asmcm.moderation.chatgpt.application.port.out;

import org.openapitools.model.CreateCompletionResponse;
import reactor.core.publisher.Flux;

import java.util.List;

public interface RateCommentsPort {
    Flux<CreateCompletionResponse> rateComments(List<String> comments);
}
