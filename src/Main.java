import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {

        // Name, birthdate (in YYYY, MM, DD), total contracts made, sold carrots (in tons), is senior seller (boolean)
        CarrotSeller firsCarrotSeller = new CarrotSeller("Jan Novotný", LocalDate.of(1978, 1, 24), 7, 8.5, true);
        CarrotSeller secondCarrotSeller = new CarrotSeller("Marek Nový", LocalDate.of(1985, 1, 12), 2, 4.2, false);

        System.out.println(firsCarrotSeller.getSellerName());
        System.out.println(secondCarrotSeller.getSellerName());

    }
}