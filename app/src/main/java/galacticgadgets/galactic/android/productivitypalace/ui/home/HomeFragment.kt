package galacticgadgets.galactic.android.productivitypalace.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import galacticgadgets.galactic.android.productivitypalace.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)

        val homeCalendarButton = root?.findViewById<Button>(R.id.calendarButton)
        homeCalendarButton?.setOnClickListener { v -> v?.findNavController()?.navigate(R.id.action_nav_home_to_calendar) }

        val homeTaskButton = root?.findViewById<Button>(R.id.tasksButton)
        homeTaskButton?.setOnClickListener { v -> v?.findNavController()?.navigate(R.id.action_nav_home_to_taskList) }

        val homeGoalsButton = root?.findViewById<Button>(R.id.goalsButton)
        homeGoalsButton?.setOnClickListener { v -> v?.findNavController()?.navigate(R.id.action_nav_home_to_goals) }

        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }
}