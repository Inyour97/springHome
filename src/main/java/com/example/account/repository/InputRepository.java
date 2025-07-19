package com.example.account.repository;

import com.example.account.entity.InputDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface InputRepository extends CrudRepository<InputDetail,Long> {
    @Override
    Iterable<InputDetail> findAll();
}
