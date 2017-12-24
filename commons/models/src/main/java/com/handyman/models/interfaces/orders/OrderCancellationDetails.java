package com.handyman.models.interfaces.orders;

import org.joda.time.DateTime;

public interface OrderCancellationDetails {
   String getCancelledBy();
   DateTime getCancellationDateTime();
   String cancellationReason();

}
