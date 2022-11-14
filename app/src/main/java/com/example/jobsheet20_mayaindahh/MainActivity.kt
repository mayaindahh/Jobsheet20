package com.example.jobsheet20_mayaindahh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "IMA AZKA ROSADAH",
        "KHAMILLA NUR LUTFI AZZAHRA",
        "LAILATUL RISA ISTIFADHOH",
        "LUK LUUL LATIFAH",
        "MAULANA ZAHRONY",
        "MAYA INDAH LESTARI",
        "MUHAMAD KHUSNU MAROM",
        "MUHAMMAD HUDA GUNAWAN",
        "MUTMAINAH SEPTIARINI",
        "NASYWA SUKRIA HANIFA",
        "NOR HIDAYAH FITRIANI",
    )

    val listNis = arrayOf(
        "2999",
        "3001",
        "3004",
        "3006",
        "3007",
        "3009",
        "3012",
        "3014",
        "3016",
        "3018",
        "3020",
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i],listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}