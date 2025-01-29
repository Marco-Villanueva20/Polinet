package pe.cibertec.polinet.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Adaptadores.AdpInfoDes
import pe.cibertec.polinet.Adaptadores.AdpMasVen
import pe.cibertec.polinet.Adaptadores.AdpNuPro
import pe.cibertec.polinet.Adaptadores.AdpPuIn
import pe.cibertec.polinet.Entidades.EntInfoDes
import pe.cibertec.polinet.Entidades.EntMasVen
import pe.cibertec.polinet.Entidades.EntNuPro
import pe.cibertec.polinet.Entidades.EntPuIn
import pe.cibertec.polinet.R

class InicioFragment : Fragment() {

    private lateinit var recyclerInfoDes: RecyclerView
    private lateinit var adapterInfoDes: AdpInfoDes

    private lateinit var recyclerLoMasVendido: RecyclerView
    private lateinit var adaptadorLoMasVendido: AdpMasVen

    private lateinit var recyclerPuIn: RecyclerView
    private lateinit var adapterPuIn: AdpPuIn

    private lateinit var recyclerNuevosProductos: RecyclerView
    private lateinit var adapterNuevosProductos: AdpNuPro

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        recyclerInfoDes = view.findViewById(R.id.rcvInfoDest)
        recyclerLoMasVendido = view.findViewById(R.id.rcvLoMasVendido)
        recyclerPuIn = view.findViewById(R.id.rcvPuIn)
        recyclerNuevosProductos = view.findViewById(R.id.rcvNuevosProductos)

        cargarinfodestacada()
        cargarLoMasVendido()
        cargarPublicidades()
        cargarNuevosProductos()

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

    private fun cargarPublicidades() {
        val listaPublicidades = mutableListOf(
            EntPuIn(R.drawable.ppi1),
            EntPuIn(R.drawable.ppi2),
            EntPuIn(R.drawable.ppi3)
        )

        adapterPuIn = AdpPuIn(listaPublicidades)
        recyclerPuIn.adapter = adapterPuIn

        recyclerPuIn.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun cargarNuevosProductos() {
        val listaNuevosProductos = listOf(
            EntNuPro(R.drawable.bnp1, "TARJ. VIDEO MSI GEFORGE GT 730 2GB DDR3 V3", "Código: 014462", 3),
            EntNuPro(R.drawable.bnp2, "MONITOR BRNG LED 27 ( PD2700QT ) ARTES GRAFICAS", "Código: 014455", 23),
            EntNuPro(R.drawable.bnp3, "MONITOR BENQ LED BACKLIGTH 32 ( PD3200U )", "Código: 014456", 12),
            EntNuPro(R.drawable.bnp4, "PROYECTOR BENQ MX631ST DLP ( MX631ST ) | VGA | 2 HDMI", "Código: 014454", 10),
            EntNuPro(R.drawable.bnp5, "MONITOR BENQ LED 27 ( GW2785TC ) | EYE - CARE |", "Código: 014457", 24),
            EntNuPro(R.drawable.bnp6, "IMPRESORA CANON PIXMA MP247", "Código: 014457", 25)
        )

        adapterNuevosProductos = AdpNuPro(listaNuevosProductos)

        recyclerNuevosProductos.adapter = adapterNuevosProductos
        recyclerNuevosProductos.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}


