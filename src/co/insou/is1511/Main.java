package co.insou.is1511;

import co.insou.is1511.compile.ISCompiler;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        File file;

        if (args.length == 0) {
            FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
            dialog.setMode(FileDialog.LOAD);
            dialog.setVisible(true);
            dialog.setMultipleMode(false);
            file = dialog.getFiles()[0];
        } else {
            file = new File(args[0]);
        }

        System.out.println("File to compile is " + file);

        List<String> lines = Files.readAllLines(file.toPath());

        ISCompiler compiler = new ISCompiler(lines);
        compiler.begin();

        System.exit(0);
    }

}

