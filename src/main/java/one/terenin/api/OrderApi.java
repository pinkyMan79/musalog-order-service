package one.terenin.api;

import one.terenin.dto.common.OrderStatus;
import one.terenin.dto.request.OrderRequest;
import one.terenin.dto.response.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/order")
public interface OrderApi {

    @PostMapping("/create")
    ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest request);
    @GetMapping("/status/{orderId}")
    ResponseEntity<OrderStatus> checkOrderStatus(@PathVariable("orderId")UUID id);
}
