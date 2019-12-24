package com.example.okumapocketmanual;

public class ExampleItem {
    private String mAlarmNumber;
    private String mAlarmName;
    private String mAlarmDescription;



    public ExampleItem(String AlarmNumber, String AlarmName, String AlarmDescription) {
        mAlarmNumber = AlarmNumber;
        mAlarmName = AlarmName;

        mAlarmDescription = AlarmDescription;
    }



    public String getAlarmNumber() {
        return mAlarmNumber;
    }

    public String getAlarmName() {
        return mAlarmName;
    }

    public String getAlarmDescription() {
        return mAlarmDescription;
    }
}
