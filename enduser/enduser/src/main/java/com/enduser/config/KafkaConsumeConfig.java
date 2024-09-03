package com.enduser.config;

import com.enduser.constants.AppConstants;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumeConfig {


    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_NAME,groupId = AppConstants.GROUP_ID)
    public void updateLocation(String value){
        System.out.println(value);
    }
}
