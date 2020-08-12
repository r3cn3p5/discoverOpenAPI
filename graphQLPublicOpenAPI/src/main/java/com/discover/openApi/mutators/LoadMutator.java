package com.discover.openApi.mutators;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.discover.openApi.dto.LoanApplicationRequest;
import org.springframework.stereotype.Component;

@Component
public class LoadMutator implements GraphQLMutationResolver {

    public boolean applyForLoan(LoanApplicationRequest request) {




        return false;
    }
}
