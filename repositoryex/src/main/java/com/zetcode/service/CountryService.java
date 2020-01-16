package com.zetcode.service;

import com.zetcode.model.Country;
import com.zetcode.repository.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll() {

        var countries = (List<Country>) repository.findAll();
        return countries;
    }
}