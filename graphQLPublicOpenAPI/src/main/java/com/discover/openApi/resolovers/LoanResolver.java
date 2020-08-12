package com.discover.openApi.resolovers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.dto.RepaymentRequest;
import com.discover.openApi.dto.RepaymentResponse;
import com.discover.openApi.service.LoanService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoanResolver implements GraphQLQueryResolver {

    private LoanService loanservice;

    public LoanResolver(LoanService loanservice) {
        this.loanservice = loanservice;
    }

    public List<Loan> loans() {

        return loanservice.getLoans();
    }

    public RepaymentResponse repaymentCalculator(RepaymentRequest request) {


        return loanservice.repaymentCalculator(request);
    }


    public boolean creditCheck(CreditCheckRequest request) {


        return loanservice.creditCheck(request);
    }
}
