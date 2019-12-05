package co.id.iconpln.listleadersapp

object DataLeader {

    val listDataWorldLeaders: ArrayList<ModelLeader>
        get() {
            // create empty List
            val list = ArrayList<ModelLeader>()
            return list
        }

    private var dataWorldLeaders = arrayOf(
        arrayOf(
            "Sukarno",
            "Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun)[note 1][note 2] adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967.[5]:11, 81 Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda.[6]:26-32 Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
            "Indonesia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/800px-Presiden_Sukarno.jpg"
        ),
        arrayOf(
            "Che Guevara",
            "Ernesto Che Guevara (lahir di Rosario, Argentina, 14 Juni 1928 – meninggal di Bolivia, 9 Oktober 1967 pada umur 39 tahun) adalah seorang pejuang revolusi, dokter, penulis, pemimpin gerilyawan, diplomat, dan pakar teori militer asal Argentina yang berhaluan Marxis. Sebagai salah satu tokoh utama dalam Revolusi Kuba, wajahnya telah menjadi simbol perlawanan dalam gerakan kontra-kebudayaan dan dalam budaya populer.",
            "Argentina",
            "https://upload.wikimedia.org/wikipedia/commons/5/58/CheHigh.jpg"
        ),
        arrayOf(
            "Jawaharlal Nehru",
            "Jawaharlal Nehru lahir 14 November 1889 – meninggal 27 Mei 1964 pada umur 74 tahun merupakan negarawan India yang pertama (dan yang paling melayani terlama) sebegai perdana menteri India dari tahun 1947 sampai 1964. Sebagai tokoh terkemuka dalam kemerdekaan gerakan kemerdekaan India",
            "https://upload.wikimedia.org/wikipedia/commons/8/80/Jawaharlal_Nehru.jpg"
        ),
        arrayOf(
            "Guadalupe Victoria",
            "Guadalupe Victoria (lahir di Tamazula, Nueva Vizcaya, Spanyol Baru, 29 September 1786 – meninggal di San Carlos Fortress, Perote, Veracruz, 21 Maret 1843 pada umur 56 tahun), dilahirkan dengan nama José Miguel Ramón Adaucto Fernández y Félix, adalah seorang politikus dan perwira militer Meksiko yang berjuang untuk kemerdekaan melawan Kekaisaran Spanyol dalam Perang Kemerdekaan Meksiko.",
            "Mexico",
            "https://upload.wikimedia.org/wikipedia/commons/d/d4/Guadalupe_Victoria_-_02.jpg"
        ),
        arrayOf(
            "Abraham Lincoln",
            "Abraham Lincoln menjadi salah satu Presiden Amerika yang paling berpengaruh. Sebelum menjadi presiden, Lincoln adalah seorang pengacara. Lincoln memiliki rasa empati yang kuat. Dia selalu mencoba melihat masalah dari sudut pandang semua orang, termasuk para budak. Dia menggunakan konsep empati ini untuk berbicara melawan perbudakan. Dalam pidatonya yang terkenal di Gettysburg, dia mengilhami bangsa Amerika dengan kata-kata mulia dan membantu mewujudkan penghapusan perbudakan.",
            "Washington",
            "https://upload.wikimedia.org/wikipedia/commons/a/ab/Abraham_Lincoln_O-77_matte_collodion_print.jpg"
        ),
        arrayOf(
            "Nelson Mandela",
            "Nelson Rolihlahla Mandela lahir di Mvezo, Afrika Selatan, 18 Juli 1918 – meninggal di Johannesburg, Afrika Selatan, 5 Desember 2013 pada umur 95 tahun) adalah seorang revolusioner antiapartheid dan politisi Afrika Selatan yang menjabat sebagai Presiden Afrika Selatan sejak 1994 sampai 1999. Ia adalah orang Afrika Selatan berkulit hitam pertama yang memegang jabatan tersebut dan presiden pertama yang terpilih melalui keterwakilan penuh, dalam sebuah pemilu multiras.",
            "Afrika Selatan",
            "https://upload.wikimedia.org/wikipedia/commons/1/14/Nelson_Mandela-2008_%28edit%29.jpg"
        ),
        arrayOf(
            "Adolf Hitler",
            "Hitler adalah veteran Perang Dunia I dengan banyak gelar. Ia bergabung dengan Partai Pekerja Jerman (pendahulu NSDAP) pada tahun 1919, dan menjadi ketua NSDAP tahun 1921. Tahun 1923, ia melancarkan kudeta di Munich yang dikenal dengan peristiwa Beer Hall Putsch. Kudeta yang gagal tersebut berujung dengan ditahannya Hitler. Di penjara, Hitler menulis memoarnya, Mein Kampf (Perjuanganku). Setelah bebas tahun 1924, Hitler mendapat dukungan rakyat dengan mengecam Perjanjian Versailles dan menjunjung Pan-Jermanisme, antisemitisme, dan anti-komunisme melalui pidatonya yang karismatik dan propaganda Nazi. Setelah ditunjuk sebagai kanselir pada tahun 1933, ia mengubah Republik Weimar menjadi Reich Ketiga, sebuah kediktatoran satu partai yang didasarkan pada ideologi Nazisme yang totalitarian dan otokratik.",
            "Jerman",
            "https://upload.wikimedia.org/wikipedia/commons/1/10/Bundesarchiv_Bild_183-S33882%2C_Adolf_Hitler_retouched.jpg"
        ),
        arrayOf(
            "Ratu Elizabeth II",
            "Ratu Elizabeth II (Elizabeth Alexandra Mary, lahir 21 April 1926; umur 93 tahun) adalah Ratu monarki konstitusional dari 16 negara berdaulat (dikenal sebagai Alam Persemakmuran) dan teritori beserta dependensinya, serta ketua dari 54 anggota Negara-Negara Persemakmuran. Ratu Elizabeth juga merupakan Gubernur Agung Gereja Inggris.",
            "Inggris",
            "https://upload.wikimedia.org/wikipedia/commons/5/50/Queen_Elizabeth_II_March_2015.jpg"
        ),
        arrayOf(
            "Josef Stalin",
            "Josef Stalin terlahir dengan nama Ioseb Besarionis dze Jughashvili lahir 18 Desember 1878 – meninggal 5 Maret 1953 pada umur 74 tahun adalah tokoh revolusi dan politikus Uni Soviet keturunan Georgia. Ia menjadi kepala negara Uni Soviet sejak pertengahan era 1920-an sampai akhir hayatnya pada tahun 1953, dengan gelar Sekretaris Jenderal Partai Komunis Uni Soviet sejak tahun 1922 sampai 1952, dan Kepala Pemerintahan Uni Soviet sejak tahun 1941 sampai 1953. Meskipun mula-mula menjalankan pemerintahan Uni Soviet selaku kepala dari suatu rezim partai tunggal oligarkis yang memerintah dengan suara terbanyak relatif (pluralitas), Stalin akhirnya menjadi diktator de facto Uni Soviet pada era 1930-an. Sebagai pengamal setia gagasan-gagasan hasil tafsir Marxisme menurut teori-teori Leninisme, ia turut berjasa membakukan gagasan-gagasan ini menjadi paham Marxisme–Leninisme, sementara kebijakan-kebijakannya sendiri akhirnya dikenal dengan sebutan Stalinisme.",
            "Rusia",
            "https://upload.wikimedia.org/wikipedia/commons/4/43/Stalin_Full_Image.jpg"
        ),
        arrayOf(
            "TUNKU ABDUL RAHMAN PUTRA",
            "Sepanjang hayatnya, Tunku telah menunjukkan kehebatan sebagai pemimpin yang berwibawa dalam pelbagai bidang, seorang pejuang yang berjiwa kental dan mempunyai semangat jati diri yang tinggi untuk membebaskan negara dari cengkaman penjajah. Penglibatan menentang Malayan Union, mengemudi kepimpinan UMNO melalui perubahan slogan dari Hidup Melayu kepada Merdeka, mengatur strategi pakatan antara kaum dengan kerjasama pihak Majlis Raja-Raja Melayu telah membuktikan kepimpinan Tunku sehingga berjaya mencapai kemerdekaan secara aman melalui meja rundingan. Liku, cabaran, perit jerih terbayar dek nikmat kemerdekaan yang diwarisi sehingga kini dan kita sebagai rakyat Malaysia perlu merasa terhutang budi kepada Tunku – Bapa Kemerdekaan.",
            "Malaysia",
            "https://upload.wikimedia.org/wikipedia/commons/5/5a/Tunku_abd_rahman.jpg"
        )
    )
}