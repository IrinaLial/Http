package service;

import model.User;

import java.io.IOException;
import java.util.List;

public interface PostRequestService {
    void sendPostCreateUser(User user) throws IOException;
    void sendPostArray(User[] users) throws IOException;
    void sendPostList(List<User> users) throws IOException;
    void postRequestTotal(String url, String jsonUser) throws IOException;
}
