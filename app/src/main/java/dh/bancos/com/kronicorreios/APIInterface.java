package dh.bancos.com.kronicorreios;


import java.util.Map;

import dh.bancos.com.kronicorreios.model.RastreamentoBody;
import dh.bancos.com.kronicorreios.model.RastreamentoResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

interface APIInterface {

    @POST("/rastreamento")
    Call<RastreamentoResponse> createBodyRastreamento(@HeaderMap Map<String, String> headers, @Body RastreamentoBody cod);

}
