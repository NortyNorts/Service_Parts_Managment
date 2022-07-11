package com.codeclan.com.SparesPlanning.components;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.models.UnitPart;
import com.codeclan.com.SparesPlanning.repositories.CustomerRepo;
import com.codeclan.com.SparesPlanning.repositories.PartRepo;
import com.codeclan.com.SparesPlanning.repositories.UnitPartRepo;
import com.codeclan.com.SparesPlanning.repositories.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private PartRepo partRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private UnitRepo unitRepo;

    @Autowired
    private UnitPartRepo unitPartRepo;

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
                .serviceState("Service Booked")
                .build();

        Customer jerrys = Customer
                .builder()
                .companyName("Servest")
                .siteName("Jerry's Cigar Shop")
                .engineerVisitsPerYear(4)
                .siteAddress("1 Royal Mile")
                .sitePostCode("EH1 1BB")
                .serviceState("Awaiting Service Booking")
                .build();

        Customer chanter = Customer
                .builder()
                .companyName("Service Specialists")
                .siteName("The Chanter")
                .engineerVisitsPerYear(1)
                .siteAddress("30 Bread Street")
                .sitePostCode("EH3 9AF")
                .serviceState("Awaiting Service Booking")
                .build();

        Customer sainsburys = Customer
                .builder()
                .companyName("Sainsburys")
                .siteName("Sainsburys")
                .engineerVisitsPerYear(2)
                .siteAddress("102 West Port")
                .sitePostCode("EH3 9HS")
                .serviceState("Awaiting Service Booking")
                .build();

        Customer edinburghFilmhouse = Customer
                .builder()
                .companyName("Servest")
                .siteName("Edinburgh Filmhouse")
                .engineerVisitsPerYear(3)
                .siteAddress("88 Lothian Road")
                .sitePostCode("EH3 9BZ")
                .serviceState("Awaiting Service Booking")
                .build();

        Customer hangingBat = Customer
                .builder()
                .companyName("Service Group")
                .siteName("The Hanging Bat")
                .engineerVisitsPerYear(4)
                .siteAddress("133 Lothian Road")
                .sitePostCode("EH3 9AB")
                .serviceState("Awaiting Service Booking")
                .build();

        Customer codeBase = Customer
                .builder()
                .companyName("CodeBase")
                .siteName("CodeBase")
                .engineerVisitsPerYear(1)
                .siteAddress("37a Castle Terrace")
                .sitePostCode("EH1 2EL")
                .serviceState("Service Booked")
                .build();

        Part snapRing = Part
                .builder()
                .partName("Snap Ring")
                .partNumber("DF1115497")
                .hoursRun(0)
                .changeByHour(2500)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                ////.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart snapRingUP = new UnitPart();
        snapRingUP.setPart(snapRing);
