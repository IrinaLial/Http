package service;

import model.User;

import java.io.IOException;

public interface DeleteRequestService {
    void deleteUser(User user) throws IOException;
    void deleteUser(String userName) throws IOException;
}
