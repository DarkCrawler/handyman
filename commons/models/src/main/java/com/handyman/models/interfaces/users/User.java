package com.handyman.models.interfaces.users;

import com.handyman.models.interfaces.common.PersonalInfo;
import com.handyman.models.interfaces.orders.OrderCustomerSnapshot;

import java.util.List;

public interface User {

   String getUserType();
   String getUserId();

   //basic user information
   PersonalInfo getPersonalInfo();

   //User orders
   List<? extends OrderCustomerSnapshot> getOrdersSnapshot();
}
