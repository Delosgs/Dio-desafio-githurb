package com.delanogs.Cities_Api.staties.repositories;

import com.delanogs.Cities_Api.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
