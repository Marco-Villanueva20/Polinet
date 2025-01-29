package pe.cibertec.polinet.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.cibertec.polinet.R

//private lateinit var recyclerInfoDes: RecyclerView
//private lateinit var adapterInfoDes: AdpInfoDes


class InicioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //    cargarinfodestacada()
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    //private fun cargarinfodestacada() {
    //        val listinfodes = mutableListOf(
    //            EntInfoDes(R.drawable.i1, "Promociones", "Mejores Promociones Dia a Dia"),
    //            EntInfoDes(R.drawable.i2, "Garantia", "Si los productos tienen problemas"),
    //            EntInfoDes(R.drawable.i3, "A menos de 49.9", "Los mejores precios en productos"),
    //            EntInfoDes(R.drawable.i4, "Lo nuevo", "En nuestros productos")
    //        )
    //        recyclerInfoDes = findViewById(R.id.rvinfodest)
    //        adapterInfoDes = AdpInfoDes(listinfodes)
    //        recyclerInfoDes.adapter = adapterInfoDes
    //        recyclerInfoDes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    //}
}