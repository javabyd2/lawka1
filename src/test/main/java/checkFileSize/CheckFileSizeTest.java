package main.java.checkFileSize;

import checkFileSize.CheckFileSize;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;


public class CheckFileSizeTest {

@Test
public void checkFolderSizeTest () {
//Arrange
    File testFile = new File ("C:\\Program Files");
    CheckFileSize cfs = new CheckFileSize();
//Act
long fileSize = cfs.checkFileSize(testFile);
//

    assertFalse(fileSize == 0);


}
}