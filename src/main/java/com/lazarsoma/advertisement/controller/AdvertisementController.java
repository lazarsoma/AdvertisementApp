package com.lazarsoma.advertisement.controller;

import com.lazarsoma.advertisement.model.Advertisement;
import com.lazarsoma.advertisement.model.User;
import com.lazarsoma.advertisement.repository.IAdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdvertisementController {

  @Autowired
  IAdvertisementRepository iAdvertisementRepository;

  @GetMapping("/advertisements")
  public String advertisementList(Model model) {
    model.addAttribute("advertisements", iAdvertisementRepository.findAll());
    return "advertisements";
  }

  @GetMapping("/advertisement/add")
  public String createAdvertisementForm(Model model) {
    model.addAttribute("advertisement", new Advertisement());
    return "AddAdvertisement";
  }

  @PostMapping("/advertisement/add")
  public String createAssigneeSubmit(Advertisement advertisement, String userName) {
    User user = new User(userName, advertisement);
    advertisement.setUser(user);
    iAdvertisementRepository.save(advertisement);
    return "redirect:/advertisements";
  }
}