package galacticgadgets.galactic.android.productivitypalace.Goals

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import galacticgadgets.galactic.android.productivitypalace.R

class Goals : Fragment() {

    companion object {
        fun newInstance() =
            Goals()
    }

    private lateinit var viewModel: GoalsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.goals_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GoalsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}