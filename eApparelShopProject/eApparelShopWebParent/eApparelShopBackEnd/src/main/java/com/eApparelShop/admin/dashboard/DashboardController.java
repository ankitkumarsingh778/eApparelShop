package com.eApparelShop.admin.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eApparelShop.admin.brand.BrandRepository;
import com.eApparelShop.admin.category.CategoryRepository;
import com.eApparelShop.admin.customer.CustomerRepository;
import com.eApparelShop.admin.order.OrderRepository;
import com.eApparelShop.admin.order.OrderService;
import com.eApparelShop.admin.product.ProductRepository;
import com.eApparelShop.admin.setting.SettingRepository;
import com.eApparelShop.admin.user.UserRepository;
import com.eApparelShop.common.entity.order.OrderStatus;

@Controller
public class DashboardController {
    
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
    
    @Autowired
    private CustomerRepository customerRepo;
    
    @Autowired
    private SettingRepository settingRepo;
    
    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
	model.addAttribute("orderCount", orderRepo.count());
	model.addAttribute("orderCountNew", orderRepo.countByStatus(OrderStatus.valueOf("NEW")));
	model.addAttribute("orderCountProcessing", orderRepo.countByStatus(OrderStatus.valueOf("PROCESSING")));
	model.addAttribute("orderCountDelivered", orderRepo.countByStatus(OrderStatus.DELIVERED));
	model.addAttribute("orderCountReturned", orderRepo.countByStatus(OrderStatus.valueOf("RETURNED")));
	
	model.addAttribute("catCount", catRepo.count());
	model.addAttribute("catRootCount", catRepo.rootCategoryCount());
	model.addAttribute("catEnabled", catRepo.countEnabledUsers());
	model.addAttribute("catDisabled", catRepo.countDisabledUsers());
	
	model.addAttribute("userCount", userRepo.count());
	model.addAttribute("userEnabled", userRepo.countByEnabled(true));
	model.addAttribute("userDisabled", userRepo.countDisabledUsers());
	
	model.addAttribute("customerCount", customerRepo.count());
	model.addAttribute("customerEnabled", customerRepo.countEnabledCustomers());
	model.addAttribute("customerDisabled", customerRepo.countDisabledCustomers());
	
	model.addAttribute("productsCount", prodRepo.count());
	model.addAttribute("productsEnabled", prodRepo.countEnabledProducts());
	model.addAttribute("productsDisabled", prodRepo.countDisabledProducts());
	model.addAttribute("inStockProducts", prodRepo.countInStockProducts());
	model.addAttribute("outStockProducts", prodRepo.countOutStockProducts());
	
	
	model.addAttribute("brandCount", brandRepo.count());
	
	return "dashboard";
    }
}
