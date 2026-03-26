import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        // Birthdate in YYYY, MM, DD
        CarrotSeller firsCarrotSeller = new CarrotSeller("Jan Novotný", LocalDate.of(1978, 1, 24), 7, 8.5, true);
        CarrotSeller secondCarrotSeller = new CarrotSeller("Marek Nový", LocalDate.of(1985, 1, 12), 2, 4.2, false);

        System.out.println(firsCarrotSeller.getSellerName());
        System.out.println(secondCarrotSeller.getSellerName());

    }
}