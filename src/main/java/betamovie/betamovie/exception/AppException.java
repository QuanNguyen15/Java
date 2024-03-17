package betamovie.betamovie.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class AppException extends RuntimeException{


    public AppException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
    private ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
