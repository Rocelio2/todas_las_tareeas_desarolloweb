public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            switch (operation) {
                case "+":
                    return String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
                case "*":
                    return String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
                case "/":
                    return String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
                default:
                    throw new IllegalArgumentException(String.format("Operation '%s' does not exist", operation));
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}

class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}