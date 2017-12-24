package com.handyman.models.implementation.common;

import com.handyman.models.interfaces.common.CustomerFeedBack;
import lombok.Data;

@Data
public class CustomerFeedBackImpl implements CustomerFeedBack {
   Integer customerRating;
   String customerFeedBack;
}
