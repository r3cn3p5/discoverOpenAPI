package com.discover.openApi.resolovers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.dto.RepaymentRequest;
import com.discover.openApi.dto.RepaymentResponse;

import java.util.Collections;
import java.util.List;

public class LoanResolver implements GraphQLQueryResolver {

    public List<Loan> loans() {




        return Collections.EMPTY_LIST;
    }

    public RepaymentResponse repaymentCalculator(RepaymentRequest request) {

        return new RepaymentResponse();
    }


    public boolean creditCheck(CreditCheckRequest request) {


        return false;
    }
}
