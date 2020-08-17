package com.discover.openApi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class LoanApplicationRequest {

    @NonNull
    private Long loanID;
    @NonNull
    private Customer customer;
    @NonNull
    private Double borrowAmount;

}
