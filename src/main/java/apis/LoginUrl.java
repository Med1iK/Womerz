package apis;

public enum LoginUrl {

    LOGIN("/auth/local");

    private String uri;
    LoginUrl(String url) { this.uri=url; }
    public String getUri(){ return this.uri; }

}
