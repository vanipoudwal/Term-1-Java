
package onscreenkb;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;

public class Onscreenkb extends JFrame implements KeyListener
{
    private JFrame f;
    private JPanel p;
  // private NullPointerException npe;
    private JButton Backspace,Tab,Q,W,E,R,T,Y,U,I,O,P,Caps,A,S,D,F,G,H,J,K,L,Shift,Z,X,C,V,B,N,M;
    private JTextField tf;
    private String keyText;
    private JFrame fr;
    private JPanel pl;
    private JLabel l1;
    private JLabel l2;
    private Object[] keys;
    int keycode;

    public static void main(String args[])
    {
        Onscreenkb os = new Onscreenkb();
        os.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // NullPointerException npe1;
        os.setSize(700,500);
        JFrame f = new JFrame("On Screen KeyBoard");
        JPanel p  =new JPanel();
        os.setVisible(true);
        
        StringBuffer sb = new StringBuffer();
        sb.append(sb);
    }

    public Onscreenkb()
    {
        super("Typing Application");
        f.add(p);
        fr.add(pl);
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel();
        p.add(l1);
        pl.add(l1);
        JLabel l2 = new JLabel();
        p.add(l2);
        pl.add(l2);
        JTextField tf = new JTextField(60);
        p.add(tf);
        pl.add(tf);
        tf.setEditable(true);
        p.add(tf , BorderLayout.NORTH);
        pl.add(tf , BorderLayout.NORTH);
        TextFieldHandler handler = new TextFieldHandler();
        
        JButton Backspace = new JButton("Backspace");
        pl.add(Backspace);
        Backspace.addActionListener(new Onscreenkb1());
        
        JButton Tab = new JButton("Tab");
        pl.add(Tab);
        Tab.addActionListener(new Onscreenkb2());
        
        JButton Q = new JButton("Q");
        pl.add(Q);
        Q.addActionListener(new Onscreenkb3());
        
        JButton W = new JButton("W");
        pl.add(W);
        W.addActionListener(new Onscreenkb4());
        
        JButton E = new JButton("E");
        pl.add(E);
        E.addActionListener(new Onscreenkb5());
        
        JButton R = new JButton("R");
        pl.add(R);
        R.addActionListener(new Onscreenkb6());
        
        JButton T = new JButton("T");
        pl.add(T);
        T.addActionListener(new Onscreenkb7());
        
        JButton Y = new JButton("Y");
        pl.add(Y);
        Y.addActionListener(new Onscreenkb8());
        
        JButton U = new JButton("U");
        pl.add(U);
        U.addActionListener(new Onscreenkb9());
        
        JButton I = new JButton("I");
        pl.add(I);
        I.addActionListener(new Onscreenkb10());
        
        JButton O = new JButton("O");
        pl.add(O);
        O.addActionListener(new Onscreenkb11());
        
        JButton P = new JButton("P");
        pl.add(P);
        P.addActionListener(new Onscreenkb12());
        
        JButton Caps = new JButton ("Caps");
        pl.add(Caps);
        Caps.addActionListener(new Onscreenkb13());
        
        JButton A = new JButton("A");
        pl.add(A);
        A.addActionListener(new Onscreenkb14());
        
        JButton S = new JButton("S");
        pl.add(S);
        S.addActionListener(new Onscreenkb15());
        
        JButton D = new JButton("D");
        pl.add(D);
        D.addActionListener(new Onscreenkb16());
        
        JButton F = new JButton("F");
        pl.add(F);
        F.addActionListener(new Onscreenkb17());
        
        JButton G = new JButton("G");
        pl.add(G);
        G.addActionListener(new Onscreenkb18());
        
        JButton H = new JButton("H");
        pl.add(H);
        H.addActionListener(new Onscreenkb19());
        
        JButton J = new JButton("J");
        pl.add(J);
        J.addActionListener(new Onscreenkb20());
        
        JButton K = new JButton("K");
        pl.add(K);
        K.addActionListener(new Onscreenkb21());
        
        JButton L = new JButton("L");
        pl.add(L);
        L.addActionListener(new Onscreenkb22());
        
        JButton Shift = new JButton("Shift");
        pl.add(Shift);
        Shift.addActionListener(new Onscreenkb23());
        
        JButton Z = new JButton("Z");
        pl.add(Z);
        Z.addActionListener(new Onscreenkb24());
        
        JButton X = new JButton("X");
        pl.add(X);
        X.addActionListener(new Onscreenkb25());
        
        JButton C = new JButton("C");
        pl.add(C);
        C.addActionListener(new Onscreenkb26());
        
        JButton V = new JButton("V");
        pl.add(V);
        V.addActionListener(new Onscreenkb27());
        
        JButton B = new JButton("B");
        pl.add(B);
        B.addActionListener(new Onscreenkb28());
        
        JButton N = new JButton("N");
        pl.add(N);
        N.addActionListener(new Onscreenkb29());
        
        JButton M = new JButton("M");
        pl.add(M);
        M.addActionListener(new Onscreenkb30());
    }

