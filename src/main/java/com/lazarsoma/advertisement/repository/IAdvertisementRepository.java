package com.lazarsoma.advertisement.repository;

import com.lazarsoma.advertisement.model.Advertisement;
import org.springframework.data.repository.CrudRepository;

public interface IAdvertisementRepository extends CrudRepository<Advertisement, Long> {
}