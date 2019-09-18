package com.lazarsoma.advertisement.service;

import com.lazarsoma.advertisement.model.User;
import com.lazarsoma.advertisement.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements IUserService {

  @Autowired
  private IUserRepository userRepository;

  @Override
  public void save(User user) {
    userRepository.save(user);
  }

  @Override
  public void delete(long id) {
    userRepository.delete(userRepository.findById(id).orElse(null));
  }

  @Override
  public List<User> findAll() {
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  @Override
  public User findById(long id) {
    return userRepository.findById(id).orElse(null);
  }
}