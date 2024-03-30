package br.com.gestao_vagas.exceptions;

import static br.com.gestao_vagas.constants.Constants.USER_NOT_FOUND;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super(USER_NOT_FOUND);
    }
}