    @Override
    public void keyPressed(KeyEvent event)
    {
        keycode = event.getKeyCode();
        keyText = String.format("%s",KeyEvent.getKeyText(event.getKeyCode()));
        f.setBackground(Color.PINK);
    }

    @Override
    public void keyReleased(KeyEvent event)
    {
        keycode = event.getKeyCode();
        keyText = String.format("%s",KeyEvent.getKeyText(event.getKeyCode()));
        getBackground();
    }

    @Override
    public void keyTyped(KeyEvent event)
    {
        keyText = String.format("%s",event.getKeyChar());
    }

    private class TextFieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
        String string = "";
        if (event.getSource() == tf)
        string = String.format("%s", event.getActionCommand());
        }
    }

    class Onscreenkb1 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Backspace");  
            sb1.append(true);
    }
}
    
    class Onscreenkb2 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Tab");  
            sb1.append(true);
    }
}

    class Onscreenkb3 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Q");  
            sb1.append(true);
    }
}

    class Onscreenkb4 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
             //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("W");  
            sb1.append(true);
    }
}
        
    class Onscreenkb5 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("E");  
            sb1.append(true);
    }
}
          
    class Onscreenkb6 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("R");  
            sb1.append(true);
    }
}
            
    class Onscreenkb7 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("T");  
            sb1.append(true);
    }
}
              
    class Onscreenkb8 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Y");   
            sb1.append(true);
    }
}
                
    class Onscreenkb9 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("U");    
            sb1.append(true);
    }
}
                  
    class Onscreenkb10 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("I");  
            sb1.append(true);
    }
}
    
    class Onscreenkb11 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("O");  
            sb1.append(true);
    }
}
      
    class Onscreenkb12 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("P");  
            sb1.append(true);
    }
}
    
    class Onscreenkb13 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Caps");  
            sb1.append(true);
    }
}
    
    class Onscreenkb14 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("A");  
            sb1.append(true);
    }
}
     
    class Onscreenkb15 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("S");  
            sb1.append(true);
    }
}
    
    class Onscreenkb16 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("D");  
            sb1.append(true);
    }
}
    
    class Onscreenkb17 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("F");  
            sb1.append(true);
    }
}
    
    class Onscreenkb18 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("G");  
            sb1.append(true);
    }
}
    
    class Onscreenkb19 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("H");  
            sb1.append(true);
    }
}
    
    class Onscreenkb20 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("J");  
            sb1.append(true);
    }
}

    class Onscreenkb21 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("K");  
            sb1.append(true);
    }
}

    class Onscreenkb22 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("L");  
            sb1.append(true);
    }
}
      
    class Onscreenkb23 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Shift");  
            sb1.append(true);
    }
}
        
    class Onscreenkb24 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("Z");  
            sb1.append(true);
    }
}
          
    class Onscreenkb25 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("X");  
            sb1.append(true);
    }
}
    
    class Onscreenkb26 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("C");  
            sb1.append(true);
    }
}
      
    class Onscreenkb27 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("V");  
            sb1.append(true);
    }
}
        
    class Onscreenkb28 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("B");  
            sb1.append(true);
    }
}

    class Onscreenkb29 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("N");  
            sb1.append(true);
    }
}

    class Onscreenkb30 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            StringBuilder sb1 = new StringBuilder("M");  
            sb1.append(true);
    }
}

}