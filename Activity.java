class Activity{

    public static void main(String args[]){

        Dog dogObj = new Dog();
        Dog dogObj1 = new Dog();

        dogObj.set_Name("Chowlong");
        System.out.println("Dog's Name: " + dogObj.showName());

        dogObj1.set_Name("Diosdado");
        System.out.println("Dog's Name: " + dogObj1.showName());
        
        System.out.println(dogObj.is_Male = true);
        System.out.println(dogObj1.is_Male = true);


        dogObj.bark();
        dogObj1.bark();

        dogObj.set_Num_of_Puppies(7);
        System.out.println(dogObj.show_Num_Of_Puppies());
        dogObj.set_Num_of_Puppies(6);
        System.out.println(dogObj.show_Num_Of_Puppies());

        Dog[] aso1 = {
            new Dog().set_Name("Bob"),
            new Dog().set_Name("Kazumi"),
            new Dog().set_Name("Xiaoyu"),
            new Dog().set_Name("Dragunov"),
            new Dog().set_Name("Gorlock the Destroyer"),
            new Dog().set_Name("ron"),
            new Dog().set_Name("nik")
         };

         Dog[] aso2 = {
            new Dog().set_Name("Asuka"),
            new Dog().set_Name("Lancelot"),
            new Dog().set_Name("Hylos"),
            new Dog().set_Name("Lolita"),
            new Dog().set_Name("Hanabi"),
            new Dog().set_Name("Layla")
         };

        dogObj.setPuppies(aso1);
        dogObj.showList();

        dogObj1.setPuppies(aso2);
        dogObj1.showList();

    }
}