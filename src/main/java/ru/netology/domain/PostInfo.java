package ru.netology.domain;

public class PostInfo {
    private int idPostInfo;
    private int idAuthor;
    private String textComplaint;
    private String urlPostInfo;

    public int getIdPostInfo() {
        return idPostInfo;
    }

    public void setIdPostInfo(int idPostInfo) {
        this.idPostInfo = idPostInfo;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getTextComplaint() {
        return textComplaint;
    }

    public void setTextComplaint(String textComplaint) {
        this.textComplaint = textComplaint;
    }

    public String getUrlPostInfo() {
        return urlPostInfo;
    }

    public void setUrlPostInfo(String urlPostInfo) {
        this.urlPostInfo = urlPostInfo;
    }
}
