package com.google.sps.Com;

public class Login {
    private final boolean isLoggedIn;
    private final String authURL;

    public Login(boolean isLoggedIn, String authURL) {
        this.isLoggedIn = isLoggedIn;
        this.authURL = authURL;
    }
}
