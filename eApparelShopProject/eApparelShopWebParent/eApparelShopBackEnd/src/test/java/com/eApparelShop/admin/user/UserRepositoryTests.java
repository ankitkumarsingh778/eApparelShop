package com.eApparelShop.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.eApparelShop.common.entity.Role;
import com.eApparelShop.common.entity.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	@Autowired
	private UserRepository repo;

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void testCreateNewUserWithOneRole() {
		Role roleAdmin = entityManager.find(Role.class, 1);
		User userI = new User("admin@localhost.net", "admin@123", "admin", "s_u");
		userI.addRole(roleAdmin);

		User savedUser = repo.save(userI);

		assertThat(savedUser.getId()).isGreaterThan(0);
	}

	@Test
	public void testCreateNewUserWithTwoRoles() {
		User userRavi = new User("ravi@localhost.com", "ravi2022", "Ravi", "Kumar");
		Role roleEditor = new Role(3);
		Role roleAssistant = new Role(5);

		userRavi.addRole(roleEditor);
		userRavi.addRole(roleAssistant);

		User savedUser = repo.save(userRavi);

		assertThat(savedUser.getId()).isGreaterThan(0);
	}

	@Test
	public void testListAllUsers() {
		Iterable<User> listUsers = repo.findAll();
		listUsers.forEach(user -> System.out.println(user));
	}

	@Test
	public void testGetUserById() {
		User userI = repo.findById(1).get();
		System.out.println(userI);
		assertThat(userI).isNotNull();
	}

	@Test
	public void testUpdateUserDetails() {
		User userI = repo.findById(1).get();
		userI.setEnabled(true);
		userI.setEmail("javaadmin@localhost.net");

		repo.save(userI);
	}

	@Test
	public void testUpdateRoles() {
		User userRavi = repo.findById(2).get();
		Role roleEditor = new Role(3);
		Role roleSalesperson = new Role(2);

		userRavi.getRoles().remove(roleEditor);
		userRavi.addRole(roleSalesperson);

		repo.save(userRavi);
	}

	@Test
	public void testDeleteUser() {
		Integer userId = 2;
		repo.deleteById(userId);

	}

	@Test
	public void testGetUserByEmail() {
		String email = "ravi@localhost.com";
		User user = repo.getUserByEmail(email);

		assertThat(user).isNotNull();
	}
	
	@Test
	public void testCountById() {
	    Integer id=1;
	    Long countById=repo.countById(id);
	    
	    assertThat(countById).isNotNull().isGreaterThan(0);
	}
}
