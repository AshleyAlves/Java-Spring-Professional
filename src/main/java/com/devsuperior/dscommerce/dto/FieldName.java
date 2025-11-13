package com.devsuperior.dscommerce.dto;

public class FieldName {
    private String name;
    private String message;

    public FieldName(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
