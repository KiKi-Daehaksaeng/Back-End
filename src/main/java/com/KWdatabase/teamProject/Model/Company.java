package com.KWdatabase.teamProject.Model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Company {
    private String itemCode;
    private String companyName;
    private int itemNumber;
    private String companySummary;
    private LocalDateTime publicDate;
}