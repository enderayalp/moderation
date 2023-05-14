package com.asmcm.moderation.comment.application.port.out.web;

import reactor.core.publisher.Mono;

public interface RateCommentsPort {
    Mono<String> rateComments();
}
