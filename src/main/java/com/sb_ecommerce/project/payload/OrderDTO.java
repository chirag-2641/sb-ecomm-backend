package com.sb_ecommerce.project.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long orderId;

    @Email(message = "Invalid email format")
    @NotNull(message = "Email is required")
    private String email;

    @NotNull(message = "Order items list cannot be null")
    private List<OrderItemDTO> orderItems;

    @NotNull(message = "Order date cannot be null")
    private LocalDate orderDate;

    @NotNull(message = "Payment details are required")
    private PaymentDTO payment;

    @NotNull(message = "Total amount is required")
    private Double totalAmount;

    @NotNull(message = "Order status is required")
    private String orderStatus;

    @NotNull(message = "Address ID is required")
    private Long addressId;
}
