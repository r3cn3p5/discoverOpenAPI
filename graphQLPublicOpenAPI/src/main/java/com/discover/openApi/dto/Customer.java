package com.discover.openApi.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Customer {

    @NonNull
    private String firstname;
    @NonNull
    private String lastname;

}
