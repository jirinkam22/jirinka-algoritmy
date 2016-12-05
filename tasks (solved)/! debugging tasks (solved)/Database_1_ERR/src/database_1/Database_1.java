package database_1;

public class Database_1 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("a.txt");
        BufferedReader br = BufferedReader(fr);
        Scanner sc = Scanner();
        double[] salary = new [100];
        String[100] name = new String[];
        int count = 0;
        
        while(sc.hasNextLine()){
            name[count] = sc.next();
            salary[count] = sc.nextDouble();
            println(name [count] + " " + salary[count]);
        }
        
        Scanner kbd = new Scanner(System.in);
        double x;
        
        System.out.println("enter salary");
        x = kbd.nextDouble();
        for(int i=0; i<count; i++){
            if (salary[i]=x){
                System.out.println(name [i] + " " + salary[1]);
                continue;                
            }           
        }
    }
    
}
