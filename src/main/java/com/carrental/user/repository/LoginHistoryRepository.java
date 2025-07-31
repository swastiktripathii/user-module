package com.carrental.user.repository;

import com.carrental.user.model.LoginHistory;
import com.carrental.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    List<LoginHistory> findByUser(User user);
}
