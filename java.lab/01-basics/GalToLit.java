/*
  Программа для преобразования галлоннов в литры.
*/

class GalToLit {
  public static void main(String[] args) {
    double gallons;
    double liters;
    
    gallons = 10;
   
    liters = gallons * 3.7854;

    System.out.println(gallons + " галлонов соответствуут " + liters + " литрам.");
  }
}
