package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Company {
    @Id
    private Long id;
    private String descriptionCompany;
    private String numberCNPJ;
    //endereço
    private String addressCompany;
    //bairro
    private String districtCompany;
    private String cityCompany;
    private String stateCompany;
    private String phoneNumberCompany;

}
