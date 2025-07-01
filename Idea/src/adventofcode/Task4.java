package adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
//    static final String TARGET = "XMAS";
//    static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}; // 8 directions
//    static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
//
//    public static void main(String[] args) throws IOException {
//        List<String> lines = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\Task4.txt"));
//        String line;
//        while ((line = reader.readLine()) != null && !line.isEmpty()) {
//            lines.add(line.trim());
//        }
//
//        int rows = lines.size();
//        int cols = lines.get(0).length();
//        char[][] grid = new char[rows][cols];
//
//        // Fill grid
//        for (int i = 0; i < rows; i++) {
//            grid[i] = lines.get(i).toCharArray();
//        }
//
//        int count = 0;
//        int len = TARGET.length();
//
//        // Traverse the grid
//        for (int x = 0; x < rows; x++) {
//            for (int y = 0; y < cols; y++) {
//                // Check all 8 directions
//                for (int d = 0; d < 8; d++) {
//                    int nx = x, ny = y;
//                    int k;
//                    for (k = 0; k < len; k++) {
//                        if (nx < 0 || ny < 0 || nx >= rows || ny >= cols) break;
//                        if (grid[nx][ny] != TARGET.charAt(k)) break;
//                        nx += dx[d];
//                        ny += dy[d];
//                    }
//                    if (k == len) count++;
//                }
//            }
//        }
//
//        System.out.println("Total XMAS occurrences: " + count);
//    }

    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\Task4.txt"));
        String line;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            lines.add(line.trim());
        }

        int rows = lines.size();
        int cols = lines.get(0).length();
        char[][] grid = new char[rows][cols];

        // Fill grid
        for (int i = 0; i < rows; i++) {
            grid[i] = lines.get(i).toCharArray();
        }

        int count = 0;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                // Center must be 'A'
                if (grid[i][j] != 'A') continue;

                // Get diagonals
                char tl = grid[i - 1][j - 1]; // top-left
                char tr = grid[i - 1][j + 1]; // top-right
                char bl = grid[i + 1][j - 1]; // bottom-left
                char br = grid[i + 1][j + 1]; // bottom-right

                // Check if one diagonal is MAS or SAM AND the other is MAS or SAM
                if (isMAS(tl, grid[i][j], br) && isMAS(tr, grid[i][j], bl)) {
                    count++;
                }
            }
        }

        System.out.println("Total X-MAS patterns: " + count);
    }

    static boolean isMAS(char first, char center, char last) {
        // 'center' must be 'A' anyway; here we just check M-A-S or S-A-M
        return (first == 'M' && last == 'S') || (first == 'S' && last == 'M');
    }
}
