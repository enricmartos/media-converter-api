package org.emartos.mediaconverterapi.v1.model;

public class FileUploadForm {

    private byte[] fileData;

    public FileUploadForm(byte[] fileData) {
        this.fileData = fileData;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

}
