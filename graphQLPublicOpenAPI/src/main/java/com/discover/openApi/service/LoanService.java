package com.discover.openApi.service;

import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.dto.LoanApplicationRequest;

import java.util.List;

public interface LoanService {


    public Loan getLoan(long id);

    public List<Loan> getLoans(Double borrowAmount);

    public String creditCheck(CreditCheckRequest request);

    public Boolean applyForLoan(LoanApplicationRequest loanApplicationRequest);

}
