package com.putkov.ft.validator;

import java.util.regex.Pattern;

public class CustomArrayValidatorImpl implements CustomArrayValidator {
    private static final Pattern VALID_PATTERN = Pattern.compile("[0-9\\s,;\\-]+$");
    @Override
    public boolean isValid(String line) {
    if(line==null || line.trim().isEmpty()){
        return false;
    }
    return VALID_PATTERN.matcher(line.trim()).matches();
    }
}
