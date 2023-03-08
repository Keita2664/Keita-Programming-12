import java.util.ArrayList;
import java.util.List;

public class Planet {

    private int orbitTime;
    private ArrayList<Moon> moons = new ArrayList<>();
    private String designation;

    public Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public Planet(){
//        orbitTime = 0;
//        designation = null;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon moon){
        return;
    }

    public List<Moon> getMoon(){
        return moons;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Planet){
            Planet other = (Planet) obj;
            if (this.orbitTime == other.orbitTime){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "";
    }
}
