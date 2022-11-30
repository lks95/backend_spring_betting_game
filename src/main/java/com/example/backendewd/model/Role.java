package com.example.backendewd.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {
    @Id
    private String id;

    private AdminUser name;

    public Role() {

    }

    public Role(AdminUser name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AdminUser getName() {
        return name;
    }

    public void setName(AdminUser name) {
        this.name = name;
    }


}