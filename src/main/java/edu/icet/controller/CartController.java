package edu.icet.controller;

import edu.icet.dto.Cart;
import edu.icet.service.custom.Impl.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@RequiredArgsConstructor
public class CartController {
    final CartService cartService;

    public List<Cart> getCartList(@RequestBody String cusId){
        return cartService.getCartList(cusId);
    }

    public boolean addToCart(@RequestBody Cart cart){
        return cartService.add(cart);
    }
    public boolean deleteFromCart(@RequestBody String cartId){
        return cartService.delete(cartId);
    }

}
