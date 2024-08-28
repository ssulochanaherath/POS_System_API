package lk.ijse.posapi.dto;

import jakarta.json.bind.annotation.JsonbDateFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO implements Serializable {
    private String orderId;
    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDate orderDate;
    private String customerId;
    private double totalAmount;
}
