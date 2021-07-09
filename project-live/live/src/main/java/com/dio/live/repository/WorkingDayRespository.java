package com.dio.live.repository;

import com.dio.live.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRespository extends JpaRepository<WorkingDay, Long> {
}
