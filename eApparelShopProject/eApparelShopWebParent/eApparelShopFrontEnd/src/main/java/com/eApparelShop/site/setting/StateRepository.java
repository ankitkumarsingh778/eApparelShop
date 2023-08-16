package com.eApparelShop.site.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eApparelShop.common.entity.Country;
import com.eApparelShop.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
