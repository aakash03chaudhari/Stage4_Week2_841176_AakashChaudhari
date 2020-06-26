package com.cognizant.cartservice.controller;

import java.util.ArrayList;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.cartservice.exception.MenuItemNotFoundException;
import com.cognizant.cartservice.model.MenuItem;
import com.cognizant.cartservice.service.CartServiceImpl;

import lombok.extern.slf4j.Slf4j;

//Controller

@RestController
@RequestMapping("/carts")
@Slf4j
public class CartController {

	@Autowired
	private CartServiceImpl cartServiceImpl;
	
	//Adds given item to given users cart.
	@PostMapping("/{userId}/{menuItemId}")
	public void addCartItem(@PathVariable("userId") int userId, @PathVariable("menuItemId") int menuItemId)
			throws MenuItemNotFoundException {
		log.info("START");
		cartServiceImpl.addCartItem(userId, menuItemId);
		log.info("END");
	}

	//fetch all the cart items of existing users
	@GetMapping(value="/{userId}", produces = MediaType.APPLICATION_JSON)
	public ArrayList<MenuItem> getAllCartItems(@PathVariable("userId") int userId) {
		log.info("START");
		return cartServiceImpl.getAllCartItems(userId);
	}

	//Delete item from users cart
	@DeleteMapping("/{userId}/{menuItemId}")
	public void deleteCartItems(@PathVariable("userId") int userId, @PathVariable("menuItemId") int menuItemId) {
		log.debug("START");
		cartServiceImpl.deleteCartItem(userId, menuItemId);
		log.debug("END");
	}

}