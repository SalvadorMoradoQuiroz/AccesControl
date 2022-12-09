package com.polarindustries.accescontrol.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import com.faskn.lib.Slice
import com.faskn.lib.PieChart
import com.polarindustries.accescontrol.R
import com.polarindustries.accescontrol.adaptadores.AdaptadorLeyendaPersonalizada
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HombreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HombreFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var textView8: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_hombre, container, false)

        textView8 = root.findViewById(R.id.textView7)
        val pieChart = PieChart(
            slices =  provideSlices(), clickListener = null, sliceStartPoint = 0f, sliceWidth = 80f
        ).build()


        val legendLayout: FrameLayout = root.findViewById(R.id.legendLayout)
        val chart = root.findViewById<com.faskn.lib.ClickablePieChart>(R.id.chart)
        chart.setPieChart(pieChart)
        chart.showLegend(legendLayout, AdaptadorLeyendaPersonalizada())

        //chart.setPieChart(pieChart)
        //chart.showLegend(legendLayout, AdaptadorLeyendaPersonalizada())

        return root
    }

    private fun provideSlices(): ArrayList<Slice>{
        var ran1 = Random.nextInt(1, 100).toFloat()
        var ran2 = Random.nextInt(1, 100).toFloat()
        var ran3 = Random.nextInt(1, 100).toFloat()
        var ran4 = Random.nextInt(1, 100).toFloat()

        textView8.text = "Promedio de visitantes por día: ${ran1+ran2+ran3+ran4}"

        return arrayListOf(
            Slice(
                ran1,
                R.color.principal_blue,
                "12-18 años"
            ),
            Slice(
                ran2,
                R.color.tenue,
                "19-30 años"
            ),
            Slice(
                ran3,
                R.color.tenue2,
                "31-45 años"
            ),
            Slice(
                ran4,
                R.color.tenue3,
                "46 en adelante"
            )
        )


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HombreFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HombreFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}