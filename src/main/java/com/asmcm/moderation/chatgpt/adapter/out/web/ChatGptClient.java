package com.asmcm.moderation.chatgpt.adapter.out.web;


import com.asmcm.moderation.chatgpt.application.port.out.RateCommentsPort;
import org.openapitools.model.CreateCompletionResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public class ChatGptClient implements RateCommentsPort {
    private final WebClient webClient;

    @Value("${moderation.chat-gpt.bearer-token}")
    private String token;

    @Value("${moderation.chat-gpt.baseUrl}")
    private String baseUrl;

    @Value("${moderation.chat-gpt.uri}")
    private String uri;


    public ChatGptClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(baseUrl).build();
    }

    public Flux<CreateCompletionResponse> rateComments(List<String> comments) {
        return webClient.get()
                .uri(uri)
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToFlux(CreateCompletionResponse.class);
    }

}
