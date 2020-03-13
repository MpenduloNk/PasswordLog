public class ExceptionX {
    public  static  void  div(int x, int y)throws Exception{
        int divide =0;
          if(y!=0)
            System.out.println(x/y);
          else{
              throw new Exception("okase divide ka zero morena!!");
          }


    }
    public static void main(String[] a)throws Exception{
        try{
        div(2,0);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
