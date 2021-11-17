package com.github.akarazhev.jacademy.jprog.features.datetime.v17;

import java.time.ZoneId;
import java.util.Set;

class DateTimeDemo {

    public static void main(String[] args) {
        //Fetching the Zoneid for given Zone.
        ZoneId zoneId = ZoneId.of("America/Marigot");
        System.out.println("Zone Id " + zoneId);

        //Fetching a Set of all Zoneids
        Set<String> zoneIdList = ZoneId.getAvailableZoneIds();

        for (String zone : zoneIdList) {
            System.out.println(zone);
        }
    }
}
