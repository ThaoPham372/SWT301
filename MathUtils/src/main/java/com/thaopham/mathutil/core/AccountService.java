package com.thaopham.mathutil.core;

import java.util.Objects;
import java.util.regex.Pattern;

public class AccountService {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    
    public boolean registerAccount(String username, String password, String email) {
        if (!isValidUsername(username)) {
            return false;
        }
        if (!isValidPassword(password)) {
            return false;
        }
        if (!isValidEmail(email)) {
            return false;
        }
        return true;
    }

    private boolean isValidUsername(String username) {
        return username != null && !username.trim().isEmpty();
    }

    public boolean isValidPassword(String password) {
        return password != null && password.length() > 6;
    }

    public boolean isValidEmail(String email) {
        if (Objects.isNull(email)) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}


