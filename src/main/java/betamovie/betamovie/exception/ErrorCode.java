package betamovie.betamovie.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(499,"Uncategorized exception error."),
    USER_EXISTED(400, "User existed."),
    USERNAME_INVALID(499,"Username must be at least 3 character."),
    INVALID_PASSWORD(499,"Password must be at least 8 character."),
    INVALID_KEY(450,"Invalid message key."),
    USER_NOT_EXISTED(1002,"User not existed")
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
