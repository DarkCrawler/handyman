package com.handyman.models.implementation.users;

import com.handyman.models.implementation.common.PersonalInfoImpl;
import com.handyman.models.implementation.orders.OrderCustomerSnapshotImpl;
import com.handyman.models.interfaces.users.User;
import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class UserImpl implements User {
   String userType;
   @Id
   String userId;
   String password;
   PersonalInfoImpl personalInfo;
   List<OrderCustomerSnapshotImpl> ordersSnapshot;
   DateTime userCreationDateTime;
   DateTime userLastAccessDateTime;
}
