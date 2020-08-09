package com.fh.shop.api.paylog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fh.shop.api.type.po.Type;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("")
public class PayLog implements Serializable {
    @TableId(type= IdType.INPUT,value = "out_trade_no")
    private String outTradeNo;
    private Long userId;
    private String orderId;
    private Date createTime;
    private Date payTime;
    private BigDecimal payMoney;
    private Integer payType;
    private Integer payStatus;
    private String transactionId;
}
