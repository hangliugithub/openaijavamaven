package example;

import com.theokanning.openai.ImageGenerations.ImageGenerationsRequest;
import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.embedding.EmbeddingRequest;

class OpenAiApiExample {
    public static void main(String... args) {
        String token = System.getenv("OPENAI_TOKEN");
        OpenAiService service = new OpenAiService(token);

        System.out.println("\nCreating completion...");
        ImageGenerationsRequest completionRequest = ImageGenerationsRequest.builder()
                .n(2)
                .prompt("happy girls in the beach")
                .size("1024x1024")
                .build();
        service.createImagesGenerations(completionRequest).getData().forEach(System.out::println);
    }
}
