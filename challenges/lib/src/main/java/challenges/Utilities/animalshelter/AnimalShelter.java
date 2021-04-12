package challenges.Utilities.animalshelter;

import challenges.stackandqueues.Queue;

public class AnimalShelter<T> {
     Queue<Animal> dogQueue;
     Queue<Animal> catQueue;

    public AnimalShelter() {
        this.dogQueue = new Queue<Animal>();
        this.catQueue = new Queue<Animal>();
    }

    public void enqueue (Animal input) throws Exception {
//    assuming we will only perform changes on cat or dog objects

        if (input.getClass().getSimpleName().equals("Dog") == true){
            dogQueue.enqueue(input);
        } else if(input.getClass().getSimpleName().equals("Cat") == true){
             catQueue.enqueue(input);
        } else {
            throw new Exception("That's not a good boy or a kitty cat");
    }

    }
    public Animal dequeue (String pref) throws Exception {
        if (pref == "dog"){
           return dogQueue.dequeue();
        } else if(pref== "cat"){
           return catQueue.dequeue();
        } else return null;
    }

}
