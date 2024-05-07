package com.example.cqrsbankingapp.service.card;

import com.example.cqrsbankingapp.domain.exception.ResourceNotFoundException;
import com.example.cqrsbankingapp.domain.model.Account;
import com.example.cqrsbankingapp.domain.model.Card;
import com.example.cqrsbankingapp.repository.AccountRepository;
import com.example.cqrsbankingapp.repository.CardRepository;
import com.example.cqrsbankingapp.service.account.AccountQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardQueryServiceImpl implements CardQueryService {

    private  final CardRepository repository;

    @Override
    public Card getById(UUID id) {
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
