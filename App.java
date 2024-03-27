import java.util.*;
public class App {
/**
 * @author Rodrigo Queiroz Vieira Freire
 * Lista de exercício 4
 */

    public static void Ex1(Scanner scan){

        int somapar, produtoimpar, num, cont = 0;

        somapar = 0;
        produtoimpar = 1;

        while(cont != 5){
            System.out.println("Insira numero ai:");
            num = scan.nextInt();
            
            if(num % 2 == 0){
                somapar+= num;
            }else{
                produtoimpar*= num;
            }
            cont++;
        }
        System.out.printf("Soma dos pares:%d\nProduto dos impares:%d", somapar, produtoimpar);



    }
    public static void Ex2(Scanner scan){

        int num, cont = 0;
        while(cont != 5){
            System.out.println("Insira numero aleatorio:");
            num = scan.nextInt();
            if(num == 0 || num < 0){
                System.out.println("Numero invalido!");
                return;
            }else{
                System.out.println("Valor lido:" + num);
                System.out.println("Valor quadrado:" + (num * num));
                System.out.println("Valor cubo:" + (num * num * num));
                System.out.println("Valor raiz:" + (Math.sqrt(num)));
            }
            cont++;

        }

    }
    public static void Ex3(Scanner scan){

        int idade, cont = 0, quantidade50 = 0, quantpessoasaltura = 0, sumaltura = 0, contpessoas = 0;
        double peso, altura, medialtura, porcentagem;

        while(cont != 3){
            System.out.println("Insira idade:");
            idade = scan.nextInt();
            System.out.println("Insira peso:");
            peso = scan.nextFloat();
            System.out.println("Insira altura:");
            altura = scan.nextFloat();

            if(idade > 50){
                quantidade50++;
            }
            if(idade >= 10 || idade <= 20){
                quantpessoasaltura++;
                sumaltura+=altura;
                

            }
            if(peso < 40){
                contpessoas++;
            }



            cont++;
        }
        medialtura = sumaltura / quantpessoasaltura;
        porcentagem = contpessoas / 3;
        System.out.println("Quantidade de pessoas com 50 anos +:"+ quantidade50);
        System.out.println("Media das alturas das pessoas com idade entre 10 e 20 anos:" + medialtura);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos entre os 10:" + (porcentagem * 100) + "%");


    }
    public static void Ex4(Scanner scan){
        int kills, deaths, assist, sumk = 0, sumd = 0, suma = 0, vence;

        boolean venceu = false;

        while(venceu == false){
            System.out.println("Insira suas kills");
            kills = scan.nextInt();
            System.out.println("Insira suas mortes");
            deaths = scan.nextInt();
            System.out.println("Insira assist");
            assist = scan.nextInt();
            sumk+= kills;
            sumd+=deaths;
            suma+=assist;

            System.out.println("Venceu a partida? (1 = sim 0 = nao):");
            vence = scan.nextInt();
            while(vence != 1 && vence != 0){
                System.out.println("Valor incorreto, insira dnv");
                vence = scan.nextInt();


            }

            if(vence == 1){
                venceu = true;
            } 
        }

        if(sumk <= 5){
            System.out.println("Noob");
        }
        if(sumk >= 20){
            System.out.println("Master");
        }
        if(sumd >= 20){
            System.out.println("Houston, we have a problem");
        }
        if(suma >= 20){
            System.out.println("Team work");
        }

    }
    public static void Ex5(Scanner scan){
        Random rand = new Random();
        int contTentativa = 0, nrandom, nuser = 101;

        System.out.println("Adivinhe o numero!");
        nrandom = rand.nextInt(1, 100);
        while(nuser != nrandom){
            System.out.println("numero sorteado:" + nrandom);
            System.out.println("Insira numero:");
            nuser = scan.nextInt();

            if(nuser > nrandom){
                System.out.println("Numero inserido maior que o numero sorteado");
            }
            if(nuser < nrandom){
                System.out.println("Numero inserido menor que o numero sorteado");
            }
            contTentativa++;
        }

        System.out.printf("Voce acertou o numero sorteado em %d tentativas!", contTentativa);
    }
    public static void Ex6(Scanner scan){
        Random rand = new Random();
        int contTentativa = 0, nrandom, nuser = 101, jogarmais = 1;
        while(jogarmais == 1){
        System.out.println("Adivinhe o numero!");
        nrandom = rand.nextInt(1, 100);
        while(nuser != nrandom){
            System.out.println("numero sorteado:" + nrandom);
            System.out.println("Insira numero:");
            nuser = scan.nextInt();

            if(nuser > nrandom){
                System.out.println("Numero inserido maior que o numero sorteado");
            }
            if(nuser < nrandom){
                System.out.println("Numero inserido menor que o numero sorteado");
            }
            contTentativa++;
        }
        System.out.printf("Voce acertou o numero sorteado em %d tentativas!", contTentativa);
        contTentativa = 0;
        System.out.println("\nQuer jogar novamente?(1 = sim 0 = nao)");
        jogarmais = scan.nextInt();
        while(jogarmais != 1 && jogarmais != 0){
            System.out.println("\nValor incorreto, insira dnv");
            jogarmais = scan.nextInt();
        }
    }

    
    }
    public static void Ex7(Scanner scan){
        int op = 999;
        System.out.println("1 - retangulo");
        System.out.println("2 - diagonal superior esquerda");
        System.out.println("3 - diagonal superior direita");
        System.out.println("4 - diagonal inferior esquerda");
        System.out.println("5 - diagonal inferior direita");
        while(op != 0){
            System.out.println("Insira a opcao:");
            op = scan.nextInt();
            
            switch (op) {
                case 1:

                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < 4; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                case 2:
                int num = 4;
                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < num ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    num--;
                }
                break;
                case 3:
                int num1 = 4;
                for(int i = 0; i < 4; i++){
                    if(num1 == 3){
                        System.out.print(" ");
                    }
                    if(num1 == 2){
                        System.out.print("  ");
                    }
                    if(num1 == 1){
                        System.out.print("   ");
                    }

                    for(int j = 0; j < num1; j++){

                        System.out.print("*");

                    }
                    
                    System.out.println();
                    num1--;
                }
                break;
                case 4:
                int num2 = 0;
                for(int i = 0; i < 4; i++){
                    if(num2 == 2){
                        System.out.print(" ");
                    }
                    if(num2 == 1){
                        System.out.print("  ");
                    }
                    if(num2 == 0){
                        System.out.print("   ");
                    }

                    for(int j = 4; j < num2; j--){

                        System.out.print("*");

                    }
                    
                    System.out.println();
                    num2++;
                }

                break;
                case 5:
                break;

        
                default:
                break;
            }
        }

    }
    public static void Ex8(Scanner scan){

    }
    public static void Ex9(Scanner scan){

    }
    public static void Ex10(Scanner scan){

    }
    public static void Ex11(Scanner scan){

    }
    public static void Ex12(Scanner scan){

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op = 999;

        while(op != 0){
            System.out.println("\nInsira opcao:");
            op = scan.nextInt();

            switch(op){
                case 1:
                Ex1(scan);
                break;
                case 2:
                Ex2(scan);
                break;
                case 3:
                Ex3(scan);
                break;
                case 4:
                Ex4(scan);
                break;
                case 5:
                Ex5(scan);
                break;
                case 6:
                Ex6(scan);
                break;
                case 7:
                Ex7(scan);
                break;
                case 8:
                Ex8(scan);
                break;
                case 9:
                Ex9(scan);
                break;
                case 10:
                Ex10(scan);
                break;
                case 11:
                Ex11(scan);
                break;
                case 12:
                Ex12(scan);
                break;
                default:
                System.out.println("opcao incorreta!");
                break;
            }
        }
        scan.close();
    }
}
