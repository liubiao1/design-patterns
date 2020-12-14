package com.liubiao.designpatterns;

import com.vip.adp.api.open.service.GoodsInfoRequest;

import java.util.UUID;

public class Vop {

    private static final String  SANDBOX_URL = "http://sandbox.vipapis.com";
    private static final String  URL = "https://gw.vipapis.com";


    public static void main(String[] args) {
        try {
            com.vip.adp.api.open.service.UnionGoodsServiceHelper.UnionGoodsServiceClient client = new com.vip.adp.api.open.service.UnionGoodsServiceHelper.UnionGoodsServiceClient();
            com.vip.osp.sdk.context.InvocationContext invocationContext = com.vip.osp.sdk.context.InvocationContext.Factory.getInstance();
            invocationContext.setAppKey("569c1ac0");
            invocationContext.setAppSecret("4CCAEB6A1A479459226389AEA7F67BEB");
            invocationContext.setAppURL(URL);
            GoodsInfoRequest goodsInfoRequest = new GoodsInfoRequest();
            goodsInfoRequest.setPage(1);
            goodsInfoRequest.setRequestId(UUID.randomUUID().toString());

            System.out.println(client.goodsList(goodsInfoRequest));
        } catch (com.vip.osp.sdk.exception.OspException e) {
            e.printStackTrace();
        }
    }

}
