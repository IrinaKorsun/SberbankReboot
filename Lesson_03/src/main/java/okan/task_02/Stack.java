package okan.task_02;

class Stack {

    private int[] stackA;
    private int sizeS;
    private static int indexS;

   private Stack(int size){
      sizeS = size;
      stackA = new int [sizeS];
      indexS = -1;
  }

   private void addstack(int val){stackA [++indexS] = val;}

   private void delstack(int k) {
        for (int n = 0 ; n < k; n++){
           stackA[indexS--] = 0;}
   }


   private void printstack() {
      for (int n = indexS; n > -1; n--){System.out.print(stackA[n] + " ");}
      System.out.println();
  }

    public static void main(String[] args) {
      Stack sss = new Stack(5);
        while (indexS != sss.sizeS-1){sss.addstack((int) (Math.random() * 100));}
        sss.printstack();
        sss.delstack (1);
        sss.printstack();
        sss.addstack((int) (Math.random() * 100));
        sss.printstack();
        sss.delstack (3);
        sss.printstack();
        sss.delstack (2);
        sss.printstack(); // Ничего не напечатается так как стек пустой
   }
}




