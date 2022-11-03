packageorg.javaturk.oopj.ch08.eceulkuuu_hw1.PointDistanceTest.java;


publicclassPointDistanceTest{

    publicstaticvoidmain(String[] args) {

        run();

    }

    publicstaticvoidrun() {
        Pointp1= newPoint(7, 17);
        Pointp2= newPoint(81.3);
        Pointp3= newPoint();
        p3.setX(2);
        p3.setY(22);
        System.out.println("p1-> "+ p1);
        System.out.println("p2-> "+ p2);
        System.out.println("p3-> "+ p3);


        System.out.println(".....");

        System.out.println("distance from p3 to center: "+ p3.distance());
        System.out.println("distance from p1 to center: "+ p1.distance());
        System.out.println("distance from p2 to center: "+ p2.distance());
        System.out.println("distance between p1 and p2: "+ p1.distance(p2));

        System.out.println(".....");


        p1.setX(19.36);
        p1.setY(21.18);

        System.out.println("p1-> "+ p1);


        System.out.println(".....");


        Pointp4= p2.clone();
        System.out.println("p4-> "+ p4);


        System.out.println(".....");

        p4.move(-1, 2.69);
        System.out.println("p4-> "+ p4);
        System.out.println("p2-> "+ p2);


        System.out.println(".....");
    }
