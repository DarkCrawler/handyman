package com.handyman.models.implementation.users;

import com.handyman.models.implementation.common.PersonalInfoImpl;
import com.handyman.models.implementation.orders.OrderCustomerSnapshotImpl;
import com.handyman.models.interfaces.users.User;
import lombok.Data;

@Data
public class UserImpl implements User<PersonalInfoImpl, OrderCustomerSnapshotImpl> {
   String userType;
   String userId;
   PersonalInfoImpl personalInfo;
   OrderCustomerSnapshotImpl ordersSnapshot;
}
