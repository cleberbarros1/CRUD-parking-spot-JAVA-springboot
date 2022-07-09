package com.parking.parkingproject.services;
import com.parking.parkingproject.models.ParkingSpotModel;
import com.parking.parkingproject.repositories.ParkingSotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    final ParkingSotRepository parkingSotRepository;

    public ParkingSpotService(ParkingSotRepository parkingSotRepository) {
        this.parkingSotRepository = parkingSotRepository;
    }

    @Transactional   //garante o rollback em caso de problemas durante a transação.
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public List<ParkingSpotModel> findAll() {
        return parkingSotRepository.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSotRepository.findById(id);
    }

    @Transactional   //garante o rollback em caso de problemas durante a transação.
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSotRepository.delete(parkingSpotModel);
    }
}
