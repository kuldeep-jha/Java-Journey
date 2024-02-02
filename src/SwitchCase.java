public class SwitchCase {
    public static void main(String[] args) {

//        Switch Case

        int whoHasRs100;
        whoHasRs100 = 100;   //here we ll find which one have the rs100

        switch (whoHasRs100){
            case 800 :                  //given 800 does match with 100
                System.out.println("Case 1");break;
            case 400 :
                System.out.println("Case 2"); break;   //break is given bcoz if the condition comes true than it will terminate the operation.
            case 100 :
                System.out.println("Case 3"); break;  // here 100 match with whohasrs100
            case 50 :
                System.out.println(" Case 4"); break;
        }

    }
}
