package com.zetcode.controller;

import com.zetcode.model.Country;
import com.zetcode.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RestController
public class MyController {

    @Autowired
    ICountryService countryService;

    @RequestMapping("/showCountries")
    public ModelAndView findCities() {

        var countries = (List<Country>) countryService.findAll();

        var params = new HashMap<String, Object>();
        params.put("countries", countries);

        return new ModelAndView("showCountries", params);
    }
    

    @RequestMapping("/countries")
    public List<Country> getCountries() {
    	
        return countryService.findAll();
    }
}