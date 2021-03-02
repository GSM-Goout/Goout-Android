package org.software.meister.gsm.goout.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.software.meister.gsm.goout.R
import org.software.meister.gsm.goout.view.activity.AddActivity
import org.software.meister.gsm.goout.view.activity.MainActivity
import org.software.meister.gsm.goout.viewmodel.fragment.DashboardViewModel

class AddFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add, container, false)

        activity?.startActivity(Intent(context, AddActivity::class.java))

        activity?.finish()

        return root
    }
}