package info.natehuff.demo.utils;

import info.natehuff.demo.dto.Pick;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPicksFile {

    public static ArrayList<Pick> readPicksFile()
            throws IOException {
        ArrayList<Pick> picks = new ArrayList<>();
        String file ="data/picks2.txt";

        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter("\n");

        while(scanner.hasNext()) {
            String currentLine = scanner.nextLine();
            String[] splitString = currentLine.split("\\s+");

            Pick pick = new Pick(splitString[1], Float.parseFloat(splitString[splitString.length - 1]));
            picks.add(pick);
        }

        return picks;
    }
}
