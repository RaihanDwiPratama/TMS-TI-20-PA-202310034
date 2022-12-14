package com.ibik.academicservices.academicservices.programs;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="program_study")
public class Program_study implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(length = 50)
  private String name;

  @Column(length = 20)
  private String description;

  @Column(length = 5)
  private String code;

  @Column(columnDefinition = "INT(11)")
  private int program_id;

  @Column(columnDefinition = "INT(11)")
  private int faculty_id;

  @Column(columnDefinition = "INT(11)")
  private int departement_id;

  @Column(nullable = false, columnDefinition = "TINYINT(4)")
  private boolean is_active;

  public Program_study() {
  }

  public Program_study(
    int id, 
    String name, 
    String description, 
    String code,
    int program_id,
    int faculty_id,
    int departement_id,
    boolean is_active
    ) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.code = code;
    this.program_id = program_id;
    this.is_active = is_active;
    this.faculty_id = faculty_id;
    this.departement_id = departement_id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getprogram_id() {
    return program_id;
  }

  public int getfaculty_id() {
    return faculty_id;
  }

  public int getdepartment_id() {
    return departement_id;
  }

  public void setIs_active(boolean is_active) {
    this.is_active = is_active;
  }
}