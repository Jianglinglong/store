package com.team.store.po;

public class QuestionInfo {
    private Integer quesId;

    private String quesContextone;

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getQuesContextone() {
        return quesContextone;
    }

    public void setQuesContextone(String quesContextone) {
        this.quesContextone = quesContextone == null ? null : quesContextone.trim();
    }
}