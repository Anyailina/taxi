package org.annill.taxi.api.repository;

import org.annill.taxi.api.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
