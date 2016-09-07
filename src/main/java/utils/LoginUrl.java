package apis;

public enum LoginUrl {

    LOGIN("/auth/local"),
    Campaign ("/api/campaigns");

    private String uri;

    LoginUrl(String url) {
        this.uri=url;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUri(String suffix) {
        return this.uri + "/" + suffix;
    }


}
