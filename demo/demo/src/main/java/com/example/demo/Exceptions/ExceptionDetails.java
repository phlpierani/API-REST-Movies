package com.example.demo.Exceptions;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ExceptionDetails {

    protected String title;
    protected int status;
    protected String detail;
    protected long timestamp;
    protected String developerMessage;

}
