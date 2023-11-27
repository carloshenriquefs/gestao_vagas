package br.com.gestao_vagas.exceptions;

import static br.com.gestao_vagas.constants.Constants.JOB_NOT_FOUND;

public class JobNotFoundException extends RuntimeException {

    public JobNotFoundException() {
        super(JOB_NOT_FOUND);
    }
}