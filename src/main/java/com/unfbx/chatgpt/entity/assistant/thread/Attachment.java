package com.unfbx.chatgpt.entity.assistant.thread;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unfbx.chatgpt.entity.assistant.Tool;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

@Data
@Slf4j
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Attachment implements Serializable {
    /**
     * The ID of the file to use as an attachment.
     */
    @JsonProperty("file_id")
    private String fileId;
    private List<Tool> tools;
}
