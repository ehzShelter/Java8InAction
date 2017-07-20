class Start {
    public static void main(String... args) {
        System.out.println("Hi");
        Flight shahjajal = new Flight();

        shahjajal.setId(111);
        shahjajal.setName("kuber");
        shahjajal.setCapacity(100);
        // Employee
        Employee nanak = new Employee();
        nanak.setName("Habib");
        nanak.setDesignation("Pilot");
        shahjajal.setPilot(nanak);
        // Airport
        Airport abuDhabi = new Airport();
        abuDhabi.setName("XXXX");
        Airport Dhaka = new Airport();
        Dhaka.setName("DDDDD");

        shahjajal.setFrom(abuDhabi);
        shahjajal.setTo(Dhaka);

        Schedule departAbuDhabi = new Schedule();
        departAbuDhabi.setHour(2);
        departAbuDhabi.setMinute(45);
        Schedule arrivalDhaka = new Schedule();
        arrivalDhaka.setHour(5);
        arrivalDhaka.setMinute(40);


        shahjajal.setDeparture(departAbuDhabi);
        shahjajal.setArrival(arrivalDhaka);

        Flight dubai = new Flight();
        dubai.setId(444);
        dubai.setName("kopila");
        dubai.setCapacity(400);
        // Employee
        Employee gubindo = new Employee();
        nanak.setName("guru");
        nanak.setDesignation("PilotMan");
        shahjajal.setPilot(nanak);
        // Airport
        Airport abu = new Airport();
        abu.setName("MMMM");
        Airport ziaInt = new Airport();
        ziaInt.setName("NNNN");

        shahjajal.setFrom(abuDhabi);
        shahjajal.setTo(Dhaka);

        Schedule departAbu = new Schedule();
        departAbu.setHour(3);
        departAbu.setMinute(33);
        Schedule arrivalZia = new Schedule();
        arrivalZia.setHour(7);
        arrivalZia.setMinute(41);

        dubai.setDeparture(departAbuDhabi);
        dubai.setArrival(arrivalDhaka);

        System.out.println(shahjajal.getName());
        System.out.println(dubai.getName());
        System.out.println(shahjajal.getName());
        System.out.println(dubai.getName());

        System.out.println(shahjajal.getFrom().getName());
        System.out.println(shahjajal.getTo().getName());

    }
}
