package com.eApparelShop.site.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eApparelShop.common.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();

	public Country findByCode(String countryCode);
}
