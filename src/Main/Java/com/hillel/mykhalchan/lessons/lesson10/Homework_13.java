import com.hillel.mykhalchan.lessons.lesson10;

class BurgerMain {

    public static void main(String[] args) {

        Burger usual = new UsualBurger("Сергей", "Михайлов", "Берлин", "+38 097 777 77 77");

        System.out.println(usual.BurgerInfo());

    }

}

class UsualBurger {

    public UsualBurger(String name, String surname, String city, String phone) {

        this.bulochka = name;

        this.surname = surname;

        this.city = city;

        this.phone = phone;

    }

    public String BurgerInfo() {

        return "Обычный бургер \n "  + bulochka + " " + surname + " из города " + city + " можно по телефону " + phone;

    }

    private String bulochka;

    private String surname;

    private String city;

    private String phone;

}

