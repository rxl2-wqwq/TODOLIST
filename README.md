## TODOLIST with JAVAFX

## 📝 Deskripsi Program

<p align="justify">
Project ini adalah aplikasi To-Do List berbasis Java dan JavaFX yang dibangun menggunakan konsep OOP dan arsitektur MVC untuk menghasilkan aplikasi yang terstruktur dan mudah dikembangkan. Bagian model terdiri dari <code>baseTask</code> dan <code>task</code> yang merepresentasikan nama tugas, deadline, dan status penyelesaiannya, sementara <code>taskFormatter</code> digunakan untuk menampilkan tugas dalam format teks yang rapi dan informatif. Logika pengelolaan seperti menambah, menghapus, dan menandai tugas diselesaikan diatur oleh <code>taskManager</code> menggunakan struktur ArrayList. Seluruh fungsi ini dihubungkan melalui kelas <code>App</code> yang menghadirkan antarmuka grafis interaktif menggunakan JavaFX, lengkap dengan input tugas, pemilihan deadline, daftar tugas dalam ListView, serta tombol aksi seperti Tambah, Hapus, dan Tandai Selesai, sehingga aplikasi terasa sederhana, intuitif, dan responsif digunakan.
</p>

## ☕ Instruksi Menjalankan Program Java <img src="https://cdn.jsdelivr.net/npm/@programming-languages-logos/java/java_48x48.png" alt="Java" width="30">

Ikuti langkah-langkah di bawah ini untuk mendapatkan salinan proyek dan menjalankannya di progam javaFX lokal Anda.

**🐧Linux :** [install javafx 21 Linux mint 2024](http://www.youtube.com/watch?v=LuyWcqhDe0o)

**🍎Mac OS :** [how to setup JavaFx on Mac](https://youtu.be/-W_GyGZV_ro?si=IXbaMPel2xxJ4lfC)

**🪟Windows :** [How to Install JavaFX 2025 in VS Code | Complete Guide for Beginners | JavaFX Setup & Java GUI](https://youtu.be/oLXxXAya-60?si=42bhcxdc1V-RWxUl) 

atau jika kamu pengguna windows yang pemalas, bisa gunakan cara paling malas berikut.

Download
[Liberica Full JDK 25.0.1+13 x86 64 for Windows](https://bell-sw.com/pages/downloads/#jdk-25-lts) dan ekstrak.

Lalu Setup environment.

di environment Buat System variable baru untuk nama bebas sebernarnya tapi saya sarankan ```JAVA_HOME``` untuk variable value itu diisi oleh Alamat (Path) file ekstak anda.

masuk ke System variables ```Path``` lalu masukkan ```%JAVA_HOME\bin%``` dan selesai

Untuk memverifikasi apakah JDK sudah terinstall, jalankan perintah ```javac --version``` dan ```java --version``` di terminal. Apakah versi Java muncul dan sudah sesuai.

Setelah itu coba anda 
copy

```bash 
git clone https://github.com/rxl2-wqwq/TODOLIST.git
```
Sebelum itu cek apakah git sudah terinstall atau belom, jalankan perintah ```git --version``` dan jika belom terinstall juga.

Download [git software](https://git-scm.com/install/) coba cek lagi, Setelah berhasil copy repositori ke direktori lokal anda dengan cara 
```bash 
git clone https://github.com/rxl2-wqwq/TODOLIST.git
```
 diterminal anda.
 
 harusnya Struktur 
 ```
 ├── lib
│   ├── javafx-swt.jar
│   ├── javafx.base.jar
│   ├── javafx.controls.jar
│   ├── javafx.fxml.jar
│   ├── javafx.graphics.jar
│   ├── javafx.media.jar
│   ├── javafx.properties
│   ├── javafx.swing.jar
│   ├── javafx.web.jar
│   ├── jdk.jsobject.jar
│   ├── jfx.incubator.input.jar
│   └── jfx.incubator.rich.jar
├── src
│   ├── controller
│   │   └── taskManager.java
│   ├── gui
│   │   └── App.java
│   ├── model
│   │   ├── baseTask.java
│   │   └── task.java
│   └── utils
│       └── taskFormatter.java
├── .gitignore
└── README.md
```
_NB: jika kamu menggunakan jdk-full isi direktori lib tidak terlalu penting karena jdk-full sudah include libarary javaFX, berbeda dengan JDK standar modern tidak menyertakan modul JavaFX, sehingga modul-modul tersebut harus disertakan secara manual dalam direktori lib atau ditambahkan ke module path._

lalu jalankan ```App.java``` pada package gui

🧩 Penjelasan GUI

Tampilan Gui : 

<img width="476" height="648" alt="image" src="https://github.com/user-attachments/assets/0248c3a8-38ad-4918-97c3-21db098214a7" />

🟦 1. Input Nama Tugas
      a. Berupa TextField dengan placeholder "Nama Tugas".
      b. Digunakan untuk mengetik nama atau judul tugas yang ingin ditambahkan ke daftar.





