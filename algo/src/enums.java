public class enums {
    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args){

        Day today = Day.SUNDAY;
        switch(today){
            case MONDAY:
            case FRIDAY:
                System.out.println("It's a weekday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend!");
                break;
            default:
                System.out.println("Midweek grid");
                break;
        }
    }
}
