package com.lazarsoma.advertisement.controller;

import com.lazarsoma.advertisement.model.Advertisement;
import com.lazarsoma.advertisement.model.User;
import com.lazarsoma.advertisement.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @Autowired
  IUserRepository iUserRepository;

  @GetMapping("/users")
  public String userList(Model model) {
    model.addAttribute("users", iUserRepository.findAll());
    return "users";
  }

  @GetMapping("/user/add")
  public String createUserForm(Model model) {
    model.addAttribute("user", new User());
    return "AddUser";
  }

  @PostMapping("/user/add")
  public String createUserSubmit(User user, String advertisementName) {
    Advertisement advertisement = new Advertisement(advertisementName, user);
    user.setAdvertisement(advertisement);
    iUserRepository.save(user);
    //iAdvertisementRepository.save(advertisement);
    return "redirect:/users";
  }
}