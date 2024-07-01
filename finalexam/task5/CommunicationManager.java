package finalexam.task5;

import okhttp3.*;

import java.io.IOException;

public class CommunicationManager {

    private String endpoint;
    private OkHttpClient client;

    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
        this.client = new OkHttpClient();
    }

    public String sendUserMessage(String message) {
        RequestBody body = RequestBody.create(
                MediaType.get("application/json; charset=utf-8"),
                "{\"message\":\"" + message + "\"}"
        );

        Request request = new Request.Builder()
                .url(endpoint)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
