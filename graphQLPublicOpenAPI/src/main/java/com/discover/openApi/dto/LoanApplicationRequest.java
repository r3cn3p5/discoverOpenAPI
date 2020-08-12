package com.discover.openApi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LoanApplicationRequest {


    private Long loanID;
    private Customer customer;
    private Double borrowAmmont;

}
