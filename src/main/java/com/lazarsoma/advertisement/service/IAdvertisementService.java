package com.lazarsoma.advertisement.service;

import com.lazarsoma.advertisement.model.Advertisement;
import java.util.List;

public interface IAdvertisementService {
  void save(Advertisement advertisement);
  void delete(long id);
  List<Advertisement> findAll();
  Advertisement findById(long id);
}