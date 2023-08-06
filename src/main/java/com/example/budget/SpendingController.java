package com.example.budget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spending")
@CrossOrigin(origins = "http://192.168.50.15:3000")
public class SpendingController {
	@GetMapping(produces = "application/json")
    public List<Spending> getAllSpending() {
		List<Spending> allSpending = new ArrayList<Spending>();
		
		allSpending.add(Spending.builder().id(1).desc("Work income").amount(1000.01).isExpense(false).build());
		allSpending.add(Spending.builder().id(2).desc("Water bill").amount(20.02).isExpense(true).build());
		allSpending.add(Spending.builder().id(3).desc("Rent").amount(30.03).isExpense(true).build());
		allSpending.add(Spending.builder().id(4).desc("Power bill").amount(50.04).isExpense(true).build());
		allSpending.add(Spending.builder().id(5).desc("Learning").amount(15.05).isExpense(true).build());
		
		return allSpending;
    }
}
