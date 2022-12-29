package com.theokanning.openai.ImageGenerations;

import com.theokanning.openai.Usage;
import com.theokanning.openai.completion.CompletionChoice;
import lombok.Data;

import java.util.List;

/**
 * An object containing a response from the completion api
 *
 * https://beta.openai.com/docs/api-reference/completions/create
 */
@Data
public class ImageGenerationsResult {


    /**
     * The creation time in epoch seconds.
     */
    long created;

    /**
     * A list of generated completions.
     */
    List<ImageGenerationsData> data;

}
