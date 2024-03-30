package br.com.gestao_vagas.exceptions;

import static br.com.gestao_vagas.constants.Constants.USER_ALREADY_EXISTS;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super(USER_ALREADY_EXISTS);
    }
}
