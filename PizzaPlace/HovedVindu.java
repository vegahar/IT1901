package PizzaPck;

import com.trolltech.qt.gui.*;
/**
 * Her opprettes widgeten som holder p� fanene man vil legge til i programmet
 * 
 * Main-metoden for � kj�re hele programmet ligger her
 * @author Vegard
 *
 */
public class HovedVindu extends QWidget {

	private QGridLayout layout;
	private QTabWidget tabMain;
	
	/**
	 * Constructoren kaller @link KundeWidget
	 * @author Vegard 
	 */
	public HovedVindu(){
		setUp();
	}	
	
	
	/**
	 * Intern metode som setter opp fanene
	 */
	private void setUp(){
		
		//oppretter layout og QtabWidget der vi kan plassere widgeter i hver fane
		layout = new QGridLayout(this); 
		tabMain = new QTabWidget();
		layout.addWidget(tabMain);
		
		
		
		/*
		 * Setter opp fanene, med navn og riktig widget
		 */
		
		
		//kunde
		KundeWidget kunde = new KundeWidget();
		tabMain.addTab(kunde, null);
		tabMain.addTab(kunde,"Kunde");
		

		//Bestillingstab
		OrderGUI tab2 = new OrderGUI();
		tabMain.addTab(tab2, "Bestilling");
		
		
		/*
		 * Viser og setter st�rrelsen p� widgeten 
		 */
		this.setFixedSize(1024, 768);
		this.show();
		
	}
	
	
	
	/**
	 * Setter opp og kj�rer programmet
	 * @param args
	 */
    public static void main(String[] args) {
    	
        QApplication.initialize(args);
        new HovedVindu(); // oppretter seg selv og kj�rer setup();
        QApplication.exec();
       
    }
    
}
