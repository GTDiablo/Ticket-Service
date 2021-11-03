package com.epam.training.ticketservice.ui.command;

import com.epam.training.ticketservice.core.account.model.AccountType;

public class BaseCommand {
    private AccountType requiredPrivilege = AccountType.NORMAL;

    void process(){

    }
}
