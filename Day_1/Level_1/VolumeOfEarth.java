public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378.0; // in km
        double pi = Math.PI;
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        double volumeMiles = volumeKm * 0.239913; // Convert km cubic to miles cubic
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
