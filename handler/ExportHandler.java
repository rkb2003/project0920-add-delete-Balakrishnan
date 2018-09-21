 
package handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.Shell;

import model.Person;
import model.PersonModelProvider;
import util.UtilFile;
import view.AddPersonDialog;
import view.MyTableViewer;

public class ExportHandler {
	   @Inject
	   private EPartService epartService;
	   @Inject
	   @Named(IServiceConstants.ACTIVE_SHELL)
	   Shell                shell;

	   @Execute
	   public void execute() throws IOException {
	      PersonModelProvider personInstance = PersonModelProvider.INSTANCE;
	      System.out.println("In person modal");
	      
	      List<String> personList = new ArrayList();
	      
	      for(Person person: personInstance.getPersons()) {
	    	  personList.add(person.getFirstName() + ","+person.getLastName() + "," 
	      + person.getPhone() + "," + person.getAddress());
	    	  System.out.println("In person modal loop");
	      }
	      System.out.println("creating file");
	      UtilFile.saveFile(PersonModelProvider.putFilePath(),  personList);
	     
	     /* AddPersonDialog dialog = new AddPersonDialog(shell);
	      dialog.open();
	      if (dialog.getPerson() != null) {
	         personInstance.getPersons().add(dialog.getPerson());
	         MPart findPart = epartService.findPart(MyTableViewer.ID);
	         Object findPartObj = findPart.getObject();

	         if (findPartObj instanceof MyTableViewer) {
	            MyTableViewer v = (MyTableViewer) findPartObj;
	            v.refresh();
	         }
	      }*/
	   }
		
}