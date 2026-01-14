public class SpaceStation {
        public static void main(String[] args) {

        OxygenSystem t1 = new OxygenSystem(500, "ACTIVE");
        OxygenSystem t2 = new OxygenSystem(300, "ACTIVE");
        
        OxygenSystem t3 = new OxygenSystem(200, "INACTIVE");

        t1.addOxygen(400);
        t2.addOxygen(200);
        t3.addOxygen(100);

        t1.consumeOxygen(50);
        t2.deactivateTank();
        t3.activateTank();
        t3.addOxygen(150);

        System.out.println("Tank 1 status: " + t1.getTankStatus() +", oxygen: " + t1.getCurrentOxygenLevel() + " liters");
        System.out.println("Tank 2 status: " + t2.getTankStatus() + ", oxygen: " + t2.getCurrentOxygenLevel() + " liters");
        System.out.println("Tank 3 status: " + t3.getTankStatus() + ", oxygen: " + t3.getCurrentOxygenLevel() + " liters");

        System.out.println("Total oxygen in station: " +
        OxygenSystem.getTotalOxygenInStation() + " liters");
        System.out.println("Total tanks created: " +
        OxygenSystem.getTotalTanks());
}
}
class OxygenSystem {

// INSTANCE  
private int tankID;
private int currentOxygenLevel;
private int maxCapacity;
private String status;

// STATIC  
private static int totalOxygenInStation;
private static int totalTanks;
private static int nextTankID;

// STATIC INITIALIZER 
static {
    totalOxygenInStation = 0;
    totalTanks = 0;
    nextTankID = 0;
}

// INSTANCE INITIALIZER
{
    tankID = ++nextTankID;
    currentOxygenLevel = 0;
    totalTanks++;
}

// CONSTRUCTOR
OxygenSystem(int maxCapacity, String status) {
    this.maxCapacity = maxCapacity;
    this.status = status;
}

// ADD OXYGEN 
void addOxygen(int litres) {
    if (!status.equals("ACTIVE")) {
        System.out.println("Cannot add oxygen: Tank " + tankID + " is inactive");
        return;
}

if (currentOxygenLevel + litres > maxCapacity) {
        litres = maxCapacity - currentOxygenLevel;
}

    currentOxygenLevel += litres;
    totalOxygenInStation += litres;

    System.out.println("Tank " + tankID + " current oxygen: " + currentOxygenLevel + " liters");
}

// CONSUME OXYGEN
void consumeOxygen(int litres) {
    if (!status.equals("ACTIVE")) {
    return;
}

if (currentOxygenLevel - litres < 0) {
    litres = currentOxygenLevel;
}

currentOxygenLevel -= litres;
totalOxygenInStation -= litres;

    System.out.println("Tank " + tankID + " consumed " + litres + " liters. Current level: " + currentOxygenLevel + " liters");
}

// ACTIVATE
void activateTank() {
    if (status.equals("ACTIVE")) {
    return;
}

    status = "ACTIVE";
    totalOxygenInStation += currentOxygenLevel;

    System.out.println("Tank " + tankID + " activated.");
}

// DEACTIVATE
void deactivateTank() {
    if (status.equals("INACTIVE")) {
    return;
}

status = "INACTIVE";
totalOxygenInStation -= currentOxygenLevel;
//currentOxygenLevel = 0;


System.out.println("Tank " + tankID + " deactivated. Oxygen removed from station total.");
}

// GETTERS
int getCurrentOxygenLevel() {
    return currentOxygenLevel;
}

int getMaxCapacity() {
    return maxCapacity;
}

String getTankStatus() {
    return status;
}

// STATIC GETTERS
static int getTotalOxygenInStation() {
    return totalOxygenInStation;
}

static int getTotalTanks() {
    return totalTanks;
}
}

