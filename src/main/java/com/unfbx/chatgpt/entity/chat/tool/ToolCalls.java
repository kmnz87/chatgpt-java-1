package com.unfbx.chatgpt.entity.chat.tool;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The tool calls generated by the model, such as function calls.
 *
 * @author <a href="https://www.unfbx.com">unfbx</a>
 * @since 1.1.2
 * 2023-11-09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToolCalls implements Serializable {
    /**
     * The ID of the tool call.
     */
    private String id;
    /**
     * The type of the tool. Currently, only function is supported.
     */
    private String type;

    private ToolCallFunction function;
}