//
//        UnitPart snapRingUPR16 = new UnitPart();
//        snapRingUPRS16.setPart(snapRing);




        Part sealingSetForTank = Part
                .builder()
                .partName("Sealing set for tank")
                .partNumber("RS2599191")
                .hoursRun(0)
                .changeByHour(2500)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart sealingSetForTankUP = new UnitPart();
        sealingSetForTankUP.setPart(sealingSetForTank);

        Part scaleCollectorAndConnectionRing = Part
                .builder()
                .partName("Scale collector And connection ring")
                .partNumber("RS2599233")
                .hoursRun(0)
                .changeByHour(5000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart scaleCollectorAndConnectionRingUP = new UnitPart();
        scaleCollectorAndConnectionRingUP.setPart(scaleCollectorAndConnectionRing);
//        unitPartRepo.(scaleCollectorAndConnectionRingUP);

        Part tankGasket = Part
                .builder()
                .partName("Tank gasket")
                .partNumber("DF1101516")
                .hoursRun(0)
                .changeByHour(5000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart tankGasketUP = new UnitPart();
        tankGasketUP.setPart(tankGasket);
//        unitPartRepo.save(tankGasketUP);

        Part tankGasket1640 = Part
                .builder()
                .partName("Tank gasket 16-40")
                .partNumber("1100966")
                .hoursRun(0)
                .changeByHour(5000)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart tankGasket1640UP = new UnitPart();
        tankGasket1640UP.setPart(tankGasket1640);
//        unitPartRepo.save(tankGasket1640UP);

        Part collectorFoil = Part
                .builder()
                .partName("Collector foil")
                .partNumber("RS2579858")
                .hoursRun(0)
                .changeByHour(2500)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart collectorFoilUP = new UnitPart();
        collectorFoilUP.setPart(collectorFoil);
//        unitPartRepo.save(collectorFoilUP);

        Part collectorFoil1640 = Part
                .builder()
                .partName("Collector foil 16-40")
                .partNumber("DF1119796")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart collectorFoil1640UP = new UnitPart();
        collectorFoil1640UP.setPart(collectorFoil1640);
//        unitPartRepo.save(collectorFoil1640UP);

        Part steamOutletHose = Part
                .builder()
                .partName("Steam outlet hose")
                .partNumber("RS2579820")
                .hoursRun(0)
                .changeByHour(5000)
                .changeByNumberOfMonths(12)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart steamOutletHoseUP = new UnitPart();
        steamOutletHoseUP.setPart(steamOutletHose);
//        unitPartRepo.save(steamOutletHoseUP);

        Part hoseSetForLevelControl = Part
                .builder()
                .partName("Hose set for level control")
                .partNumber("RS2579888")
                .hoursRun(0)
                .changeByHour(5000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart hoseSetForLevelControlUP = new UnitPart();
        hoseSetForLevelControlUP.setPart(hoseSetForLevelControl);
//        unitPartRepo.save(hoseSetForLevelControlUP);

        Part hoseSetForLevelControl1640 = Part
                .builder()
                .partName("Hose set for level control 16-40")
                .partNumber("RS2579899")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart hoseSetForLevelControl1640UP = new UnitPart();
        hoseSetForLevelControl1640UP.setPart(hoseSetForLevelControl1640);
//        unitPartRepo.save(hoseSetForLevelControl1640UP);

        Part floatAssembly = Part
                .builder()
                .partName("Float assembly")
                .partNumber("RS2579882")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart floatAssemblyUP = new UnitPart();
        floatAssemblyUP.setPart(floatAssembly);
//        unitPartRepo.save(floatAssemblyUP);

        Part steamHoseNipple = Part
                .builder()
                .partName("Steam hose nipple")
                .partNumber("RS2579893")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart steamHoseNippleUP = new UnitPart();
        steamHoseNippleUP.setPart(steamHoseNipple);
//        unitPartRepo.save(steamHoseNippleUP);

        Part cylinderInsertWithFoil = Part
                .builder()
                .partName("Cylinder insert with foil")
                .partNumber("2579856")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart cylinderInsertWithFoilUP = new UnitPart();
        cylinderInsertWithFoilUP.setPart(cylinderInsertWithFoil);
//        unitPartRepo.save(cylinderInsertWithFoilUP);

        Part cylinderInsertWithFoil1640 = Part
                .builder()
                .partName("Cylinder insert with foil 16-40")
                .partNumber("2557692")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart cylinderInsertWithFoil1640UP = new UnitPart();
        cylinderInsertWithFoil1640UP.setPart(cylinderInsertWithFoil1640);
//        unitPartRepo.save(cylinderInsertWithFoil1640UP);

        Part mainContactor25A = Part
                .builder()
                .partName("Main Contactor 25A")
                .partNumber("1115507")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(1)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart mainContactor25AUP = new UnitPart();
        mainContactor25AUP.setPart(mainContactor25A);
//        unitPartRepo.save(mainContactor25AUP);

        Part mainContactor32A = Part
                .builder()
                .partName("Main Contactor 32A")
                .partNumber("1115509")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart mainContactor32AUP = new UnitPart();
        mainContactor32AUP.setPart(mainContactor32A);
//        unitPartRepo.save(mainContactor32AUP);

        Part mainContactor50A = Part
                .builder()
                .partName("Main Contactor 50A")
                .partNumber("1115511")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart mainContactor50AUP = new UnitPart();
        mainContactor50AUP.setPart(mainContactor50A);
//        unitPartRepo.save(mainContactor50AUP);

        Part mainContactor80A = Part
                .builder()
                .partName("Main Contactor 80A")
                .partNumber("1117502")
                .hoursRun(0)
                .changeByHour(10000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart mainContactor80AUP = new UnitPart();
        mainContactor80AUP.setPart(mainContactor80A);
//        unitPartRepo.save(mainContactor80AUP);

        Part inletValve = Part
                .builder()
                .partName("Inlet Valve")
                .partNumber("2579874")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart inletValveUP = new UnitPart();
        inletValveUP.setPart(inletValve);
//        unitPartRepo.save(inletValveUP);

        Part inletValve1640 = Part
                .builder()
                .partName("Inlet Valve 16-40")
                .partNumber("2579875")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(24)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(2)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart inletValve1640UP = new UnitPart();
        inletValve1640UP.setPart(inletValve1640);
//        unitPartRepo.save(inletValve1640UP);

        Part waterCupCpl = Part
                .builder()
                .partName("Water cup cpl.")
                .partNumber("2579884")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart waterCupCplUP = new UnitPart();
        waterCupCplUP.setPart(waterCupCpl);
//        unitPartRepo.save(waterCupCplUP);

        Part hoseSetForDrainPump = Part
                .builder()
                .partName("Hose set for drain pump")
                .partNumber("2579887")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart hoseSetForDrainPumpUP = new UnitPart();
        hoseSetForDrainPumpUP.setPart(hoseSetForDrainPump);
//        unitPartRepo.save(hoseSetForDrainPumpUP);

        Part hoseSetForDrainPump1640 = Part
                .builder()
                .partName("Hose set for drain pump 16-40")
                .partNumber("2579898")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart hoseSetForDrainPump1640UP = new UnitPart();
        hoseSetForDrainPump1640UP.setPart(hoseSetForDrainPump1640);
//        unitPartRepo.save(hoseSetForDrainPump1640UP);

        Part hoseSetForInletAndDrain = Part
                .builder()
                .partName("Hose set for inlet and drain")
                .partNumber("2579885")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart hoseSetForInletAndDrainUP = new UnitPart();
        hoseSetForInletAndDrainUP.setPart(hoseSetForInletAndDrain);
//        unitPartRepo.save(hoseSetForInletAndDrainUP);

        Part hoseSetForInletAndDrain1640 = Part
                .builder()
                .partName("Hose set for inlet and drain 16-40")
                .partNumber("2579896")
                .hoursRun(0)
                .changeByHour(20000)
                .changeByNumberOfMonths(36)
                .lastChangedDate(LocalDate.of(2020, 06, 03).atStartOfDay())
                .priority(3)
                .unitParts(new ArrayList<>())
                //.units_history(new ArrayList<>())
                .getDate(LocalDate.now())
                .build();

        UnitPart hoseSetForInletAndDrain1640UP = new UnitPart();
        hoseSetForInletAndDrain1640UP.setPart(hoseSetForInletAndDrain1640);
        //unitPartRepo.save(hoseSetForInletAndDrain1640UP);


        List<UnitPart> RS5unitParts = Arrays.asList(
                snapRingUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                tankGasketUP,
                collectorFoilUP,
                steamOutletHoseUP,
                hoseSetForLevelControlUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                cylinderInsertWithFoilUP,
                mainContactor25AUP,
                inletValveUP,
                waterCupCplUP,
                hoseSetForDrainPumpUP,
                hoseSetForInletAndDrainUP);

        List<UnitPart> RS16unitParts = Arrays.asList(
                snapRingUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                tankGasket1640UP,
                steamOutletHoseUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                cylinderInsertWithFoil1640UP,
                mainContactor32AUP,
                mainContactor32AUP,
                collectorFoil1640UP,
                hoseSetForLevelControl1640UP,
                inletValve1640UP,
                waterCupCplUP,
                hoseSetForDrainPump1640UP,
                hoseSetForInletAndDrain1640UP);


        List<UnitPart> RS24unitParts = Arrays.asList(
                snapRingUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                tankGasket1640UP,
                steamOutletHoseUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                cylinderInsertWithFoil1640UP,
                mainContactor50AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                collectorFoil1640UP,
                hoseSetForLevelControl1640UP,
                inletValve1640UP,
                waterCupCplUP,
                hoseSetForDrainPump1640UP,
                hoseSetForInletAndDrain1640UP
        );

        List<UnitPart> RS40unitParts = Arrays.asList(
                snapRingUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                tankGasket1640UP,
                steamOutletHoseUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                cylinderInsertWithFoil1640UP,
                mainContactor80AUP,
                mainContactor50AUP,
                mainContactor50AUP,
                collectorFoil1640UP,
                hoseSetForLevelControl1640UP,
                inletValve1640UP,
                waterCupCplUP,
                hoseSetForDrainPump1640UP,
                hoseSetForInletAndDrain1640UP
        );

        List<UnitPart> RS50unitParts = Arrays.asList(
                snapRingUP,
                snapRingUP,
                sealingSetForTankUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                scaleCollectorAndConnectionRingUP,
                tankGasket1640UP,
                tankGasket1640UP,
                steamOutletHoseUP,
                steamOutletHoseUP,
                floatAssemblyUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                steamHoseNippleUP,
                cylinderInsertWithFoil1640UP,
                cylinderInsertWithFoil1640UP,
                mainContactor50AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                collectorFoil1640UP,
                collectorFoil1640UP,
                hoseSetForLevelControl1640UP,
                hoseSetForLevelControl1640UP,
                inletValve1640UP,
                inletValve1640UP,
                waterCupCplUP,
                waterCupCplUP,
                hoseSetForDrainPump1640UP,
                hoseSetForDrainPump1640UP,
                hoseSetForInletAndDrain1640UP,
                hoseSetForInletAndDrain1640UP
        );

        List<UnitPart> RS60unitParts = Arrays.asList(
                snapRingUP,
                snapRingUP,
                sealingSetForTankUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                scaleCollectorAndConnectionRingUP,
                tankGasket1640UP,
                tankGasket1640UP,
                steamOutletHoseUP,
                steamOutletHoseUP,
                floatAssemblyUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                steamHoseNippleUP,
                cylinderInsertWithFoil1640UP,
                cylinderInsertWithFoil1640UP,
                mainContactor50AUP,
                mainContactor50AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                mainContactor32AUP,
                collectorFoil1640UP,
                collectorFoil1640UP,
                hoseSetForLevelControl1640UP,
                hoseSetForLevelControl1640UP,
                inletValve1640UP,
                inletValve1640UP,
                waterCupCplUP,
                waterCupCplUP,
                hoseSetForDrainPump1640UP,
                hoseSetForDrainPump1640UP,
                hoseSetForInletAndDrain1640UP,
                hoseSetForInletAndDrain1640UP
        );

        List<UnitPart> RS80unitParts = Arrays.asList(
                snapRingUP,
                snapRingUP,
                sealingSetForTankUP,
                sealingSetForTankUP,
                scaleCollectorAndConnectionRingUP,
                scaleCollectorAndConnectionRingUP,
                tankGasket1640UP,
                tankGasket1640UP,
                steamOutletHoseUP,
                steamOutletHoseUP,
                floatAssemblyUP,
                floatAssemblyUP,
                steamHoseNippleUP,
                steamHoseNippleUP,
                cylinderInsertWithFoil1640UP,
                cylinderInsertWithFoil1640UP,
                mainContactor80AUP,
                mainContactor80AUP,
                mainContactor50AUP,
                mainContactor50AUP,
                mainContactor50AUP,
                mainContactor50AUP,
                collectorFoil1640UP,
                collectorFoil1640UP,
                hoseSetForLevelControl1640UP,
                hoseSetForLevelControl1640UP,
                inletValve1640UP,
                inletValve1640UP,
                waterCupCplUP,
                waterCupCplUP,
                hoseSetForDrainPump1640UP,
                hoseSetForDrainPump1640UP,
                hoseSetForInletAndDrain1640UP,
                hoseSetForInletAndDrain1640UP
        );


        Unit RS5kg = Unit
                .builder()
                .unitType("RS5-10kg")
                .serialNumber("AB123")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2022, 8, 01).atStartOfDay())
                .customer(codeClan)
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
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
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
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
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
                .build();

        Unit RS40kg = Unit
                .builder()
                .unitType("RS40kg")
                .serialNumber("AB456")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear(1000)
                .nextServiceDate(LocalDate.of(2022, 8, 1).atStartOfDay())
                .customer(sainsburys)
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
                .build();

        Unit RS50kg = Unit
                .builder()
                .unitType("RS50kg")
                .serialNumber("AB567")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear((1000))
                .nextServiceDate(LocalDate.of(2022, 8, 1).atStartOfDay())
                .customer(edinburghFilmhouse)
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
                .build();

        Unit RS60kg = Unit
                .builder()
                .unitType("RS60kg")
                .serialNumber("AB678")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear((1000))
                .nextServiceDate(LocalDate.of(2022, 8, 1).atStartOfDay())
                .customer(hangingBat)
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
                .build();

        Unit RS80kg = Unit
                .builder()
                .unitType("RS80kg")
                .serialNumber("AB789")
                .hoursRun(0)
                .dateInstalled(LocalDate.of(2020, 5, 17).atStartOfDay())
                .expectedRunHoursPerYear((1000))
                .nextServiceDate(LocalDate.of(2022, 8, 1).atStartOfDay())
                .customer(hangingBat)
                .unitParts(new ArrayList<>())
                //.parts_history(new ArrayList<>())
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

        unitRepo.save(RS5kg);
        unitRepo.save(RS16kg);
        unitRepo.save(RS24kg);
        unitRepo.save(RS40kg);
        unitRepo.save(RS50kg);
        unitRepo.save(RS60kg);
        unitRepo.save(RS80kg);

        for (UnitPart up: RS5unitParts){
            up.setId(null);
            RS5kg.addPart(up);
            up.setUnit(RS5kg);
            unitPartRepo.save(up);
        }

        for (UnitPart up: RS16unitParts){
            up.setId(null);
            RS16kg.addPart(up);
            up.setUnit(RS16kg);
            unitPartRepo.save(up);
        }

        for (UnitPart up: RS24unitParts){
            up.setId(null);
            RS24kg.addPart(up);
            up.setUnit(RS24kg);
            unitPartRepo.save(up);
        }

        for (UnitPart up: RS40unitParts){
            up.setId(null);
            RS40kg.addPart(up);
            up.setUnit(RS40kg);
            unitPartRepo.save(up);
        }

        for (UnitPart up: RS50unitParts){
            up.setId(null);
            RS50kg.addPart(up);
            up.setUnit(RS50kg);
            unitPartRepo.save(up);
        }

        for (UnitPart up: RS60unitParts){
            up.setId(null);
            RS60kg.addPart(up);
            up.setUnit(RS60kg);
            unitPartRepo.save(up);
        }

        for (UnitPart up: RS80unitParts){
            up.setId(null);
            RS80kg.addPart(up);
            up.setUnit(RS80kg);
            unitPartRepo.save(up);
        }

//        snapRingUPRS5.setUnit(RS5kg);
//        unitPartRepo.save(snapRingUPRS5)


    }
}
