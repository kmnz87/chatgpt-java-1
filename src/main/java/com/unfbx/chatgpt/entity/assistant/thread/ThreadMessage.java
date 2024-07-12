package com.unfbx.chatgpt.entity.assistant.thread;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

@Data
@Slf4j
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class ThreadMessage {

    private String role;
    private List<Content> content;
    private Map metadata;
    private List<Attachment> attachments;

    @Getter
    @AllArgsConstructor
    public enum Role {

        USER("user"),
        ;
        private final String name;
    }
}
