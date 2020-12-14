//package com.report.demo.entity;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.sql.Date;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "company")
//public class Company {
//
//    @Id
//    @GeneratedValue
//    private int id;
//    private String company_name;
//    private String company_hotline;
//    private String company_address;
//    private String company_desc;
//    private Date create_at;
//    private Date update_at;
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getCompany_name() {
//        return company_name;
//    }
//
//    public void setCompany_name(String company_name) {
//        this.company_name = company_name;
//    }
//
//    public String getCompany_hotline() {
//        return company_hotline;
//    }
//
//    public void setCompany_hotline(String company_hotline) {
//        this.company_hotline = company_hotline;
//    }
//
//    public String getCompany_address() {
//        return company_address;
//    }
//
//    public void setCompany_address(String company_address) {
//        this.company_address = company_address;
//    }
//
//    public String getCompany_desc() {
//        return company_desc;
//    }
//
//    public void setCompany_desc(String company_desc) {
//        this.company_desc = company_desc;
//    }
//
//    public Date getCreate_at() {
//        return create_at;
//    }
//
//    public void setCreate_at(Date create_at) {
//        this.create_at = create_at;
//    }
//
//    public Date getUpdate_at() {
//        return update_at;
//    }
//
//    public void setUpdate_at(Date update_at) {
//        this.update_at = update_at;
//    }
//}
