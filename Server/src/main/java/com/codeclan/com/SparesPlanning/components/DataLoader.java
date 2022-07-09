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

//@Component
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

        //Add five random customers

        Customer codeClan = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("CodeClan")
                .engineerVisitsPerYear(2)
                .siteAddress("37 Castle Terrace")
                .sitePostCode("EH1 2EL")
                .build();

        Customer jerrys = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("Jerry's Cigar Shop")
                .engineerVisitsPerYear(4)
                .siteAddress("1 Royal Mile")
                .sitePostCode("EH1 1BB")
                .build();

        Customer chanter = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("The Chanter")
                .engineerVisitsPerYear(1)
                .siteAddress("30 Bread Street")
                .sitePostCode("EH3 9AF")
                .build();

        Customer sainsburys = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("Sainsbury's")
                .engineerVisitsPerYear(2)
                .siteAddress("102 West Port")
                .sitePostCode("EH3 9HS")
                .build();

        Customer edinburghFilmhouse = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("Edinburgh Filmhouse")
                .engineerVisitsPerYear(3)
                .siteAddress("88 Lothian Road")
                .sitePostCode("EH3 9BZ")
                .build();

        Customer hangingBat = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("The Hanging Bat")
                .engineerVisitsPerYear(4)
                .siteAddress("133 Lothian Road")
                .sitePostCode("EH3 9AB")
                .build();

        Unit RS5kg = Unit
                .builder()
                .unitType("RS5-10kg")
                .serialNumber("AB123")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020,5,17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2022, 8, 01).atStartOfDay())
                .customer(codeClan)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Unit RS16kg = Unit
                .builder()
                .unitType("RS16-20kg")
                .serialNumber("AB234")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2022, 8, 01).atStartOfDay())
                .customer(jerrys)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Unit RS24kg = Unit
                .builder()
                .unitType("RS24-30kg")
                .serialNumber("AB345")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2022, 8, 01).atStartOfDay())
                .customer(chanter)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Unit RS40kg = Unit
                .builder()
                .unitType("RS40kg")
                .serialNumber("AB456")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020,5,17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2022,8,1).atStartOfDay())
                .customer(sainsburys)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Unit RS50kg = Unit
                .builder()
                .unitType("RS50kg")
                .serialNumber("AB567")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020,5,17).atStartOfDay())
                .expectedRunHoursPerYear((1000))
                .nextServiceDate(LocalDate.of(2022,8,1).atStartOfDay())
                .customer(edinburghFilmhouse)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Unit RS60kg = Unit
                .builder()
                .unitType("RS60kg")
                .serialNumber("AB678")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020,5,17).atStartOfDay())
                .expectedRunHoursPerYear((1000))
                .nextServiceDate(LocalDate.of(2022,8,1).atStartOfDay())
                .customer(hangingBat)
                .parts(new ArrayList<>())
                .parts_history(new ArrayList<>())
                .build();

        Part snapRing = Part
                .builder()
                .partName("Snap Ring")
                .partNumber("DF1115497")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(2500)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part sealingSetForTank = Part
                .builder()
                .partName("Sealing set for tank")
                .partNumber("RS2599191")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(2500)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part scaleCollectorAndConnectionRing = Part
                .builder()
                .partName("Scale collector And connection ring")
                .partNumber("RS2599233")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(5000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part tankGasket = Part
                .builder()
                .partName("Tank gasket")
                .partNumber("DF1101516")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(5000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part collectorFoil = Part
                .builder()
                .partName("Collector foil")
                .partNumber("RS2579858")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(2500)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part steamOutletHose = Part
                .builder()
                .partName("Steam outlet hose")
                .partNumber("RS2579820")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(5000)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part hoseSetForLevelControl = Part
                .builder()
                .partName("Hose set for level control")
                .partNumber("RS2579888")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(5000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part floatAssembly = Part
                .builder()
                .partName("Float assembly")
                .partNumber("RS2579882")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(10000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part steamHoseNipple = Part
                .builder()
                .partName("Steam hose nipple")
                .partNumber("RS2579893")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part cylinderInsertWithFoil = Part
                .builder()
                .partName("Cylinder insert with foil")
                .partNumber("2579856")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part mainContactor25A = Part
                .builder()
                .partName("Main Contactor 25A")
                .partNumber("1115507")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part inletValve = Part
                .builder()
                .partName("Inlet Valve")
                .partNumber("2579874")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(20000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part waterCupCpl = Part
                .builder()
                .partName("Water cup cpl.")
                .partNumber("2579884")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part hoseSetForDrainPump = Part
                .builder()
                .partName("Hose set for drain pump")
                .partNumber("2579887")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        Part hoseSetForInletAndDrain = Part
                .builder()
                .partName("Hose set for inlet and drain")
                .partNumber("2579885")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .units(new ArrayList<>())
                .units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        customerRepo.save(codeClan);
        customerRepo.save(jerrys);
        customerRepo.save(chanter);
        customerRepo.save(sainsburys);
        customerRepo.save(edinburghFilmhouse);
        customerRepo.save(hangingBat);

        partRepo.save(snapRing);
        partRepo.save(sealingSetForTank);
        partRepo.save(scaleCollectorAndConnectionRing);
        partRepo.save(tankGasket);
        partRepo.save(collectorFoil);
        partRepo.save(steamOutletHose);
        partRepo.save(hoseSetForLevelControl);
        partRepo.save(floatAssembly);
        partRepo.save(steamHoseNipple);
        partRepo.save(cylinderInsertWithFoil);
        partRepo.save(mainContactor25A);
        partRepo.save(inletValve);
        partRepo.save(waterCupCpl);
        partRepo.save(hoseSetForDrainPump);
        partRepo.save(hoseSetForInletAndDrain);


        RS5kg.addPart(snapRing);
        RS5kg.addPart(sealingSetForTank);
        RS5kg.addPart(scaleCollectorAndConnectionRing);
        RS5kg.addPart(tankGasket);
        RS5kg.addPart(collectorFoil);
        RS5kg.addPart(steamOutletHose);
        RS5kg.addPart(hoseSetForLevelControl);
        RS5kg.addPart(floatAssembly);
        RS5kg.addPart(steamHoseNipple);
        RS5kg.addPart(cylinderInsertWithFoil);
        RS5kg.addPart(mainContactor25A);
        RS5kg.addPart(inletValve);
        RS5kg.addPart(waterCupCpl);
        RS5kg.addPart(hoseSetForDrainPump);
        RS5kg.addPart(hoseSetForInletAndDrain);

        unitRepo.save(RS5kg);

    }
}
