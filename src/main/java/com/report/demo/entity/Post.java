//package com.report.demo.entity;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.sql.Date;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "post")
//public class Post {
//
//    @Id
//    @GeneratedValue
//    private int id;
//    private String post_title;
//    private String post_desc;
//    private String company_id;
//    private String job_id;
//    private Date create_at;
//    private Date update_at;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getPost_title() {
//        return post_title;
//    }
//
//    public void setPost_title(String post_title) {
//        this.post_title = post_title;
//    }
//
//    public String getPost_desc() {
//        return post_desc;
//    }
//
//    public void setPost_desc(String post_desc) {
//        this.post_desc = post_desc;
//    }
//
//    public String getCompany_id() {
//        return company_id;
//    }
//
//    public void setCompany_id(String company_id) {
//        this.company_id = company_id;
//    }
//
//    public String getJob_id() {
//        return job_id;
//    }
//
//    public void setJob_id(String job_id) {
//        this.job_id = job_id;
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
