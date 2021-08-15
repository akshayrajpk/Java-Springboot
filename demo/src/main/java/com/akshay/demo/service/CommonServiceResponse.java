package com.akshay.demo.service;

public class CommonServiceResponse {

    private boolean successful = true;
    private String message;

    public CommonServiceResponse() {
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CommonServiceResponse{" +
                "successful=" + successful +
                ", message='" + message + '\'' +
                '}';
    }
}
