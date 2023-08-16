package com.eApparelShop.admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eApparelShop.admin.AdminService;
import com.eApparelShop.admin.dashboard.DashboardController;
import com.eApparelShop.common.entity.order.Order;

@Controller
public class MainController {
    
    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public String viewHomePage(Model model) {

	return "redirect:/dashboard";
    }

    @GetMapping("/login")
    public String viewLoginPage() {
	return "login";
    }

    @GetMapping("/error")
    public String errorPage() {
	return "error";
    }

}
