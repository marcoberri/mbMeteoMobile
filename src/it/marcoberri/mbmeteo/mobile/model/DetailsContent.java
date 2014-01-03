package it.marcoberri.mbmeteo.mobile.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DetailsContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DetailItem> ITEMS = new ArrayList<DetailItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DetailItem> ITEM_MAP = new HashMap<String, DetailItem>();

	static {
		addItem(new DetailItem("1", "temperature","temperature"));
		addItem(new DetailItem("2", "humidity","humidity"));
		addItem(new DetailItem("3", "dewpoint","dewpoint"));
		addItem(new DetailItem("4", "day_rainfall","day_rain"));
		addItem(new DetailItem("5", "tot_rain","tot_rain"));
	}

	private static void addItem(DetailItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DetailItem {
		
		private String id;
		
		private String contentDescription;
		public String getId() {
		
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContentDescription() {
			
			return contentDescription;
		}

		public void setContentDescription(String contentDescription) {
			this.contentDescription = contentDescription;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		private String image;
		
		DetailItem(String id, String contentDescription, String image) {
			this.id = id;
			this.image = image;
			this.contentDescription = contentDescription;
		}

		@Override
		public String toString() {
			return this.contentDescription;
					//return this.context.getResources().getText(this.context.getResources().getIdentifier(this.contentDescription, "strings","it.marcoberri.mbmeteo.mobile")).toString();
		}
	}
}
