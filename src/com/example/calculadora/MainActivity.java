package com.example.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean multi = false;
	boolean divicion = false;
	Double[] numero = new Double[20];
	Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button numero0 = (Button)findViewById(R.id.btncero);
        numero0.setOnClickListener(this);
        
        Button numero1 = (Button)findViewById(R.id.btnuno);
        numero1.setOnClickListener(this);
        
        Button numero2 = (Button)findViewById(R.id.btndos);
        numero2.setOnClickListener(this);
        
        Button numero3 = (Button)findViewById(R.id.btntres);
        numero3.setOnClickListener(this);
        
        Button numero4 = (Button)findViewById(R.id.btncuatro);
        numero4.setOnClickListener(this);
        
        Button numero5 = (Button)findViewById(R.id.btncinco);
        numero5.setOnClickListener(this);
        
        Button numero6 = (Button)findViewById(R.id.btnseis);
        numero6.setOnClickListener(this);
        
        Button numero7 = (Button)findViewById(R.id.btnsiete);
        numero7.setOnClickListener(this);
        
        Button numero8 = (Button)findViewById(R.id.btnocho);
        numero8.setOnClickListener(this);
        
        Button numero9 = (Button)findViewById(R.id.btnnueve);
        numero9.setOnClickListener(this);
        
        Button punto = (Button)findViewById(R.id.btnpunto);
        punto.setOnClickListener(this);
        
        Button suma = (Button)findViewById(R.id.btnsuma);
        suma.setOnClickListener(this);
        
        Button resta = (Button)findViewById(R.id.btnresta);
        resta.setOnClickListener(this);
        
        Button multi = (Button)findViewById(R.id.btnmulti);
        multi.setOnClickListener(this);
        
        Button division = (Button)findViewById(R.id.btndivicion);
        division.setOnClickListener(this);
        
        Button igual = (Button)findViewById(R.id.btnigual);
        igual.setOnClickListener(this);
        
        Button borra = (Button)findViewById(R.id.btnborra);
        borra.setOnClickListener(this);
        
        Button limpiar = (Button)findViewById(R.id.btnlimpiar);
        limpiar.setOnClickListener(this);   
    }
    @Override
	public void onClick(View v) {
		EditText pantalla = (EditText)findViewById(R.id.txtcampo);
		int selec = v.getId();
		String a = pantalla.getText().toString();
		
		try{
		switch (selec)
		{
		
		case R.id.btncero:
			pantalla.setText(a+"0");
		    break;
		    
		case R.id.btnuno:
			pantalla.setText(a+"1");
			break;
			
		case R.id.btndos:
			pantalla.setText(a+"2");
			break;
			
		case R.id.btntres:
			pantalla.setText(a+"3");
			break;
			
		case R.id.btncuatro:
			pantalla.setText(a+"4");
			break;
			
		case R.id.btncinco:
			pantalla.setText(a+"5");
			break;
			
		case R.id.btnseis:
			pantalla.setText(a+"6");
			break;
			
		case R.id.btnsiete:
			pantalla.setText(a+"7");
			break;
			
		case R.id.btnocho:
			pantalla.setText(a+"8");
			break;
			
		case R.id.btnnueve:
			pantalla.setText(a+"9");
			break;
			
		case R.id.btnpunto:
			if(decimal == false){
			pantalla.setText(a+".");
			decimal = true;
			}else {return;}
			break;
			
		case R.id.btnsuma:
			suma = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
			
		case R.id.btnresta:
			resta = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
			
		case R.id.btnmulti:
			multi = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
			
		case R.id.btndivicion:
			divicion = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
			
		case R.id.btnigual:
			numero[1] = Double.parseDouble(a);
			
			if (suma == true){
				resultado = numero[0]+numero[1];
				pantalla.setText(String.valueOf(resultado));
			}else if(resta == true){
				resultado = numero[0]-numero[1];
				pantalla.setText(String.valueOf(resultado));
			}else if(multi == true){
				resultado = numero[0]*numero[1];
				pantalla.setText(String.valueOf(resultado));
			}else if(divicion == true){
				resultado = numero[0]/numero[1];
				pantalla.setText(String.valueOf(resultado));
			}
			
			decimal = false;
			suma = false;
			resta = false;
			multi = false;
			divicion = false;
			break;
			
		case R.id.btnborra:
			pantalla.setText("");
			decimal = false;
			break;
			
		case R.id.btnlimpiar:
			if (pantalla.getText().length()!=0){
				pantalla.setText(a.substring(0,a.length()-1));
			}
			break;
		    }
		}catch (Exception e){
			pantalla.setText("error");
		}
    }
}
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

	
