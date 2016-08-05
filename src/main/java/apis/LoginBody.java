package apis;

import org.json.simple.JSONObject;

public class LoginBody {

    private static String LoginEmail = "PlzEnterloginEmail";
    private static String LoginPassword = "PlzEnterpassword";


    public String generateJSONBodyForLogin() {

        JSONObject credentials = new JSONObject();
        credentials.put("email", LoginEmail);
        credentials.put("password", LoginPassword);
        return credentials.toJSONString();
    }


}
