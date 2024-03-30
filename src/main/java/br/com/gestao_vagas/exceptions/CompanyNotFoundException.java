package br.com.gestao_vagas.exceptions;

import static br.com.gestao_vagas.constants.Constants.COMPANY_NOT_FOUND;

public class CompanyNotFoundException extends RuntimeException {
    public CompanyNotFoundException() {
        super(COMPANY_NOT_FOUND);
    }
}
