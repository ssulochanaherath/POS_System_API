package lk.ijse.posapi.entity.java.lk.ijse.posapi.dto;

import lk.ijse.posapi.dto.OrderDTO;
import lk.ijse.posapi.dto.OrderDetailDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequestDTO implements Serializable {
    private OrderDTO orderDTO;
    private List<OrderDetailDTO> orderDetailDTOS;
}
