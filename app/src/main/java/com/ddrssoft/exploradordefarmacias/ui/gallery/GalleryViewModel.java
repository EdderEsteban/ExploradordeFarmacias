package com.ddrssoft.exploradordefarmacias.ui.gallery;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ddrssoft.exploradordefarmacias.modelo.Farmacia;

import java.util.ArrayList;
import java.util.List;

public class GalleryViewModel extends AndroidViewModel {

    private Context context;
    private MutableLiveData<List<Farmacia>> listaMutable;
    public GalleryViewModel(@NonNull Application application) {
        super(application);
        this.context=application.getApplicationContext();
    }

    public LiveData<List<Farmacia>> getListaMutable(){
        if(listaMutable==null){
            listaMutable=new MutableLiveData<>();
        }
        return listaMutable;
    }

    public void armarLista(){

        List<Farmacia> lista = new ArrayList<>();
        lista.add(new Farmacia("Farmacia Tello","Heroes de Malvinas 261",02664431776,"https://lh5.googleusercontent.com/p/AF1QipMcW9bCJgBRvoH8UdKDrtSGHosLF9f5a4aFFJut=w426-h240-k-no","08:00 - 00:00"));
        lista.add(new Farmacia("Farmacia Quintana","Heroes de Malvinas 121",02664452000,"https://lh5.googleusercontent.com/p/AF1QipNiDK6N-d3LYO7FJTPpXcvvneb0x5VYZcl32NQo=w408-h544-k-no", "08:00 - 00:00"));
        lista.add(new Farmacia("Farmacia San Isidro","Av. Pte. Juan Domingo Perón 1028",02665017344,"https://lh5.googleusercontent.com/p/AF1QipPAGn9c3eVIXvjXVM5BGIKaSFL424WZ11wMQMCU=w426-h240-k-no", "08:00 - 00:00"));
        lista.add(new Farmacia("Farmacia La Piramide","Cdad. del Rosario 360",02665017344,"https://lh5.googleusercontent.com/p/AF1QipO1QcDFlTs6MLvV8S5EdPnqQu0cwuVMUc7TIDFQ=w408-h725-k-no", "08:00 - 00:00"));
        lista.add(new Farmacia("Farmacity","Junín 952",02665017344,"https://lh5.googleusercontent.com/p/AF1QipNzEh2tDp75aXflST0VmVZpUXzHT0WOtBdqtIsw=w408-h707-k-no", "24hs"));


        listaMutable.setValue(lista);


    }
}