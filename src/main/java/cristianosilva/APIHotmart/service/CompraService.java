package cristianosilva.APIHotmart.service;

import cristianosilva.APIHotmart.exceptions.BusinessException;
import cristianosilva.APIHotmart.exceptions.NotFoundException;
import cristianosilva.APIHotmart.mapper.CompraMapper;
import cristianosilva.APIHotmart.model.Compra;
import cristianosilva.APIHotmart.model.dto.CompraDTO;
import cristianosilva.APIHotmart.repository.CompraRepository;
import cristianosilva.APIHotmart.util.MessageUtils;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristiano Silva
 */
@Service
public class CompraService {

    @Autowired
    private CompraRepository repository;

    @Autowired
    private CompraMapper mapper;
//Insert
    @Transactional
    public CompraDTO save(CompraDTO dto) {
        Optional<Compra> optionalStock = repository.findByTransactionAndProd(dto.getTransaction(), dto.getProd());
        if (optionalStock.isPresent()) {
            throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);
        }
        Compra stock = mapper.toEntity(dto);
        repository.save(stock);
        return mapper.toDto(stock);
    }
//Realizar update
    @Transactional
    public CompraDTO update(CompraDTO dto) {
        Optional<Compra> optionalStock = repository.findByStockUpdate(dto.getTransaction(), dto.getStatus(), dto.getId());
        if (optionalStock.isPresent()) {
            throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);
        }
        Compra stock = mapper.toEntity(dto);
        repository.save(stock);
        return mapper.toDto(stock);
    }
//Buscar tudo que está no banco
    @Transactional(readOnly = true)
    public List<CompraDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }
//Buscar por ID
    @Transactional(readOnly = true)
    public CompraDTO findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElseThrow(NotFoundException::new);

    }
//Delete
    @Transactional
    public CompraDTO delete(Long id){
        CompraDTO dto = this.findById(id);
        repository.deleteById(dto.getId());
        return dto;
    }
  
}
