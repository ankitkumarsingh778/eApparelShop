package com.eApparelShop.admin.shippingrate;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.eApparelShop.common.entity.Country;
import com.eApparelShop.common.entity.ShippingRate;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ShippingRateRepositoryTests {

	@Autowired private ShippingRateRepository repo;
	@Autowired private TestEntityManager entityManager;
	
	@Test
	public void testCreateNew() {
		Country india = new Country(1);
		ShippingRate newRate = new ShippingRate();
		newRate.setCountry(india);
		newRate.setState("West Bengal");
		newRate.setRate(8.25f);
		newRate.setDays(3);
		newRate.setCodSupported(true);
		
		ShippingRate savedRate = repo.save(newRate);
		assertThat(savedRate).isNotNull();
		assertThat(savedRate.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testUpdate() {
		Integer rateId = 3;
		ShippingRate rate = entityManager.find(ShippingRate.class, rateId);
		rate.setRate(8.25f);
		rate.setDays(3);
		ShippingRate updatedRate = repo.save(rate);
		
		assertThat(updatedRate.getRate()).isEqualTo(8.25f);
		assertThat(updatedRate.getDays()).isEqualTo(2);
	}
	
	@Test
	public void testFindAll() {
		List<ShippingRate> rates = (List<ShippingRate>) repo.findAll();
		assertThat(rates.size()).isGreaterThan(0);
		
		rates.forEach(System.out::println);
	}
	
	@Test
	public void testFindByCountryAndState() {
		Integer countryId = 106;
		String state = "Maharashtra";
		ShippingRate rate = repo.findByCountryAndState(countryId, state);
		
		assertThat(rate).isNotNull();
		System.out.println(rate);
	}
	
	@Test
	public void testUpdateCODSupport() {
		Integer rateId = 1;
		repo.updateCODSupport(rateId, false);
		
		ShippingRate rate = entityManager.find(ShippingRate.class, rateId);
		assertThat(rate.isCodSupported()).isFalse();
	}
	
	@Test
	public void testDelete() {
		Integer rateId = 2;
		repo.deleteById(rateId);
		
		ShippingRate rate = entityManager.find(ShippingRate.class, rateId);
		assertThat(rate).isNull();
	}
}
