package com.demo.wechatpay.util;

import com.demo.wechatpay.entity.wechat.UnifiedorderDataVO;

/**
 * TextMessage
 *
 * @author WuYuxiang
 * @date 2015/11/16
 */
public class TextMessage extends UnifiedorderDataVO {

    public TextMessage(){

    }

    public TextMessage(UnifiedorderDataVO reqTM){
        super.setAppid(reqTM.getAppid());
        super.setMch_id(reqTM.getMch_id());
        super.setDevice_info(reqTM.getDevice_info());
        super.setNonce_str(reqTM.getNonce_str());
        super.setSign(reqTM.getSign());
        super.setBody(reqTM.getBody());
        super.setDetail(reqTM.getDetail());
        super.setAttach(reqTM.getAttach());
        super.setOut_trade_no(reqTM.getOut_trade_no());
        super.setFee_type(reqTM.getFee_type());
        super.setTotal_fee(reqTM.getTotal_fee());
        super.setSpbill_create_ip(reqTM.getSpbill_create_ip());
        super.setTime_start(reqTM.getTime_start());
        super.setTime_expire(reqTM.getTime_expire());
        super.setGoods_tag(reqTM.getGoods_tag());
        super.setNotify_url(reqTM.getNotify_url());
        super.setTrade_type(reqTM.getTrade_type());
        super.setProduct_id(reqTM.getProduct_id());
        super.setLimit_pay(reqTM.getLimit_pay());
        super.setOpenid(reqTM.getOpenid());
    }
}
