package obramowkiikrawedzie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.border.*;


public class ObramowkiIKrawedzie extends JFrame {

    public ObramowkiIKrawedzie()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Aplikacja z wieloma ramkami");
        this.setBounds(300, 320, 400, 200);
        
        dodajPrzelacznik("createEtchedBorder", BorderFactory.createEtchedBorder());
        dodajPrzelacznik("createLoweredBevelBorder", BorderFactory.createLoweredBevelBorder());
        
        panelRadio.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
        panelRadio.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Krawędzie", TitledBorder.RIGHT, TitledBorder.BOTTOM));
        this.getContentPane().setLayout(new GridLayout(2, 1));
        
        this.add(panelRadio);
        this.add(panelKrawedzi);
        
        this.setDefaultCloseOperation(3);
    }
    private JPanel panelRadio = new JPanel();
    private JPanel panelKrawedzi = new JPanel();
    private ButtonGroup grupaRadio = new ButtonGroup();
    
    public void dodajPrzelacznik(final String nazwa, final Border kr)
    {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        
        przelacznik.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelKrawedzi.setBorder(BorderFactory.createTitledBorder(kr, nazwa));
            }
        });
        grupaRadio.add(przelacznik);
        panelRadio.add(przelacznik);
    }
    
    public static void main(String[] args) {
        new ObramowkiIKrawedzie().setVisible(true);
    }
    
}
