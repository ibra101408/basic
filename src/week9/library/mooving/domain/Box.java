package week9.library.mooving.domain;

import java.util.List;

public class Box implements Thing {

    private int capasity;
    private List<Thing> things;

    public Box(int maxCapaciity) {
        this.capasity = maxCapaciity;
    }


   public boolean addThing(Thing thing){
        if(thing.getVolume() <= this.capasity){
            this.things.add(thing);
            this.capasity -= thing.getVolume();
            return true;
        }
        return false;
   }


    @Override
    public String toString() {
        String content = "";
        for(Thing thing : this.things){
            content += "\t" + thing.toString() + "\n";
        }
        return content;
    }

    @Override
    public int getVolume() {
        int thingsCapsity = 0;
        for(Thing thing: this.things){
            thingsCapsity += thing.getVolume();
        }
        return thingsCapsity;
    }
}
