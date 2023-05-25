package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Instrument;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InstrumentService {
    List<Instrument> getAllInstruments();

    Instrument getInstrumentById(Long id);

    Instrument addInstrument(Instrument instrument);

    void deleteInstrumentById(Long id);


}
