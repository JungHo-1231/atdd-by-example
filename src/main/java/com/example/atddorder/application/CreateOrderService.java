package com.example.atddorder.application;

import com.example.atddorder.domain.PendingOrder;

public interface CreateOrderService {
     PendingOrder createOrderService(PendingOrderRequest request);
}
