package com.handyman.models.implementation.orders;

import com.handyman.models.interfaces.orders.OrderExecutionDetails;
import lombok.Data;
import org.joda.time.DateTime;

@Data
public class OrderExecutionDetialsImpl implements OrderExecutionDetails {
   String orderStatus;
   DateTime orderStatusTimeStamp;
}
