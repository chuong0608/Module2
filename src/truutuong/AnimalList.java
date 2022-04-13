package truutuong;

public class AnimalList {
    private AnimalList [] animalLists = new AnimalList[5];
    private int nextIndex=0;
    public AnimalList get(int Index){
        return this.animalLists[Index];
    }
    public void add(AnimalList animalList){
        if(nextIndex<animalLists.length){
            animalLists[nextIndex]=animalList;
            System.out.println("add " + nextIndex);
            nextIndex++;
        }
    }

}
class Dog extends AnimalList{
}
 class DogTestDrive {
     public static void main(String[] args) {
         AnimalList animalList = new AnimalList();
         Dog dog = new Dog();
         animalList.add(dog);
         System.out.println();
     }
 }
