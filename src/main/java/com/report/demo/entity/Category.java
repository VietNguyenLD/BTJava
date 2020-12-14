package com.report.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    private int id;
    private String cate_title;
    private String cate_desc;
    private Date create_at;
    private Date update_at;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCate_title() {
        return cate_title;
    }

    public void setCate_title(String cate_title) {
        this.cate_title = cate_title;
    }

    public String getCate_desc() {
        return cate_desc;
    }

    public void setCate_desc(String cate_desc) {
        this.cate_desc = cate_desc;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
