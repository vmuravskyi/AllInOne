package tim_buchalka_java_programming_masterclass.section_11_naming_conventions_and_packages.lesson_142;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author v.muravskyi
 *
 */
public class MyWindow extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8991222989382017681L;

	public MyWindow(String title) {
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge = new Font("Consolas", Font.BOLD, 18);
		Font sansSerifSmall = new Font("Consolas", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("The complete Java Developer Course", 60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("by Volodymyr Muravskyi", 60, 100);
	}

}