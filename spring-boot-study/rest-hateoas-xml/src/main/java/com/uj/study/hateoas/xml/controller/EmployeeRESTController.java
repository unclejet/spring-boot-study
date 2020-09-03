package com.uj.study.hateoas.xml.controller;

import com.uj.study.hateoas.xml.dao.EmployeeDB;
import com.uj.study.hateoas.xml.model.EmployeeListVO;
import com.uj.study.hateoas.xml.model.EmployeeReport;
import com.uj.study.hateoas.xml.model.EmployeeVO;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：unclejet
 * @date ：Created in 2020/4/30 7:10
 * @description：
 * @modified By：
 * @version:
 */
@RestController
public class EmployeeRESTController {

    @RequestMapping(value = "/employees")
    public EmployeeListVO getAllEmployees() {
        EmployeeListVO employeeListVO = new EmployeeListVO();
        for (EmployeeVO employee :
                EmployeeDB.getEmployeeList()) {
            Link link = ControllerLinkBuilder.linkTo(EmployeeRESTController.class)
                    .slash(employee.getEmployeeId())
                    .withSelfRel();
            employee.add(link);

            ResponseEntity<EmployeeReport> methodLinkBuilder = ControllerLinkBuilder.methodOn(EmployeeRESTController.class).getReportByEmployeeById(employee.getEmployeeId());
            Link reportLink = ControllerLinkBuilder.linkTo(methodLinkBuilder).withRel("employee-report");
            employee.add(reportLink);

            employeeListVO.getEmployees().add(employee);
        }

        Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(EmployeeRESTController.class).getAllEmployees()).withSelfRel();
        employeeListVO.add(selfLink);
        return employeeListVO;
    }

    @RequestMapping(value = "/employees/{id}")
    public HttpEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) {
        if (id <= 3) {
            EmployeeVO employee = EmployeeDB.getEmployeeList().get(id-1);

            //Self link
            Link selfLink = ControllerLinkBuilder
                    .linkTo(EmployeeRESTController.class)
                    .slash(employee.getEmployeeId())
                    .withSelfRel();

            //Method link
            Link reportLink = ControllerLinkBuilder
                    .linkTo(ControllerLinkBuilder.methodOn(EmployeeRESTController.class)
                            .getReportByEmployeeById(employee.getEmployeeId()))
                    .withRel("report");

            employee.add(selfLink);
//            employee.add(reportLink);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/employees/{id}/report")
    public ResponseEntity<EmployeeReport> getReportByEmployeeById(@PathVariable("id") int id) {
        //Do some operation and return report
        return null;
    }
}
