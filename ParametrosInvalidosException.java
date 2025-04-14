package Exception;

import java.io.Serial;

public class ParametrosInvalidosException extends Exception {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}