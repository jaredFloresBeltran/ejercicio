//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String [] args) {
        Double num1= Double.valueOf(JOptionPane.showInputDialog("Dame el primer numero"));
        Double num2= Double.valueOf(JOptionPane.showInputDialog("Dame el segundo numero"));
        Double num3= Double.valueOf(JOptionPane.showInputDialog("Dame el tercer numero"));

        System.out.println((Double.valueOf(num1) + Double.valueOf(num2) + Double.valueOf(num3))/3);

    }



}