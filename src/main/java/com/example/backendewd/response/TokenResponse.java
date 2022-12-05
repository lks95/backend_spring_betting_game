package com.example.backendewd.response;

import java.util.List;

public class TokenResponse {

    private String id;
    private String username;
    private List<String> roles;

    public TokenResponse(String id, String username, List<String> roles) {

        this.id = id;
        this.username = username;
        this.roles = roles;
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
