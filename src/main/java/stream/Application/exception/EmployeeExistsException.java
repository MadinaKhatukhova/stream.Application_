package stream.Application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import stream.Application.domain.Employee;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeExistsException extends RuntimeException {

    public EmployeeExistsException() {
        super("Employee Book already contains this employee.");
    }

    public EmployeeExistsException(String message) { super(message);}

    public EmployeeExistsException(String message, Throwable cause) { super(message, cause);}

    public EmployeeExistsException(Throwable cause) { super(cause);}

    protected EmployeeExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
