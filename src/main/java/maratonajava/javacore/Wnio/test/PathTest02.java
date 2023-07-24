package maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder_path");
        if (Files.notExists(folderPath)) {
            Path folderDirectory = Files.createDirectory(folderPath);
            System.out.println("File created successfully!");
        }

        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");
        Path subFolderDirectory = Files.createDirectories(subFolderPath);
        if (Files.notExists(subFolderPath)) {
            System.out.println("Sub folders created successfully!");
        } else {
            System.out.println("Subfolder already exists!");
        }

        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
            System.out.println("File created successfully!");
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "renamed_file.txt");
        if (Files.notExists(target)) {
            Files.copy(source, target);
        }
    }
}
