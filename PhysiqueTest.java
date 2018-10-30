import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhysiqueTest {
    @Test
    private int weight ;
    private int age;
    private int height;
    private int preferedAgeMin;
    private int preferedAgeMax;
    private int preferedWeightMin;
    private int preferedWeightmax;
    private int preferedHeighttMin;
    private int preferedHeightMax;
    public void setAndGetTest1() {
        Physique physique = new Physique();
        physique.setWeight(150);
        assertEquals(150, physique.getWeight());

        physique.setAge(28);
        assertEquals(28, account.getAge());

        physique.setPreferedAgeMin(23);
        assertEquals(23, physique.getPreferedAgeMin());

        physique.setPreferedAgeMax(36);
        assertEquals(36, physique.getHeight());

        physique.setPreferedWeightMin(140);
        assertEquals(140, physique.getPreferedWeightMin());

         physique.setPreferedWeightMaz(220);
        assertEquals(220, physique.getPreferedWeightMin());

        physique.setPreferedHeighttMin(510);
        assertEquals(510, physique.getPreferedHeightMin());

        physique.setPreferedHeighttMax(605);
        assertEquals(605, physique.getPreferedHeightMax());


        


    }

}
