package com.kurrant.multi;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    public Integer supplierCorpId;

    public Integer customerCorpId;

    public Integer type;

    public Integer level;

    public Integer locationId;

    public Integer registerType;

    public Integer gender;

    public Integer verifyStatus;

    public Integer status;

//    public LocalDateTime created;

    public Integer box;

    UserDto(User user){
        this.supplierCorpId = user.getSupplierCorpId();
        this.customerCorpId = user.getCustomerCorpId();
        this.type = user.getType();
        this.level = user.getLevel();
        this.locationId = user.getLocationId();
        this.registerType = user.getRegisterType();
        this.gender = user.getGender();
        this.verifyStatus = user.getVerifyStatus();
        this.status = user.getStatus();
        this.box = user.getBox();
    }

}
