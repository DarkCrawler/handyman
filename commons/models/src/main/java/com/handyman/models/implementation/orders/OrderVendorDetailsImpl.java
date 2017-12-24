package com.handyman.models.implementation.orders;

import com.handyman.models.interfaces.common.Address;
import com.handyman.models.interfaces.orders.OrderVendorDetails;
import lombok.Data;
import org.joda.time.DateTime;

@Data
public class OrderVendorDetailsImpl implements OrderVendorDetails {
   String vendorId;
   String vendorFirstName;
   String vendorLastName;
   String vendorMiddleName;
   String vendorMobileNumber;
   Address vendorAddress;
   DateTime orderAcceptanceDateTime;
   DateTime orderCompletionDateTime;
}
