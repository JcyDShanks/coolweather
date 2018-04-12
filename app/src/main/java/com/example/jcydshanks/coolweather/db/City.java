package com.example.jcydshanks.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;                 //每个实体类中都应该有的字段
    private String cityName;        //记录城市名
    private int cityCode;           //记录城市代号
    private int provinceId;         //记录当前城市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
