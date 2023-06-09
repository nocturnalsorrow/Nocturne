package com.nocturne.nocturne.controller;

import com.nocturne.nocturne.model.Instrument;
import com.nocturne.nocturne.service.InstrumentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instrument")
public class InstrumentController {

    private final InstrumentService instrumentService;

    @Autowired
    public InstrumentController(InstrumentService instrumentService) {
        this.instrumentService = instrumentService;
    }

    @GetMapping("/all")
    public List<Instrument> getAllInstruments() {
        return instrumentService.getAllInstruments();
    }

//    @GetMapping("/all")
//    public String getAllInstruments(Model model) {
//        List<Instrument> instruments = instrumentService.getAllInstruments();
//        model.addAttribute("instruments", instruments);
//        return "instruments"; // Возвращает имя шаблона представления без расширения
//    }


    @GetMapping("/getbyid/{id}")
    public Instrument getInstrumentById(@PathVariable("id") Long id){
        return instrumentService.getInstrumentById(id);
    }

    @PostMapping("/add")
    public Instrument addInstrument(@RequestBody Instrument instrument) {
        return instrumentService.addInstrument(instrument);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInstrumentById(@PathVariable("id") Long id){
        instrumentService.deleteInstrumentById(id);
    }
}
