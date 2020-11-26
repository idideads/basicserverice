package org.whatever.basicserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.whatever.basicserver.domain.Company;

import java.util.List;

@Mapper
public interface CompanyMapper {

    @Select("select newid()")
    public String newId();

    @Select("select companyid,companyname,rowid,treecontrol,invoice,taxpayerno,regadd,regtel,bank,bankcode from ocompany")
    public List<Company> getAllCompany();

}
