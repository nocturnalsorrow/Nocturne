package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Manufacturer;
import com.nocturne.nocturne.repository.ManufacturerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    private final ManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer getManufacturerById(Long id) {
        Optional<Manufacturer> optionalManufacturer = manufacturerRepository.findById(id);
        if(optionalManufacturer.isEmpty())
            throw new IllegalStateException("Manager with id " + id + " doesn`t exist");
        return optionalManufacturer.get();
    }

    @Override
    public Manufacturer addManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @Override
    public void deleteManufacturerById(Long id) {
        manufacturerRepository.deleteById(id);
    }
}
