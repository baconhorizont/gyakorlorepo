package week03.compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {

        Capsules art = new Capsules();

        art.fillTubeFirstTime("kék");
        art.fillTubeFirstTime("kék");
        art.fillTubeFirstTime("sárga");
        art.fillTubeFirstTime("kék");
        art.fillTubeFirstTime("kék");

        System.out.println(art.getCapsuleColors());

        art.addFirst("piros");
        art.addLast("piros");

        System.out.println(art.getCapsuleColors());

        art.removeFirst();
        art.removeLast();

        System.out.println(art.getCapsuleColors());

    }


}
