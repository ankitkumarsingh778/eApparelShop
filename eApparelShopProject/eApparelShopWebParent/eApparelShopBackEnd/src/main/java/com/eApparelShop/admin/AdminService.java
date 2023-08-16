package com.eApparelShop.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eApparelShop.admin.brand.BrandRepository;
import com.eApparelShop.admin.category.CategoryRepository;
import com.eApparelShop.admin.order.OrderRepository;
import com.eApparelShop.admin.product.ProductRepository;
import com.eApparelShop.admin.user.UserRepository;
import com.eApparelShop.common.entity.order.Order;

@Service
public class AdminService {
    @Autowired
    private BrandRepository brandRepo;
    
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private CategoryRepository catRepo;
    
    @Autowired
    private ProductRepository prodRepo;
    
    @Autowired
    private OrderRepository orderRepo;
    
    public Iterable<Order> getAllOrders() {
        return orderRepo.findAll();
    }
    
    public long getOrderCount() {
        return orderRepo.count();
    }
    
    public Integer lastOrder() {
	Optional<Order> order=orderRepo.findById(8);
	
	return order.get().getId();
    }
   
}