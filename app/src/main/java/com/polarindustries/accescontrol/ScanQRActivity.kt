package com.polarindustries.accescontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult
import com.polarindustries.accescontrol.adaptadores.AdaptadorUsuarioNuevo
import com.polarindustries.accescontrol.modelos.UsuarioActivo
import kotlinx.android.synthetic.main.activity_scan_qractivity.*


class ScanQRActivity : AppCompatActivity() {

    private var flag = false
    private var result: IntentResult? = null
    private var listaActivos: ArrayList<UsuarioActivo> = arrayListOf(
        UsuarioActivo("Usuario", "4:00", true),
        UsuarioActivo("Usuario", "4:00", true),
        UsuarioActivo("Usuario", "4:00", false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_qractivity)

        supportActionBar!!.hide()

        floatingAddGenerico.setOnClickListener{
            val intent = Intent(this@ScanQRActivity, RegistroGenericoActivity::class.java)
            startActivity(intent)
        }

        floatingScannerQR.setOnClickListener {
            escanearQR()
        }

        recyclerViewActivos.layoutManager = LinearLayoutManager(this)
        recyclerViewActivos.adapter = AdaptadorUsuarioNuevo(this, listaActivos, this )
    }

    private fun escanearQR(){
        flag = false
        val intentIntegrator = IntentIntegrator(this)
        intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES)
        intentIntegrator.setPrompt("Escanea código QR")
        intentIntegrator.setOrientationLocked(false) //orientacion

        intentIntegrator.setCameraId(0) //camara

        intentIntegrator.setBeepEnabled(false)
        intentIntegrator.captureActivity = CaptureActivityPortrait::class.java
        intentIntegrator.setBarcodeImageEnabled(false)
        intentIntegrator.initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result!!.contents != null) {
                val values = result!!.contents
                Toast.makeText(this, "Información: $values", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Mamo mi bro.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}