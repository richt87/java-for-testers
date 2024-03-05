package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {
        return Files.readString(Paths.get("src/main/resources/hello.txt"));
    }

    public Boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
            String fileContents = Files.readString(Paths.get(path));
            return fileContents.contains(expectedText);
        } catch (IOException e) {
            return false;
            // (Files.readString(Paths.get(path)).contains(expectedText));
        }
    }

    public Boolean fileHasText(String filename, String expectedText) throws IOException {
        String path = "src/main/resources/" + filename;

        if (!Files.exists(Paths.get(path))) {
            throw new MissingWelcomeFileException("Welcome files " + filename + "not found", null);
        }
        try {
            String fileContent = Files.readString(Paths.get(path));
            return fileContent.contains(expectedText);
        } catch (IOException e) {

            // (Files.readString(Paths.get(path)).contains(expectedText))
            return false;
        }
    }
}