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

        Customer codeBase = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("CodeBase")
                .engineerVisitsPerYear(1)
                .siteAddress("37a Castle Terrace")
                .sitePostCode("EH1 2EL")
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

        Unit RS80kg = Unit
                .builder()
                .unitType("RS80kg")
                .serialNumber("AB789")
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

        Part tankGasket1640 = Part
                .builder()
                .partName("Tank gasket 16-40")
                .partNumber("1100966")
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

        Part collectorFoil1640 = Part
                .builder()
                .partName("Collector foil 16-40")
                .partNumber("DF1119796")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
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

        Part hoseSetForLevelControl1640 = Part
                .builder()
                .partName("Hose set for level control 16-40")
                .partNumber("RS2579899")
                .hoursRun(0)
                .changePart(false)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
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

        Part cylinderInsertWithFoil1640 = Part
                .builder()
                .partName("Cylinder insert with foil 16-40")
                .partNumber("2557692")
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

        Part mainContactor32A = Part
                .builder()
                .partName("Main Contactor 32A")
                .partNumber("1115509")
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

        Part mainContactor50A = Part
                .builder()
                .partName("Main Contactor 50A")
                .partNumber("1115511")
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

        Part mainContactor80A = Part
                .builder()
                .partName("Main Contactor 80A")
                .partNumber("1117502")
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

        Part inletValve1640 = Part
                .builder()
                .partName("Inlet Valve 16-40")
                .partNumber("2579875")
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

        Part hoseSetForDrainPump1640 = Part
                .builder()
                .partName("Hose set for drain pump 16-40")
                .partNumber("2579898")
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

        Part hoseSetForInletAndDrain1640 = Part
                .builder()
                .partName("Hose set for inlet and drain 16-40")
                .partNumber("2579896")
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
        customerRepo.save(codeBase);

        partRepo.save(snapRing);
        partRepo.save(sealingSetForTank);
        partRepo.save(scaleCollectorAndConnectionRing);
        partRepo.save(tankGasket);
        partRepo.save(tankGasket1640);
        partRepo.save(collectorFoil);
        partRepo.save(collectorFoil1640);
        partRepo.save(steamOutletHose);
        partRepo.save(hoseSetForLevelControl);
        partRepo.save(hoseSetForLevelControl1640);
        partRepo.save(floatAssembly);
        partRepo.save(steamHoseNipple);
        partRepo.save(cylinderInsertWithFoil);
        partRepo.save(cylinderInsertWithFoil1640);
        partRepo.save(mainContactor25A);
        partRepo.save(mainContactor32A);
        partRepo.save(mainContactor50A);
        partRepo.save(mainContactor80A);
        partRepo.save(inletValve);
        partRepo.save(inletValve1640);
        partRepo.save(waterCupCpl);
        partRepo.save(hoseSetForDrainPump);
        partRepo.save(hoseSetForDrainPump1640);
        partRepo.save(hoseSetForInletAndDrain);
        partRepo.save(hoseSetForInletAndDrain1640);


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

        RS16kg.addPart(snapRing);
        RS16kg.addPart(sealingSetForTank);
        RS16kg.addPart(scaleCollectorAndConnectionRing);
        RS16kg.addPart(tankGasket1640);
        RS16kg.addPart(steamOutletHose);
        RS16kg.addPart(floatAssembly);
        RS16kg.addPart(steamHoseNipple);
        RS16kg.addPart(cylinderInsertWithFoil1640);
        RS16kg.addPart(mainContactor32A);
        RS16kg.addPart(mainContactor32A);
        RS16kg.addPart(collectorFoil1640);
        RS16kg.addPart(hoseSetForLevelControl1640);
        RS16kg.addPart(inletValve1640);
        RS16kg.addPart(waterCupCpl);
        RS16kg.addPart(hoseSetForDrainPump1640);
        RS16kg.addPart(hoseSetForInletAndDrain1640);
        unitRepo.save(RS16kg);

        RS24kg.addPart(snapRing);
        RS24kg.addPart(sealingSetForTank);
        RS24kg.addPart(scaleCollectorAndConnectionRing);
        RS24kg.addPart(tankGasket1640);
        RS24kg.addPart(steamOutletHose);
        RS24kg.addPart(floatAssembly);
        RS24kg.addPart(steamHoseNipple);
        RS24kg.addPart(cylinderInsertWithFoil1640);
        RS24kg.addPart(mainContactor50A);
        RS24kg.addPart(mainContactor32A); //both are technically secondary, but have the same part number. Do we need to create a new part for it?
        RS24kg.addPart(mainContactor32A);
        RS24kg.addPart(collectorFoil1640);
        RS24kg.addPart(hoseSetForLevelControl1640);
        RS24kg.addPart(inletValve1640);
        RS24kg.addPart(waterCupCpl);
        RS24kg.addPart(hoseSetForDrainPump1640);
        RS24kg.addPart(hoseSetForInletAndDrain1640);
        unitRepo.save(RS24kg);

        RS40kg.addPart(snapRing);
        RS40kg.addPart(sealingSetForTank);
        RS40kg.addPart(scaleCollectorAndConnectionRing);
        RS40kg.addPart(tankGasket1640);
        RS40kg.addPart(steamOutletHose);
        RS40kg.addPart(floatAssembly);
        RS40kg.addPart(steamHoseNipple);
        RS40kg.addPart(cylinderInsertWithFoil1640);
        RS40kg.addPart(mainContactor80A);
        RS40kg.addPart(mainContactor50A);
        RS40kg.addPart(mainContactor50A);
        RS40kg.addPart(collectorFoil1640);
        RS40kg.addPart(hoseSetForLevelControl1640);
        RS40kg.addPart(inletValve1640);
        RS40kg.addPart(waterCupCpl);
        RS40kg.addPart(hoseSetForDrainPump1640);
        RS40kg.addPart(hoseSetForInletAndDrain1640);
        unitRepo.save(RS40kg);

        RS50kg.addPart(snapRing);
        RS50kg.addPart(snapRing);
        RS50kg.addPart(sealingSetForTank);
        RS50kg.addPart(sealingSetForTank);
        RS50kg.addPart(scaleCollectorAndConnectionRing);
        RS50kg.addPart(scaleCollectorAndConnectionRing);
        RS50kg.addPart(tankGasket1640);
        RS50kg.addPart(tankGasket1640);
        RS50kg.addPart(collectorFoil1640);
        RS50kg.addPart(collectorFoil1640);
        RS50kg.addPart(steamOutletHose);
        RS50kg.addPart(steamOutletHose);
        RS50kg.addPart(floatAssembly);
        RS50kg.addPart(floatAssembly);
        RS50kg.addPart(hoseSetForLevelControl1640);
        RS50kg.addPart(hoseSetForLevelControl1640);
        RS50kg.addPart(steamHoseNipple);
        RS50kg.addPart(steamHoseNipple);
        RS50kg.addPart(inletValve1640);
        RS50kg.addPart(inletValve1640);
        RS50kg.addPart(cylinderInsertWithFoil1640);
        RS50kg.addPart(cylinderInsertWithFoil1640);
        RS50kg.addPart(waterCupCpl);
        RS50kg.addPart(waterCupCpl);
        RS50kg.addPart(hoseSetForDrainPump1640);
        RS50kg.addPart(hoseSetForDrainPump1640);
        RS50kg.addPart(hoseSetForInletAndDrain1640);
        RS50kg.addPart(hoseSetForInletAndDrain1640);
        RS50kg.addPart(mainContactor50A);
        RS50kg.addPart(mainContactor32A);
        RS50kg.addPart(mainContactor32A);
        RS50kg.addPart(mainContactor32A);
        RS50kg.addPart(mainContactor32A);
        unitRepo.save(RS50kg);

        RS60kg.addPart(snapRing);
        RS60kg.addPart(snapRing);
        RS60kg.addPart(sealingSetForTank);
        RS60kg.addPart(sealingSetForTank);
        RS60kg.addPart(scaleCollectorAndConnectionRing);
        RS60kg.addPart(scaleCollectorAndConnectionRing);
        RS60kg.addPart(tankGasket1640);
        RS60kg.addPart(tankGasket1640);
        RS60kg.addPart(collectorFoil1640);
        RS60kg.addPart(collectorFoil1640);
        RS60kg.addPart(steamOutletHose);
        RS60kg.addPart(steamOutletHose);
        RS60kg.addPart(floatAssembly);
        RS60kg.addPart(floatAssembly);
        RS60kg.addPart(hoseSetForLevelControl1640);
        RS60kg.addPart(hoseSetForLevelControl1640);
        RS60kg.addPart(steamHoseNipple);
        RS60kg.addPart(steamHoseNipple);
        RS60kg.addPart(inletValve1640);
        RS60kg.addPart(inletValve1640);
        RS60kg.addPart(cylinderInsertWithFoil1640);
        RS60kg.addPart(cylinderInsertWithFoil1640);
        RS60kg.addPart(waterCupCpl);
        RS60kg.addPart(waterCupCpl);
        RS60kg.addPart(hoseSetForDrainPump1640);
        RS60kg.addPart(hoseSetForDrainPump1640);
        RS60kg.addPart(hoseSetForInletAndDrain1640);
        RS60kg.addPart(hoseSetForInletAndDrain1640);
        RS60kg.addPart(mainContactor50A);
        RS60kg.addPart(mainContactor50A);
        RS60kg.addPart(mainContactor32A);
        RS60kg.addPart(mainContactor32A);
        RS60kg.addPart(mainContactor32A);
        RS60kg.addPart(mainContactor32A);
        unitRepo.save(RS60kg);

        RS80kg.addPart(snapRing);
        RS80kg.addPart(snapRing);
        RS80kg.addPart(sealingSetForTank);
        RS80kg.addPart(sealingSetForTank);
        RS80kg.addPart(scaleCollectorAndConnectionRing);
        RS80kg.addPart(scaleCollectorAndConnectionRing);
        RS80kg.addPart(tankGasket1640);
        RS80kg.addPart(tankGasket1640);
        RS80kg.addPart(collectorFoil1640);
        RS80kg.addPart(collectorFoil1640);
        RS80kg.addPart(steamOutletHose);
        RS80kg.addPart(steamOutletHose);
        RS80kg.addPart(floatAssembly);
        RS80kg.addPart(floatAssembly);
        RS80kg.addPart(hoseSetForLevelControl1640);
        RS80kg.addPart(hoseSetForLevelControl1640);
        RS80kg.addPart(steamHoseNipple);
        RS80kg.addPart(steamHoseNipple);
        RS80kg.addPart(inletValve1640);
        RS80kg.addPart(inletValve1640);
        RS80kg.addPart(cylinderInsertWithFoil1640);
        RS80kg.addPart(cylinderInsertWithFoil1640);
        RS80kg.addPart(waterCupCpl);
        RS80kg.addPart(waterCupCpl);
        RS80kg.addPart(hoseSetForDrainPump1640);
        RS80kg.addPart(hoseSetForDrainPump1640);
        RS80kg.addPart(hoseSetForInletAndDrain1640);
        RS80kg.addPart(hoseSetForInletAndDrain1640);
        RS80kg.addPart(mainContactor80A);
        RS80kg.addPart(mainContactor80A);
        RS80kg.addPart(mainContactor50A);
        RS80kg.addPart(mainContactor50A);
        RS80kg.addPart(mainContactor50A);
        RS80kg.addPart(mainContactor50A);
        unitRepo.save(RS80kg);




    }
}
