package com.discover.openApi.service;

import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.dto.LoanApplicationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class LoanServiceImpl implements LoanService {

    ArrayList<Loan> loans = new ArrayList<>();

    public LoanServiceImpl() {
        loans.add(new Loan(1L, "Personal Loan", 2.1, 12));
        loans.add(new Loan(2L, "Personal Loan", 2.2, 18));
        loans.add(new Loan(3L, "Personal Loan", 2.3, 36));
        loans.add(new Loan(4L, "Personal Loan", 2.4, 48));
        loans.add(new Loan(5L, "Personal Loan (insurance)", 3.4, 12));
        loans.add(new Loan(6L, "Personal Loan (insurance)", 3.3, 18));
        loans.add(new Loan(7L, "Personal Loan (insurance)", 3.2, 36));
        loans.add(new Loan(8L, "Personal Loan (insurance)", 3.1, 48));
    }

    @Override
    public Loan getLoan(long id) {

        log.info("*************************************************************************");
        log.info("Request for Loan");
        log.info("*************************************************************************");

        return loans.stream().filter(x -> x.getId().longValue() == id).findFirst().get();
    }

    @Override
    public List<Loan> getLoans(Double borrowAmount) {

        log.info("*************************************************************************");
        log.info("Request for Loan Repayments");
        log.info("*************************************************************************");


        // TODO: this code safe until introduce MS
        double scale = Math.pow(10, 2);
        loans.stream().forEach(x -> {x.setMonthlyRepaymentAmt( Math.round((borrowAmount + (borrowAmount / 100) * x.getInterestRate()) /  x.getTermInMonths() * scale) / scale);});

        return loans;
    }

    @Override
    public String creditCheck(CreditCheckRequest request) {

        log.info("*************************************************************************");
        log.info("Request for Credit Card Check");
        log.info("*************************************************************************");

        if (request.getCustomer().getFirstname().equalsIgnoreCase("nigel")) return "FAIL";
        if (request.getCustomer().getFirstname().equalsIgnoreCase("spencer")) return "PASS";

        return "ERROR";
    }

    @Override
    public Boolean applyForLoan(LoanApplicationRequest loanApplicationRequest) {

        log.info("*************************************************************************");
        log.info("Application for new Loan :) :) :)");
        log.info("*************************************************************************");

        return true;
    }
}
