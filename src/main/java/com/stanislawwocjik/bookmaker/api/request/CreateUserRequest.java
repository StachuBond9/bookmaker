package com.stanislawwocjik.bookmaker.api.request;

public record CreateUserRequest(String login, String password, String firstName, String lastName, String eMail,
                                String identityCard) {

}
