package com.kalakota.sb.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee implements Serializable
{
    @Id
    @GeneratedValue
    private int employeeId;
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

}
