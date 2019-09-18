package com.lazarsoma.advertisement.repository;

import com.lazarsoma.advertisement.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
}