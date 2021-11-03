package com.epam.training.ticketservice.core.account;

import com.epam.training.ticketservice.core.account.model.Account;

public interface AccountManager {
    boolean isAccountExists(Account account);
    Account addAccount(Account account);
}
