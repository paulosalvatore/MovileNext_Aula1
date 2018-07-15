package br.com.paulosalvatore.movilenext_aula1;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SeekBarViewModel extends ViewModel {
	public MutableLiveData<Integer> seekbarValue = new MutableLiveData<>();
}
