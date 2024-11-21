import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nivel;
        int media, vitorias, derrotas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de vitorais: ");
        vitorias = sc.nextInt();

        System.out.println("Digite o numero de derrotas: ");
        derrotas = sc.nextInt();

        media = vitorias - derrotas;

        if(media >= 0 && media < 10){
            nivel = "Ferro";
        } else if (media >= 11 && media <= 20) {
            nivel = "Bronze";
        } else if (media >= 21 && media <= 50) {
            nivel = "Prata";
        } else if (media >= 51 && media <= 70) {
            nivel = "Ouro";
        } else if (media >= 71 && media <= 80) {
            nivel = "Platina";
        } else if (media >= 81 && media <= 90) {
            nivel = "Ascendente";
        } else if (media >= 91 && media <= 100) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }
        System.out.println("O Heroi tem saldo de "+vitorias+" Vitorias e "+derrotas+" Derrotas e no nivel de "+nivel);

    }
}