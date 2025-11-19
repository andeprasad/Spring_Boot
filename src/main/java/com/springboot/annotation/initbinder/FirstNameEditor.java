package com.springboot.annotation.initbinder;

import java.beans.PropertyEditorSupport;

public class FirstNameEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text.trim().toLowerCase());
    }
}
