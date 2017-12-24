package com.handyman.models.implementation.orders;

import com.handyman.models.interfaces.common.Address;
import lombok.Data;
import org.joda.time.DateTime;

@Data
public class OrderCustomerDetailsImpl {
   String customerId;
   String customerFirstName;
   String customerMiddleName;
   String customerLastName;
   String customerMobileNumber;
   Address customerAddress;
   DateTime orderPlacementDateTime;
}
