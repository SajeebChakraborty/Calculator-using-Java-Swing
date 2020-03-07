import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

	private Container ct;
    private JTextArea text = new JTextArea();
    private JLabel lab = new JLabel("fx");
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,mal,div,min,equal,sin,acc,del,cos,tan,point,on,off;
    private JButton arrow,ac;
	 static String str="",sign="",numstr="";
    static int a=0,b=0,result=0,op=0,eq=0 ;

    Calculator(){
		
		
		setBounds(100,40,360,420);
		setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ct = this.getContentPane();
		ct.setLayout(null);
		ct.setBackground(Color.BLACK);
		
		
		lab.setBounds(10,35,30,35);
        lab.setFont(new Font("",Font.ITALIC,30));
        lab.setFont(new Font("",Font.ITALIC,30));
		lab.setForeground(Color.YELLOW);
		
		ct.add(lab);

        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b0 = new JButton("0");
        add = new JButton("+");
        mal = new JButton("x");
        min = new JButton("-");
        div = new JButton("/");
        equal = new JButton("=");
        point= new JButton(".");
        on = new JButton("ON");
        off = new JButton("OFF");
        arrow = new JButton("Back");
        ac = new JButton("AC");

        b1.setBounds(10,150,50,45);
        b1.setFont(new Font("",Font.BOLD,25));
        b1.addActionListener(this);
        ct.add(b1);

        b2.setBounds(70,150,50,45);
        b2.setFont(new Font("",Font.BOLD,25));
        b2.addActionListener(this);
        ct.add(b2);

        b3.setBounds(130,150,50,45);
        b3.setFont(new Font("",Font.BOLD,25));
        b3.addActionListener(this);
        ct.add(b3);
		
        b4.setBounds(10,200,50,45);
        b4.setFont(new Font("",Font.BOLD,25));
        b4.addActionListener(this);
        ct.add(b4);
		
        b5.setBounds(70,200,50,45);
        b5.setFont(new Font("",Font.BOLD,25));
        b5.addActionListener(this);
        ct.add(b5);
		
        b6.setBounds(130,200,50,45);
        b6.setFont(new Font("",Font.BOLD,25));
        b6.addActionListener(this);
        ct.add(b6);
		
        b7.setBounds(10,250,50,45);
        b7.setFont(new Font("",Font.BOLD,25));
        b7.addActionListener(this);
        ct.add(b7);
		
        b8.setBounds(70,250,50,45);
        b8.setFont(new Font("",Font.BOLD,25));
        b8.addActionListener(this);
        ct.add(b8);
		
        b9.setBounds(130,250,50,45);
        b9.setFont(new Font("",Font.BOLD,25));
        b9.addActionListener(this);
        ct.add(b9);

        add.setBounds(200,150,50,45);
        add.setFont(new Font("",Font.BOLD,25));
        add.addActionListener(this);
        ct.add(add);

        min.setBounds(200,200,50,45);
        min.setFont(new Font("",Font.BOLD,25));
        min.addActionListener(this);
        ct.add(min);

        mal.setBounds(200,250,50,45);
        mal.setFont(new Font("",Font.BOLD,25));
        mal.addActionListener(this);
        ct.add(mal);

        div.setBounds(200,300,50,45);
        div.setFont(new Font("",Font.BOLD,25));
        div.addActionListener(this);
        ct.add(div);

        point.setBounds(10,300,50,45);
        point.setFont(new Font("",Font.BOLD,25));
        point.addActionListener(this);
        ct.add(point);

        b0.setBounds(70,300,50,45);
        b0.setFont(new Font("",Font.BOLD,25));
        b0.addActionListener(this);
        ct.add(b0);

        equal.setBounds(130,300,50,45);
        equal.setFont(new Font("",Font.BOLD,25));
        equal.addActionListener(this);
        ct.add(equal);

        on.setBounds(260,150,70,45);
		on.setFont(new Font("",Font.BOLD,15));
        on.addActionListener(this);
        ct.add(on);

        off.setBounds(260,200,70,45);
        off.setFont(new Font("",Font.BOLD,15));
        off.addActionListener(this);
        ct.add(off);

        arrow.setBounds(260,250,70,45);
        arrow.setFont(new Font("",Font.BOLD,15));
        arrow.addActionListener(this);
        ct.add(arrow);

        ac.setBounds(260,300,70,45);
        ac.setFont(new Font("",Font.BOLD,15));
        ac.addActionListener(this);
        ct.add(ac);

        text.setBounds(50,30,270,50);
        text.setFont(new Font("",Font.PLAIN,25));
        text.setBackground(Color.WHITE);
        ct.add(text);

        
    }
    public void actionPerformed (ActionEvent e) {
        try {

            if (e.getSource() == b1) {
                text.setText("1");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b2) {
                text.setText("2");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b3) {
                text.setText("3");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b4) {
                text.setText("4");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b5) {
                text.setText("5");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b6) {
                text.setText("6");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b7) {
                text.setText("7");
                numstr += text.getText();
                str += numstr;
                text.setText(str);
            } else if (e.getSource() == b8) {
                text.setText("8");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b9) {
                text.setText("9");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            } else if (e.getSource() == b0) {
                text.setText("0");
                numstr += text.getText();
                str += text.getText();
                text.setText(str);
            }

            //Begining Operation

            else if (e.getSource() == add) {
                sign = "+";
                a = Integer.parseInt(numstr);
                result += a;
                str += "+";
                text.setText(str);
                numstr = "";

            } else if (e.getSource() == mal) {
                sign = "x";
                a = Integer.parseInt(numstr);
                if (result == 0) result = 1;
                result *= a;
                str += "x";
                text.setText(str);
                numstr = "";
            } else if (e.getSource() == div) {
                sign = "/";
                a = Integer.parseInt(numstr);
                if (a == 0) {
                    text.setText("ERROR");
                } else if (result == 0) result = a;
                else result /= a;
                str += "/";
                text.setText(str);
                numstr = "";
            } else if (e.getSource() == min) {
                sign = "-";
                a = Integer.parseInt(numstr);
                if (result==0) result=a;
                else result -= a;
                str += "-";
                text.setText(str);
                numstr = "";

            } else if (e.getSource() == equal) {
                a = Integer.parseInt(numstr);
                if (sign == "+") {
                    result += a;
                } else if (sign == "x") {
                    result *= a;
                } else if (sign == "/") {
                    result /= a;
                }
                else if (sign=="-"){
                    result-=a;
                }
                str += "=" + Integer.toString(result);
                text.setText(str);
                str = "";
                numstr = "";
                //result = 0;

            }
            else if (e.getSource()==off){
                ct.setVisible(false);
            }
            else if (e.getSource()==arrow){
                if (numstr!=null && numstr.length()>=1){
                    numstr=numstr.substring(0,numstr.length()-1);
                    str= str.substring(0,str.length()-1);
                    text.setText(str);
                }
                else if (str!=null && str.length()>=1){
                    str= str.substring(0,str.length()-1);
                    text.setText(str);
                }

            }
            else if (e.getSource()==ac){
                numstr="";
                str="";
                result=0;
                a=0;
                b=0;
                text.setText(str);
            }
        }catch (Exception ex){
            text.setText("MATH ERROR");
        }

    }




    public static void main(String[] args) {
         Calculator frm = new Calculator();
		 frm.setVisible(true);
    }
}