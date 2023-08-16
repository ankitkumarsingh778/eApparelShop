package com.eApparelShop.admin.brand;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.eApparelShop.common.entity.Brand;
import com.eApparelShop.common.entity.Category;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BrandRepositoryTests {

    @Autowired
    private BrandRepository repo;

    @Test
    public void testCreateBrandForMensClothing() {
	Category mensClothing = new Category(1);
	Brand uspolo = new Brand("USPOLO");
	uspolo.getCategories().add(mensClothing);

	Brand savedBrand = repo.save(uspolo);

	assertThat(savedBrand).isNotNull();
	assertThat(savedBrand.getId()).isGreaterThan(0);
    }

    @Test
    public void testCreateBrand2() {
	Category cellphones = new Category(4);
	Category tablets = new Category(7);

	Brand apple = new Brand("Apple");
	apple.getCategories().add(cellphones);
	apple.getCategories().add(tablets);

	Brand savedBrand = repo.save(apple);

	assertThat(savedBrand).isNotNull();
	assertThat(savedBrand.getId()).isGreaterThan(0);
    }

    @Test
    public void testCreateBrand3() {
	Brand samsung = new Brand("Samsung");

	samsung.getCategories().add(new Category(29)); // category memory
	samsung.getCategories().add(new Category(24)); // category internal hard drive

	Brand savedBrand = repo.save(samsung);

	assertThat(savedBrand).isNotNull();
	assertThat(savedBrand.getId()).isGreaterThan(0);
    }

    @Test
    public void testFindAll() {
	Iterable<Brand> brands = repo.findAll();
	brands.forEach(System.out::println);

	assertThat(brands).isNotEmpty();
    }

    @Test
    public void testGetById() {
	Brand brand = repo.findById(4).get();

	assertThat(brand.getName()).isEqualTo("CSK Apparel");
    }

    @Test
    public void testUpdateName() {
	String newName = "Samsung Electronics";
	Brand samsung = repo.findById(3).get();
	samsung.setName(newName);

	Brand savedBrand = repo.save(samsung);
	assertThat(savedBrand.getName()).isEqualTo(newName);
    }

    @Test
    public void testDelete() {
	Integer id = 1;
	repo.deleteById(id);

	Optional<Brand> result = repo.findById(id);

	assertThat(result.isEmpty());
    }
}
