package org.emartos.mediaconverterapi.v1.model;

public class FileUploadForm {

    private byte[] fileData;

    public FileUploadForm() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }

    public FileUploadForm(byte[] fileData) {
        this.fileData = fileData;
    }

    public byte[] getFileData() {
        return fileData;
    }

//    @FormParam("selectedFile")
//    @PartType("application/octet-stream")
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

}
