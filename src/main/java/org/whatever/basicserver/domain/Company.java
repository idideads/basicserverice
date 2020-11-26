package org.whatever.basicserver.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Getter@Setter
public class Company {
//    companyid,companyname,rowid,treecontrol,invoice,taxpayerno,regadd,regtel,bank,bankcode
    private String companyId;
    private String companyName;
    private String rowid;
    private String treeControl;
    private String invoice;
    private String taxPayerNo;
    private String regAdd;
    private String regTel;
    private String bank;
    private String bankCode;
}
