package it.marcoberri.mbmeteo.mobile;

import it.marcoberri.mbmeteo.mobile.model.DetailsContent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A fragment representing a single Item detail screen. This fragment is either
 * contained in a {@link ItemListActivity} in two-pane mode (on tablets) or a
 * {@link ItemDetailActivity} on handsets.
 */
public class ItemDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private DetailsContent.DetailItem mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ItemDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (getArguments().containsKey(ARG_ITEM_ID)) {
			mItem = DetailsContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		
		final View rootView = inflater.inflate(R.layout.fragment_item_detail,container, false);

		
		if (mItem == null) {
			return rootView;
		}
		
			final ImageView imgView = ((ImageView) rootView.findViewById(R.id.item_detail_container_image));
			imgView.setImageResource( getResources().getIdentifier(mItem.getImage(), "drawable","it.marcoberri.mbmeteo.mobile"));
			Log.d("Meteo", "Contente description:" + mItem.getContentDescription());
			Log.d("Meteo", "Get Resource:" + getResources().getIdentifier(mItem.getContentDescription(), "string","it.marcoberri.mbmeteo.mobile"));
			Log.d("Meteo", "Get Resource 2:" + getResources().getText(getResources().getIdentifier(mItem.getContentDescription(), "string","it.marcoberri.mbmeteo.mobile")));
				
			final String ext = getResources().getText(getResources().getIdentifier(mItem.getContentDescription()+ "_ext", "string","it.marcoberri.mbmeteo.mobile")).toString();
			
			imgView.setContentDescription(ext);

			final String desc = getResources().getText(getResources().getIdentifier(mItem.getContentDescription(), "string","it.marcoberri.mbmeteo.mobile")).toString();
			this.getActivity().setTitle(desc);
			
			final TextView textView = ((TextView) rootView.findViewById(R.id.item_detail_container_text));
			textView.setText(ext);
		
			return rootView;
	}
}
