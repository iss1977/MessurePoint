package measurePoint;

import java.util.Locale;

public class Measurepoint {
    int time;
    double speed;
    double distance;

    public Measurepoint(int time, double speed, double distance) {
        this.time = time;
        this.speed = speed;
        this.distance = distance;
    }

    public Measurepoint(int time, int  speed, int distance){
        this.time = time;
        this.speed = speed;
        this.distance = distance;
    }

    public Integer getTime(){
        return this.time;
    }

    public Double getSpeed(){
        return this.speed;
    }
    public Double getDistance(){
        return this.distance;
    }

    public Integer compareTo(Measurepoint comapreTO){
        return 0;
    }


    public boolean equals(Measurepoint other){
        return ( (other.distance == this.distance) && (other.speed == this.speed) && (other.time == this.time));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Time:");
        sb.append(String.format(Locale.ENGLISH,"%5d s, ", this.time)).append(String.format(Locale.ENGLISH,"Speed:%8.2f m/s, ", this.speed)).append(String.format(Locale.ENGLISH,"Distance:%8.2f m", this.distance));
        return sb.toString();
    }
}
