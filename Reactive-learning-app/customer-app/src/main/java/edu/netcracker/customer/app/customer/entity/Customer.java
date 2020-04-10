package edu.netcracker.customer.app.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import utils.models.Currency;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {
    @Id
    private Integer id;
    private String email;
    private String name;
    private String address;
    private Currency currency;
}