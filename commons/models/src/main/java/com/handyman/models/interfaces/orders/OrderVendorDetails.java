package com.handyman.models.interfaces.orders;

import com.handyman.models.interfaces.common.Address;
import org.joda.time.DateTime;

public interface OrderVendorDetails {
   String getVendorId();
   String getVendorFirstName();
   String getVendorMiddleName();
   String getVendorLastName();
   String getVendorMobileNumber();
   Address getVendorAddress();
   DateTime getOrderAcceptanceDateTime();
   DateTime getOrderCompletionDateTime();
}
