class employee{
  String name;
  String department;
  String religion;
  int nin;
  String couse_of_Study;
}

public class company{
  public static void main(String a[]){
    employee w1 = new employee();
    w1.name = "jacob";
    w1.department = "computer_enginnering";
    w1.religion = "christian";
    w1.nin = 23456;
    w1.couse_of_Study = "computer";

    employee w2 = new employee();
    w2.name = "joe";
    w2.department = "software_dev";
    w2.religion = "christian";
    w2.nin = 49008;
    w2.couse_of_Study = "engineer";


    employee w3 = new employee();
    w3.name = "kosi";
    w3.department = "data_analysis";
    w3.religion = "christian";
    w3.nin = 91911;
    w3.couse_of_Study = "data_analysis";

    employee w4 = new employee();
    w4.name = "muneera";
    w4.department = "web_designer";
    w4.religion = "muslim";
    w4.nin = 76421;
    w4.couse_of_Study = "web_design";

    employee w5 = new employee();
    w5.name = "yusuf";
    w5.department = "web_designer";
    w5.religion = "muslim";
    w5.nin = 98076;
    w5.couse_of_Study = "web_design";



    employee workers[] = new employee[5];
    workers[0] = w1;
    workers[1] = w2;
    workers[2] = w3;
    workers[3] = w4;
    workers[4] = w5;

    // for(int i=0;i<students.length;i++){
    //   System.out.println(students[i].name +" : " + students[i].marks);
    // }


    //using enhanced for loop
    for(employee emp : workers){
      System.out.println(emp.name +" : " + emp.nin);
    }

  //   for(int num = 9;num<9;num++){
  //     System.out.println("called " + num);
  //   }
   };
}

