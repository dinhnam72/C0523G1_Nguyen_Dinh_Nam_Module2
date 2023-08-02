package case_study.service;

import case_study.model.furama.Facility;
import case_study.model.furama.House;
import case_study.model.furama.Room;
import case_study.model.furama.Villa;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    public static IFacilityRepository facilityRepository = new FacilityRepository();
    private static final String REX_IDVILLA = "^SVRO[-]\\d{4}$";
    private static final String REX_IDHOUSE = "^SVHO[-]\\d{4}$";
    private static final String REX_IDROOM = "^SVRO[-]\\d{4}$";
    private static final String REX_NAME = "^[A-Z][a-z]*\\s([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";

    @Override
    public void displayFacility() {
        Map<Facility, Integer> facilityMap = facilityRepository.getALlFacility();
        for (Facility facility : facilityMap.keySet()) {
            System.out.println(facility + " - Value: " + facilityMap.get(facility));
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addFacilityVilla() {
        String id;
        do {
            System.out.print("Input idFacility: ");
            id = scanner.nextLine();
            if (!id.matches(REX_IDVILLA)) {
                System.out.println("Id không đúng định dạng SVXX_YYYY (Trong đó XX:VL và YYYY là các số từ 0-9)");
            }
        } while (!id.matches(REX_IDVILLA));
        String name;
        do {
            System.out.print("Input nameFacility: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên phải bắt đầu bằng chữ hoa");
            }
        } while (!name.matches(REX_NAME));
        double area = 0;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Input areaFacility: ");
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 30) {
                    System.out.println("Bên chúng tôi chỉ có phòng trên 30m2");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số.");
                flag = true;
            }
        } while (flag == true);
        int costs = 0;
        do {
            flag = false;
            try {
                System.out.print("Input costsFacility: ");
                costs = Integer.parseInt(scanner.nextLine());
                if (costs <= 0) {
                    System.out.println("Tiền thuê nhập số dương");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        int maxPeople = 0;
        do {
            flag = false;
            try {
                System.out.println("Input maxPeople: ");
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople <= 0 && maxPeople >= 20) {
                    System.out.println("Số người bạn nhập không đúng điều kiện (0<n<20)");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        String rentalType;
        do {
            System.out.print("Input rentalType: ");
            rentalType = scanner.nextLine();
            if (!rentalType.matches(REX_NAME)) {
                System.out.println("Nhập chưa đúng type");
            }
        } while (!rentalType.matches(REX_NAME));
        String roomStandard;
        do {
            System.out.print("Input roomStandard: ");
            roomStandard = scanner.nextLine();
            if (!roomStandard.matches(REX_NAME)) {
                System.out.println("Chữ cái đầu viết hoa");
            }
        } while (!roomStandard.matches(REX_NAME));

        double swimmingArea = 0;
        do {
            flag = false;
            try {
                System.out.print("Input swimmingArea: ");
                swimmingArea = Double.parseDouble(scanner.nextLine());
                if (swimmingArea > 0) {
                    System.out.println("Diện tích phải lớn hơn 0");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        int floor = 0;
        do {
            flag = false;
            try {
                System.out.print("Input floorFacility: ");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor < 1) {
                    System.out.println("Số tâầng phải lớn 0");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        Facility villa = new Villa(id, name, area, costs, maxPeople, rentalType, roomStandard, swimmingArea, floor);
        facilityRepository.addFacility(villa);
    }

    @Override
    public void addFacilityHouse() {
        String id;
        do {
            System.out.print("Input idFacility: ");
            id = scanner.nextLine();
            if (!id.matches(REX_IDHOUSE)) {
                System.out.println("Id không đúng định dạng SVXX_YYYY (Trong đó XX:HO và YYYY là các số từ 0-9)");
            }
        } while (!id.matches(REX_IDHOUSE));
        String name;
        do {
            System.out.print("Input nameFacility: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên phải bắt đầu bằng chữ hoa");
            }
        } while (!name.matches(REX_NAME));
        double area = 0;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Input areaFacility: ");
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 30) {
                    System.out.println("Bên chúng tôi chỉ có phòng trên 30m2");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số.");
                flag = true;
            }
        } while (flag == true);
        int costs = 0;
        do {
            flag = false;
            try {
                System.out.print("Input costsFacility: ");
                costs = Integer.parseInt(scanner.nextLine());
                if (costs <= 0) {
                    System.out.println("Tiền thuê nhập số dương");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        int maxPeople = 0;
        do {
            flag = false;
            try {
                System.out.println("Input maxPeople: ");
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople <= 0 && maxPeople >= 20) {
                    System.out.println("Số người bạn nhập không đúng điều kiện (0<n<20)");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        String rentalType;
        do {
            System.out.print("Input rentalType: ");
            rentalType = scanner.nextLine();
            if (!rentalType.matches(REX_NAME)) {
                System.out.println("Nhập chưa đúng type");
            }
        } while (!rentalType.matches(REX_NAME));
        String roomStandard;
        do {
            System.out.print("Input roomStandard: ");
            roomStandard = scanner.nextLine();
            if (!roomStandard.matches(REX_NAME)) {
                System.out.println("Chữ cái đầu viết hoa");
            }
        } while (!roomStandard.matches(REX_NAME));
        int floor = 0;
        do {
            flag = false;
            try {
                System.out.print("Input floorFacility: ");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor < 1) {
                    System.out.println("Số tâầng phải lớn 0");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        Facility house = new House(id, name, area, costs, maxPeople, rentalType, roomStandard, floor);
        facilityRepository.addFacility(house);
    }

    @Override
    public void addFacilityRoom() {
        String id;
        do {
            System.out.print("Input idFacility: ");
            id = scanner.nextLine();
            if (!id.matches(REX_IDROOM)) {
                System.out.println("Id không đúng định dạng SVXX_YYYY (Trong đó XX:RO và YYYY là các số từ 0-9)");
            }
        } while (!id.matches(REX_IDROOM));
        String name;
        do {
            System.out.print("Input nameFacility: ");
            name = scanner.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Tên phải bắt đầu bằng chữ hoa");
            }
        } while (!name.matches(REX_NAME));
        double area = 0;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Input areaFacility: ");
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 30) {
                    System.out.println("Bên chúng tôi chỉ có phòng trên 30m2");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số.");
                flag = true;
            }
        } while (flag == true);
        int costs = 0;
        do {
            flag = false;
            try {
                System.out.print("Input costsFacility: ");
                costs = Integer.parseInt(scanner.nextLine());
                if (costs <= 0) {
                    System.out.println("Tiền thuê nhập số dương");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        int maxPeople = 0;
        do {
            flag = false;
            try {
                System.out.println("Input maxPeople: ");
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople <= 0 && maxPeople >= 20) {
                    System.out.println("Số người bạn nhập không đúng điều kiện (0<n<20)");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        String rentalType;
        do {
            System.out.print("Input rentalType: ");
            rentalType = scanner.nextLine();
            if (!rentalType.matches(REX_NAME)) {
                System.out.println("Nhập chưa đúng type");
            }
        } while (!rentalType.matches(REX_NAME));
        String roomStandard;
        do {
            System.out.print("Input roomStandard: ");
            roomStandard = scanner.nextLine();
            if (!roomStandard.matches(REX_NAME)) {
                System.out.println("Chữ cái đầu viết hoa");
            }
        } while (!roomStandard.matches(REX_NAME));

        double swimmingArea = 0;
        do {
            flag = false;
            try {
                System.out.print("Input swimmingArea: ");
                swimmingArea = Double.parseDouble(scanner.nextLine());
                if (swimmingArea > 0) {
                    System.out.println("Diện tích phải lớn hơn 0");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        int floor = 0;
        do {
            flag = false;
            try {
                System.out.print("Input floorFacility: ");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor < 1) {
                    System.out.println("Số tâầng phải lớn 0");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
                flag = true;
            }
        } while (flag);
        System.out.print("Input freeService: ");
        String freeService = scanner.nextLine();
        Facility room = new Room(id, name, area, costs, maxPeople, rentalType, freeService);
        facilityRepository.addFacility(room);
    }


    @Override
    public void displayFacilityMaintenance() {
        Map<Facility, Integer> facilityMaintenaceMap = facilityRepository.getFacilityMaintenance();
        for (Facility key : facilityMaintenaceMap.keySet()) {
            System.out.println(key + " - Number of bookings: " + facilityMaintenaceMap.get(key));
        }
    }

    @Override
    public void removeFacility() {
        System.out.print("Input idRemove: ");
        String idRemove = scanner.nextLine();
        Facility facility = facilityRepository.getById(idRemove);
        if(facility==null){
            System.out.println("Id không có trong hệ thộng");
        }else {
            facilityRepository.removeFacility(facility);
        }
    }
}
