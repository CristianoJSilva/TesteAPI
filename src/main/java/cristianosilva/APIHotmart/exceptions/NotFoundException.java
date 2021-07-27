package cristianosilva.APIHotmart.exceptions;

import cristianosilva.APIHotmart.util.MessageUtils;
import org.aspectj.bridge.MessageUtil;

/**
 *
 * @author Cristiano Silva
 */
public class NotFoundException extends RuntimeException{
    
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
