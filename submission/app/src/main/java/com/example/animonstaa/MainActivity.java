package com.example.animonstaa;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animonsta.R;


public class MainActivity extends AppCompatActivity  {


    ListView listView;
    String[] mTitle = {"Adudu", "Bagogo", "Boboiboy", "Ejojo", "Gopal", "Ochobot", "Papa Zola", "Probe", "Tok Aba", "Yaya", "Ying"};
    String[] mDescription = {"Adudu Detail", "Bagogo Detail", "Boboiboy Detail", "Ejojo Detail", "Gopal Detail", "Ochobot Detail", "Papa Zola Detail", "Probe Detail", "Tok Aba Detail", "Yaya Detail", "Ying Detail"};
    String[] detaills = {"Adu Du adalah antagonis utama dalam serial ini. Berkepala kotak dan berwarna hijau. Tujuannya adalah menghancurkan BoBoiBoy dan kawan-kawannya serta mendapatkan coklat. Berasal dari golongan terbawah Suku Sakat Ado Doi sektor 42 planet A Ta Ta Tiga . Kapal luar Angkasa milk Adu du pernah dijual untuk membeli senjata dari Bago Go.\n", "Penjual barang senjata haram terhebat di planet Ata Ta Tiga. Licik dan cerdas orangnya. Selain menjual senjata haram dan pakaian berwarna merah berdasi hijau. Makanan Kegemaran adalah Ikan Lele Spesial Campur-Campur",

            "BoBoiBoy disuarakan oleh BoBoiBoy Nur Fathiah Diaz. BoBoiBoy adalah protagonis dan tokoh utama dalam serial ini. Diceritakan, dia berasal dari Kuala Lumpur dan mendapat kekuatan dari Ochobot. Dia memiliki 5 kekuatan dari 5 elemen, yaitu Petir, Angin, Tanah, Api, Air.Masing-masing elemen dapat naik ke tingkat kedua yaitu petir menjadi halilintar, angin menjadi taufan, tanah menjadi gempa, Elemen Api BoBoiBoy diperkirakan akan meningkat ke elemen Magma, sedangkan elemen Air diperkirakan akan meningkat ke elemen Es. Api muncul pada BoBoiBoy musim ketiga. Kekuatannya yang terbesar adalah kekuatan dari tiga elemen BoBoiBoy mampu memisahkan menjadi tiga di mana masing-masing klon dapat mengontrol setiap elemen. Ia punya kelemahan, yaitu pelupa dan takut dengan suara balon pecah. Suara balon pecah yang terus-menerus menyebabkan BoBoiBoy Petir naik tingkat kedua menjadi BoBoiBoy Halilintar.",
            "\n"+"Teman masa kecil Adu Du dan sekaligus musuh besar dari Adu Du. Ejo Jo merupakan Alien Golongan kelas atas di Planet Ata Ta Tiga. Ia pernah membuat Adu Du hampir hancur dan membuat Probe hancur. Dan juga pernah di lawan Adu Du, BoBoiBoy dan kawan-kawan, Tok Aba, Papa Zola, dan tiga teman sekolahnya. Ejo Jo memiliki sifat paling antagonis di antara semua makhluk planet Ata Ta Tiga.\n" +
            "\n",
            "Gopal disuarakan oleh Dzubir Mohamed Zakaria. Gopal berbadan besar dan merupakan orang yang pertama kali mengakui BoBoiBoy sebagai sahabatnya. Gopal adalah anak yang penakut dan membongkar rahasia orang-orang disekitarnya secara tidak sadar, termasuk rahasia teman-temannya. Gopal bisa mengubah objek menjadi objek yang lain karna memiliki kekuatan memanipulasi molekul, tetapi ia selalu mengubahnya menjadi makanan karena ia selalu memikirkan makanan. Semakin dia takut, semakin hebat kuasanya. Dia juga mampu mengubah benda yang sudah diubah ke bentuk semula. Selalu berhutang di warung coklat Tok Aba. Dia mempunyai Hutang kepada Tok Aba 32 Ringgit 75 sen. Dia berkedudukan Penolong Ketua Darjah Di kelas 5 Jujur.\n" +
            "\n",
            "Ochobot disuarakan oleh Muhammad Fathi Diaz. Ochobot merupakan Bola kekuatan yang diaktifkan Adu Du menggunakan kekuatan coklat, namun berpihak kepada BoBoiBoy karena Adu Du mengaktifkan Ochobot dengan coklat Tok Aba adalah pengaktifnya. Dialah yang memberikan kekuatan bagi BoBoiBoy, Gopal, Ying, Yaya, dan Fang (tetapi Fang diberikan kekuatan karena sangat tertekan). Dia juga pegawai Tok Aba di BoBoiBoy & Tok Aba Kokotiam.\n" +
            "\n",
            "Papa Zola disuarakan oleh Nizam Razak. Papa Zola memiliki kekuatan dari dunia game. Papa Zola merupakan Superhero fiksi yang keluar dari permainan video ke dunia nyata bersamaan dengan BoBoiBoy dan Gopal akibat ulah Adu Du yang menghancurkan mereka. Dia mengambil Gopal sebagai muridnya untuk sementara waktu. Papa Zola selalu berkata bahwa dirinya(“Musuh Kejahatan, Kekasih Kebenaran”). Dalam episode surat penggemar, Komputer mengatakan bahwa ia gagal setiap wawancara tunggal untuk pekerjaan. Dalam Musim 2, ia menjadi guru Olahraga dan guru Matematika di Sekolah Rendah Pulau Rintis. Papa Zola mempunyai beberapa kekuatan antara lain Kuasa Pembesaran, Rotan Keinsafan, Silauan Kehenseman, Tendangan Keinsafan, Pembaris P Papa Zola, Pinggan Mangkok Berapi, Tendangan Kacak Berapi.\n",
            "Menurut cerita komputer asisiten Ejo Jo, Probe ditemukan oleh Adu Du saat Probe dibuang karena eksperimen pembuatannya dianggap gagal. Setelah diperbaiki, mereka tidak terpisahkan. Adu Du mengaktifkan Probe dengan Air Pipe. Dapat berubah menjadi Super Probe, Super Makcik Probe, Super Duper Probe, Robolabolabolabolabot Super King, Mega Probe, Mesin Basuh, Vakum, Ketuhar, Kuali, Tong Gas. Sering bertindak bodoh dan sering dilempar cangkir oleh Adu Du. Hancur pada episode 12 musim 2 namun diperbaiki lagi pada musim 3..\n" +
            "\n",
            "Tok Aba disuarakan oleh Muhammad Anas Bin Abdul Aziz. Tok aba adalah kakek BoBoiBoy dan pemilik toko coklat(Tok Aba's Kokotiam). Meskipun tidak mempunyai kekuatan dari Ochobot Tok Aba mempunyai beberapa ilmu. Ilmunya adalah Pulasan Telinga, Gerakan Ayam Tambatan, Gerakan Ayam 3 Rasa, Hikmat Ayam Susar, Hikmat Ayam Penyet, Hikmat Cakar Ayam, Kuasa Pukulan Rotan, Tendangan Basikal Tua, Gerakan Kemenangan Dan Ia Pernah meminjam jam kuasa Ying Pada saat akan menghancurkan konsentrasi Ejo jo.\n",
            "Yaya disuarakan oleh Nur Sarah Alisya Zainal Rashid. Yaya, seperti teman-temannya, ia sangat baik tetapi dia mudah marah. Dia suka menjual dan memberikan biskuit tetapi tidak tahu bagaimana membuat biskuit yang lezat. Biskuit yang ia jual membuat orang pingsan karna Yaya membuat biskuitnya dari bahan yang tak lazim seperti rempah kurma, serai, daun jeruk, bahkan sampai bawang pun di pakai. Kuasanya adalah kemampuan untuk terbang di udara dan serta kuasa super kuat karena ia mempunyai kuasa menipulasi graviti. Sehari-hari ia selalu berteman baik terutama dengan Ying. Namun Yaya dan Ying juga dapat bermusuhan hanya pada saat ujian sekolah. \n" +
            "\n",
            "Dia baik kepada semua teman-temannya terutama untuk Yaya. Ying disuarakan oleh Yap Ee Jean. Dia memiliki sifat pemalu. Dapat berlari dengan kecepatan yang luar biasa (seperti kilat), namun akan kehilangan kekuatannya saat bersin. Kekuatan sebenarnya adalah memanipulasi waktu sehingga ia dapat berlari cepat. Sehari-hari ia selalu berteman baik terutama dengan Yaya. Namun Yaya dan Ying juga dapat bermusuhan hanya pada saat ujian sekolah. Ying berkedudukan sebagai Naib Presiden Bilik Darjah. Kuasa Ying antara lain Kuasa larian kilat, larian laju, Kuasa Menipulasi Massa, Seribu Tendangan Laju, Cakaran Laju, Seribu Cakaran Laju, Tendangan Laju, Seribu Tendangan Lompat, Gerakan Kombo Yaya & Ying, Tulisan Laju..\n" +
            "\n"};

    int[] images = {R.drawable.adudu, R.drawable.bagogo, R.drawable.boboboy, R.drawable.ejojo, R.drawable.gopall, R.drawable.ochobott, R.drawable.papazola, R.drawable.probe, R.drawable.tokaba, R.drawable.yayaa, R.drawable.ying};
    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),ListdataActivity.class);
                intent.putExtra("name",mTitle[i]);
                intent.putExtra("desk",detaills[i]);
                intent.putExtra("image",images[i]);
                startActivity(intent);
            }
        });


    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           View view1 = getLayoutInflater().inflate(R.layout.row,null);

           TextView name = view1.findViewById(R.id.nama);
           TextView desk = view1.findViewById(R.id.deskripsi);
           ImageView image = view1.findViewById(R.id.imagee);

           name.setText(mTitle[i]);
           desk.setText(mDescription[i]);
           image.setImageResource(images[i]);
           return view1;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onClick(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void onClick(int item) {
        switch (item) {
            case R.id.about:
                Intent mv1 = new Intent(MainActivity.this, tentang.class);
                startActivity(mv1);
                break;
            case R.id.exit:
                finish();
                break;
            case R.drawable.saya:
                finish();
                break;
        }
    }












}
