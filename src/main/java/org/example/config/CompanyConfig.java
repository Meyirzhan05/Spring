package org.example.config;

import org.example.company.ITCompany;
import org.example.company.employer.Employer;
import org.example.company.employer.ITRole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example.company")
public class CompanyConfig {
//    @Bean
//    @Primary
//    public ITCompany getITCompany(Employer<ITRole> director) {
//        ITCompany company = new ITCompany("SDU", 100);
//        company.setDirector(director);
//        return company;
//    }
//    @Bean
//    public ITCompany getAnotherITCompany() {
//        return new ITCompany("IITU", 200);
//    }

    @Bean
    public Employer<ITRole> getDirector() {
        return new Employer<>("Nurlykhan", 18, ITRole.Director) {
            @Override
            public void work() {
                System.out.println(this.getName() + " is directing");
            }
        };
    }

    @Bean("CompanyName")
    public String getCompanyName() {
        return "AITU";
    }

    @Bean("MaxEmployerCount")
    public int getCount() {
        return 100;
    }
}
