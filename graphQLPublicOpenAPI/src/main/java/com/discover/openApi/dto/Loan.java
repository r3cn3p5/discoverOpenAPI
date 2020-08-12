package com.discover.openApi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Loan {

    private Long id;
    private String name;

    private Double intrestRate;
    private Integer termMonths;

}
