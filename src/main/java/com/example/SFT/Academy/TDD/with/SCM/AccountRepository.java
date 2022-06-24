package com.example.SFT.Academy.TDD.with.SCM;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByName(String name);

}
