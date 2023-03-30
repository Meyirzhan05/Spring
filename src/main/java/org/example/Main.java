package org.example;

import org.example.company.ITCompany;
import org.example.config.CompanyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfig.class);
//        ITCompany company = context.getBean("CompanyComponent", ITCompany.class);
        ITCompany company = context.getBean(ITCompany.class);
        System.out.println(company.getName());
        System.out.println(company.getDirector());
    }
}