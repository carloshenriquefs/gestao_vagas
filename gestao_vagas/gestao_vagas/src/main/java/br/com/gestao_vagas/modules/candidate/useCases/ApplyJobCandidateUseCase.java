package br.com.gestao_vagas.modules.candidate.useCases;

import br.com.gestao_vagas.exceptions.JobNotFoundException;
import br.com.gestao_vagas.exceptions.UserNotFoundException;
import br.com.gestao_vagas.modules.candidate.repositories.CandidateRepository;
import br.com.gestao_vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    public void execute(UUID idCandidate, UUID idJob) {

        this.candidateRepository.findById(idCandidate).orElseThrow(() -> {
            throw new UserNotFoundException();
        });

        this.jobRepository.findById(idJob).orElseThrow(() -> {
            throw new JobNotFoundException();
        });

    }
}
