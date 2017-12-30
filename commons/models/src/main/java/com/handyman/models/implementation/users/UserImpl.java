package com.handyman.models.implementation.users;

import com.handyman.models.implementation.common.PersonalInfoImpl;
import com.handyman.models.implementation.orders.OrderCustomerSnapshotImpl;
import com.handyman.models.interfaces.users.User;
import lombok.Data;

import java.util.List;

@Data
public class UserImpl implements User {
   String userType;
   String userId;
   PersonalInfoImpl personalInfo;
   List<OrderCustomerSnapshotImpl> ordersSnapshot;
}
