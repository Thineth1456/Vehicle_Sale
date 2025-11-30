package edu.icet.repository.custom;

import edu.icet.dto.Cart;
import edu.icet.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public interface CartRepository extends CrudRepository<Cart> {
    List<Cart> getCartList(String id) throws SQLException;
}
