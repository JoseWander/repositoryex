package com.zetcode.service;

import com.zetcode.model.Country;
import java.util.List;

public interface ICountryService {

    public List<Country> findAll();
}