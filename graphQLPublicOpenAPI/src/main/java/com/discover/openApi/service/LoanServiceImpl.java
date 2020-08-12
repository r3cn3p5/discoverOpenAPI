package com.discover.openApi.service;

import com.discover.openApi.dto.CreditCheckRequest;
import com.discover.openApi.dto.Loan;
import com.discover.openApi.dto.RepaymentRequest;
import com.discover.openApi.dto.RepaymentResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {

    ArrayList<Loan> loans = new ArrayList<>();

    public LoanServiceImpl() {
        loans.add(new Loan(1L, "Personal Loan", 2.2, 12));
        loans.add(new Loan(2L, "Personal Loan", 2.1, 18));
        loans.add(new Loan(3L, "Personal Loan", 2.2, 36));
        loans.add(new Loan(4L, "Personal Loan", 2.3, 48));
        loans.add(new Loan(5L, "Personal Loan Platinum", 2.0, 12));
        loans.add(new Loan(6L, "Personal Loan Platinum", 2.1, 18));
        loans.add(new Loan(7L, "Personal Loan Platinum", 2.2, 36));
        loans.add(new Loan(8L, "Personal Loan Platinum", 2.3, 48));
    }

    @Override
    public List<Loan> getLoans() {
        return loans;
    }

    @Override
    public RepaymentResponse repaymentCalculator(RepaymentRequest request) {

        double repaymentAmount = 0;

        Optional<Loan> loan = loans.stream().filter(x -> x.getId() == request.getLoanID()).findFirst();

        if (loan.isPresent()) {

            repaymentAmount = (request.getBorrowAmmont() + (request.getBorrowAmmont() / 100) * loan.get().getInterestRate()) / loan.get().getTermInMonths();

        }

        return  new RepaymentResponse(repaymentAmount);

    }

    @Override
    public boolean creditCheck(CreditCheckRequest request) {

        if (request.getCustomer().getFirstname().equalsIgnoreCase("nigel")) return false;

        return true;
    }
}
