package quick.pager.shop.manage.response;

import java.io.Serializable;
import lombok.Data;

@Data
public class LoginResponse implements Serializable {
    private static final long serialVersionUID = -4731844044049208511L;

    private String sysCode;

    private String sysName;

}
