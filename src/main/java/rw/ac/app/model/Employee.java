package rw.ac.app.model;

import jakarta.persistence.*;
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int emp_id;

    private String firstname;
    private String lastname;
    private String institution;
    private String position;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String firstname, String lastname, String institution, String position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.institution = institution;
        this.position = position;
    }

    // Getters and Setters
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}