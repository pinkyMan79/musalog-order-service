package one.terenin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.terenin.dto.common.OrderProductInfo;
import one.terenin.dto.common.OrderStatus;
import one.terenin.entity.parent.AbstractEntity;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order_table")
public class OrderEntity extends AbstractEntity {

    @Column(name = "order_owner")
    private UUID orderOwner;
    @OneToMany
    @JoinColumn(name = "product")
    private Set<OrderProductInfoEntity> products;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
