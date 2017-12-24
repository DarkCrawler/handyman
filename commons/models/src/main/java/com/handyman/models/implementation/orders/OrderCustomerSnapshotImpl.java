package com.handyman.models.implementation.orders;

import com.handyman.models.interfaces.orders.OrderCustomerSnapshot;
import lombok.Data;
import org.joda.time.DateTime;

import java.util.List;

@Data
public class OrderCustomerSnapshotImpl implements OrderCustomerSnapshot {
   String orderId;
   String orderType;
   String orderCategory;
   List<String> orderSubCategoryList;
   String orderDescription;
   DateTime orderPlacementDateTime;
}
