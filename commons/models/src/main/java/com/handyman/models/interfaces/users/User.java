package com.handyman.models.interfaces.users;

import com.handyman.models.interfaces.common.PersonalInfo;
import com.handyman.models.interfaces.orders.OrderCustomerSnapshot;
import org.joda.time.DateTime;

import java.util.List;

public interface User {

   String getUserType();
   String getUserId();
   String getPassword();

   //basic user information
   PersonalInfo getPersonalInfo();

   //User orders
   List<? extends OrderCustomerSnapshot> getOrdersSnapshot();
   DateTime getUserCreationDateTime();
   DateTime getUserLastAccessDateTime();
}
