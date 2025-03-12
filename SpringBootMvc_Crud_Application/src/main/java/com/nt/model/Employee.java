package com.nt.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp")
@Data
@NoArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empno;
    @Column(length=20)
    private String ename;
    @Column(length=20)
    private String job;
    private Float sal;
    private Integer deptno;
}