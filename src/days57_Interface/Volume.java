package days57_Interface;

public interface Volume {   // public is the only access modifier that can be used

    /*
    Interfaces can have:
• Constant variables • Abstract methods • Default Methods
• Static Methods
• Interfaces can not have:
• Constructor
• Blocks
• Instance variables or methods
     */

    boolean hasVolume=true;//by default it static & final

    abstract  double volume(); //by default it' abstract

}
