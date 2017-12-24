package com.handyman.models.interfaces.orders;

import com.handyman.models.interfaces.common.CustomerFeedBack;
import org.joda.time.DateTime;

import java.util.List;

public interface Order {
   String getOrderId();
   String getOrderType();
   String getOrderCategory();
   List<String> getOrderSubCategoryList();
   String getOrderDescription();
   OrderCustomerDetails getOrderCustomerDetails();

   DateTime getOrderPlacementDateTime();
   Double getOrderCompletionHours();

   CustomerFeedBack getCustomerFeedBack();
   List<OrderExecutionDetails> getOrderExecutionDetails();
   OrderCancellationDetails getOrderCancellationDetails();
}
