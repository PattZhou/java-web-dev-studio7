package org.launchcode.studio7;

public class Main {

    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD();
        DVD myDVD = new DVD("Jams");

        myCD.spinDisc();
        myDVD.spinDisc();


        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
//They both spin: void spinDisc();
//They both store data: void storeData(String data);
//Data gets written to the discs by using a laser: void writeData(String data);
//The data on the discs can be read by using a laser: String readData();
//Once loaded, they both report information like name, capacity, contents, and disc type: HashMap<String,String> getInfo();
// inserted into a computer: void insert();
//set storage capacity: boolean isFull();

//Abstract class: (Data written with a laser, data read by a laser, both report info, both inserted into comp)
/* So i guess abstract is shared method information..like parent to child class?
 * Class variables
 * Private Methods
 * Complex functionality (long methods)*/

//Interfaces: ("they both spin" cus of different speeds??, "they both share data" but different data?, storage capacity)
/* interface is shared method but different?
Public methods only
Simple functionality (if any)
dont hold class variables
No shared functionality between children
 */

//Finally, write down the fields needed to define the properties of a CD or DVD (e.g. storageCapacity). Consider:
//Which fields are shared by both types of discs, and which ones are unique to each class?
//Do any of the fields represent constants?