package com.uj.study.hateoas.xml.model;

import org.springframework.hateoas.RepresentationModel;

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
public class EmployeeVO extends RepresentationModel<EmployeeVO> {
//    private static final long serialVersionUID = 1L;

    public EmployeeVO(Integer id, String firstName, String lastName, String email) {
        super();
        this.employeeId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public EmployeeVO() {

    }

    @XmlAttribute
    private Integer employeeId;

    @XmlElement
    private String firstName;

    @XmlElement
    private String lastName;

    @XmlElement
    private String email;

    //removed getters and setters for readability

    @Override
    public String toString() {
        return "EmployeeVO [id=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + "]";
    }
}
