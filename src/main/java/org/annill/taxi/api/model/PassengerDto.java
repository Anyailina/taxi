package org.annill.taxi.api.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.annill.taxi.api.AuditState;

@Data
@Accessors(chain = true)
public class PassengerDto {

    private Long id;

    private String name;

    private String female;

    private Integer age;

    private AuditState auditState;

}
