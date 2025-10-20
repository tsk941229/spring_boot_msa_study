package com.springtour.example.chapter05.domain.dto;

import lombok.Getter;

@Getter
public class DeleteResultResponse {

    private boolean success;
    private String message;

    public DeleteResultResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

}
