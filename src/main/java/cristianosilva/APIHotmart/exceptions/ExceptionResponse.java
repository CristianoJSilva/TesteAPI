package cristianosilva.APIHotmart.exceptions;

/**
 *
 * @author Cristiano Silva
 */
public class ExceptionResponse {

    private String message;

    public ExceptionResponse(String message) {
        //Não preciso do setter porque já estou fazendo aqui
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
