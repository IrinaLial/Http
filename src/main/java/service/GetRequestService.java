package service;

import java.io.IOException;

public interface GetRequestService {
    void getLogin(String username, String password) throws IOException;
    void getLogout() throws IOException;
    void getUser(String username) throws IOException;
    int sendTotal(String url) throws IOException;

}
