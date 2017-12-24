package com.handyman.models.implementation.common;

import com.handyman.models.interfaces.common.Address;
import lombok.Data;

@Data
public class AddressImpl implements Address {
   String addressType;
   String addressLine1;
   String addressList2;
   String city;
   String state;
   String country;
   String landmark;
   String pincode;
   Boolean isAddressPrimary;
}
