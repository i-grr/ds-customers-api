package io.github.i_grr.dscustomers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.i_grr.dscustomers.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
