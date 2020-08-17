package com.discover.openApi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class CreditCheckRequest {

    @NonNull
    private Customer customer;

    @NonNull
    private Double borrowAmount;
}
