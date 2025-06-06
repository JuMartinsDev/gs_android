package com.julia.gs_android

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    private lateinit var adapter: EventoAdapter
    private val listaEventos = mutableListOf<Evento>()
    private val listaFiltrada = mutableListOf<Evento>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editLocal = findViewById<EditText>(R.id.editLocal)
        val editTipo = findViewById<EditText>(R.id.editTipo)
        val editImpacto = findViewById<EditText>(R.id.editImpacto)
        val editData = findViewById<EditText>(R.id.editData)
        val editAfetadas = findViewById<EditText>(R.id.editAfetadas)
        val btnIncluir = findViewById<Button>(R.id.btnIncluir)
        val recycler = findViewById<RecyclerView>(R.id.recyclerEventos)
        val btnSobre = findViewById<Button>(R.id.btnSobre)
        val etFiltroTipo = findViewById<EditText>(R.id.et_filtro_tipo)
        val btnLimparFiltro = findViewById<Button>(R.id.btn_limpar_filtro)

        adapter = EventoAdapter(listaFiltrada) { posicao ->
            listaEventos.removeAt(posicao)
            atualizarListaFiltrada(etFiltroTipo.text.toString())
        }

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)

        btnIncluir.setOnClickListener {
            val local = editLocal.text.toString()
            val tipo = editTipo.text.toString()
            val impacto = editImpacto.text.toString()
            val data = editData.text.toString()
            val afetadasStr = editAfetadas.text.toString()

            //validação de campos vazios
            if (local.isBlank() || tipo.isBlank() || impacto.isBlank() || data.isBlank() || afetadasStr.isBlank()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            //validação de campos vazios do número de pessoas afetadas
            val afetadas = afetadasStr.toIntOrNull()
            if (afetadas == null || afetadas <= 0) {
                Toast.makeText(this, "Número de afetadas deve ser maior que 0", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val evento = Evento(local, tipo, impacto, data, afetadas)
            listaEventos.add(evento)
            atualizarListaFiltrada(etFiltroTipo.text.toString())

            editLocal.text.clear()
            editTipo.text.clear()
            editImpacto.text.clear()
            editData.text.clear()
            editAfetadas.text.clear()
        }

        etFiltroTipo.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val filtro = s.toString()
                atualizarListaFiltrada(filtro)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        btnLimparFiltro.setOnClickListener {
            etFiltroTipo.text.clear()
            atualizarListaFiltrada("")
        }

        btnSobre.setOnClickListener {
            startActivity(Intent(this, SobreActivity::class.java))
        }
    }

    private fun atualizarListaFiltrada(filtro: String) {
        listaFiltrada.clear()
        if (filtro.isBlank()) {
            listaFiltrada.addAll(listaEventos)
        } else {
            listaFiltrada.addAll(listaEventos.filter {
                it.tipo.contains(filtro, ignoreCase = true)
            })
        }
        adapter.notifyDataSetChanged()
    }
}
