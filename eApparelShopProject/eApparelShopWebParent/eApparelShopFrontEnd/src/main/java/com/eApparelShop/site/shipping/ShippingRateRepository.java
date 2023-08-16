package com.eApparelShop.site.shipping;

import org.springframework.data.repository.CrudRepository;

import com.eApparelShop.common.entity.Country;
import com.eApparelShop.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);

}
