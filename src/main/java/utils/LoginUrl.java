package utils;

public enum LoginUrl {

    LOGIN("/auth/local?email=*****&password=*****"),
    Campaign("/api/campaigns");

    private String uri;

    LoginUrl(String url){ this.uri=url; }

    public String getUri(){
        return this.uri;
    }

    public String getUri(String suffix){
        return this.uri + "/" + suffix;
    }

}
