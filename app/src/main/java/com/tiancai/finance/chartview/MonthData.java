package com.tiancai.finance.chartview;

/**
 * Created by lsl on 2017/8/28.
 */

public class MonthData {

    private String label;
    private float value;

    public MonthData() {
    }

    public MonthData(String label, float value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
