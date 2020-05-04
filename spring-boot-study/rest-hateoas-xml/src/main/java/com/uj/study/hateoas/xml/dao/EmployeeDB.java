package com.uj.study.hateoas.xml.dao;

import com.uj.study.hateoas.xml.model.EmployeeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：unclejet
 * @date ：Created in 2020/4/30 7:12
 * @description：
 * @modified By：
 * @version:
 */
public class EmployeeDB {
    public static List<EmployeeVO> getEmployeeList()
    {
        List<EmployeeVO> list = new ArrayList<>();

        EmployeeVO empOne = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2, "Amit", "Singhal", "asinghal@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3, "Kirti", "Mishra", "kmishra@gmail.com");

        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);

        return list;
    }
}
