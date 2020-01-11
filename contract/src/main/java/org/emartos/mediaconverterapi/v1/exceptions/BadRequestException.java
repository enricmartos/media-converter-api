package org.emartos.mediaconverterapi.v1.exceptions;

public class BadRequestException extends MediaConverterServiceException{

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable t) {
        super(message, t);
    }
}
