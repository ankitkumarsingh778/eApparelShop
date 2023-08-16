package com.eApparelShop.admin.category;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.eApparelShop.common.entity.Category;

@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CategoryRepositoryTests {

    @Autowired
    private CategoryRepository repo;

    @Test
    public void testCreateRootCategory() {
	Category category = new Category("Women's Clothing");
	Category savedCategory = repo.save(category);

	assertThat(savedCategory.getId()).isGreaterThan(0);
    }

    @Test
    public void testCreateSubCategory() {
	Category parent = new Category(7);
	Category subCategory = new Category("Formal Trousers", parent);
	Category savedCategory = repo.save(subCategory);

    }

    @Test
    public void testGetCategory() {
	Category category = repo.findById(2).get();
	System.out.println(category.getName());

	Set<Category> children = category.getChildren();

	for (Category subCategory : children) {
	    System.out.println(subCategory.getName());

	}
    }

    @Test
    public void testPrintHierarchicalCategories() {
	Iterable<Category> categories = (Iterable<Category>) repo.findAll();

	for (Category category : categories) {
	    if (category.getParent() == null) {
		System.out.println(category.getName());

		printChildren(category, 1);
		/*
		 * Set<Category> children = category.getChildren(); for (Category subCategory :
		 * children) { System.out.println("--" + subCategory.getName());
		 * 
		 * printChildren(subCategory,1); }
		 */
	    }
	}
    }

    private void printChildren(Category parent, int subLevel) {
	Set<Category> children = parent.getChildren();

	for (Category subCategory : children) {
	    for (int i = 0; i < subLevel; i++) {
		System.out.print("--");
	    }
	    System.out.println(subCategory.getName());

	    if (subCategory.getChildren() != null)
		printChildren(subCategory, subLevel + 1);
	}
    }
    
    /*
     * @Test public void testListRootCategories() { List<Category>
     * rootCategories=repo.findRootCategories(pageable); rootCategories.forEach(cat
     * -> System.out.println(cat.getName())); }
     */
    
    @Test
	public void testFindByName() {
		String name = "Accessories";
		Category category = repo.findByName(name);
		
		assertThat(category).isNotNull();
		assertThat(category.getName()).isEqualTo(name);
	}
	
	
	@Test
	public void testFindByAlias() {
		String alias = "belts";
		Category category = repo.findByAlias(alias);
		
		assertThat(category).isNotNull();
		assertThat(category.getAlias()).isEqualTo(alias);
	}
}
