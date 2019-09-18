package com.lazarsoma.advertisement.service;

import com.lazarsoma.advertisement.model.User;
import java.util.List;

public interface IUserService {
  void save(User user);
  void delete(long id);
  List<User> findAll();
  User findById(long id);
}