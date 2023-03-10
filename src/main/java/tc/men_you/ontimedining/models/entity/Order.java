package tc.men_you.ontimedining.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;


@Document("order")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private String id;
    private String deliveryTime;
    private String deliveryAddress;
    private Set<String> menuItemsId;
    private double totalPay;
    private boolean status;
    private String customerId;

}
