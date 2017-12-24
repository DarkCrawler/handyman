package com.handyman.models.interfaces.orders;

import com.handyman.models.interfaces.common.Address;
import org.joda.time.DateTime;

public interface OrderCustomerDetails {
   String getCustomerId();
   String getCustomerFirstName();
   String getCustomerLastName();
   String getCustomerMiddleName();
   String getCusotmerMobileNumber();
   Address getCustomerAddress();
   DateTime getOrderPlacementDateTime();
}
