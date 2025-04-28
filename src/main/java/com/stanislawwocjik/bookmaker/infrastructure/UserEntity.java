package com.stanislawwocjik.bookmaker.infrastructure;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class UserEntity {
    @Id
    private String login;

    private String firstName;
    private String lastName;
    private String eMail;
    private String identityCard;
    private BigDecimal balance;

    public UserEntity() {
    }

    public UserEntity(String login, String firstName, String lastName, String eMail, String identityCard, BigDecimal balance) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.identityCard = identityCard;
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
