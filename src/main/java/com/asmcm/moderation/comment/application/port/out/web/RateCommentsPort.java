package com.asmcm.moderation.comment.application.port.out.web;

import reactor.core.publisher.Flux;

import java.util.List;

public interface RateCommentsPort {
    Flux<String> rateComments(List<String> comments);
}
