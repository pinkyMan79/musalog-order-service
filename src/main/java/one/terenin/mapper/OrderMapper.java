package one.terenin.mapper;

import one.terenin.dto.request.OrderRequest;
import one.terenin.dto.response.OrderResponse;
import one.terenin.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderEntity map(OrderRequest request);
    @Mappings({
            @Mapping(target = "orderId", source = "id"),
            @Mapping(target = "ownerId", source = "orderOwner"),
            @Mapping(target = "message", ignore = true)
    })
    OrderResponse map(OrderEntity entity);
}
