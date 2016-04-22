package br.univel.exemplolayoutandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	private Spinner spnSexo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.spnSexo = (Spinner) findViewById(R.id.spnSexo);
	}

	@Override
	protected void onStart() {
		super.onStart();
		spnSexo.setAdapter(
				ArrayAdapter.createFromResource(this, R.array.array_sexo, android.R.layout.simple_spinner_item));
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void acaoCadastrar(final View view) {
		System.out.println("Pessoa cadastrada com sucesso");
	}

	public void acaoCancelar(final View view) {
		System.out.println("Cadastro cancelado");
	}
}
