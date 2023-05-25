package com.nocturne.nocturne.controller;

import com.nocturne.nocturne.model.Instrument;
import com.nocturne.nocturne.model.Manufacturer;
import com.nocturne.nocturne.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @Autowired
    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping("/all")
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerService.getAllManufacturers();
    }

    @PostMapping("/add")
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerService.addManufacturer(manufacturer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInstrumentById(@PathVariable("id") Long id){
        manufacturerService.deleteManufacturerById(id);
    }
}
