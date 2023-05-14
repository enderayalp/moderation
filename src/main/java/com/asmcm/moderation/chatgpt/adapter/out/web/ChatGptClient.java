package com.asmcm.moderation.chatgpt.adapter.out.web;


import com.asmcm.moderation.chatgpt.application.port.out.RateCommentsPort;
import org.openapitools.model.CreateCompletionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

@Component

public class ChatGptClient implements RateCommentsPort {
    private final WebClient webClient;

    @Value("${moderation.chat-gpt.bearer-token}")
    private String enrcyptedToken;

    @Value("${moderation.chat-gpt.decryptionKey}")
    private String decryptionKey;

    @Value("${moderation.chat-gpt.baseUrl}")
    private String baseUrl;

    @Value("${moderation.chat-gpt.uri}")
    private String uri;

    private final String decryptedChatGptKey;

    public ChatGptClient(WebClient.Builder webClientBuilder, @Autowired EncrypterDecrypter encrypterDecrypter) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeySpecException, BadPaddingException, IOException, InvalidKeyException {
        decryptedChatGptKey=encrypterDecrypter.decrypt(decryptionKey, enrcyptedToken);
        this.webClient = webClientBuilder.baseUrl(baseUrl).build();
    }

    public Flux<CreateCompletionResponse> rateComments(List<String> comments) {
        return webClient.get()
                .uri(uri)
                .header("Authorization", "Bearer " + decryptedChatGptKey)
                .retrieve()
                .bodyToFlux(CreateCompletionResponse.class);
    }

}
