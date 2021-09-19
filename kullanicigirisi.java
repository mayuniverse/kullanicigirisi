import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        // kullanıcı adımız : mayuniverse şifremiz : 123

        // değişkenleri tanımlayalım
        String nickname,password,changepassword,newpassword;

        // import sınıfını tanımlayalım
        Scanner inp = new Scanner(System.in);
        
        // kullanıcıdan input alalım
        System.out.println("Kullanıcı adını giriniz");
        nickname = inp.nextLine();
        System.out.println("Şifrenizi giriniz");
        password = inp.nextLine();
        

        // Koşul ifadelerini yerleştirelim

        if(nickname.equals("mayuniverse") && password.equals("123")){
            System.out.println("Giriş Başarılı !");
        }
        else{
            System.out.println("Şifreniz hatalı");
            System.out.println("Şifrenizi değiştirmek ister misiniz? Evet ise 1, Hayır ise 2");
            changepassword = inp.nextLine();
            if(changepassword.equals("1")){
                System.out.println("Yeni şifrenizi giriniz");
                newpassword = inp.nextLine();
                if(newpassword.equals("123")){
                    System.out.println("Eski şifrenizle aynı şifreyi giremezsiniz !");
                }else{
                    System.out.println("Şifre oluşturuldu !");
                }


            }
            else{
                System.out.println("ok, uygulamadan çıktınız");
            }
        }
    }
}