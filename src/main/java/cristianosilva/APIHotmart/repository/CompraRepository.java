package cristianosilva.APIHotmart.repository;

import cristianosilva.APIHotmart.model.Compra;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristiano Silva
 */
@Repository
public interface CompraRepository  extends JpaRepository<Compra, String>{

    Optional<Compra> findByTransactionAndProd(String transaction, String prod);

    @Query("SELECT compra " +
            "FROM Compra compra " +
            "WHERE compra.transaction = :transaction AND compra.status = :status AND compra.id <> :id")
    Optional<Compra> findByStockUpdate(@Param("transaction") String transaction,@Param("status") String status,@Param("id") Long id);
    
  
   
}
