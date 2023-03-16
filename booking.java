import java.util.Scanner;

public class booking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        
    }
}


interface  customer{
    string name;
    int id;
    string password;
    void login(int id, string password);
    void bill();
    void whichseat();


}

class customer1 implements customer{
    string name;
    int id;
    string password;
    public void login(int id, string password){

    }
    public void bill(){
        
    }
    public void whichseat(){
        seat d= new seat();

    }


}
class seat{
    int i,j;
    int board[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 } ,
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 },
                          { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 } };
}
class price extends seat{
    public void seat_price(int j){
        int p;
        if(j==9||j==10){
            p=300;
            super.bill1(p);
        }
        else if(j<=8||j>=5){
            p=200;
            return p;
        }
        else if(j<=4||j>=0){
            p=200;
            return p;
        }
        else{
            return;
        }



        
    }
}
class bill extends price{
    public void bill1(int p){

    }

}
class avalable extends seat{
    public void set(int j,int i){
        if (super.board[j][i]==0){

    }
    else {
        System.out.println("not avalable");
    }
    }
}
interface  staff{
    string name;
    int id;
    string password;
    public void login(int id, string password);
}
class staff1 implements customer{
    string name;
    int id;
    string password;
    public void login(int id, string password){

    }
    
    public void whichseat(){
        seat d= new seat();
    }


}


