package com.example.sportscentric;

public enum LogoImageId {
    LOGO_IMAGE_00(R.id.logoImage00),
    LOGO_IMAGE_01(R.id.logoImage01),
    LOGO_IMAGE_02(R.id.logoImage02),
    LOGO_IMAGE_03(R.id.logoImage03),
    LOGO_IMAGE_04(R.id.logoImage04),
    LOGO_IMAGE_05(R.id.logoImage05);

    private final int id;

    LogoImageId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}