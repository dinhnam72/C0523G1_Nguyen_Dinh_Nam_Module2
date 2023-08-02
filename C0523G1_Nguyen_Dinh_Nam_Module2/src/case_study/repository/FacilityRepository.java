package case_study.repository;

import case_study.model.furama.Facility;
import case_study.model.furama.House;
import case_study.model.furama.Room;
import case_study.model.furama.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Facility, Integer> facilityList = new LinkedHashMap<>();


    static {
        Facility Villa = new Villa("SVVL-0001", "Nha Nghi", 200, 1000000, 10, "DAY", "5 Star", 100, 4);
        Facility House = new House("SVHO-0001", "Nha O", 160, 7200000, 10, "MONTH", "2 Star", 3);
        Facility Room = new Room("SVRO-0001", "Nha Nghi", 100, 1000000, 10, "DAY", "rger");
        facilityList.put(Villa, 0);
        facilityList.put(House, 0);
        facilityList.put(Room, 0);
    }


    @Override
    public Map<Facility, Integer> getALlFacility() {
        return facilityList;
    }

    @Override
    public void addFacility(Facility facility) {
        facilityList.put(facility, 0);
    }

    @Override
    public Map<Facility, Integer> getFacilityMaintenance() {
        Map<Facility, Integer> facilityMaintenaceMap = new LinkedHashMap<>();
        for (Facility key : facilityList.keySet()) {
            int numBookings = facilityList.get(key);
            if (numBookings >= 5) {
                facilityMaintenaceMap.put(key, numBookings);
            }
        }
        return facilityMaintenaceMap;
    }

    @Override
    public void removeFacility(Facility facility) {
        facilityList.remove(facility);
    }

    @Override
    public Facility getById(String id) {
        Map<Facility,Integer> facilityIntegerMap = getALlFacility();
        for (Map.Entry<Facility,Integer> entry: facilityIntegerMap.entrySet()){
                if(entry.getKey().getId().equals(id)){
                    return entry.getKey();
                }
        }
        return null;
    }
}
