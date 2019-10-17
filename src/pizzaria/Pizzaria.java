package pizzaria;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Samanta Scavassa
 * @author Renan de Abreu
 */
public class Pizzaria {

    public static void main(String[] args) {

        Pizza[] pedidoArray = new Pizza[100];

        JFrame f = new JFrame();

        f.setSize(900, 800);

        JLabel Nome = new JLabel("Digite seu nome: ");
        JTextField Name = new JTextField();

        JTextField Tel = new JTextField();
        JLabel Telefone = new JLabel("Digite seu telefone: ");

        JTextField Pizza = new JTextField();
        JLabel SaborPizza = new JLabel("Digite o sabor da pizza(0 - Marguerita, 1 - Capricciosa, "
                + "2 - Diavolo, 3 - Funghi ou 4 - Prosciutto):");

        JTextField Tam = new JTextField();
        JLabel Tamanho = new JLabel("Digite o tamanho da pizza(P, M, G): ");

        f.add(Nome);
        f.add(Name);

        f.add(Telefone);
        f.add(Tel);

        f.add(SaborPizza);
        f.add(Pizza);

        f.add(Tamanho);
        f.add(Tam);

        f.add(new JLabel());

        JButton Confirmar = new JButton();
        Confirmar.setText("Confirmar");
        Confirmar.setForeground(Color.BLUE);

        JButton Cancelar = new JButton();
        Cancelar.setText("Cancelar");
        Cancelar.setForeground(Color.BLUE);

        f.add(Confirmar);
        f.add(Cancelar);

        f.setLayout(new GridLayout(20, 20));

        f.setVisible(true);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Confirmar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Ingredientes s = new Ingredientes();
                Sabor sab = new Sabor();

                Pizza novoPedido = new Pizza(Tam.getText(), Integer.parseInt(Pizza.getText()), s);

                JFrame p = new JFrame();

                p.setSize(800, 800);

                JLabel Pedido = new JLabel();
                Pedido.setText("<html>" + "Dados do pedido:<br/> " + "Cliente:\t" + Name.getText()+ "<br/>Telefone:\t" 
                        + Tel.getText() + "<br/> Sabor da Pizza:\t" + sab.retornaSabor(novoPedido.getSabor()) + "<br/>Ingredientes da Pizza\t:<br/>" 
                        + s.ingredientePizza(Integer.parseInt(Pizza.getText())) + "<br/>Preço do Pedido:\tR$" + novoPedido.calcularValor() 
                        + "<br/>Data do Pedido:\t" + novoPedido.dataPedido());
                p.add(Pedido);
                

                p.setLayout(new GridLayout(5, 5));

                p.setVisible(true);

                p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            }

        }
        );

        Cancelar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame c = new JFrame();

                        c.setSize(900, 800);

                        JLabel Cancel = new JLabel();
                        Cancel.setText("Pedido Cancelado");
                        c.add(Cancel);

                        c.setLayout(new GridLayout(10, 10));

                        c.setVisible(true);

                        c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    }

                }
        );

    }
}
