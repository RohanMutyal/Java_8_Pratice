package com.company;

public final class ImmutableClass {
    private final int intValue;
    private final String stringValue;
    private final double doubleValue;

    public ImmutableClass(int intValue, String stringValue, double doubleValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.doubleValue = doubleValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }
}