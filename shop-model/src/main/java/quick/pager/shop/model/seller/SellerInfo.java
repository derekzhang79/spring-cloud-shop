package quick.pager.shop.model.seller;

import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.shop.model.Model;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfo extends Model {
    private static final long serialVersionUID = 4052894917999366234L;

    private String phone;

    private String sellerName;

    private String address;

    private Integer sellerStatus;

    private String longitude;

    private String latitude;


}