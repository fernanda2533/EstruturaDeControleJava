public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "laranja"; 
        switch (faixa.toLowerCase()) { 
            case "preta": 
            System.out.println("Sei o Bassai-Dai..");
            case "marrom": 
            System.out.println("Sei o Tekki Shodan");
            case "roxa": 
            System.out.println("Sei o Heian Godan");
            case "verde": 
            System.out.println("Sei o Hein Yodan");
            case "laranja": 
            System.out.println("Sei o Hein Sandan");
            case "vermelha": 
            System.out.println("Sei o Hein Nidan");
            case "amarela": 
            System.out.println("Sei o Hein Shodan");
            break;
            default:
            System.out.println("Não sei nada");
        }
        System.out.println("Fim!");
    }

}
