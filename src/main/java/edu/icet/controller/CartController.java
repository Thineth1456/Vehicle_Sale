package edu.icet.controller;

import edu.icet.dto.Cart;
import edu.icet.service.custom.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLException;
import java.util.List;
@RequiredArgsConstructor
public class CartController {
    final CartService cartService;

    public List<Cart> getCartList(@RequestBody String cusId){
        try {
            return cartService.getCartList(cusId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addToCart(@RequestBody Cart cart){
        try {
            return cartService.add(cart);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean deleteFromCart(@RequestBody String cartId){
        try {
            return cartService.delete(cartId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
