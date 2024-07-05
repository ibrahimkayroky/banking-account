package com.example.banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class AccountDto {
    private long id;
    private String accountHolderName;
    private double balance;
}
