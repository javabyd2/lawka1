package skaner;

public class File {
    private String FileName;
    private Long LastModified;
    private Long FileSize;

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public Long getLastModified() {
        return LastModified;
    }

    public void setLastModified(Long lastModified) {
        LastModified = lastModified;
    }

    public Long getFileSize() {
        return FileSize;
    }

    public void setFileSize(Long fileSize) {
        FileSize = fileSize;
    }

    public File(String fileName, Long lastModified, Long fileSize) {
        FileName = fileName;
        LastModified = lastModified;
        FileSize = fileSize;
    }

    public File() {
    }
}
