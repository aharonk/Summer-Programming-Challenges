class Solution {
    static class Point {
        private final int X;
        private final int Y;
        
        public Point(int x, int y) {
            X = x;
            Y = y;
        }
        
        public int hashCode() {
            return  29 * (29 * 43 + X) + Y;
        }
        
        public boolean equals(Object o) {
            assert o instanceof Point;
            return this.hashCode() == o.hashCode();
        }
    }
    
    public boolean isPathCrossing(String path) {
        HashSet<Point> coordsVisited = new HashSet<>();
        int currX = 0, currY = 0;
        Point currPos;
        coordsVisited.add(new Point(currX, currY));

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N' -> currY++;
                case 'S' -> currY--;
                case 'E' -> currX++;
                case 'W' -> currX--;
                default -> System.exit(-1);
            }

            if (coordsVisited.contains(currPos = new Point(currX, currY))) {
                return true;
            }

            coordsVisited.add(currPos);
        }

        return false;
    }
}
