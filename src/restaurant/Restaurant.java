package restaurant;

public class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Menu createMenu() {
        Menu menu = new Menu();
        menu.setFelPrincipal("carme");
        menu.setDesert("Placinta");
        return menu;
    }

    class Menu {
        private String felPrincipal;
        private String desert;

        public String getFelPrincipal() {
            return felPrincipal;
        }

        public void setFelPrincipal(String felPrincipal) {
            this.felPrincipal = felPrincipal;
        }

        public String getDesert() {
            return desert;
        }

        public void setDesert(String desert) {
            this.desert = desert;
        }

        public void afiseazaMenu() {
            System.out.println("Menu: ");
            System.out.println("Fel principal - " + felPrincipal);
            System.out.println("Deser - " + desert);
        }
    }

    static class CalculatorTaxe {
        double calculTaxe(double pret, double taxaProcent) {
            return pret * taxaProcent;
        }
    }

    void callPolice() {
        Button button = new Button() {
            @Override
            public void pressAlarmButton() {
                System.out.println("Calling the police");
            }
        };
        button.pressAlarmButton();
    }
}
