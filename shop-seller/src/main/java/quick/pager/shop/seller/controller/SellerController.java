package quick.pager.shop.seller.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quick.pager.common.constants.Constants;
import quick.pager.common.response.Response;
import quick.pager.shop.seller.dto.SellerLoginDTO;
import quick.pager.shop.seller.dto.SellerSubscribeDTO;

/**
 * 商家服务
 *
 * @author siguiyang
 */
@RestController
@RequestMapping(Constants.Module.SELLER)
public class SellerController {

    /**
     * 登陆
     */
    @PostMapping("/login")
    public Response login(SellerLoginDTO dto) {
        return new Response();
    }

    /**
     * 注册
     */
    @PostMapping("/subscribe")
    public Response subscribe(SellerSubscribeDTO dto) {
        return null;
    }

    /**
     * 商家信息
     */
    @PostMapping("/info")
    public Response sellerInfo() {
        return null;
    }
}
