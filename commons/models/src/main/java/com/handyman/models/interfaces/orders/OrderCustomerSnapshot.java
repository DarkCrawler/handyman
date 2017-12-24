package com.handyman.models.interfaces.orders;

import org.joda.time.DateTime;

import java.util.List;

public interface OrderCustomerSnapshot {
   String getOrderId();
   String getOrderType();
   String getOrderCategory();
   List<String> getOrderSubCategoryList();
   String getOrderDescription();
   DateTime getOrderPlacementDateTime();
}
