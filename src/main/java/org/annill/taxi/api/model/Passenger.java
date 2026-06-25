package org.annill.taxi.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;
import org.annill.taxi.api.AuditState;

@Table(name = "passenger")
@Entity
@Data
@Accessors(chain = true)
public class Passenger {

    @Id
    private Long id;

    private String name;

    private String female;

    private Integer age;

    private String password;

    private AuditState auditState;
}
