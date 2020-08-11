package com.localcriminals.api.model.util;

import com.localcriminals.api.model.enums.District;
import com.localcriminals.api.model.enums.Province;

import java.util.UUID;

public class Address {
    public UUID uuid;
    public String buildingNumber;
    public String lane1;
    public String lane2;
    public String town;
    public District district;
    public Province province;

    public Address(String buildingNumber, String lane1, String lane2, String town, District district, Province province) {
        this.uuid = UUID.randomUUID();
        this.buildingNumber = buildingNumber;
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.town = town;
        this.district = district;
        this.province = province;
    }

    public Address(UUID uuid, String buildingNumber, String lane1, String lane2, String town, District district, Province province) {
        this.uuid = uuid;
        this.buildingNumber = buildingNumber;
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.town = town;
        this.district = district;
        this.province = province;
    }

}
