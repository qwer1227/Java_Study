package report.exception;

public class SchoolException extends RuntimeException{

    public SchoolException(String message){
        super(message);
    }

    public SchoolException(String message, Throwable cause){
        super(message, cause);
    }

    public SchoolException(Throwable cause){
        super(cause);
    }

    public SchoolException(){

    }
}
