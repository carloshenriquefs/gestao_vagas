package br.com.gestao_vagas.modules.candidate.useCases;

import br.com.gestao_vagas.exceptions.UserNotFoundException;
import br.com.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;
import br.com.gestao_vagas.modules.candidate.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfileCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate) {
        var candidate = this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        var candidateDTO = ProfileCandidateResponseDTO.builder()
                .description(candidate.getDescription())
                .username(candidate.getUsername())
                .email(candidate.getEmail())
                .id(candidate.getId())
                .name(candidate.getName())
                .build();

        return candidateDTO;
    }
}
