import java.awt.*;
import java.awt.event.*;

class Login11 extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;
    GridBagConstraints gc;

    Login11() {
        l1 = new Label("User Name");
        l2 = new Label("Password");
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Login");
        b2 = new Button("Reset");

        setSize(500, 300);
        setLayout(new GridBagLayout());
        gc = new GridBagConstraints();

        addC(l1, 1, 1, 1, 1);
        addC(t1, 1, 2, 1, 1);
        addC(l2, 2, 1, 1, 1);
        addC(t2, 2, 2, 1, 1);
        addC(b1, 3, 1, 1, 1);
        addC(b2, 3, 2, 1, 1);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public void addC(Component cc,int r,int c,int h,int w) {
        gc.gridx = c;
        gc.gridy = r;
        gc.gridwidth = w;
        gc.gridheight = h;
        gc.fill = gc.BOTH;
        add(cc, gc);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new ATM(); 
        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
	     dispose();
        }
    }

    public static void main(String a[]) {
        new Login11();
    }
}
