package week03.compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

private List<String> capsuleColors = new ArrayList<>();

public void fillTubeFirstTime(String capsule){
    capsuleColors.add(capsule);
}


    public void addLast(String capsule){
    capsuleColors.add(capsule);
    }

    public  void addFirst(String capsule){
    capsuleColors.add(0,capsule);
    }

    public void removeFirst(){
    capsuleColors.remove(0);
    }
    public void removeLast(){
    capsuleColors.remove(capsuleColors.size()-1);
    }

    public List<String> getCapsuleColors() {
        return capsuleColors;
    }
}
