package com.lgcns.tct_backend.util;

import lombok.experimental.UtilityClass;

import java.util.regex.Pattern;

@UtilityClass
public class UserUtility {
    private static final String USER_ID_REGEX = "^[a-zA-Z]{1}[a-zA-Z0-9_-]{4,19}$";

    public static boolean isUserIdValid(String userId){
        return Pattern.matches(USER_ID_REGEX, userId);
    }
}
