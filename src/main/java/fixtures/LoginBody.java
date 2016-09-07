package apis;

import org.json.simple.JSONObject;

public class LoginBody {

    private static String LoginEmail = "admin@example.com";
    private static String LoginPassword = "456852456852za";


    public String generateJSONBodyForLogin() {

        JSONObject credentials = new JSONObject();
        credentials.put("email", LoginEmail);
        credentials.put("password", LoginPassword);
        return credentials.toJSONString();
    }
}
