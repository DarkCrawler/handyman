package com.handyman.models.interfaces.orders;

import org.joda.time.DateTime;

public interface OrderExecutionDetails {
   String getOrderStatus();
   DateTime getOrderStatusTimeStamp();
}
