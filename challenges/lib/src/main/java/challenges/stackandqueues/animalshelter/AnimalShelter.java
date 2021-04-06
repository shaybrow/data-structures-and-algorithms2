package challenges.stackandqueues.animalshelter;

import challenges.stackandqueues.Queue;

public class AnimalShelter<T> {
     Queue<Animal> dogQueue;
     Queue<Animal> catQueue;

    public void enqueue (Animal input) throws Exception {
//    assuming we will only perform changes on cat or dog objects
        System.out.println(input.getClass().getSimpleName());
        if (input.getClass().getSimpleName() == "Dog"){
            dogQueue.enqueue(input);
        } else if(input.getClass().getSimpleName() == "Cat"){
             catQueue.enqueue(input);
        } else {
            throw new Exception("That's not a good boy or a kitty cat");
    }

    }
    public T dequeue (String pref) throws Exception {
        if (pref == "dog"){
            dogQueue.dequeue();
        } else if(pref== "cat"){
            catQueue.dequeue();
        } else return null;
    }

}
