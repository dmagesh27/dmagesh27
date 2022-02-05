package SeleniumJava;

public enum Testone {
BREAKFAST(7, 30), LUNCH(12, 15), DINNER(19, 45);
private int hh;
private int mm;
Testone(int hh, int mm) {
assert (hh >= 0 && hh <= 23) : "Illegal hour.";
assert (mm >= 0 && mm <= 59) : "Illegal mins.";
this.hh = hh;
this.mm = mm;
}
public int getHour() {
return hh;
}
public int getMins() {
return mm;
}
public static void main(String args[]){
Testone t = BREAKFAST;
Testone t2 = DINNER;

System.out.println(t.getHour() +":"+t.getMins());
System.out.println(t2.getHour() +":"+t2.getMins());

}
}
