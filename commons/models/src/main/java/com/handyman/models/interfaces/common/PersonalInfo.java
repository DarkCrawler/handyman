package com.handyman.models.interfaces.common;

import java.util.List;

public interface PersonalInfo<A extends Address> {
   String getFirstName();
   String getMiddleName();
   String getLastName();
   String getPrimaryMobileNumber();
   String getSecondaryMobileNumber();
   String getRegisteredEmailId();

   //User can have multiple address
   List<A> getAddresses();
}
