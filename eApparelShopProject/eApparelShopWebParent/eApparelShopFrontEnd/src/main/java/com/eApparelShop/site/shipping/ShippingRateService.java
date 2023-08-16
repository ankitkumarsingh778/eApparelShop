package com.eApparelShop.site.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eApparelShop.common.entity.Address;
import com.eApparelShop.common.entity.Customer;
import com.eApparelShop.common.entity.ShippingRate;

@Service
public class ShippingRateService {
    
	@Autowired private ShippingRateRepository repo;
	
	public int getShippingRateForCustomer(Customer customer) {
		String state = customer.getState();	
		if (state == null || state.isEmpty()) {
			state = customer.getCity();
		}
		
		return 99;
	}
	
	public int getShippingRateForAddress(Address address) {
		String state = address.getState();
		if (state == null || state.isEmpty()) {
			state = address.getCity();
		}
		
		return 99;
	}	
}
