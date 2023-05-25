package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Instrument;
import com.nocturne.nocturne.repository.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstrumentServiceImpl implements InstrumentService {

    private final InstrumentRepository instrumentRepository;

    @Autowired
    public InstrumentServiceImpl(InstrumentRepository instrumentRepository) {
        this.instrumentRepository = instrumentRepository;
    }

    @Override
    public List<Instrument> getAllInstruments() {
        return instrumentRepository.findAll();
    }

    @Override
    public Instrument getInstrumentById(Long id) {
        Optional<Instrument> optionalManufacturer = instrumentRepository.findById(id);
        if(optionalManufacturer.isEmpty())
            throw new IllegalStateException("Instrument with id " + id + " does`t exist");
        return optionalManufacturer.get();
    }

    @Override
    public Instrument addInstrument(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }

    @Override
    public void deleteInstrumentById(Long id) {
        instrumentRepository.deleteById(id);
    }
}
