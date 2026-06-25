package org.annill.taxi.api;

import java.util.Optional;
import org.annill.taxi.api.model.Passenger;
import org.annill.taxi.api.model.PassengerDto;
import org.annill.taxi.api.repository.PassengerRepository;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    private final PassengerConverter passengerConverter;
    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository, PassengerConverter passengerConverter) {
        this.passengerRepository = passengerRepository;
        this.passengerConverter = passengerConverter;
    }


    public void save(PassengerDto passenger) {
        passengerRepository.save(passengerConverter.convert(passenger));
    }

    public PassengerDto get(Long id) {
        Optional<Passenger> passengerOptional = passengerRepository.findById(id);
        if (passengerOptional.isEmpty() || passengerOptional.get().getAuditState().equals(AuditState.R)) {
            return new PassengerDto();
        }

        return passengerConverter.convert(passengerOptional.get());

    }

    public void delete(Long id) {
        Optional<Passenger> passengerOptional = passengerRepository.findById(id);
        if (passengerOptional.isEmpty()) {
            return;
        }

        passengerOptional.get().setAuditState(AuditState.R);

    }

}
