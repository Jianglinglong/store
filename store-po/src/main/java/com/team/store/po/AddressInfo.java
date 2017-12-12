package com.team.store.po;

public class AddressInfo {
    private Integer addrId;

    private String addrAddress;

    private Integer userId;

    private String addrPhone;

    private String addrPeople;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getAddrAddress() {
        return addrAddress;
    }

    public void setAddrAddress(String addrAddress) {
        this.addrAddress = addrAddress == null ? null : addrAddress.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddrPhone() {
        return addrPhone;
    }

    public void setAddrPhone(String addrPhone) {
        this.addrPhone = addrPhone == null ? null : addrPhone.trim();
    }

    public String getAddrPeople() {
        return addrPeople;
    }

    public void setAddrPeople(String addrPeople) {
        this.addrPeople = addrPeople == null ? null : addrPeople.trim();
    }
    
    public void sss(){
    //String sss = "<li class='user-addresslist '><span class='new-option-r'><i class='am-icon-check-circle'></i>默认地址</span><p class='new-tit new-p-re'><span class='new-txt'>${address.addrPeople }</span><span class='new-txt-rd2'>${address.addrPhone }</span></p><div class='new-mu_l2a new-p-re'><p id='addrIndex${addrIndex.index }' class='new-mu_l2cw'><span class='province'>"+proShow+"</span>&nbsp;<span class='city'>"+citysShow+"</span>&nbsp;<span class='dist'>"+areaShow+"</span>&nbsp;<span class='street'>"+detial+"</span></p></div><div class='new-addr-btn'><a href='addr/initUpdate.do?addrId=${address.addrId }'><i class='am-icon-edit'></i>编辑</a> <spanclass='new-addr-bar'>|</span> <a href='personalData/deleteAddress.do?addrId=${address.addrId }' onclick='delClick(this);'><i class='am-icon-trash'></i>删除</a></div></li>";
    }
}