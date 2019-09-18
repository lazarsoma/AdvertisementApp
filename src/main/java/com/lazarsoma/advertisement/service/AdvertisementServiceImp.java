package com.lazarsoma.advertisement.service;

import com.lazarsoma.advertisement.model.Advertisement;
import com.lazarsoma.advertisement.repository.IAdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class AdvertisementServiceImp implements IAdvertisementService {

  @Autowired
  private IAdvertisementRepository advertisementRepository;

  @Override
  public void save(Advertisement advertisement) {
    advertisementRepository.save(advertisement);
  }

  @Override
  public void delete(long id) {
    advertisementRepository.delete(advertisementRepository.findById(id).orElse(null));
  }

  @Override
  public List<Advertisement> findAll() {
    List<Advertisement> advertisements = new ArrayList<>();
    advertisementRepository.findAll().forEach(advertisements::add);
    return advertisements;
  }

  @Override
  public Advertisement findById(long id) {
    return advertisementRepository.findById(id).orElse(null);
  }
}