public class PersonAgenda {

    static Person[] listName = new Person[2]; // store the names
    static int index=0;

    public static void main(String[] args) {
        System.out.println("Phone Directory");
        int option=0;

        do {

            // afisare meniu
            System.out.println("1.Add person");
            System.out.println("2.Display persons");
            System.out.println("3.Delete person");
            System.out.println("4 Modify person");


            //selectare optiune
            option=SkeletonJava.readIntConsole("Option:");

            switch (option) {
                case 1: add();break;
                case 2: print();break;
                case 3: del();break;
                case 4: modify();break;
            }


        }
        while(option!=5);

    }

    static void add() {

        // de optimizat cand se umple agenda

        // de optimizat daca deja exista o pers cu acel nume

        if(index<listName.length) {
            String name = SkeletonJava.readStringConsole("Input the name:");
            String number = SkeletonJava.readStringConsole("Input the number:");

            Person p = new Person();
            p.name = name;
            p.phoneNumber = number;
            listName[index] = p;
            index++;
        }
        else
        {
            System.out.println("gata memoria, schimba telul ");
        }
    }

    static void print() {
        for (int i=0; i<listName.length; i++){
            if(listName[i]!=null){
                System.out.println("Name:"+listName[i].name);
                System.out.println("Phone number:"+listName[i].phoneNumber);
            }
        }
    }

    static void del() {
        String name = SkeletonJava.readStringConsole("Input the name:");
        for (int i=0; i<listName.length; i++){
            if (listName[i]!=null&&listName[i].name.equals(name)){
              listName[i]=null;
            }
        }
        // citeste un nume
        // il cauta in array
        //daca il gaseste il sterge  asa listName[unde l-a gasit]=null sau "";

    }

    static void modify() {
        String name = SkeletonJava.readStringConsole("Input the name:");
        for (int i=0; i<listName.length; i++){
            if (listName[i]!=null&&listName[i].name.equals(name)){
                String newname = SkeletonJava.readStringConsole("Input the new name:");
                listName[i].name=newname;
            }
        }
        // citeste un nume
        // il cauta in array
        // daca il gaseste cere noul nume si il substituie pe cel vechi cu cel nou
    }


}
