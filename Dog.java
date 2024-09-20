
public class Dog {
    String name;
    boolean is_Male;
    int num_of_Puppies;
    public Dog[] list_of_Puppies;
   

   public Dog set_Name(String Puppies){
         this.name = Puppies;
         return this;
    }
    public String showName(){
        return name;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void set_Num_of_Puppies(int num_of_Puppies){
        this.num_of_Puppies = num_of_Puppies;
    }
    public int show_Num_Of_Puppies(){
        return num_of_Puppies;
    }

    public Dog setPuppies(Dog[] aso) {
        num_of_Puppies = aso.length;
        list_of_Puppies = aso;
        return this;
    }

    public void showList(){
        for (int i = 0; i < list_of_Puppies.length; i++) {
            System.out.println(list_of_Puppies[i].name);
        }
    }


}

