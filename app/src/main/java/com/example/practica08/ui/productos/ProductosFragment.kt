package com.example.practica08.ui.productos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica08.databinding.FragmentHomeBinding
import com.example.practica08.databinding.FragmentProductosBinding

class ProductosFragment : Fragment() {
    private var _binding: FragmentProductosBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgProducto01.setOnClickListener{
            Toast.makeText(activity, "Brocas para metal", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto02.setOnClickListener{
            Toast.makeText(activity, "Destornillador eléctrico", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto03.setOnClickListener{
            Toast.makeText(activity, "Escalera", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto04.setOnClickListener{
            Toast.makeText(activity, "Cinta adhesiva", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto05.setOnClickListener{
            Toast.makeText(activity, "Cepillo eléctrico", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto06.setOnClickListener{
            Toast.makeText(activity, "Prensa", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto07.setOnClickListener{
            Toast.makeText(activity, "Machuelos", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto08.setOnClickListener{
            Toast.makeText(activity, "Formón", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto09.setOnClickListener{
            Toast.makeText(activity, "Manguera para jardín", Toast.LENGTH_SHORT).show()
        }
        binding.imgProducto10.setOnClickListener{
            Toast.makeText(activity, "Remaches", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}