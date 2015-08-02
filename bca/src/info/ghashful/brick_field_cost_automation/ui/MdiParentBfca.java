/**
 * contins ui 
 */
package info.ghashful.brick_field_cost_automation.ui;

 
import info.ghashful.brick_field_cost_automation.utils.JTreeCellRenderer;
import info.ghashful.brick_field_cost_automation.utils.JTreeNode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * 
 * Main.java is written for Entry Point Of the application
 *
 * @version 1.0 20th June 2015 * @author Shekhar Ullah
 */
public class MdiParentBfca extends javax.swing.JFrame {

	/**
	 * Creates new form Dashboard
	 */
	public MdiParentBfca() {
		// get screen resolution in pixels
		screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		pnlBody = new javax.swing.JPanel();
		pnlMenu = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		// define root node
		DefaultMutableTreeNode menu = new DefaultMutableTreeNode("Menu");

		// define Settings node
		DefaultMutableTreeNode settings = new DefaultMutableTreeNode(
				new JTreeNode("Settings", "dash_menu_sale_root.png"));
		// define sub-nodes for Settings
		settings.add(new DefaultMutableTreeNode(new JTreeNode("User", "dash_menu_test_root.png")));

		// define operation node
		DefaultMutableTreeNode operation = new DefaultMutableTreeNode(
				new JTreeNode("Operation", "dash_menu_test_root.png"));
		// add sub-nodes for operation
		operation.add(new DefaultMutableTreeNode(new JTreeNode("Expense", "dash_menu_test_root.png")));
		operation.add(new DefaultMutableTreeNode(new JTreeNode("Sales", "dash_menu_test_root.png")));

		// define report node
		DefaultMutableTreeNode report = new DefaultMutableTreeNode(new JTreeNode("Reports", "dash_menu_test_root.png"));
		// add sub-nodes for report
		report.add(new DefaultMutableTreeNode(new JTreeNode("Balance Sheet", "dash_menu_test_root.png")));
		report.add(new DefaultMutableTreeNode(new JTreeNode("Ladger", "dash_menu_test_root.png")));

		// define tools node
		DefaultMutableTreeNode tools = new DefaultMutableTreeNode(new JTreeNode("Tools", "dash_menu_test_root.png"));
		// add sub-nodes for product
		tools.add(new DefaultMutableTreeNode(new JTreeNode("Import Date", "dash_menu_test_root.png")));
		tools.add(new DefaultMutableTreeNode(new JTreeNode("Backup", "dash_menu_test_root.png")));

		// define help node
		DefaultMutableTreeNode help = new DefaultMutableTreeNode(new JTreeNode("Help", "dash_menu_test_root.png"));
		// add sub-nodes for records
		help.add(new DefaultMutableTreeNode(new JTreeNode("User Guide", "dash_menu_test_root.png")));
		help.add(new DefaultMutableTreeNode(new JTreeNode("Content Developers", "dash_menu_test_root.png")));

		// Test node
		DefaultMutableTreeNode test = new DefaultMutableTreeNode(new JTreeNode("Test", "dash_menu_test_root.png"));
		test.add(new DefaultMutableTreeNode(new JTreeNode("New Frame", "dash_menu_test_window.png")));

		// add all nodes to root-menu
		menu.add(settings);
		menu.add(operation);
		menu.add(tools);
		menu.add(help);
		menu.add(report);

		menu.add(test);

		// add root node(via constructor) to tree
		jtrMenu = new javax.swing.JTree(menu);
		jdpFormDisplay = new javax.swing.JDesktopPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Brick Field Cost Automation . Dashboard");
		setAlwaysOnTop(true);
		setBackground(new java.awt.Color(30, 170, 241));
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setForeground(java.awt.Color.lightGray);
		setIconImages(null);
		setMaximumSize(new java.awt.Dimension(32767, 32767));
		setName("dashMain"); // NOI18N
		setResizable(false);

		pnlBody.setMinimumSize(new java.awt.Dimension(0, 0));
		pnlBody.setLayout(new javax.swing.BoxLayout(pnlBody, javax.swing.BoxLayout.LINE_AXIS));

		pnlMenu.setLayout(new java.awt.GridLayout(1, 0));

		jScrollPane1.setBorder(null);

		// custom cell renderer
		JTreeCellRenderer jtcr = new JTreeCellRenderer();

		// use custom cell renderer
		jtrMenu.setCellRenderer(jtcr);

		DefaultTreeCellRenderer dtcr = (DefaultTreeCellRenderer) jtrMenu.getCellRenderer();
		dtcr.setTextSelectionColor(Color.WHITE);
		dtcr.setTextNonSelectionColor(Color.CYAN);
		jtrMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 10, 10));
		jtrMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jtrMenu.setForeground(new java.awt.Color(255, 255, 255));
		jtrMenu.setModel(jtrMenu.getModel());
		jtrMenu.setDoubleBuffered(true);
		jtrMenu.setMaximumSize(new java.awt.Dimension(32767, 32767));
		jtrMenu.setMinimumSize(new java.awt.Dimension(128, 78));
		jtrMenu.setName("dashboard menu"); // NOI18N
		jtrMenu.setPreferredSize(new java.awt.Dimension(275, 126));
		jtrMenu.setSize((int) (pnlMenu.getWidth() * 1.1), (int) pnlMenu.getHeight());
		jtrMenu.setPreferredSize(jtrMenu.getSize());
		jtrMenu.setRootVisible(false);
		jtrMenu.setRowHeight(32);
		jtrMenu.setToggleClickCount(1);
		jtrMenu.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
			public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
				jtrMenuValueChanged(evt);
			}
		});
		jScrollPane1.setViewportView(jtrMenu);

		jScrollPane1.setPreferredSize(pnlMenu.getSize());

		pnlMenu.add(jScrollPane1);

		pnlMenu.setSize((int) (screenSize.getWidth() * 0.20), (int) screenSize.getHeight());
		pnlMenu.setMinimumSize(pnlMenu.getSize());
		pnlMenu.setPreferredSize(pnlMenu.getSize());

		pnlBody.add(pnlMenu);

		jdpFormDisplay.setMaximumSize(new java.awt.Dimension(32767, 32767));

		javax.swing.GroupLayout jdpFormDisplayLayout = new javax.swing.GroupLayout(jdpFormDisplay);
		jdpFormDisplay.setLayout(jdpFormDisplayLayout);
		jdpFormDisplayLayout.setHorizontalGroup(jdpFormDisplayLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 508, Short.MAX_VALUE));
		jdpFormDisplayLayout.setVerticalGroup(jdpFormDisplayLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));

		jdpFormDisplay.setSize((int) (screenSize.getWidth() - pnlMenu.getWidth()), (int) screenSize.getHeight());
		jdpFormDisplay.setPreferredSize(jdpFormDisplay.getSize());

		pnlBody.add(jdpFormDisplay);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		pnlBody.setPreferredSize(screenSize.getSize());
		getAccessibleContext().setAccessibleName("Open POS | Dashboard");
		pack();
	}// </editor-fold>

	private void jtrMenuValueChanged(javax.swing.event.TreeSelectionEvent evt) {
		dmtn = new DefaultMutableTreeNode();
		dmtn = (DefaultMutableTreeNode) jtrMenu.getLastSelectedPathComponent();
		if (dmtn == null) {
			return; // exit method
		}

		String selectedNode = "";

		if (dmtn.isLeaf()) {
			JTreeNode jtn = (JTreeNode) dmtn.getUserObject();
			selectedNode = jtn.getName();
		} else {
			return; // exit method
		}
		
		//--------------User Frame---------Sub Settings node-----------
		if ("User".equals(selectedNode)) {
			if (jif != null) {
				jif.dispose();
			}

			jif = new UserClass();
			jif.setClosable(true);
			jif.setSize(jdpFormDisplay.getSize());

			jif.setVisible(true);

			try {
				jdpFormDisplay.add(jif);
				jif.setSelected(true);
				jtrMenu.setSelectionPath(null);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		// ----------------------Test Frame----------------------------
//		if ("New Frame".equals(selectedNode)) {
//			if (jif != null) {
//				jif.dispose();
//			}
//
//			jif = new TestForm();
//			jif.setClosable(true);
//			jif.setSize(jdpFormDisplay.getSize());
//
//			jif.setVisible(true);
//
//			try {
//				jdpFormDisplay.add(jif);
//				jif.setSelected(true);
//				jtrMenu.setSelectionPath(null);
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

		// -----------------User Guide new Frame--------------------
//		if ("User Guide".equals(selectedNode)) {// TODO add sub-tree frames
//												// here.
//			if (jif != null) {
//				jif.dispose();
//			}
//
//			jif = new TestForm();// FIXME add new User Guide Class here.
//			jif.setClosable(true);
//			jif.setSize(jdpFormDisplay.getSize());
//
//			jif.setVisible(true);
//
//			try {
//				jdpFormDisplay.add(jif);
//				jif.setSelected(true);
//				jtrMenu.setSelectionPath(null);
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

		System.out.println("Node Selected : " + selectedNode);

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MdiParentBfca.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		// </editor-fold>

		// Create and display the form
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				MdiParentBfca dashWindow = new MdiParentBfca();
				dashWindow.setMinimumSize(screenSize);
				dashWindow.setVisible(true);

			}
		});
	}

	// <editor-fold defaultstate="collapsed" desc="Variables declarations">
	// Variables declaration - do not modify
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JDesktopPane jdpFormDisplay;
	private javax.swing.JTree jtrMenu;
	private javax.swing.JPanel pnlBody;
	private javax.swing.JPanel pnlMenu;
	// End of variables declaration
	// custom variables
	private static Dimension screenSize;

	// custom models
	private DefaultMutableTreeNode dmtn;
	private JInternalFrame jif;

	// </editor-fold>
}
