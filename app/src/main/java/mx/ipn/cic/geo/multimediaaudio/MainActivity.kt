package mx.ipn.cic.geo.multimediaaudio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import mx.ipn.cic.geo.multimediaaudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    private lateinit var mediaPlayer : MediaPlayer
    private lateinit var btnPlay: Button
    private lateinit var btnPause: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)



        supportActionBar?.hide()

        // Crear el objeto media player.
        mediaPlayer = MediaPlayer.create(this, R.raw.labrador_barking)

        // Métodos para reproducir y detener el audio.
        btnPlay = findViewById(R.id.btnPlay)
        btnPause = findViewById(R.id.btnPause)

        with(binding) {
            btnPlay.setOnClickListener {
                Log.d("MultimediaAudio", "Iniciando Reproducción...")
                mediaPlayer.start()

            }

            btnPause.setOnClickListener {
                if (mediaPlayer.isPlaying) {
                    Log.d("MultimediaAudio", "Pausando Reproducción...")
                    mediaPlayer.pause()
                }
            }

        }

        /*
        btnPlay.setOnClickListener {
            Log.d("MultimediaAudio", "Iniciando Reproducción...")
            mediaPlayer.start()
        }
        */

        //btnPause = findViewById(R.id.btnPause)


        /*
        btnPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                Log.d("MultimediaAudio", "Pausando Reproducción...")
                mediaPlayer.pause()
            }
        }
        */

        /*
        findViewById<Button>(R.id.btnPlay).setOnClickListener {
            Log.d("MultimediaAudio", "Iniciando Reproducción...")
            mediaPlayer.start()
        }
        findViewById<Button>(R.id.btnPause).setOnClickListener {
            if (mediaPlayer.isPlaying) {
                Log.d("MultimediaAudio", "Pausando Reproducción...")
                mediaPlayer.pause()
            }
        }
        */

        // Práctica. Modificar el programa para:
        // 1. Agregar colores (temas, en ambos modos).
        // 2. Habilitar por view binding.
        // Documento escrito. Investigar la forma de habilitar asignación de listeners en Kotlin en archivo XML.
    }

    fun mostrarMensaje(view: View) {
        Toast.makeText(this, "Opción Seleccionada...", Toast.LENGTH_LONG).show()
    }
}