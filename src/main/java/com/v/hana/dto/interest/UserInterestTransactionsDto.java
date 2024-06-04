package com.v.hana.dto.interest;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserInterestTransactionsDto {
    private final ArrayList<UserInterestTransactionDto> transaction;
    private final Long totalSpent;
    private final int interestTotalSpent;

    @Builder
    public UserInterestTransactionsDto(
            ArrayList<UserInterestTransactionDto> transaction,
            Long totalSpent,
            int interestTotalSpent) {
        this.transaction = transaction;
        this.totalSpent = totalSpent;
        this.interestTotalSpent = interestTotalSpent;
    }
}
