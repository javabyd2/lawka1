package skaner;

import java.io.File;
import java.util.ArrayList;

public class FileListFromDirectory {
    private static ArrayList<SearchFile> fileList = new ArrayList<>();

    public static ArrayList<SearchFile> GetFileListFromDirectory(String sourceDirectory) {
        PenetrateDirectory(sourceDirectory, -1);
        return fileList;
    }

    public static void PenetrateDirectory(String sourceDirectory, Integer level) {
        level++;
        File directory = new File(sourceDirectory);
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
//                saveLine(tabs(level)+file.getName()+" ["+byteDisplaySize(file.length())+"]");
                Long fileSize = CheckFile.getFileSize(file.getName());
                fileList.add(new SearchFile(file.getName(), file.lastModified(), fileSize));
            } else if (file.isDirectory() /* && RECURSIVE */) {
//                saveLine(tabs(level)+"["+file.getName()+"] ["+byteDisplaySize(getDirectorySize(file.toString()))+"]");
                PenetrateDirectory(file.toString(), level);
            }
        }
    }

/*
    public static String tabs(Integer count) {
        String tabs = "";
        for (int i=0; i<count; i++)
            tabs += (char)9;
        return tabs;
    }
*/

/*
    public static String byteDisplaySize(Long size) {
        String surfix = "B";
        Double sizeDbl = size.doubleValue();
        if (size > 1024) {
            sizeDbl /= 1024;
            surfix = "KB";
        } else if (size > 1024) {
            sizeDbl /= 1024;
            surfix = "MB";
        } else if (size > 1024) {
            sizeDbl /= 1024;
            surfix = "GB";
        }
        if (surfix == "B") return String.format("%1.0f", sizeDbl) +" "+ surfix;
        else return String.format("%1.2f", sizeDbl) + " " + surfix;
    }
*/

/*
    public static Long getDirectorySize(String sourceDirectory) {
        SearchFile directory = new SearchFile(sourceDirectory);
        SearchFile[] files = directory.listFiles();
        Long sizeAll = 0L;
        for (SearchFile file : files) {
            if (file.isFile()) {
                sizeAll += file.length();
            } else if (file.isDirectory() */
/* && RECURSIVE *//*
) {
                sizeAll += getDirectorySize(file.toString());
            }
        }
        return sizeAll;
    }
*/

}