package org.annill.taxi.api;

import org.annill.taxi.api.model.Passenger;
import org.annill.taxi.api.model.PassengerDto;
import org.springframework.stereotype.Component;

@Component
public class PassengerConverter {


    public PassengerDto convert(Passenger passenger) {
        return new PassengerDto()
            .setId(passenger.getId())
            .setAge(passenger.getAge())
            .setName(passenger.getName())
            .setFemale(passenger.getFemale())
            .setAuditState(passenger.getAuditState());
    }


    public Passenger convert(PassengerDto passengerDto) {
        return new Passenger()
            .setId(passengerDto.getId())
            .setAge(passengerDto.getAge())
            .setName(passengerDto.getName())
            .setFemale(passengerDto.getFemale())
            .setAuditState(passengerDto.getAuditState());
    }



}
