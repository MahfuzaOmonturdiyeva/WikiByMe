package uz.gita.wikibyme.aboutActivityChildren

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.fragment.app.Fragment
import uz.gita.wikibyme.R
import uz.gita.wikibyme.app.LocalStorage
import java.io.*
import java.util.*

class AboutFragmentPage : Fragment() {
    private lateinit var enter: ImageButton
    private lateinit var edittext: EditText
    private lateinit var sharedPreferences: LocalStorage

    init {

    }
    companion object {

        private const val ARG_NUMBER_PAGE_KEY = "number_page_key"

        fun newInstance(numberPage: Int): AboutFragmentPage =
            AboutFragmentPage()
                .apply {
                    arguments = Bundle()
                        .apply {
                            putInt(ARG_NUMBER_PAGE_KEY, numberPage)
                        }
                }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_for_viewpager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedPreferences = LocalStorage(requireContext())
        arguments?.apply {

            val pageNumber = getInt(ARG_NUMBER_PAGE_KEY)

            enter = view.findViewById<ImageButton>(R.id.img_btn_enter)
            enter.visibility = View.INVISIBLE
            edittext = view.findViewById<EditText>(R.id.edittext_user)
            when (pageNumber) {
                1 -> {

                    edittext.setText(sharedPreferences.getRM)
                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)

                        }

                        sharedPreferences.getRM=sharedPreferences.getRM+text
                        enter.visibility = View.INVISIBLE
                    }
                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.rm2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.rm))
                }
                2 -> {
                    edittext.setText(sharedPreferences.getJ)

                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)

                        }

                        sharedPreferences.getJ=sharedPreferences.getJ+text
                        enter.visibility = View.INVISIBLE
                    }
                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.j2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.j))
                }
                3 -> {
                    edittext.setText(sharedPreferences.getSG)

                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)

                        }

                        sharedPreferences.getSG=sharedPreferences.getSG+text
                        enter.visibility = View.INVISIBLE
                    }

                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.sg2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.sg))
                }
                4 -> {
                    edittext.setText(sharedPreferences.getJHOPE)
                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)

                        }

                        sharedPreferences.getJHOPE=sharedPreferences.getJHOPE+text
                        enter.visibility = View.INVISIBLE
                    }

                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.j_h2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.j_h))
                }
                5 -> {
                    edittext.setText(sharedPreferences.getJM)

                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)

                        }

                        sharedPreferences.getJM=sharedPreferences.getJM+text
                        enter.visibility = View.INVISIBLE
                    }
                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.jm2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.jm))
                }
                6 -> {
                    edittext.setText(sharedPreferences.getV)
                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)
                        }
                        sharedPreferences.getV=sharedPreferences.getV+text
                        enter.visibility = View.INVISIBLE
                    }
                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.v2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.v))
                }
                7 -> {
                    edittext.setText(sharedPreferences.getJK)

                    var text:String=""
                    edittext.addTextChangedListener(object : TextWatcher {
                        override fun beforeTextChanged(
                            p0: CharSequence?,
                            p1: Int,
                            p2: Int,
                            p3: Int
                        ) {
                            enter.visibility = View.INVISIBLE
                        }

                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            enter.visibility = View.VISIBLE
                        }

                        override fun afterTextChanged(p0: Editable?) {
                            text = p0.toString()
                            if (text == "") {
                                enter.visibility = View.INVISIBLE
                            }
                        }
                    })
                    enter.setOnClickListener {
                        val view1 = requireActivity().currentFocus
                        if (view1 != null) {
                            val imm =
                                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.hideSoftInputFromWindow(view1.windowToken, 0)

                        }
                        sharedPreferences.getJK=sharedPreferences.getJK+text
                        enter.visibility = View.INVISIBLE
                    }
                    view.findViewById<ImageView>(R.id.image_wiki).setImageResource(R.drawable.jk2)
                    view.findViewById<TextView>(R.id.tv_wiki).text =
                        getString("number page", getString(R.string.jk))
                }
            }
        }
    }

}