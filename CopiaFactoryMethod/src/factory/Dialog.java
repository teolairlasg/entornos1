package factory;

import buttons.Button;

public abstract class Dialog {
	 public void renderWindow() {
	        // ... other code ...

	        Button okButton = createButton();
	        okButton.render();
	    }

	    /**
	     * Subclasses will override this method in order to create specific button
	     * objects.
	     */
	    public abstract Button createButton();
}
