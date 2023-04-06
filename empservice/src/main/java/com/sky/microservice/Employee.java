package com.sky.microservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Employee {
 private int id;
 private String name;
 private String position;
 private long weight;
 private String sex;
 
}
