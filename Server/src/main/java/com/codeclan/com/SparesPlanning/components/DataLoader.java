package com.codeclan.com.SparesPlanning.components;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.repositories.CustomerRepo;
import com.codeclan.com.SparesPlanning.repositories.PartRepo;
import com.codeclan.com.SparesPlanning.repositories.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private PartRepo partRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private UnitRepo unitRepo;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = Customer
                .builder()
                .companyName("CodeClan")
                .siteName("CodeClanHouse")
                .engineerVisitsPerYear(2)
                .siteAddress("Castle Terrace EH2 1HR")
                .build();



        Unit unit1 = Unit
                .builder()
                .serialNumber("AB123")
                .hoursRun(1000)
                .dateInstalled(LocalDate.of(2020,05,17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2023, 01, 01).atStartOfDay())
                .customer(customer1)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Part part1 = Part
                .builder()
                .partName("Snap Ring")
                .partNumber("AB123")
                .hoursRun(1000)
                .changePart(false)
                .changeByHour(2000)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .build();

        Part part2 = Part
                .builder()
                .partName("Snap Ring")
                .partNumber("AB123")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(2000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2022, 06, 03).atStartOfDay())
                .units(new ArrayList<>())
                .priority(1)
                .units_history(new ArrayList<>())
                .build();

        customerRepo.save(customer1);
        partRepo.save(part1);
        partRepo.save(part2);

        unit1.addPartHistory(part1);
        unit1.addPart(part1);
        unit1.addPart(part2);
        unitRepo.save(unit1);

    }
}
