public class MyMain {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Box<String> stringBox=new Box<String>();
        stringBox.set("Abdo");
        PairValue<Integer, String> pairValue=new PairValue<>(10,"abdo");
        System.out.println(pairValue.getVFromK(10));
        System.out.println(pairValue.getVFromK(12));

        //raw type
        PairValue pairValue2=new PairValue("myKey","abdo");
        System.out.println(pairValue2.getVFromK(10));
        pairValue2=pairValue;

        //the unchecked warnings
        //pairValue=pairValue2;
        //System.out.println(pairValue2);
        //System.out.println(pairValue.getVFromK(""));

        //generic methods
    }



}
