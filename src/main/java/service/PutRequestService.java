package service;

import model.User;

import java.io.IOException;

public interface PutRequestService {
    void sendPutUser(String userName, User user) throws IOException;

}
