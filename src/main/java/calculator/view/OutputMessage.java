package calculator.view;

public enum OutputMessage {
    INPUT_PREFIX("덧셈할 문자열을 입력해 주세요."),
    RESULT("결과 : %d");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFormattedMessage(Object... args) {
        return String.format(message, args);
    }
}
