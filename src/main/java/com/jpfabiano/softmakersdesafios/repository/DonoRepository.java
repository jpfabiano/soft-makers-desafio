package com.jpfabiano.softmakersdesafios.repository;

import com.jpfabiano.softmakersdesafios.models.DonoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends JpaRepository<DonoModel,Long> {
}
