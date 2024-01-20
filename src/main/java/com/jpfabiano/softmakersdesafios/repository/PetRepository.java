package com.jpfabiano.softmakersdesafios.repository;

import com.jpfabiano.softmakersdesafios.models.DonoModel;
import com.jpfabiano.softmakersdesafios.models.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetModel,Long> {
}
