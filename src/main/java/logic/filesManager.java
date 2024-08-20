package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filesManager {

    FileInputStream input;
    FileOutputStream output;
    File file;

    public String openFile(File file) {
        String content = "";
        try {
            input = new FileInputStream(file);
            int ascci;
            while ((ascci = input.read()) != -1) {
                char charcater = (char) ascci;
                content += charcater;
            }
        } catch (Exception e) {
        }
        return content;
    }

    public String saveFile(File file, String content) {
        String response = null;
        try {
            output = new FileOutputStream(file);
            byte[] bytesTxt = content.getBytes();
            output.write(bytesTxt);
            response = "Se guardo con exito el archivo";
        } catch (Exception e) {
        }
        return response;
    }
}
