package service.impl;

import model.User;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import service.PutRequestService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PutRequestServiceImpl implements PutRequestService {
    private final String USER_AGENT = "Chrome/65.0.3325.146";

    @Override
    public void sendPutUser(String userName, User user) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();

        String url = "http://petstore.swagger.io/v2/user/" + userName;

        HttpPut put = new HttpPut(url);
        put.setHeader("User-Agent", USER_AGENT);
        put.setHeader("accept", "application/json");
        put.setHeader("Content-Type", "application/json");

        String jsonUser = PostRequestServiceImpl.userToString(user);

        put.setEntity(new StringEntity(jsonUser));

        HttpResponse response = client.execute(put);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("PUT parameters : " + put.getEntity());
        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());
    }
    }
