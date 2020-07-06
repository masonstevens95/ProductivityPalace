package galacticgadgets.galactic.android.productivitypalace.Calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import galacticgadgets.galactic.android.productivitypalace.R

class CalendarActual : Fragment() {

    companion object {
        fun newInstance() =
            CalendarActual()
    }
    private lateinit var viewModel: CalendarActualViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.calendar_actual_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val textView: TextView = view.findViewById(android.R.id.text2)
            textView.text = getInt(ARG_OBJECT).toString()
        }
    }
}