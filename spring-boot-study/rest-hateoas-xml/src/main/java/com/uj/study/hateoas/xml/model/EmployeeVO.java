package com.uj.study.hateoas.xml.model;

import org.springframework.hateoas.ResourceSupport;

import javax.xml.bind.annotation.*;

/**
 * @author ：unclejet
 * @date ：Created in 2020/4/30 7:05
 * @description：
 * @modified By：
 * @version:
 */
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.NONE)
public class EmployeeVO extends ResourceSupport {
//    private static final long serialVersionUID = 1L;

    public EmployeeVO(Integer id, String firstName, String lastName, String email) {
        super();
        this.employeeId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public EmployeeVO() {
        super();
    }

    @XmlAttribute
    private Integer employeeId;

    @XmlElement
    private String firstName;

    @XmlElement
    private String lastName;

    @XmlElement
    private String email;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeVO [id=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + "]";
    }
}
