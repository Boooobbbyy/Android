package com.tnembull.batikapp.model

import java.io.Serializable
/*
* Ini Untuk Membuat Model Main Pada Halaman Awal
* */

class ModelMain : Serializable {
    var id = 0
    var namaBatik: String? = null
    var daerahBatik: String? = null
    var maknaBatik: String? = null
    var hargaRendah = 0
    var hargaTinggi = 0
    var hitungView: String? = null
    var linkBatik: String? = null

}