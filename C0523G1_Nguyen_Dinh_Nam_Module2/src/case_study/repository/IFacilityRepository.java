package case_study.repository;

import case_study.model.furama.Facility;
import case_study.model.furama.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility,Integer> getALlFacility() ;
    void addFacility(Facility facility);
    Map<Facility,Integer> getFacilityMaintenance();
    void removeFacility(Facility facility);
    Facility getById(String id);
}
