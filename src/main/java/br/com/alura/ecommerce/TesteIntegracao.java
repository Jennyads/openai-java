package br.com.alura.ecommerce;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import com.theokanning.openai.service.OpenAiService;

import java.util.Arrays;

public class TesteIntegracao {

    public static void main(String[] args) {
        var user = "Gere 5 produtos";
        var system = "Você é um gerador de produtos fictícios para um ecommerce e deve gerar apenas o nome dos produtos solicitados pelo usuário";

        var chave = System.getenv("OPENAI_API_KEY");
        var service = new OpenAiService(chave);

        var completionRequest = ChatCompletionRequest.builder()
                .model("gpt-3.5-turbo")
                .messages(Arrays.asList(
                        new ChatMessage(ChatMessageRole.SYSTEM.value(), system),
                        new ChatMessage(ChatMessageRole.USER.value(), user)
                ))
                .build();

        try {
            service.createChatCompletion(completionRequest)
                    .getChoices()
                    .forEach(c -> System.out.println(c.getMessage().getContent()));
        } catch (com.theokanning.openai.OpenAiHttpException e) {
            System.err.println("Erro ao chamar a API do OpenAI: " + e.getMessage());
        }
    }
}
