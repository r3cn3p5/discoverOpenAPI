package com.discover.openApi.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Loan {

    @NonNull
    private Long id;
    @NonNull
    private String name;

    @NonNull
    private Double interestRate;
    @NonNull
    private Integer termInMonths;

    @Setter
    private Double monthlyRepaymentAmt;

}
