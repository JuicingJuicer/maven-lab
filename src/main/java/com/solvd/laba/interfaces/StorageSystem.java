package com.solvd.laba.interfaces;

import com.solvd.laba.Preferences;
import com.solvd.laba.items.Media;

public interface StorageSystem {
	public void addMedia(Media media);

	public void removeMedia(Media media);

	public void filterItems(Preferences preferences);
}
