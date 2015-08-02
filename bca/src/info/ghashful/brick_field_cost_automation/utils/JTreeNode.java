package info.ghashful.brick_field_cost_automation.utils;

/**
 * 
 JTreeNode.java for creating node
 *
 * @version 1.0 24th June 2015 * @author Shekhar Ullah
 */
public class JTreeNode {
	
	// Variables Declaration
    private String name;
    private String icon;

	// constructor
    public JTreeNode(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return ("/info/ghashful/brick_field_cost_automation/assets/" + this.icon);
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
    
    

}
