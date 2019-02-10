package net.storage.controller;

import net.storage.entities.Cart;
import net.storage.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping(value = "/looseSearch", method = RequestMethod.POST)
    public @ResponseBody
    List<Cart> postCart(@RequestBody List<Cart> cart){
        for (Cart c: cart ) {
            cartService.save(c);
        }
        return null;
    }
}
