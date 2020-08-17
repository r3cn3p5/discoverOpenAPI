package com.discover.openApi.resolovers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.service.LoanService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoanResolver implements GraphQLQueryResolver {

    private LoanService loanservice;

    public LoanResolver(LoanService loanservice) {
        this.loanservice = loanservice;
    }

    public Loan loan(long id) {
        return loanservice.getLoan(id);
    }


    public List<Loan> loans(Double borrowAmount) {
        return loanservice.getLoans(borrowAmount);
    }


    public String creditCheck(CreditCheckRequest request) {
        return loanservice.creditCheck(request);
    }
}
