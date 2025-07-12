package com.example.account.repository;

import com.example.account.entity.InputDetail;
import org.springframework.data.repository.CrudRepository;

public interface InputRepository extends CrudRepository<InputDetail,Long> {
}
