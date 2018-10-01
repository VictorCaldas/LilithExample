package dh.bancos.com.kronicorreios;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dh.bancos.com.kronicorreios.model.RastreamentoBody;
import dh.bancos.com.kronicorreios.model.RastreamentoResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;
    private static final String CONTENT_TYPE = "application/json";
    RastreamentoBody cod;

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.editText)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        apiInterface = APIClient.getClientRetrofit().create(APIInterface.class);
    }

    @OnClick(R.id.button)
    public void submit() {

        final ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("buscando Informações");
        progress.setMessage("Espero um pouco!");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.show();

        if (editText.getText().toString().equals("")) {
             cod = new RastreamentoBody("DY575086091BR");
        } else {
             cod = new RastreamentoBody(editText.getText().toString());
        }

        Map<String, String> map = new HashMap<>();
        map.put("Content-Type", CONTENT_TYPE);

        Call<RastreamentoResponse> call3 = apiInterface.createBodyRastreamento(map,cod);
        call3.enqueue(new Callback<RastreamentoResponse>() {
            @Override
            public void onResponse(Call<RastreamentoResponse> call, Response<RastreamentoResponse> response) {
                String status =  response.body().getStatus().getStatus();
                Log.v("MainActivity", status);
                progress.dismiss();
            }

            @Override
            public void onFailure(Call<RastreamentoResponse> call, Throwable t) {
                Log.v("MainActivity", "Erro");
                progress.dismiss();
            }
        });
    }
}
