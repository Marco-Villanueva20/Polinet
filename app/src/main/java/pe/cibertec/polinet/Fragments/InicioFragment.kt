package pe.cibertec.polinet.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Adaptadores.AdpInfoDes
import pe.cibertec.polinet.Entidades.EntInfoDes
import pe.cibertec.polinet.R

class InicioFragment : Fragment() {

    private lateinit var recyclerInfoDes: RecyclerView
    private lateinit var adapterInfoDes: AdpInfoDes

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar la vista del fragmento
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        // Inicializar el RecyclerView
        recyclerInfoDes = view.findViewById(R.id.rcvInfoDest)

        // Cargar los datos y configurar el adaptador
        cargarinfodestacada()

        return view
    }

    private fun cargarinfodestacada() {
        // Lista de datos para el RecyclerView
        val listinfodes = mutableListOf(
            EntInfoDes(R.drawable.i1, "Promociones", "Tenemos las mejores promociones y precios, todos los dias del año."),
            EntInfoDes(R.drawable.i2, "Garantía", "Si los productos tienen problemas, no dudes en contactarnos."),
            EntInfoDes(R.drawable.i3, "A menos de $49.9", "Los mejores precios en productos seleccionados de las mejores marcas."),
            EntInfoDes(R.drawable.i4, "Lo nuevo", "En nuestros categorias encontraras la mejor seleccion de productos.")
        )

        // Configurar el adaptador
        adapterInfoDes = AdpInfoDes(listinfodes)

        // Establecer el adaptador y el LayoutManager
        recyclerInfoDes.adapter = adapterInfoDes
        recyclerInfoDes.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}
