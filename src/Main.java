import javax.swing.*;
// import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto("ervilha", 5.50);
        */

        Produto produto;

        boolean encerrar = false;

        String nome = "";
        int quantidade = 0;
        double valor = 0;
        double total = 0;

        do {
            /*
            System.out.println("Nome do produto: ");
            nome = leitor.nextLine();
            */

            nome = JOptionPane.showInputDialog("Nome do produto: ");

            /*
            System.out.println("Valor do produto [apenas números]");
            valor = leitor.nextDouble();
             */

            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto [apenas números]: "));
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade? "));

            produto = new Produto(nome, quantidade, valor);
            System.out.println(produto);

            total = total + (produto.getValor() * produto.getQuantidade());

            /*
            System.out.println("""
                        Deseja mais alguma coisa?
                        [ 1 ] = SIM
                        [ 0 ] = NÃO
                    """);
            encerrar = leitor.hasNextInt();
            var opcao = leitor.nextInt() ;
            */

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                        Deseja mais alguma coisa?
                        [ 1 ] = SIM
                        [ 0 ] = NÃO
                    """));

            encerrar = opcao == 1 ? false : true;

        } while(encerrar == false);

        System.out.printf("Total da compra: R$ %,.2f%n", total);

    }
}
