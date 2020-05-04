package com.uj.study.hateoas.xml.controller;

import com.uj.study.hateoas.xml.dao.EmployeeDB;
import com.uj.study.hateoas.xml.model.EmployeeListVO;
import com.uj.study.hateoas.xml.model.EmployeeReport;
import com.uj.study.hateoas.xml.model.EmployeeVO;
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
        EmployeeListVO employeesList = new EmployeeListVO();

        for (EmployeeVO employee : EmployeeDB.getEmployeeList()) {
            employeesList.getEmployees().add(employee);
        }

        return employeesList;
    }

    @RequestMapping(value = "/employees/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) {
        if (id <= 3) {
            EmployeeVO employee = EmployeeDB.getEmployeeList().get(id - 1);
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity<EmployeeVO>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/employees/{id}/report")
    public ResponseEntity<EmployeeReport> getReportByEmployeeById(@PathVariable("id") int id) {
        //Do some operation and return report
        return null;
    }
}
