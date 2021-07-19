class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> coordsVisited = new HashSet<>();
        int currX = 0, currY = 0;
        String currPos;
        coordsVisited.add(String.valueOf(0)+"."+0);

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N' -> currY++;
                case 'S' -> currY--;
                case 'E' -> currX++;
                case 'W' -> currX--;
                default -> System.exit(-1);
            }

            if (coordsVisited.contains(currPos = String.valueOf(currY)+"."+currX)) {
                return true;
            }

            coordsVisited.add(currPos);
        }

        return false;
    }
}
