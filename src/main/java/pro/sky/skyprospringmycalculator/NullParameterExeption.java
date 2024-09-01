package pro.sky.skyprospringmycalculator;

public class NullParameterExeption extends RuntimeException {

    public NullParameterExeption() {
    }

    public NullParameterExeption(String message) {
        super(message);
    }

    public NullParameterExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
