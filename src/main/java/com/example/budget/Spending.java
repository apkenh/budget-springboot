package com.example.budget;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Spending {
	private Integer id;
	private String desc;
	private Double amount;
	private boolean isExpense;
}
