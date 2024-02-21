import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.baitap.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = "hfdawhwhcoomdd"
        val result = countVietnameseWords(input)
        Log.d("VietnameseWords", "Số lượng chữ cái Tiếng Việt có thể tạo thành trong chuỗi: $result")
    }
}

