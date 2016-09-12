package utils;

public enum LoginUrl {

    LOGIN("/auth/local"),
    Campaign("/api/campaigns"),
    SocialNetwork("api/campaigns/socials/");

    private String uri;

    LoginUrl(String url){ this.uri=url; }

    public String getUri(){
        return this.uri;
    }

    public String getUri(String suffix){
        return this.uri + "/" + suffix;
    }

}
