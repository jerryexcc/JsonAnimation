package idv.jerryexcc.jsonanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animaView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animaView = findViewById(R.id.jsonAni);
        animaView.setAnimation("message.json");//設定播放的動畫檔
        animaView.playAnimation();//播放動畫
        animaView.setRepeatCount(LottieDrawable.INFINITE);//播放次數 import LottieDrawable 可設定無限播放
//        animaView.pauseAnimation(); //暫停動畫
//        animaView.cancelAnimation(); //取消動畫
//        animaView.getDuration(); //取得動畫時間長
    }
}

//Json動畫可參考此網站 https://lottiefiles.com
