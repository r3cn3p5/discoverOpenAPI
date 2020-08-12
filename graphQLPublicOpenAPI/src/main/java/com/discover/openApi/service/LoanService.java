package com.discover.openApi.service;

import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.dto.RepaymentRequest;
import com.discover.openApi.dto.RepaymentResponse;

import java.util.List;

public interface LoanService {

    public List<Loan> getLoans();

    public RepaymentResponse repaymentCalculator(RepaymentRequest request);
    public boolean creditCheck(CreditCheckRequest request);

}
