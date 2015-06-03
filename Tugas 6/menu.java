    import java.util.*;  
      
    public class menu  
      
    {  
      
        public static void main(String args[])  
      
        {  

                System.out.println("Masukkan Bilangan pertama");
                    String x = System.console().readLine();
                    int var1 = Integer.parseInt(x);

                    System.out.println("Masukkan Bilangan kedua");
                    String y = System.console().readLine();
                    int var2 = Integer.parseInt(y);                    
                    int hasil;
      
           while(true){  
      
                    System.out.println("    Menu :");  
      
                    System.out.println("[1]. Jumlah");  
      
                    System.out.println("[2]. Pengurangan");  
      
                    System.out.println("[3]. Kali");  
      
                    System.out.println("[4]. Bagi");  

                    System.out.println("[5]. Exit");  
      
                    System.out.print("Masukkan Pilihan anda : "); 

                    String input = System.console().readLine();  
      
                    int opsi = Integer.parseInt(input);  
       
      
                    System.out.println("-----------------------");  
      
                   
                    switch(opsi)  
                        
                    {   
      
                        case 1 : 
                        hasil=var1+var2;
                        System.out.println("Jumlah =" + hasil);
                        break;  
      
                        case 2 :
                        hasil=var1-var2;
                        System.out.println("Pengurangan =" + hasil);
                        break;  
      
                        case 3 : 
                        hasil=var1*var2;
                        System.out.println("Kali =" + hasil);
                        break;  
      
                        case 4 : 
                        hasil=var1/var2;
                        System.out.println("Pembagian =" + hasil);
                        break;  
      
                        case 5 : 
                        System.out.println("Anda memilih keluar.. bye");  
      
                        System.exit(0);  
      
                        break; 
      
                    }  
      

                    System.out.println("-----------------------");  
      
                }  
      
                  
      
        }  
      
    }  