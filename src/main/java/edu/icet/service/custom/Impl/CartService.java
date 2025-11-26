package edu.icet.service.custom.Impl;

import edu.icet.dto.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    List<Cart> getCartList(String id);

    boolean add(Cart cart);

    boolean delete(String cartId);
}
