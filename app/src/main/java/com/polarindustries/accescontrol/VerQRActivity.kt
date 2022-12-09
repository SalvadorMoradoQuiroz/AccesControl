package com.polarindustries.accescontrol

import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ver_qractivity.*
import net.glxn.qrgen.android.QRCode

class VerQRActivity : AppCompatActivity() {
    private var idUsuario = "-NGsTx2ys1Zlg4pNB77B"
    private var nombre = "Antonio Pulido"
    private var correo = "pulidovirrueta@gmail.com"
    private var bitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_qractivity)
        title = "Mi código QR"

        var textoQR = "${idUsuario}_${nombre}_${correo}"

        bitmap = QRCode.from(textoQR!!).withSize(500, 500).bitmap()
        imageViewQRUsuario.setImageBitmap(bitmap)


    }
}