package cristianosilva.APIHotmart.mapper;

import cristianosilva.APIHotmart.model.Compra;
import cristianosilva.APIHotmart.model.dto.CompraDTO;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author Cristiano Silva
 */
@Component
public class CompraMapper {

    public Compra toEntity(CompraDTO dto) {
        Compra stock = new Compra();
        stock.setId(dto.getId());
        stock.setTransaction(dto.getTransaction());
        stock.setStatus(dto.getStatus());
        stock.setEmail(dto.getEmail());
        stock.setFirstName(dto.getFirstName());
        stock.setLastName(dto.getLastName());
        stock.setProd(dto.getProd());
        return stock;
    }

    public CompraDTO toDto(Compra stock) {
        CompraDTO dto = new CompraDTO();
        dto.setId(stock.getId());
        dto.setTransaction(stock.getTransaction());
        dto.setStatus(stock.getStatus());
        dto.setEmail(stock.getEmail());
        dto.setFirstName(stock.getFirstName());
        dto.setLastName(stock.getLastName());
        stock.setProd(stock.getProd());
        return dto;
    }

    public List<CompraDTO> toDto(List<Compra> listStock){
        return listStock.stream().map(this::toDto).collect(Collectors.toList());
    }
}
