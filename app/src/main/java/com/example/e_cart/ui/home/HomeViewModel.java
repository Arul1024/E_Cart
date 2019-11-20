package com.example.e_cart.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText,nText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Wicket Keeping Gloves");
        nText = new MutableLiveData<>();
        nText.setValue("Inner Gloves");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getNtext() {
        return nText;
    }
}