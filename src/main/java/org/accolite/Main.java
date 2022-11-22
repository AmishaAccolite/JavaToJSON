package org.accolite;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Employee emp = new Employee();
            emp.setId(6870);
            emp.setName("Amisha Gupta");
            emp.setDesignation("SWE");
            emp.setAge(22);
            Employee emp2 = new Employee();
            emp2.setId(6891);
            emp2.setName("Ridhi Kar");
            emp2.setDesignation("SWE");
            emp2.setAge(22);
            Employee emp3 = new Employee();
            emp3.setId(6895);
            emp3.setName("Aditya Sarthak");
            emp3.setDesignation("QA");
            emp3.setAge(24);
            String jsonEmp = objectMapper.writeValueAsString(emp);
            String jsonEmp2 = objectMapper.writeValueAsString(emp2);
            String jsonEmp3 = objectMapper.writeValueAsString(emp3);

            System.out.println(jsonEmp);
            System.out.println(jsonEmp2);
            System.out.println(jsonEmp3);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}