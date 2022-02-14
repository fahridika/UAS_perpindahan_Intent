package fahri.dika.uas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_makan.setOnClickListener{
            startActivity(Intent(this,MakanActivity::class.java)) }
        rumah.setOnClickListener{
            startActivity(Intent(this,RumahActivity::class.java)) }
        anak.setOnClickListener{
            startActivity(Intent(this,ItemActivity::class.java)) }
        kesehatan.setOnClickListener{
            startActivity(Intent(this,KesehatanActivity::class.java)) }



        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title="Hyper Market"
            subtitle="Didirikan Muhammad Fahri Dika Yuda"

            setDisplayHomeAsUpEnabled(true)

        }



    }
}