package pe.cibertec.polinet.Adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.polinet.Entidades.EntNuPro
import pe.cibertec.polinet.R

class AdpNuPro(private val listaProductos: List<EntNuPro>) :
    RecyclerView.Adapter<AdpNuPro.NuProViewHolder>() {

    class NuProViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgProductoNuevo: ImageView = itemView.findViewById(R.id.imgProductoNuevo)
        val txtNombreProductoNuevo: TextView = itemView.findViewById(R.id.tvNombreProductoNuevo)
        val txtCodigoProductoNuevo: TextView = itemView.findViewById(R.id.tvCodigoProductoNuevo)
        val txtStockProductoNuevo: TextView = itemView.findViewById(R.id.tvStockProductoNuevo)
        val btnComprarNuevo: Button = itemView.findViewById(R.id.btnComprarNuevo)
        val btnAgregarCarritoNuevo: Button = itemView.findViewById(R.id.btnAgregarCarritoNuevo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NuProViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_nuevos_productos, parent, false)
        return NuProViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NuProViewHolder, position: Int) {
        val producto = listaProductos[position]
        holder.imgProductoNuevo.setImageResource(producto.imgnp)
        holder.txtNombreProductoNuevo.text = producto.nomnp
        holder.txtCodigoProductoNuevo.text = producto.codnp
        holder.txtStockProductoNuevo.text = "Stock: ${producto.stocknp}"

        // Acción del botón Comprar
        holder.btnComprarNuevo.setOnClickListener {
            // Aquí puedes agregar la acción de compra
        }

        // Acción del botón Agregar al Carrito
        holder.btnAgregarCarritoNuevo.setOnClickListener {
            // Aquí puedes agregar la acción de agregar al carrito
        }
    }

    override fun getItemCount(): Int {
        return listaProductos.size
    }
}


