public class App {
     /**
    * @param args
    */
   public static void main(String[] args) {
 // int, byte, double, short, long, float bunlar saya türünde fakat float ve double tam sayı deil 
// boolean true and false . 
//char metindir ama tek sayılı 

  /* int sayi = 12; 
  sayi = 13; 
  System.out.println(sayi); 
  byte say = 12; 
  say = -129; hatalı olur çünkü sınır -128 ile 127 arasında 
  char tekkarakter = 'ali'; hatalıdır çünkü tek karaker alıyo sınır bu boolean torf = true or false tutar ve tek tırnak sart 
  sorgulama if bölümü */ 

 
 
  /* 
  int sayı = 18; 

      if (sayı < 40){ 
        System.out.println("40'dan küçük"); 
        }
      if(sayı >= 20){ 
        System.out.println("20 e eşittir"); 
    } else { 
        System.out.println("Hiçbir durum karşılanmadı"); 
      } 
       */
 
 

    /*if (sayı==22){ 
      System.out.println("sayı 22 ye eşittir"); } 
    else if (sayı<18) { 
       System.out.println("sayı 18 den küçüktür"); } 
    else { 
      System.out.println("sayı 18 den büyük yada eşit, 22 ye eşit değil"); */ 
     

    /*swicht      */ 
    /* 
     char not = 'A' ;  

     switch  (not) {
       case 'A' : 
          System.out.println("mükemmel : geçtin") ;
          break; 
       case 'B' : 
          System.out.println("çok iyi : geçtin") ;
          break; 
       case 'C' : 
          System.out.println("iyi : geçtin") ;
          break;
       case 'D' :  
          System.out.println("Fena değil : geçtin") ;
          break; 
       case 'F' :  
          System.out.println("malesef : kaldın") ;
          break; 
       default: 
       System.out.println("geçersiz not girdiniz") ; }
     */
        /* 
         int j = 100 ; 
         do { 
            System.out.println(j); 
            j++; 
         }while(j<10); 
          system.out.printl("do while dögüsü bitti.") 100 yazdıktan sonra bitircek yani ilk do ya giriyo sonra şart a giriyo.  

         */ 
         /* 
         double[] myList = {1.2,1.7,3.9,1} ;
         double total = 0;
         double max = myList[0] ; 
         for(double number:myList){
         if(max<number){
            max=number ; // eğer büyükse n m den , m yi n ye ata 
         }
            total= total + number ; 
          System.out.println(number);
         }
        System.out.println("toplam ="+total);
        System.out.println("en buyuk ="+max);
         */
         /* 
         String[] [] sehirler = new String[3] [3];
         sehirler[0] [0] = "ist" ; 
         sehirler[0] [1] = "ank" ; 
         sehirler[0] [2] = "kon" ; 
         sehirler[1] [0] = "siv" ; 
         sehirler[1] [1] = "erz" ; 
         sehirler[1] [2] = "malatya" ; 
         sehirler[2] [0] = "erzincan" ; 
         sehirler[2] [1] = "kayseri" ; 
         sehirler[2] [2] = "bursa" ; 

         for(int i = 0;i<=2;i++){
            System.out.println("----------------");
            for(int j = 0;j <=2;j++){
               System.out.println(sehirler[i][j]);
            }
         }
         */
        // String mesaj = "Bugün hava çok güzel." ; // boşlukta bir karakter ve eleman ile index karıştırılmamalı. 
        
       /*   System.out.println(mesaj);
         System.out.println("eleman sayısı ="+mesaj.length());   
         System.out.println("8. eleman :"+mesaj.charAt(7));
         System.out.println(mesaj.concat(" Yaşasın"));
         System.out.println(mesaj.startsWith("B")); // Bu stwit boolean türünden ve mesaj b ile başlıyo mu diye soruyosun evet ise true gelir
         System.out.println(mesaj.endsWith("Ş")); // bu da ş ile bitiyo mu diye gösteriyo 
         char[] karakterler = new char[5] ;
         mesaj.getChars(0,4,karakterler,0) ; //0 ile 4. index arası nı al 0 dan başla bunu karakterlere ata 
         System.out.println(karakterler);
         System.out.println(mesaj.indexOf('a')); // av yazarsak ta 7 . vercek çunku yedi ilk olan a yani ve av için " lazım av"
         System.out.println(mesaj.lastIndexOf("a")); // harf yada kelimeyi soldan bulmaya başlar ama yine index soldan sayılır yani e yazsak 2 gelmez.
   */   
  
   
         /* 
      String yeniMesaj = mesaj.replace(' ','-') ;  // değiştirme , boşluklr çizgi oldu 
         System.out.println(yeniMesaj);
         System.out.println(mesaj.substring(6,7)); // 2 yada 5 yani hangi sayı yazılırsa. indexten itibaren alıyo günden başlıyo 5 olursa boşuğu da alıp başlıyo ,6 yaparsak 6 yı almaz ama virgülden öceki sayıyı alır.

         for(String kelime : mesaj.split("")) {// normal tırnak koyarsak hiç boş olmaz ise b u g gibi alt alta yazar ama bir boşluk olursa kelimeleri alt alta yazar.
            System.out.println(kelime);
         }
         System.out.println(mesaj.toLowerCase()); // tüm harfler mini olur
         System.out.println(mesaj.toUpperCase()); // tüm harfler buyuk 
         System.out.println(mesaj.trim()); // başında ve sonundaki boşlukları siler */
         /* 
         int number = 13 ;
        // int remainder = number % 2 ;  
         //System.out.println(remainder);
         boolean isPrime =  true ; 

         if(number == 1){
            System.out.println("sayı asal değildir");
            return; // return if den sonraki komutlara girmiyo demek ama eğer koşul sağlandıysa
         }
         if(number<1){
            System.out.println("geçersiz sayı");
         }
         
         for (int i=2;i<number;i++){
            if(number % i == 0){
               isPrime = false ; 
            }
         }
         if(isPrime){
            System.out.println("sayı asaldır");
         } else {
            System.out.println("sayı asal değildir");
         }*/
          
         char harf = 'Q' ;
         char[] ünsüz = {'Q','W','R','T','Y','P'} ;
         for(char harfler:ünsüz)
         if(harf == harfler){
            System.out.println("ünsüz harf girdiniz");
         }
         switch(harf) {
            case 'A' :
            case 'I' : 
            case 'O' :
            case 'U' :
               System.out.println("kalın ünlü sesli harf");
               break;
            default:
                 System.out.println("ince ünlü sesli harf");   
          } 
          
         /*  mük sayı 6 123+ = 6 
         int number = 12 ; 
         int total = 0;

         for(int i = 1;i<number;i++) {
            if(number % i == 0) {      // == 0 kalan sıfır a tam ise demek
               total = total + i ;
            }        
          }
         if(total == number){
            System.out.println("mükemmel sayıdır");
         }else {
            System.out.println("mükemmel sayı değildir");
         } */









         
   }
  }