class Main {

    public static void main(String[] args) {
        System.out.println("Inicializando....");
        System.out.println("Car....");
        Car car = new Car("AMQ123", new Account("Andres Loiza", "ADN1235","andresl@hotmail.com","12365"));
        car.setPassenger(4);
        car.printDataCar();

        System.out.println("Uberx....");
        UberX uberx = new UberX("MKL185", new Account("Maria Loyola", "JKL12365", "marial@hotmail.com", "125478"),"Toyota","Corolla");
        uberx.setPassenger(4);
        uberx.printDataCar();

        System.out.println("UberVan....");
        UberVan uberVan = new UberVan("SDC369852",new Account("Maria Loyola", "JKL12365", "marial@hotmail.com", "125478"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        System.out.println("User....");
        User user = new User("SDC369852","Maria Del Prado", "mariadl@hotmail.com", "4521365");
        user.printDataUser();
    }
}