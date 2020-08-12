package com.discover.openApi.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RepaymentResponse {


    @NonNull private Double monthlyRepaymentAmt;
}
