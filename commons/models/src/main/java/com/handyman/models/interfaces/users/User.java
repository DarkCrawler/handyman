package com.handyman.models.interfaces.users;

import com.handyman.models.interfaces.common.PersonalInfo;
import com.handyman.models.interfaces.orders.OrderCustomerSnapshot;

import java.util.List;

public interface User<P extends PersonalInfo, O extends OrderCustomerSnapshot> {

   String getUserType();
   String getUserId();

   //basic user information
   P getPersonalInfo();

   //User orders
   List<O> getOrdersSnapshot();
}
