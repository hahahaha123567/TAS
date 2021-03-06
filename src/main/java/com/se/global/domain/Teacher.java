package com.se.global.domain;

import java.util.ArrayList;

/**
 * 封装教师用户除了共有属性之外的属性
 *
 * @author Yusen
 * @version 1.0
 * @since 1.0
 */
public class Teacher extends User {
    private String title;
    private ArrayList<CourseKey> teaches;
    public static final String TITLE = "title";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<CourseKey> getTeaches() {
        return teaches;
    }

    public void setTeaches(ArrayList<CourseKey> teaches) {
        this.teaches = teaches;
    }
}
