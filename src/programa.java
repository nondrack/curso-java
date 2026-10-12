void main  (){
    String produto1 = "computador";
    String produto2 = "office desk";
    int age = 30;
    int code = 5290;
    char gender = 'f';
    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;
    Locale.setDefault(Locale.US);

    System.out.printf("Products:%n %s, which price is $ %.2f%n %s, which price is $ %.2f%n " +
            "Record: %d years old, code %d and gender: %s%n Measue: %.8f%n" +
            "Rouded: %.3f%n", produto1, price1, produto2, price2, age, code, gender, measure, measure);

}