package org.emartos.mediaconverterapi.v1.exceptions;

public abstract class MediaConverterServiceException extends Exception{

    public MediaConverterServiceException(String message) {
        super(message);
    }

    public MediaConverterServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
