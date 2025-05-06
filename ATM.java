import java.awt.*;
import java.awt.event.*;
class ATM extends Frame implements ItemListener
{	
	Choice its,qty;       
	List pro,spro,spri,sqty,pri,stot,tot;
	TextField gt;
	GridBagConstraints gc;
          	ATM()
	{
	  setSize(800,800);
	  setLocation(500,300);
	   setLayout(new GridBagLayout());
	gc=new GridBagConstraints();
	 // setLayout(new FlowLayout());
	  its=new Choice();
	  qty=new Choice();
	  pro=new List();
                 pri=new List();
	 spro=new List();
	 spri=new List();
	 sqty=new List();
	 stot=new List();
	 
 	gt=new TextField("0",10);
	 add(new Label("items"),1,1,1,1);
	add(its,1,2,1,1);
	add(new Label("products"),1,3,1,1);
	add(pro,1,4,1,1);
	add(new Label("price"),1,5,1,1);
	add(pri,1,6,1,1);
	add(new Label("quantity"),1,7,1,1);
	add(qty,1,8,1,1);
	add(new Label("selected product"),2,3,1,1);
	add(spro,2,4,1,1);
	add(new Label("selected price"),2,5,1,1);
	add(spri,2,6,1,1);
	add(new Label("selected quantity"),2,7,1,1);
	add(sqty,2,8,1,1);
	add(new Label("total"),3,7,1,1);
	add(stot,3,8,1,1);
	add(new Label("grand Total"),4,7,1,1);
	add(gt,4,8,1,1);
	its.add("ROOT VEGETABLE");
	its.add("LEAFY VEGETABLES");
	 its.add("VEGETABLES");
	// its.add("");
	//its.add("");
	 for(int i=0;i<30;i++)
	 qty.add(Integer.toString(i));
	pri.setEnabled(false);
	qty.setEnabled(false);
	spro.setEnabled(false);
	spri.setEnabled(false);
	stot.setEnabled(false);
	sqty.setEnabled(false);
	gt.setEnabled(true);
	its.addItemListener(this);
	pro.addItemListener(this);
	qty.addItemListener(this);
          	setVisible(true);
	}
	public void add(Component cc,int r,int c,int h,int w)
	{
		gc.gridx=c;
		gc.gridy=r;
		gc.gridwidth=w;
		gc.gridheight=h;
		gc.fill=gc.BOTH;
		add(cc,gc);

	}
	/*public static void main(String a[])
	{
	new ATM();
											}*/									
	public void itemStateChanged(ItemEvent e)
	{
	 if(e.getSource()==its)
	 {
	    pro.removeAll();
	    pri.removeAll();
	  if(its.getSelectedItem().equals("ROOT VEGETABLE"))
	             {
		pro.add("CARROT");pri.add("40");
		pro.add("BEET ROOT");pri.add("60");
		pro.add("RADDISH");pri.add("70");
		pro.add("POTATO");pri.add("90");
		pro.add("SWEET POTATO");pri.add("60");
	             }
                              if(its.getSelectedItem().equals("LEAFY VEGETABLES"))
	             {
		pro.add("SWISS CHARD");pri.add("50");
		pro.add("TURNIP GREENS");pri.add("60");
		pro.add("RED AMARANTH");pri.add("70");
		pro.add("CURRY LEAVES");pri.add("90");
		pro.add("KALE");pri.add("60");
	             }
	  if(its.getSelectedItem().equals("VEGETABLES"))
	             {
		pro.add("TOMATO");pri.add("50");
		pro.add("BEANS");pri.add("60");
		pro.add("BOTTLE GUARD");pri.add("70");
		pro.add("BITTER GUARD");pri.add("90");
		pro.add("LADYS FINGER");pri.add("60");
	             }
	 }
	 if(e.getSource()==pro)
	{
	   pri.select(pro.getSelectedIndex());
	   qty.setEnabled(true);
	}
	if(e.getSource()==qty)
	{
	    int a=Integer.parseInt(pri.getSelectedItem());
   	     int b=Integer.parseInt(qty.getSelectedItem());
	     int c=a*b;
	     spro.add(pro.getSelectedItem());
	       spri.add(pri.getSelectedItem());
	    sqty.add(qty.getSelectedItem());
	stot.add(Integer.toString(c));
	    int z=Integer.parseInt(gt.getText());
	   z=z+c;
	    gt.setText(Integer.toString(z));
	  qty.select(0);
	   qty.setEnabled(false);		
	}

	}
	/*public static void main(String a[])
	{
	new ATM();
	}*/
				
}