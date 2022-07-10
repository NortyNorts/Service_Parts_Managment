package com.codeclan.com.SparesPlanning;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.models.Unit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class CustomerTest {

    Customer customer1;
    Unit unit1;
    Part part1;
    Part part2;


    @BeforeEach
    public void before(){

        part1 = Part
                .builder()
                .partName("Snap Ring")
                .partNumber("AB123")
                .hoursRun(1000)
                .changePart(false)
                .changeByHour(2000)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .build();

        part2 = Part
                .builder()
                .partName("Snap Ring")
                .partNumber("AB123")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(2000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2022, 06, 03).atStartOfDay())
                .priority(1)
                .build();

        unit1 = Unit
                .builder()
                .unitType("RS5kg")
                .serialNumber("AB123")
                .hoursRun(1000)
                .dateInstalled(LocalDate.of(2020,05,17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2023, 01, 01).atStartOfDay())
                .parts(new ArrayList<>())
                .build();

        customer1 = Customer
                .builder()
                .companyName("CodeClan")
                .siteName("CodeClanHouse")
                .engineerVisitsPerYear(2)
                .siteAddress("Castle Terrace EH2 1HR")
                .units(new ArrayList<>())
                .build();

    }

    @Test
    public void canFindCustomer(){

    }


    @Test
    public void canAddPartToUnit(){
        unit1.addPart(part1);
        assertEquals(1, unit1.getParts().size());
    }

    @Test
    public void canAddUnitToCustomer(){
        unit1.addPart(part1);
        customer1.addUnit(unit1);
        assertEquals(1, customer1.getUnits().size());
    }

    @Test
    public void canSetUnitHoursRun(){
        unit1.setHoursRun(2000);
        assertEquals(2000, unit1.getHoursRun());
    }

    @Test
    public void canIncreaseUnitAndPartHoursRun(){
        int enteredHourRun = 2000;
        unit1.increaseHoursRun(enteredHourRun, unit1);
        part1.increaseHoursRun(unit1, part1);
        assertEquals(1000, unit1.getIncreasedRunHours());
        assertEquals(2000, part1.getHoursRun());
        assertEquals(2000, unit1.getHoursRun());
    }

    @Test
    public void partDoesNotNeedChanged(){
        assertFalse(part1.isChangePart());
    }

    @Test
    public void partDoesNeedChanged(){
        part1.setChangePart(true);
        assertTrue(part1.isChangePart());
    }

    @Test
    public void increaseHoursToPartNeedingChanged(){
        int enteredHourRun = 2000;
        unit1.increaseHoursRun(enteredHourRun, unit1);
        part1.increaseHoursRun(unit1, part1);
        part1.checkPartChange(unit1, part1);
        assertTrue(part1.isChangePart());
    }

    @Test
    public void canChangePart(){
        unit1.addPart(part1);
        unit1.addPart(part2);
        unit1.changePart(part2);
        assertEquals(0, part2.getHoursRun());
        assertEquals(LocalDate.now().atStartOfDay(), part2.getLastChangedDate());
    }

    @Test
    public void canCheckPartsDueForNextService(){
        int enteredHourRun = 1000;
        unit1.addPart(part1);
        unit1.addPart(part2);
        customer1.addUnit(unit1);
        unit1.increaseHoursRun(enteredHourRun,unit1);
        part1.increaseHoursRun(unit1, part1);
        part2.increaseHoursRun(unit1, part2);
        unit1.nextService(customer1, unit1);
        part1.checkPartChange(unit1, part1);
        part2.checkPartChange(unit1, part2);
        assertTrue(part1.isChangePart());
        assertFalse(part2.isChangePart());
    }
}
