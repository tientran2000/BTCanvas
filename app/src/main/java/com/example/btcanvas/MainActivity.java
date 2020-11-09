package com.example.btcanvas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Bitmap bmp;
    Paint p;
    Canvas canvas;
    Button hcn,hv,ht,htg,mdo,vang,xanh,hong,tim,cam;
    int chon=1;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KhoiTao();
        veBieuDoCot(new String[]{"2015","2016","2017","2018"},new int[]{3,5,7,8});
//drawShape();
hong.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        p.setColor(getResources().getColor(R.color.hong));
        hcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas.drawColor(Color.WHITE);
                hinhcn();
            }
        });
        hv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas.drawColor(Color.WHITE);
                vuong();
            }
        });
        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas.drawColor(Color.WHITE);
                tron();
            }
        });
        htg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas.drawColor(Color.WHITE);
                hinhtg();
            }
        });
    }
});
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.setColor(getResources().getColor(R.color.Cam));
                hcn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhcn();
                    }
                });
                hv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        vuong();
                    }
                });
                ht.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        tron();
                    }
                });
                htg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhtg();
                    }
                });
            }
        });
        mdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // p.setColor(getResources().getColor(R.color.hong));
                p.setColor(Color.RED);
                hcn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhcn();
                    }
                });
                hv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        vuong();
                    }
                });
                ht.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        tron();
                    }
                });
                htg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhtg();
                    }
                });
            }
        });
        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.setColor(getResources().getColor(R.color.tim));
                hcn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhcn();
                    }
                });
                hv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        vuong();
                    }
                });
                ht.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        tron();
                    }
                });
                htg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhtg();
                    }
                });
            }
        });
        xanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                p.setColor(getResources().getColor(R.color.hong));
                p.setColor(Color.GREEN);
                hcn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhcn();
                    }
                });
                hv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        vuong();
                    }
                });
                ht.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        tron();
                    }
                });
                htg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhtg();
                    }
                });
            }
        });
        vang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                p.setColor(getResources().getColor(R.color.hong));
                p.setColor(Color.YELLOW);
                hcn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhcn();
                    }
                });
                hv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        vuong();
                    }
                });
                ht.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        tron();
                    }
                });
                htg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canvas.drawColor(Color.WHITE);
                        hinhtg();
                    }
                });
            }
        });
//        hcn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hinhcn();
//                hong.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        p.setColor(getResources().getColor(R.color.hong));                    }
//                });
//                cam.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        p.setColor(getResources().getColor(R.color.Cam));                    }
//                });
//                mdo.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        p.setColor(Color.RED);                    }
//                });
//                xanh.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        p.setColor(getResources().getColor(R.color.xanh));                    }
//                });
//                vang.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        p.setColor(getResources().getColor(R.color.vang));                    }
//                });
//                tim.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        p.setColor(getResources().getColor(R.color.tim));                    }
//                });
//            }
//        });
    }
    public void KhoiTao() {
        img = (ImageView) findViewById(R.id.img);
        ht=(Button) findViewById(R.id.ht);
        htg=(Button) findViewById(R.id.htg);
        hv=(Button) findViewById(R.id.hv);
        hcn=(Button) findViewById(R.id.hcn);
        mdo=(Button) findViewById(R.id.maudo);
        vang=(Button) findViewById(R.id.mauvang);
        cam=(Button) findViewById(R.id.maucam);
        hong=(Button) findViewById(R.id.mauhong);
        tim=(Button) findViewById(R.id.mautim);
        xanh=(Button) findViewById(R.id.mauxanh);
        bmp = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
        p = new Paint();
        p.setAntiAlias(true);
        p.setColor(Color.GREEN);
        p.setStrokeWidth(10);
        p.setDither(false);
        p.setTextSize(60);
        canvas = new Canvas(bmp);
    }
    public void veBieuDoCot(String[] tenCot, int[] soLieu) {
        canvas.drawColor(Color.WHITE);
        // Vẽ trục tọa độ
        int top, left = 100, right;
        canvas.drawLine(100, 100, 100, 800, p);
        canvas.drawLine(100, 100, 85, 115, p);
        canvas.drawLine(100, 100, 115, 115, p);
        canvas.drawLine(100, 800, 800, 800, p);
        canvas.drawLine(785, 815, 800, 800, p);
        canvas.drawLine(785, 785, 800, 800, p);
        canvas.drawText("Năm", 810, 800, p);
        canvas.drawText("Sản lượng", 40, 70, p);
        // Vẽ các khối hình chữ nhật biểu đồ
        for (int i = 0; i < tenCot.length; i++) {
            left = left + 100;
            right = left + 100;
            top = 800 - soLieu[i] * 100;
            canvas.drawRect(left, top, right, 800, p);
            canvas.drawText(tenCot[i], left, 880, p);
            canvas.drawText(soLieu[i] * 100 + "", left, top - 40, p);
            left = left + 60;
        }
        img.setImageBitmap(bmp);

    }

    public void tron(){
        canvas.drawCircle(500, 300, 200, p);
        canvas.drawText("Hình tròn", 350, 600, p);//
        img.setImageBitmap(bmp);
    }
    public void vuong(){
        canvas.drawColor(Color.WHITE);
        canvas.drawRect(200, 100, 700, 600, p);
        //canvas.drawRect(200,200,700,700, p);
        canvas.drawText("Hình vuông", 300, 700, p);
        img.setImageBitmap(bmp);
    }
    public void hinhcn(){
        canvas.drawColor(Color.WHITE);
        canvas.drawRect(100, 100, 700, 600, p);
        canvas.drawText("Hình chữ nhật", 300, 700, p);
        img.setImageBitmap(bmp);
    }
    public void hinhtg(){
        canvas.drawColor(Color.WHITE);
        canvas.drawLine(100, 100, 600, 600, p);
        canvas.drawLine(100, 100, 300, 600, p);
        canvas.drawLine(300, 600, 600, 600, p);

        //img.startAnimation(animation2);
        canvas.drawText("Hình Tam giác", 300, 700, p);

        img.setImageBitmap(bmp);
    }
}
