package com.example.abcmysql.util;

import com.example.abcmysql.dto.Abc;
import okhttp3.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

public class AbcOkhttp {
    public static final MediaType JSON = MediaType.get("application/json; charset=UTF-8");
    OkHttpClient client = new OkHttpClient();

    public void RestApi(Abc abc) throws IOException {
        String abcString = abc.toString();
        System.out.println(abcString);
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:2222")
                .path("data")
                .encode()
                .build()
                .expand()
                .toUri();
        post(uri.toString(), abcString);
    }


    public void post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        client.newCall(request).execute();
    }
}
