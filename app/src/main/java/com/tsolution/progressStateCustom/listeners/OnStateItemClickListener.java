package com.tsolution.progressStateCustom.listeners;


import com.tsolution.progressStateCustom.StateProgressBar;
import com.tsolution.progressStateCustom.components.StateItem;

/**
 * Created by Kofi Gyan on 2/20/2018.
 */

public interface OnStateItemClickListener {

    void onStateItemClick(StateProgressBar stateProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState);

}
