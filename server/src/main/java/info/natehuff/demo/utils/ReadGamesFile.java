package info.natehuff.demo.utils;

import info.natehuff.demo.dto.Game;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadGamesFile {

    public static ArrayList<Game> readGamesFile()
            throws IOException {
        ArrayList<Game> games = new ArrayList<>();
        String file ="data/games1.txt";

        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter("\n");

        while(scanner.hasNext()) {
            String currentLine = scanner.nextLine();
            String[] splitString = currentLine.split("\\s+");



            Game game = new Game(splitString[0],
                    Integer.parseInt(splitString[1].substring(splitString[1].indexOf("(")+1, splitString[1].indexOf(")"))),
                    splitString[splitString.length - 2],
                    Integer.parseInt(splitString[splitString.length - 1].substring(splitString[splitString.length - 1].indexOf("(")+1,
                            splitString[splitString.length - 1].indexOf(")"))), 1);
            games.add(game);
        }

        return games;
    }
}
