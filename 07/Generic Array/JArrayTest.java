public class JArrayTest{
    public static void main(String[] args){
        JArray<String> test = new JArray<String>(5);

        test.set(0,"test_01");
        test.set(1,"test_02");
        test.set(2,"test_03");
        test.set(3,"test_04");
        test.set(4,"test_05");
        
        System.out.println(test);
        for(int i=0;i<test.length();i++){
            System.out.println(test.get(i));
        }

        String[] test_2 = new String[2];

        test_2[0]="test_11";
        test_2[1]="test_12";

        test.setSlice(1,test_2,2);

        System.out.println();
        System.out.println();

        for(int i=0;i<test.length();i++){
            System.out.println(test.get(i));
        }

    }
}
