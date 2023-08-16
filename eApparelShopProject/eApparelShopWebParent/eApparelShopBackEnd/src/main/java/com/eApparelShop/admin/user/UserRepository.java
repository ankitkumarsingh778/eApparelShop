package com.eApparelShop.admin.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eApparelShop.admin.paging.SearchRepository;
import com.eApparelShop.common.entity.User;

public interface UserRepository extends SearchRepository<User, Integer>, CrudRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = :email")
    public User getUserByEmail(@Param("email") String email);

    public Long countById(Integer id);

    @Query("SELECT u FROM User u WHERE CONCAT(u.id, ' ', u.email, ' ', u.firstName, ' '," + " u.lastName) LIKE %?1%")
    public Page<User> findAll(String keyword, Pageable pageable);

    @Query("UPDATE User u SET u.enabled = ?2 WHERE u.id = ?1")
    @Modifying
    public void updateEnabledStatus(Integer id, boolean enabled);

    long countByEnabled(boolean enabled);

    @Query("SELECT COUNT(u) FROM User u WHERE u.enabled = false")
    long countDisabledUsers();

}
