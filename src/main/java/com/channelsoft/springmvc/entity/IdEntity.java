package com.channelsoft.springmvc.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by yuanshun on 2015/1/19.
 */
@MappedSuperclass
public class IdEntity {
    protected Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
