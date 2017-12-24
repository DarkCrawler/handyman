package com.handyman.models.implementation.orders;

import com.handyman.models.interfaces.common.CustomerFeedBack;
import com.handyman.models.interfaces.orders.Order;
import com.handyman.models.interfaces.orders.OrderCancellationDetails;
import com.handyman.models.interfaces.orders.OrderCustomerDetails;
import com.handyman.models.interfaces.orders.OrderExecutionDetails;
import lombok.Data;
import org.joda.time.DateTime;

import java.util.List;

@Data
public class OrderImpl implements Order {
   String orderId;
   String orderType;
   String orderCategory;
   List<String> orderSubCategoryList;
   String orderDescription;
   OrderCustomerDetails orderCustomerDetails;
   DateTime orderPlacementDateTime;
   Double orderCompletionHours;
   CustomerFeedBack customerFeedBack;
   List<OrderExecutionDetails> orderExecutionDetails;
   OrderCancellationDetails orderCancellationDetails;
}
