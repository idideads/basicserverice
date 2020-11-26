package org.whatever.basicserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.whatever.basicserver.domain.Company;
import org.whatever.basicserver.mapper.CompanyMapper;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyMapper companyMapper;

    @GetMapping("/newid")
    public String getNewId() {
        return companyMapper.newId();
    }

    @GetMapping("/allcompanys")
    public List<Company> getAllCompany() {
        return companyMapper.getAllCompany();
    }
}
