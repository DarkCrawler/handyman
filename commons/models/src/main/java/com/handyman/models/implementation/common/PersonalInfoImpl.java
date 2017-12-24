package com.handyman.models.implementation.common;

import com.handyman.models.interfaces.common.PersonalInfo;
import lombok.Data;

import java.util.List;

@Data
public class PersonalInfoImpl implements PersonalInfo<AddressImpl> {
   String firstName;
   String lastName;
   String middleName;
   String primaryMobileNumber;
   String secondaryMobileNumber;
   String registeredEmailId;
   List<AddressImpl> addresses;
}
