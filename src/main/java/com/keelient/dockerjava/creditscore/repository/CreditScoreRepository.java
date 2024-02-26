package com.keelient.dockerjava.creditscore.repository;

import com.keelient.dockerjava.creditscore.entity.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditScore, String> {
}
