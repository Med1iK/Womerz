package apis;

import org.json.simple.JSONObject;

public class LoginBody {

    private static String LoginEmail = "loginEmail";
    private static String LoginPassword = "password";


    public String generateJSONBodyForLogin() {

        JSONObject credentials = new JSONObject();
        credentials.put("email", LoginEmail);
        credentials.put("password", LoginPassword);
        return credentials.toJSONString();
    }


}
