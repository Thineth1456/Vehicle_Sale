package edu.icet.service.custom;

import edu.icet.dto.Cart;
import edu.icet.service.SuperService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface CartService extends SuperService {
    List<Cart> getCartList(String id) throws SQLException;

    boolean add(Cart cart) throws SQLException;

    boolean delete(String cartId) throws SQLException;
}
