package occases;

public class TestMVC {
    public static void main(String[] args){
        GarageVue testgv=new GarageVue();
        Voiture v1 =new Voiture("111","AAA","AAA",111,111,111);
        testgv.affMsg(v1);
        Voiture v2 = testgv.encodeVoiture();
        testgv.affVoiture(v2);
    }
}
