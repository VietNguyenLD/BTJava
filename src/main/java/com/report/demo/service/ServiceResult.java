package com.report.demo.service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ServiceResult {
    private Status status = Status.SUCCESS;
    private String message;
    private Object data;
//    private List<Object> objectList;

    public enum Status {
        SUCCESS, FAILED;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
