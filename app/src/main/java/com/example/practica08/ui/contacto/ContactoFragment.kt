package com.example.practica08.ui.contacto

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practica08.FerreteriaContacto
import com.example.practica08.R
import com.example.practica08.databinding.FragmentContactoBinding
import com.example.practica08.databinding.FragmentHomeBinding

class ContactoFragment : Fragment() {
    private lateinit var nombre : EditText
    private lateinit var correo : EditText
    private lateinit var telefono : EditText
    private lateinit var comentario : EditText
    private lateinit var spnProds : Spinner
    private lateinit var registrar : Button
    private var prodsSel : String = "Brocas para metal"

    private var ferreteria : FerreteriaContacto = FerreteriaContacto()

    private var _binding: FragmentContactoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentContactoBinding.inflate(inflater,container,false)
        val root: View = binding.root

        nombre = root.findViewById(R.id.etNombre)
        correo = root.findViewById(R.id.etCorreo)
        telefono = root.findViewById(R.id.etTelefono)
        comentario = root.findViewById(R.id.etComentario)
        spnProds = root.findViewById(R.id.spnProds)
        registrar = root.findViewById(R.id.btnRegistrar)

        val productos = resources.getStringArray(R.array.lstProductos)
        val prods = ArrayAdapter(requireContext(),R.layout.spinner_color_selected,productos)
        prods.setDropDownViewResource(R.layout.spinner_color_dropdown)
        spnProds.adapter = prods
        spnProds.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                prodsSel = productos[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        registrar.setOnClickListener {
            addData()
        }
        return root

    }
    private fun addData(){
        if(nombre.text.isNotBlank() && nombre.text.isNotEmpty()
            && correo.text.isNotBlank() && correo.text.isNotEmpty()
            && telefono.text.isNotEmpty() && telefono.text.isNotBlank()
            && comentario.text.isNotEmpty() && comentario.text.isNotBlank())
        {
            ferreteria.nombre = nombre.text.toString()
            ferreteria.correo = correo.text.toString()
            ferreteria.telefono = telefono.text.toString()
            ferreteria.producto = prodsSel
            ferreteria.comentario = comentario.text.toString()
            Toast.makeText(requireContext(),"Registrado: ${ferreteria.nombre} | ${ferreteria.correo} | ${ferreteria.telefono} | ${ferreteria.producto}: ${ferreteria.comentario}"
                ,Toast.LENGTH_LONG).show()
            cleanBoxes()

        }else {
            // Mostrar mensaje de error si hay campos vacíos o inválidos
            Toast.makeText(requireContext(), "Por favor, completa todos los campos correctamente", Toast.LENGTH_SHORT).show()
        }
    }
    private fun cleanBoxes(){
        nombre.text = null
        correo.text = null
        telefono.text = null
        comentario.text = null
        spnProds.setSelection(0)
        nombre.requestFocus()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}