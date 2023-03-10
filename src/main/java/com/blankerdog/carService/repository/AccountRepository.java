package com.blankerdog.carService.repository;

import com.blankerdog.carService.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> getAccountByLogin(String login);

    boolean existsAccountByLogin(String login);
}
