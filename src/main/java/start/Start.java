package start;

import service.impl.GetRequestServiceImpl;

public class Start {
    public static void main(String[] args) throws Exception {

//        User user = new User();
//        user.setId(1);
//        user.setName("lala");
//        user.setEmail("groov@http.com");


        GetRequestServiceImpl httpImpl = new GetRequestServiceImpl();
        httpImpl.getLogin("WWWW","@asdr");
//
//      DeleteRequestServiceImpl deleteImpl = new DeleteRequestServiceImpl();
//      deleteImpl.deleteUser("WWWW");

//        PostRequestServiceImpl postRequest = new PostRequestServiceImpl();
//        postRequest.sendPostCreateUser(user);
//


    }
}
