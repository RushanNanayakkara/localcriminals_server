package com.localcriminals.api.repository;

import com.localcriminals.api.model.Criminal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalRepository extends JpaRepository<Criminal,Integer> {

}
