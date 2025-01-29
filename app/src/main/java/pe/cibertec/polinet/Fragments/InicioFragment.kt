package pe.cibertec.polinet.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Adaptadores.AdpInfoDes
import pe.cibertec.polinet.Adaptadores.AdpMasVen
import pe.cibertec.polinet.Entidades.EntInfoDes
import pe.cibertec.polinet.Entidades.EntMasVen
import pe.cibertec.polinet.R

class InicioFragment : Fragment() {

    private lateinit var recyclerInfoDes: RecyclerView
    private lateinit var adapterInfoDes: AdpInfoDes

    private lateinit var recyclerLoMasVendido: RecyclerView
    private lateinit var adaptadorLoMasVendido: AdpMasVen

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        recyclerInfoDes = view.findViewById(R.id.rcvInfoDest)
        recyclerLoMasVendido = view.findViewById(R.id.rcvLoMasVendido)

        cargarinfodestacada()
        cargarLoMasVendido()

        return view
    }

    private fun cargarinfodestacada() {
        val listinfodes = mutableListOf(
            EntInfoDes(R.drawable.i1, "Promociones", "Tenemos las mejores promociones y precios, todos los dias del año."),
            EntInfoDes(R.drawable.i2, "Garantía", "Si los productos tienen problemas, no dudes en contactarnos."),
            EntInfoDes(R.drawable.i3, "A menos de $49.9", "Los mejores precios en productos seleccionados de las mejores marcas."),
            EntInfoDes(R.drawable.i4, "Lo nuevo", "En nuestros categorias encontraras la mejor seleccion de productos.")
        )

        adapterInfoDes = AdpInfoDes(listinfodes)

        recyclerInfoDes.adapter = adapterInfoDes
        recyclerInfoDes.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun cargarLoMasVendido() {
        val listaProductos = listOf(
            EntMasVen(R.drawable.blmv1, "CASE GAMBYTE GOWA ARGB (GTT1205A) S/ FUENTE DE PODER", "Código 011361", 10),
            EntMasVen(R.drawable.blmv2, "MEM.RAM THERMALTAKE H-ONE DDR4 16GB ( 2 * 8 ) / 2666MHZ", "Código 011449", 5),
            EntMasVen(R.drawable.blmv3, "PC MINI INTEL NUC NUC10FNH ( BXNUC1013FNH1 )", "Código 011540", 5),
            EntMasVen(R.drawable.blmv4, "COOLER PARA LAPTOP COOLER MASTES ERGOSTAND", "Código 010048", 5),
            EntMasVen(R.drawable.blmv5, "AURICULAR HYPERX CLOUD ALPHA S ( HX-HSCAS-BK )", "Código 011612", 5),
            EntMasVen(R.drawable.blmv6, "SSD SOLIDO WERSTERN DIGITAL 480GB ( WDS480G2G0 )", "Código 008439", 5)
        )

        adaptadorLoMasVendido = AdpMasVen(listaProductos)

        recyclerLoMasVendido.adapter = adaptadorLoMasVendido
        recyclerLoMasVendido.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

}

