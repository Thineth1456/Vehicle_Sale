package edu.icet.service.custom.Impl;

import edu.icet.dto.Cart;
import edu.icet.repository.custom.CartRepository;
import edu.icet.service.custom.CartService;
import lombok.RequiredArgsConstructor;

import java.sql.SQLException;
import java.util.List;
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    final CartRepository cartRepository;
    @Override
    public List<Cart> getCartList(String id) throws SQLException {
        return cartRepository.getCartList(id);
    }

    @Override
    public boolean add(Cart cart) throws SQLException {
        return cartRepository.save(cart);
    }

    @Override
    public boolean delete(String cartId) throws SQLException {
        return cartRepository.delete(cartId);
    }
}
