package pe.cibertec.polinet.Adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Entidades.EntMasVen
import pe.cibertec.polinet.R

class AdpMasVen(private val listaMasVen: List<EntMasVen>) :
    RecyclerView.Adapter<AdpMasVen.MasVenViewHolder>() {

    class MasVenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen: ImageView = itemView.findViewById(R.id.productoimagen)
        val nombre: TextView = itemView.findViewById(R.id.productonombre)
        val codigo: TextView = itemView.findViewById(R.id.productocodigo)
        val stock: TextView = itemView.findViewById(R.id.productostock)
        val comprarBtn: Button = itemView.findViewById(R.id.bcomprar)
        val agregarBtn: Button = itemView.findViewById(R.id.bagregar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MasVenViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lo_mas_vendido, parent, false)
        return MasVenViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaMasVen.size
    }

    override fun onBindViewHolder(holder: MasVenViewHolder, position: Int) {
        val producto = listaMasVen[position]
        holder.imagen.setImageResource(producto.imaglmv)
        holder.nombre.text = producto.nombrelmv
        holder.codigo.text = producto.codlmv
        holder.stock.text = "Stock: ${producto.stocklmv}"

        // Opcional: Configurar acciones para los botones
        holder.comprarBtn.setOnClickListener {
            // Acción para comprar ahora
        }
        holder.agregarBtn.setOnClickListener {
            // Acción para agregar al carrito
        }
    }
}

