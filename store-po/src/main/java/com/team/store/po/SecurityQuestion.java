package com.team.store.po;

public class SecurityQuestion {
    private Integer securityId;

    private Integer userId;

    private Integer quesId;

    private String securiryAnswer;

    public Integer getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getSecuriryAnswer() {
        return securiryAnswer;
    }

    public void setSecuriryAnswer(String securiryAnswer) {
        this.securiryAnswer = securiryAnswer == null ? null : securiryAnswer.trim();
    }
}