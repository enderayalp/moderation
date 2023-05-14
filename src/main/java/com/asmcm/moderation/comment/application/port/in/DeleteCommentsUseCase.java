package com.asmcm.moderation.comment.application.port.in;

import java.util.List;

public interface DeleteCommentsUseCase {

    void deleteComments(List<String> comments);
}
