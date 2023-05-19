package com.ZOHOCRMapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ZOHOCRMapp.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
