package one.terenin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.terenin.entity.parent.AbstractEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_info_table")
public class OrderProductInfoEntity extends AbstractEntity {

    @Column(name = "url_location")
    private String productLocation;
    @Column(name = "name")
    private String productName;
    @Column(name = "description")
    private String productDescription;
    @Column(name = "quality")
    private String productQuality;
    @Column(name = "product_count")
    private String productCount;
    @Column(name = "in_stock")
    private Boolean hasInStock;
    @ManyToOne
    @JoinColumn(name = "order_parent")
    private OrderEntity entity;

}
