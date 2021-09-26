package com.company;

import com.company.model.SmartPhone;

import java.math.BigDecimal;

public class SmartPhoneExample {

    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone.SmartPhoneBuilder("1", "2", 3).build();
        SmartPhone smartPhone2 = new SmartPhone.SmartPhoneBuilder("1", "2", 3).withPrice(new BigDecimal("2899.99")).withNfc(true).build();
        SmartPhone smartPhone3 = new SmartPhone.SmartPhoneBuilder("1", "2", 3).withColor("RED").build();
        SmartPhone smartPhone4 = new SmartPhone.SmartPhoneBuilder("1", "2", 3).withBatteryCapacity(4000).withCamera(12).build();

        System.out.println(smartPhone1.toString());
        System.out.println(smartPhone2.toString());
        System.out.println(smartPhone3.toString());
        System.out.println(smartPhone4.toString());

    }
}
