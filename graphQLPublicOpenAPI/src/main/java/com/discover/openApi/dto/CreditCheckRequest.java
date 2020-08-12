package com.discover.openApi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreditCheckRequest {

    private Customer customer;
}
