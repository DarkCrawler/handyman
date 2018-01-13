package com.handyman.models.interfaces.common;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public interface Address {
   @NotNull(message = "Address line 1 cannot be null") String getAddressLine1();

   @NotNull(message = "Address line 2 cannot be null") String getAddressList2();

   @NotNull(message = "City cannot be null") String getCity();

   @NotNull(message = "State cannot be null") String getState();

   @NotNull(message = "Country cannot be null") String getCountry();

   String getLandmark();

   @NotNull(message = "Pincode cannot be null")
   @Max(value = 6, message = "Pin code cannot be more than 6 chars")
   @Min(value = 6, message = "Pin code cannot be less than 6 chars") String getPincode();

   @NotNull(message = "is primary field cannot be null") Boolean getIsAddressPrimary();
}
