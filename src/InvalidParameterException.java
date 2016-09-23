class InvalidParameterException extends Exception {
    private String message;

    InvalidParameterException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
