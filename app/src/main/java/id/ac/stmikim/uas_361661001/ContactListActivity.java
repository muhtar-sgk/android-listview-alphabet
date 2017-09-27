package id.ac.stmikim.uas_361661001;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactListActivity extends Activity {

	private ExampleContactListView listview;
	
	List<ContactItemInterface> contactList;
	List<ContactItemInterface> filterList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);
		
		filterList = new ArrayList<ContactItemInterface>();
		contactList = ExampleDataSource.getSampleContactList();
		
		ExampleContactAdapter adapter = new ExampleContactAdapter(this, R.layout.example_contact_item, contactList);
		
		listview = (ExampleContactListView) this.findViewById(R.id.listview);
		listview.setFastScrollEnabled(true);
		listview.setAdapter(adapter);
    }
    
}
