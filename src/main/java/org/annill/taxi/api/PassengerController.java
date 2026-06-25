package org.annill.taxi.api;

import org.annill.taxi.api.model.PassengerDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passengers/")
public class PassengerController {

    private PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping("save")
    private void save(PassengerDto passenger) {
        passengerService.save(passenger);
    }

    @GetMapping("/{id}")
    private PassengerDto get(@PathVariable Long id) {
        return passengerService.get(id);
    }

    @DeleteMapping("/{id}")
    private void delete(Long id) {
        passengerService.delete(id);

    }

}
