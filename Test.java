/*
 * Copyright (C) FPT Software Co., Ltd. 2016. All rights reserved.
 * @author: HoangNM10
 * Create date:   Jan 09, 2017
 * 
 */
package com.tpb.dcp.be.dto.valuation;

import java.io.Serializable;
import java.util.List;

import com.tpb.dcp.be.dto.APColOwnerInfoDTO;
import com.tpb.dcp.be.entity.valuation.ColGold;
import com.tpb.dcp.be.entity.valuation.ColGoldInfo;

public class APCreateGoldDTO implements Serializable {

    /** SerialVersionUID */
    private static final long serialVersionUID = 1L;

    //Quang sua lan 1

    private int msgCode;
    private String msgValue;
    private ColGold colGold;
    private ColGoldInfo colGoldInfo;
    private APColOwnerInfoDTO apColOwnerInfoDTO;
    private List<ColGoldInfo> listColGoldInfo;
    private List<Integer> listIdColOwnerInfo;
    private List<Integer> listIdColGoldInfo;

    /**
     * Constructor
     * 
     */
    public APCreateGoldDTO() {
        super();
    }

    public APCreateGoldDTO(int msgCode) {
        super();
        this.msgCode = msgCode;
    }

    public APCreateGoldDTO(int msgCode, String msgValue) {
        super();
        this.msgCode = msgCode;
        this.msgValue = msgValue;
    }

    /**
     * Get the msgCode
     * 
     * @return msgCode
     */
    public int getMsgCode() {
        return msgCode;
    }

    /**
     * Set the msgCode
     * 
     * @param msgCode
     */
    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    /**
     * Get the msgValue
     * 
     * @return msgValue
     */
    public String getMsgValue() {
        return msgValue;
    }

    /**
     * Set the msgValue
     * 
     * @param msgValue
     */
    public void setMsgValue(String msgValue) {
        this.msgValue = msgValue;
    }

    /**
     * Get the colGold
     * 
     * @return colGold
     */
    public ColGold getColGold() {
        return colGold;
    }

    /**
     * Set the colGold
     * 
     * @param colGold
     */
    public void setColGold(ColGold colGold) {
        this.colGold = colGold;
    }

    /**
     * Get the colGoldInfo
     * 
     * @return colGoldInfo
     */
    public ColGoldInfo getColGoldInfo() {
        return colGoldInfo;
    }

    /**
     * Set the colGoldInfo
     * 
     * @param colGoldInfo
     */
    public void setColGoldInfo(ColGoldInfo colGoldInfo) {
        this.colGoldInfo = colGoldInfo;
    }

    /**
     * Get the apColOwnerInfoDTO
     * 
     * @return apColOwnerInfoDTO
     */
    public APColOwnerInfoDTO getApColOwnerInfoDTO() {
        return apColOwnerInfoDTO;
    }

    /**
     * Set the apColOwnerInfoDTO
     * 
     * @param apColOwnerInfoDTO
     */
    public void setApColOwnerInfoDTO(APColOwnerInfoDTO apColOwnerInfoDTO) {
        this.apColOwnerInfoDTO = apColOwnerInfoDTO;
    }

    /**
     * Get the listColGoldInfo
     * 
     * @return listColGoldInfo
     */
    public List<ColGoldInfo> getListColGoldInfo() {
        return listColGoldInfo;
    }

    /**
     * Set the listColGoldInfo
     * 
     * @param listColGoldInfo
     */
    public void setListColGoldInfo(List<ColGoldInfo> listColGoldInfo) {
        this.listColGoldInfo = listColGoldInfo;
    }

    /**
     * Get the listIdColOwnerInfo
     * @return listIdColOwnerInfo
     */
    public List<Integer> getListIdColOwnerInfo() {
        return listIdColOwnerInfo;
    }

    /**
     * Set the listIdColOwnerInfo
     * @param listIdColOwnerInfo
     */
    public void setListIdColOwnerInfo(List<Integer> listIdColOwnerInfo) {
        this.listIdColOwnerInfo = listIdColOwnerInfo;
    }

    /**
     * Get the listIdColGoldInfo
     * @return listIdColGoldInfo
     */
    public List<Integer> getListIdColGoldInfo() {
        return listIdColGoldInfo;
    }

    /**
     * Set the listIdColGoldInfo
     * @param listIdColGoldInfo
     */
    public void setListIdColGoldInfo(List<Integer> listIdColGoldInfo) {
        this.listIdColGoldInfo = listIdColGoldInfo;
    }
}