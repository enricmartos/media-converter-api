package org.emartos.mediaconverterapi.v1.model;

public class ResizeFileUploadForm extends FileUploadForm {

    private Integer width;
    private Integer height;

    public ResizeFileUploadForm(byte[] fileData, Integer width, Integer height) {
        super(fileData);
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
