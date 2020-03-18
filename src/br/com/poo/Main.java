package br.com.poo;

import br.com.poo.model.Ingredientes;
import br.com.poo.model.Pizzaria;
import br.com.poo.model.Sabor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Samanta Scavassa
 * @author Renan de Abreu
 */
public class Main {

    public static void main(String[] args) {
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

                                            Pizzaria novoPedido = new Pizzaria(Tam.getText(), Integer.parseInt(Pizza.getText()), s);

                                            JFrame p = new JFrame();

                                            p.setSize(800, 800);

                                            JLabel Pedido = new JLabel();
                                            Pedido.setText("<html>" + "Dados do pedido:<br/> " + "Cliente:<br/>" + Name.getText()+ "<br/>Telefone:<br/>"
                                                    + Tel.getText() + "<br/> Sabor da Pizza:<br/>" + sab.retornaSabor(novoPedido.getSabor()) + "<br/>Ingredientes da Pizza\t:<br/>"
                                                    + s.ingredientePizza(Integer.parseInt(Pizza.getText())) + "<br/>Preço do Pedido:<br/>R$" + novoPedido.calcularValor()
                                                    + "<br/>Data do Pedido:<br/>" + novoPedido.dataPedido());
                                            p.add(Pedido);


                                            p.setLayout(new GridLayout(3, 10));

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
