package com.example.android.sunshine.utilities;

/**
 * Created by Chloe on 3/10/2018.
 */

public interface ItemTouchHelperAdapter {
    // interface is for adapting move or dismiss
        boolean onItemMove(int fromPosition, int toPosition);
        void onItemDismiss(int position);
}
