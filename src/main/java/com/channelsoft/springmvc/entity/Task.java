package com.channelsoft.springmvc.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by yuanshun on 2015/1/19.
 */
@Entity
@Table(name="ss_task")
public class Task {
    private String title;
    private String description;
    private User user;

    @NotBlank
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @ManyToOne
    @JoinColumn(name="user_id")
    public User getUser() {
        return user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
