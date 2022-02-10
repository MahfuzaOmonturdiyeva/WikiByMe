package uz.gita.wikibyme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.gita.wikibyme.databinding.ActivityMainBinding

const val KEYITEM="key"

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rm.setOnClickListener{
            onClick(0)
        }
        binding.j.setOnClickListener{
            onClick(1)
        }
        binding.sg.setOnClickListener{
            onClick(2)
        }
        binding.jH.setOnClickListener{
            onClick(3)
        }
        binding.jm.setOnClickListener{
            onClick(4)
        }
        binding.v.setOnClickListener{
            onClick(5)
        }
        binding.jk.setOnClickListener{
            onClick(6)
        }
    }
    private fun onClick(i:Int){
        val intent=Intent(this,AboutActivity::class.java)
        intent.putExtra(KEYITEM, i)
        startActivity(intent)
        finish()
    }
}