package pe.cibertec.polinet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView
import pe.cibertec.polinet.Fragments.CarritoFragment
import pe.cibertec.polinet.Fragments.InicioFragment
import pe.cibertec.polinet.Fragments.MiCuentaFragment
import pe.cibertec.polinet.Fragments.OpcionalesFragment

class MenuInicio : AppCompatActivity() {

    lateinit var navigation : BottomNavigationView

    private val nOnNavMenuInferior = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId) {
            R.id.itemInicio -> {
                supportFragmentManager.commit {
                    replace<InicioFragment>(R.id.fragment_container)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemMiCuenta -> {
                supportFragmentManager.commit {
                    replace<MiCuentaFragment>(R.id.fragment_container)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemCarrito -> {
                supportFragmentManager.commit {
                    replace<CarritoFragment>(R.id.fragment_container)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemOpciones -> {
                supportFragmentManager.commit {
                    replace<OpcionalesFragment>(R.id.fragment_container)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        navigation = findViewById(R.id.navMenuInferior)
        navigation.setOnNavigationItemSelectedListener(nOnNavMenuInferior)

        supportFragmentManager.commit {
            replace<InicioFragment>(R.id.fragment_container)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }
    }



}