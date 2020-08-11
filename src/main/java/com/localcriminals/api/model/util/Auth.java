package com.localcriminals.api.model.util;

import java.util.UUID;

public class Auth {
    public UUID uuid;
    public String email;
    public String password;

    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
