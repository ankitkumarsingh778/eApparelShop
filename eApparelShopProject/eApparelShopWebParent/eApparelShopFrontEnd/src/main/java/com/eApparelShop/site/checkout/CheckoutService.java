package com.eApparelShop.site.checkout;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eApparelShop.common.entity.CartItem;
import com.eApparelShop.common.entity.ShippingRate;
import com.eApparelShop.common.entity.product.Product;

@Service
public class CheckoutService {
    private static final int DIM_DIVISOR = 139;

    public CheckoutInfo prepareCheckout(List<CartItem> cartItems, int shippingRate) {
	CheckoutInfo checkoutInfo = new CheckoutInfo();

	float productCost = calculateProductCost(cartItems);
	float productTotal = calculateProductTotal(cartItems);
	float shippingCostTotal = calculateShippingCost(cartItems, shippingRate);
	float paymentTotal = productTotal + shippingCostTotal;

	checkoutInfo.setProductCost(productCost);
	checkoutInfo.setProductTotal(productTotal);
	checkoutInfo.setShippingCostTotal(shippingCostTotal);
	checkoutInfo.setPaymentTotal(paymentTotal);

	checkoutInfo.setDeliverDays(7);
	checkoutInfo.setCodSupported(true);

	return checkoutInfo;
    }

    private float calculateShippingCost(List<CartItem> cartItems, int shippingRate) {
	float shippingCostTotal = 0.0f;

	for (CartItem item : cartItems) {
	    float shippingCost = 0;
	    Product product = item.getProduct();
	    float dimWeight = (product.getLength() * product.getWidth() * product.getHeight()) / DIM_DIVISOR;
	    float finalWeight = product.getWeight() > dimWeight ? product.getWeight() : dimWeight;
	    if (product.getCost() < 500) {
		shippingCost = 99;
	    }

	    item.setShippingCost(shippingCost);

	    shippingCostTotal += shippingCost;
	}

	return shippingCostTotal;
    }

    private float calculateProductTotal(List<CartItem> cartItems) {
	float total = 0.0f;

	for (CartItem item : cartItems) {
	    total += item.getSubtotal();
	}

	return total;
    }

    private float calculateProductCost(List<CartItem> cartItems) {
	float cost = 0.0f;

	for (CartItem item : cartItems) {
	    cost += item.getQuantity() * item.getProduct().getCost();
	}

	return cost;
    }
}
