//Sean Blanchard
//11/6/18
//Lab8b TestClient


public class TestClient {

    public static void main(String args[]){

        Test test=new Test("Maths");
        System.out.println(test.calcAverage(54,77,99,105,44,88));
        System.out.println(test.calcAverage(43,77,93,22,57,99,99,99,94,23,44));
        System.out.println(test.calcAverage(65,77,99,34,12,99,86));
        System.out.println();
    }
}
