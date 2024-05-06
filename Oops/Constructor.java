package Oops;

public class Constructor {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car("red");
        c2.model_no[0] = 2;
        c2.model_no[1] = 3;
        c2.model_no[2] = 4;
        car c3 = new car(415800);
        car c4 = new car(c2); //copy
        c2.model_no[2] = 6;
        System.out.println(c4.color);
        for(int i = 0;i<c4.model_no.length;i++){
            System.out.println(c4.model_no[i] );
        }
    }
}
class car {
    String color;
    int [] model_no;
    int price ;

    car(){  //--> non-parameterized constructor
        model_no =  new int[3];
        System.out.println("this is car constructor...");
    }
    car(String color){ //--> parameterized
        model_no =  new int[3];
        this.color = color;
        System.out.println("this is car constructor with string type parameter...");

    }
    car(int price){ //--> parameterized constructor
        this.price = price;
        System.out.println("this is car constructor with int type parameter...");
    }

  /*  car(car c2){ //--> copy constructor
        model_no =  new int[3];
        this.color = c2.color;
        this.model_no = c2.model_no;  // it creates a shallow copy
    }


   */

    car(car  c2 ){  //--> copy constructor
        model_no = new int[3];
        this.color = c2.color;
        for(int i = 0;i<model_no.length;i++){  // it creates a deep copy
            this.model_no[i] = c2.model_no[i];
        }

    }

}