import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import blog.*;
import org.eclipse.swt.widgets.Label;

public class MainWindow {
	private static Text text;
	private static List list;
	
	private static BlogList blogList = new BlogList();
	private static Text text_1;
	private static Text text_2;
	private static Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				BlogPost post = new BlogPost();
					post.setHeadline(text.getText());
					post.setContent(text_1.getText());
					blogList.post.add(post);
					list.add(post.getHeadline());
			}
		});
		btnNewButton.setBounds(193, 204, 75, 25);
		btnNewButton.setText("Posta");
		
		
		list = new List(shell, SWT.BORDER);
		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = list.getSelectionIndex();
				text.setText(blogList.post.get(i).getHeadline());
				text_1.setText(blogList.post.get(i).getContent());
			}
		});
		
		BlogPost p = new BlogPost();
			p.setHeadline("Hej");
			p.setContent("Innehåll bla bla bla");
			blogList.post.add(p);
			list.add(p.getHeadline());
	
		BlogPost p2 = new BlogPost();
			p2.setHeadline("News");
			p2.setContent("Senaste nytt!!");
			blogList.post.add(p2);
			list.add(p2.getHeadline());
			
		
		list.setBounds(291, 34, 120, 199);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 9, 139, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(10, 35, 256, 162);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(73, 233, 76, 21);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(73, 206, 76, 21);
		
		Label lblFrfattare = new Label(shell, SWT.NONE);
		lblFrfattare.setBounds(12, 206, 55, 15);
		lblFrfattare.setText("F\u00F6rfattare:");
		
		Label lblKategori = new Label(shell, SWT.NONE);
		lblKategori.setBounds(12, 233, 55, 15);
		lblKategori.setText("Kategori:");
		
		Label lblLista = new Label(shell, SWT.NONE);
		lblLista.setBounds(291, 15, 55, 15);
		lblLista.setText("Lista:");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public List getList() {
		return list;
	}
	public Text getText_1() {
		return text_1;
	}
	public Text getText_3() {
		return text_3;
	}
	public Text getText_2() {
		return text_2;
	}
}
