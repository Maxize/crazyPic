package com.amnon.crazypic.entiry;

public class MyBitmap {

    private String name;
    private String frame;
    private String offset;
    private Boolean rotated;
    private String sourceColorRect;
    private String sourceSize;

    public MyBitmap() {
        super();
    }

    public MyBitmap(String name, String frame, String offset, Boolean rotated,
            String sourceColorRect, String sourceSize) {
        super();
        this.name = name;
        this.frame = frame;
        this.offset = offset;
        this.rotated = rotated;
        this.sourceColorRect = sourceColorRect;
        this.sourceSize = sourceSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Boolean getRotated() {
        return rotated;
    }

    public void setRotated(Boolean rotated) {
        this.rotated = rotated;
    }

    public String getSourceColorRect() {
        return sourceColorRect;
    }

    public void setSourceColorRect(String sourceColorRect) {
        this.sourceColorRect = sourceColorRect;
    }

    public String getSourceSize() {
        return sourceSize;
    }

    public void setSourceSize(String sourceSize) {
        this.sourceSize = sourceSize;
    }

    @Override
    public String toString() {
        return "MyBitmap [name=" + name + ", frame=" + frame + ", offset=" + offset + ", rotated="
                + rotated + ", sourceColorRect=" + sourceColorRect + ", sourceSize=" + sourceSize
                + "]";
    }

}
