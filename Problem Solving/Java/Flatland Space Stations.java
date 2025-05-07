// Complete the flatlandSpaceStations function below.
static int flatlandSpaceStations(int n, int[] c) {
    int maximumDistance = 0;
    for (int i = 0; i < n; i++){
        int minimumDistance = Math.abs(i -c[0]);
        for (int d:c){
            if (Math.abs(i-d) < minimumDistance){
                minimumDistance = Math.abs(i-d);
            }
        }
        if (minimumDistance > maximumDistance) {
            maximumDistance = minimumDistance;
        }
    }
    return maximumDistance;

}