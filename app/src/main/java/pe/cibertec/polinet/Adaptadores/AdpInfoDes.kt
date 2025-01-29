package pe.cibertec.polinet.Adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Entidades.EntInfoDes
import pe.cibertec.polinet.R

class AdpInfoDes (private val listaInfoDes: List<EntInfoDes>):
    RecyclerView.Adapter<AdpInfoDes.InfoDesViewHolder>(){

    class InfoDesViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val imginfodes: ImageView = itemView.findViewById(R.id.imginfodestacada)
        val titinfodes: TextView = itemView.findViewById(R.id.tinfodestacadatitulo)
        val desinfodes: TextView = itemView.findViewById(R.id.tinfodestacadadescripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoDesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_info_destacada, parent, false)
        return InfoDesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaInfoDes.size
    }

    override fun onBindViewHolder(holder: InfoDesViewHolder, position: Int) {
        val infodesactuales = listaInfoDes[position]
        holder.imginfodes.setImageResource(infodesactuales.imginfodes)
        holder.titinfodes.text = infodesactuales.titinfodes
        holder.desinfodes.text = infodesactuales.desinfodes
    }

}