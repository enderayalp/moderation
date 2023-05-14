package com.asmcm.moderation.chatgpt.adapter.out.web;


import com.asmcm.moderation.comment.application.port.out.web.RateCommentsPort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
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

    public Mono<String> rateComments() {
        return webClient.get()
                .uri(uri)
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToMono(String.class);
    }
}
