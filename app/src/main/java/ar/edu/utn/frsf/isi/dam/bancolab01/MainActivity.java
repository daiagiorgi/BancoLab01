package ar.edu.utn.frsf.isi.dam.bancolab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

import ar.edu.utn.frsf.dam.bancolab01.modelo.Cliente;
import ar.edu.utn.frsf.dam.bancolab01.modelo.PlazoFijo;

public class MainActivity extends AppCompatActivity {

    private PlazoFijo pf;
    private Cliente cliente;

    // widgets de la vista
    private EditText edEmail;
    private EditText edtCUIL;
    private RadioGroup rGroup;
    private EditText montoInversion;
    //private seekBar
    private ToggleButton btnSeleccion;
    private CheckBox terminos;
    private Button btnCalcularPlazoFijo;
    private TextView resultado;


    private Button btnHacerPlazoFijo;
    private EditText edtMonto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pf = new PlazoFijo(getResources().getStringArray(R.array.tasas));
        cliente = new Cliente();

        edEmail = (EditText) findViewById(R.id.edtEmail);
        edtCUIL = (EditText) findViewById(R.id.cuit_cuil);
        rGroup = (RadioGroup)findViewById(R.id.grupoRadioButton);
        edtMonto= (EditText) findViewById(R.id.montoAInvertir);
        RadioButton checkedRadioButton = (RadioButton)rGroup.findViewById(rGroup.getCheckedRadioButtonId());
        montoInversion = (EditText) findViewById(R.id.montoAInvertir);
        btnSeleccion = (ToggleButton) findViewById(R.id.botonAccion);
        terminos =(CheckBox)findViewById(R.id.checkBoxtermino);
        btnHacerPlazoFijo = (Button) findViewById(R.id.botonPlazoFijo);
        resultado = (TextView) findViewById(R.id.mensajeResultado);
        btnHacerPlazoFijo.setEnabled(false);




    }
}
