package pe.cibertec.polinet.Adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Entidades.EntPuIn
import pe.cibertec.polinet.R

class AdpPuIn(private val listaPublicidades: List<EntPuIn>) :
    RecyclerView.Adapter<AdpPuIn.PuInViewHolder>() {

    class PuInViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPubliInferior: ImageView = itemView.findViewById(R.id.imgPubliInferior)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PuInViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_publi_inferior, parent, false)
        return PuInViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaPublicidades.size
    }

    override fun onBindViewHolder(holder: PuInViewHolder, position: Int) {
        val publicidad = listaPublicidades[position]
        holder.imgPubliInferior.setImageResource(publicidad.imgpuin)
    }
}

