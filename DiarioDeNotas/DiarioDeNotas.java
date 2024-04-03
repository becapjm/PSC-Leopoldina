import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'aluno' se você for aluno e 'Professor' se você for professor");
        String usuario = sc.nextLine();

        if(usuario.equalsIgnoreCase("Professor")){
            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            System.out.println("Ola Professor " + nome + " Seja bem-vindo");

        }else if(usuario.equalsIgnoreCase("Aluno")){ 
            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            System.out.println("Ola aluno+ nome +Seja bem-vindo");

        }else{
            System.out.println("Opção Inválida");
                    
        }
        sc.close();
        }
    }


