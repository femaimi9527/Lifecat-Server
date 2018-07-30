package com.ten.vo;

import com.ten.entity.InfoDO;
import com.ten.vo.utils.InfoLevel;

/**
 * INFO
 *
 * @author Administrator
 */
public class InfoVO {

    private Integer infoId;
    private String infoTitle;
    private String infoContent;
    private Boolean readed;
    private String infoGmtCreate;
    private String infoGmtModified;
    /**
     * INFO level
     */
    private InfoLevel infoLevel;

    /**
     * constructor
     */
    public InfoVO() {
    }

    public InfoVO(InfoDO infoDO) {
        this.infoId = infoDO.getInfoId();
        this.infoTitle = infoDO.getInfoTitle();
        this.infoContent = infoDO.getInfoContent();
        // int => boolean
        // 0:unread-false 1:read-true
        this.readed = infoDO.getReaded() >= 1;
        this.infoGmtCreate = infoDO.getInfoGmtCreate();
        this.infoGmtModified = infoDO.getInfoGmtModified();
        // int => InfoLevel
        // 1:info 2:alert 3:warn 4:read
        int infolevel = infoDO.getInfoLevel();
        if (infolevel == 1) {
            this.infoLevel = InfoLevel.INFO;
        } else if (infolevel == 2) {
            this.infoLevel = InfoLevel.ALERT;
        } else if (infolevel == 3) {
            this.infoLevel = InfoLevel.WARN;
        }
    }

    @Override
    public String toString() {
        return "VO:INFO@{" +
                "infoid:" + infoId +
                ",infotitle:" + infoTitle +
                ",infocontent:" + infoContent +
                ",infolevel:" + infoLevel +
                ",isreaded:" + readed +
                ",infogmtcreate:" + infoGmtCreate +
                ",infogmtfinish:" + infoGmtModified +
                "}";
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public Boolean getReaded() {
        return readed;
    }

    public void setReaded(Boolean readed) {
        this.readed = readed;
    }

    public String getInfoGmtCreate() {
        return infoGmtCreate;
    }

    public void setInfoGmtCreate(String infoGmtCreate) {
        this.infoGmtCreate = infoGmtCreate;
    }

    public String getInfoGmtModified() {
        return infoGmtModified;
    }

    public void setInfoGmtModified(String infoGmtModified) {
        this.infoGmtModified = infoGmtModified;
    }

    public InfoLevel getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(InfoLevel infoLevel) {
        this.infoLevel = infoLevel;
    }
}
