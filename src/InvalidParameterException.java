/**
 * Created by DENIS on 07.09.2016.
 */
class InvalidParameterException extends Exception {
    private String message;
    InvalidParameterException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
