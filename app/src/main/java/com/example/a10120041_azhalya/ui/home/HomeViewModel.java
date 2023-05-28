/**
 *
 * Nama : Azhalya Cantika
 * Nim : 10120041
 * Kelas : IF 1
 * Email : Azhalya
 *
 */

package com.example.a10120041_azhalya.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}