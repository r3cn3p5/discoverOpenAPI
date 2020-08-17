package com.discover.openApi.mutators;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.discover.openApi.dto.LoanApplicationRequest;
import com.discover.openApi.service.LoanService;
import org.springframework.stereotype.Component;

@Component
public class LoanMutator implements GraphQLMutationResolver {

    private LoanService loanservice;

    public LoanMutator(LoanService loanservice) {
        this.loanservice = loanservice;
    }

    public boolean applyForLoan(LoanApplicationRequest request) {

        loanservice.applyForLoan(request);
        return false;
    }
}
