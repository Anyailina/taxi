package org.annill.taxi;

import org.springframework.boot.SpringApplication;

public class TestTaxiApplication {

    public static void main(String[] args) {
        SpringApplication.from(TaxiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
