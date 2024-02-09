package com.keelient.soap.webservice.coursemanagement.bean;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private int id;
    private String name;
    private String description;
}
