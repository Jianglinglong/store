/**
  * Copyright 2017 bejson.com 
  */
package com.team.store.pojo;
import java.util.List;

/**
 * Auto-generated: 2017-11-22 15:45:46
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class AddrBean {

    private String name;
    private List<CityBean> CityBean;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setCityBean(List<CityBean> CityBean) {
         this.CityBean = CityBean;
     }
     public List<CityBean> getCityBean() {
         return CityBean;
     }

}

