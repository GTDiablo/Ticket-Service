package com.epam.training.ticketservice.core.account.model;

public class Account {
    private String username;
    private String password;
    private AccountType accountType;

    private Account(String username, String password, AccountType accountType){
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public Builder builder(){
        return new Builder();
    }

    private class Builder {
        private String username = "";
        private String password = "";
        private AccountType accountType = AccountType.NORMAL;

        public void setUsername(String username){
            this.username = username;
        }

        public void setPassword(String password){
            this.password = password;
        }

        public void setAccountType(AccountType accountType){
            this.accountType = accountType;
        }

        public Account build(){
            return new Account(this.username, this.password, this.accountType);
        }
    }
}
