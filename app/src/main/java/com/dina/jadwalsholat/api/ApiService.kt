package com.dina.jadwalsholat.api

import com.dina.jadwalsholat.model.ResponseJadwalSholat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("{kota}/tanggal/{tanggal}")
    fun getJadwalSholat(@Path("kota") kota : String,
                        @Path("tanggal") tanggal : String) : Call<ResponseJadwalSholat>

}