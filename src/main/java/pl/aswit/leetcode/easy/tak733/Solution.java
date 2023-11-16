package pl.aswit.leetcode.easy.tak733;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    //beats 100%
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        if(value == color){
            return image;
        }
        check(image, sr, sc, color, value);
        return image;
    }

    private void check(int[][] image, int x, int y, int color, int value) {
        if(x >= image.length || x < 0 || y >= image[0].length || y < 0){
            return;
        }
        if(image[x][y] != value){
            return;
        }
        image[x][y] = color;
        check(image, x - 1, y, color, value);
        check(image, x, y - 1, color, value);
        check(image, x + 1, y, color, value);
        check(image, x, y + 1, color, value);

    }



    //beats 100%
    public int[][] floodFillAvr(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        check(image, sr, sc, color, value);
        return image;
    }

    private void checkAvr(int[][] image, int x, int y, int color, int value) {
        image[x][y] = color;
        if(x>0 && image[x-1][y] == value && image[x-1][y] != color /*last condition check if original color is not the same a current color. If it is not necessary to change any thing*/){
            check(image, x-1, y, color, value);
        }
        if(y>0 && image[x][y-1] == value  && image[x][y-1] != color){
            check(image, x, y-1, color, value);
        }
        if(x<image.length -1 && image[x+1][y] == value  && image[x+1][y] != color){
            check(image, x+1, y, color, value);
        }
        if(y<image[0].length -1 && image[x][y+1] == value  && image[x][y+1] != color){
            check(image, x, y+1, color, value);
        }
    }


    //beats 45%
    public int[][] floodFillSlow(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        Map<Point, Point> usedPoints = new HashMap<>();
        checkSlow(image, sr, sc, color, value, usedPoints);
        return image;
    }

    private void checkSlow(int[][] image, int x, int y, int color, int value, Map usedPoints) {
        if(usedPoints.get(new Point(x, y))!= null){
            return;
        }
        usedPoints.put(new Point(x,y), "a");
        image[x][y] = color;
        if(x>0 && image[x-1][y] == value){
            checkSlow(image, x-1, y, color, value, usedPoints);
        }
        if(y>0 && image[x][y-1] == value){
            checkSlow(image, x, y-1, color, value, usedPoints);
        }
        if(x<image.length -1 && image[x+1][y] == value){
            checkSlow(image, x+1, y, color, value, usedPoints);
        }
        if(y<image[0].length -1 && image[x][y+1] == value){
            checkSlow(image, x, y+1, color, value, usedPoints);
        }
    }
    class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

}