package com.example.backendewd.response;

import java.util.List;

public class TokenResponse {

    private String id;
    private String username;
    private List<String> roles;
    private String token;

    //https://www.predic8.de/bearer-token-autorisierung-api-security.htm
    private String type = "Bearer";


    public TokenResponse(String accessToken, String id, String username, List<String> roles) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
    public String getAccessToken(){
        return token;
    }
    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType(){
        return type;
    }
    public void setTokenType(String tt){
        this.type = tt;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<String> getRoles() {
        return roles;
    }
}
