package com.trip.distribution.model.order;

import java.util.List;

public class OrderPromotion {
    private Long promotionID;
    private String couponCode;
    private Long deductionStrategyID;
    private List<Long> resourceIdList;

    public Long getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Long promotionID) {
        this.promotionID = promotionID;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Long getDeductionStrategyID() {
        return deductionStrategyID;
    }

    public void setDeductionStrategyID(Long deductionStrategyID) {
        this.deductionStrategyID = deductionStrategyID;
    }

    public List<Long> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<Long> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }
}
