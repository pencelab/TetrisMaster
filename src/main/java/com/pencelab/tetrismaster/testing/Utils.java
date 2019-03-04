package com.pencelab.tetrismaster.testing;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.pieces.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static final int SQUARE = 1;
    public static final int PIPE = 2;
    public static final int T = 3;
    public static final int L = 4;
    public static final int LR = 5;
    public static final int Z = 6;
    public static final int ZR = 7;

    private Utils(){
    }

    public static List<String> getFiles(String folder) throws URISyntaxException {
        URI uri = ClassLoader.getSystemResource(folder).toURI();
        String fixturesRoot = Paths.get(uri).toString();
        final Path fixturesRootPath = Paths.get(fixturesRoot);

        try {
            return Files.walk(fixturesRootPath)
                    .filter(Files::isRegularFile)
                    .map(path -> fixturesRootPath.relativize(path).toString())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static BufferedReader openFile(Class c, String filename){
        return new BufferedReader(new InputStreamReader(c.getResourceAsStream(filename)));
    }

    public static String readLine(BufferedReader in) throws IOException {
        return in.readLine();
    }

    private void printContent(BufferedReader in) throws IOException {
        String line;
        while((line = in.readLine()) != null){
            System.out.println(line);
        }
    }

    public static void closeFile(BufferedReader in) throws IOException {
        in.close();
    }

    public static Piece setupPiece(BufferedReader in) throws IOException {
        int p = Integer.parseInt(readLine(in));
        int x = Integer.parseInt(readLine(in));
        int y = Integer.parseInt(readLine(in));
        int rotations = Integer.parseInt(readLine(in));
        return setupPiece(p, x, y, rotations);
    }

    public static IPiece.ISquareUnit[][] setupSquareUnits(int width, int height, BufferedReader in, IPiece.ISquareUnit squareUnitMock) throws IOException {
        IPiece.ISquareUnit[][] squareUnits = new IPiece.ISquareUnit[height][width];
        for(int j = 0; j < height; j++){
            String line = Utils.readLine(in);
            for(int i = 0; i < width; i++){
                int value = Integer.parseInt(String.valueOf(line.charAt(i)));
                if(value == 1)
                    squareUnits[j][i] = squareUnitMock;
            }
        }
        return squareUnits;
    }

    public static IPiece.ISquareUnit[][] setupSquareUnits(int width, int height, BufferedReader in) throws IOException {
        IPiece.ISquareUnit[][] squareUnits = new IPiece.ISquareUnit[height][width];
        for(int j = 0; j < height; j++){
            String line = Utils.readLine(in);
            for(int i = 0; i < width; i++){
                int value = Integer.parseInt(String.valueOf(line.charAt(i)));
                if(value != 0)
                    squareUnits[j][i] = setupSquareUnit(value, i, j);
            }
        }
        return squareUnits;
    }

    private static IPiece.ISquareUnit setupSquareUnit(int p, int x, int y){
        IPiece.ISquareUnit squareUnit = null;
        switch(p){
            case SQUARE:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.PURPLE.getColor());
                break;
            case PIPE:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.YELLOW.getColor());
                break;
            case T:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.RED.getColor());
                break;
            case L:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.BLUE.getColor());
                break;
            case LR:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.TEAL.getColor());
                break;
            case Z:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.LIME.getColor());
                break;
            case ZR:
                squareUnit = new Piece.SquareUnit(x, y, Globals.PieceColor.ORANGE.getColor());
                break;
        }
        return squareUnit;
    }

    private static Piece setupPiece(int p, int x, int y, int rotations) {
        Piece piece = null;

        switch(p){
            case SQUARE:
                piece = new Square.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
            case PIPE:
                piece = new Pipe.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
            case T:
                piece = new T.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
            case L:
                piece = new L.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
            case LR:
                piece = new LR.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
            case Z:
                piece = new Z.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
            case ZR:
                piece = new ZR.Builder().withCoordinatesXY(x, y).withRotations(rotations).build();
                break;
        }

        return piece;
    }

}
