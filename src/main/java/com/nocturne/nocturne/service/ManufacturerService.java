package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    List<Manufacturer> getAllManufacturers();

    Manufacturer getManufacturerById(Long id);

    Manufacturer addManufacturer(Manufacturer manufacturer);

    void deleteManufacturerById(Long id);
}
