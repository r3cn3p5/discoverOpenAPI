package com.discover.openApi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RepaymentRequest {

    private Long loanID;
    private Integer ceditScore;
    private Double borrowAmmont;

}
