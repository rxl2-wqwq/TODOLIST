## TODOLIST with JAVAFX

---

## 📝 Deskripsi Program

<p align="justify">
Project ini adalah aplikasi To-Do List berbasis Java dan JavaFX yang dibangun menggunakan konsep OOP dan arsitektur MVC untuk menghasilkan aplikasi yang terstruktur dan mudah dikembangkan. Bagian model terdiri dari <code>baseTask</code> dan <code>task</code> yang merepresentasikan nama tugas, deadline, dan status penyelesaiannya, sementara <code>taskFormatter</code> digunakan untuk menampilkan tugas dalam format teks yang rapi dan informatif. Logika pengelolaan seperti menambah, menghapus, dan menandai tugas diselesaikan diatur oleh <code>taskManager</code> menggunakan struktur ArrayList. Seluruh fungsi ini dihubungkan melalui kelas <code>App</code> yang menghadirkan antarmuka grafis interaktif menggunakan JavaFX, lengkap dengan input tugas, pemilihan deadline, daftar tugas dalam ListView, serta tombol aksi seperti Tambah, Hapus, dan Tandai Selesai, sehingga aplikasi terasa sederhana, intuitif, dan responsif digunakan.
</p>

---

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

---

## 🧩 Penjelasan GUI

Tampilan Gui : 

<img width="476" height="648" alt="image" src="https://github.com/user-attachments/assets/0248c3a8-38ad-4918-97c3-21db098214a7" />

---

1. Input Nama Tugas
     
   a. Berupa TextField dengan placeholder "Nama Tugas".

   b. Digunakan untuk mengetik nama atau judul tugas yang ingin ditambahkan ke daftar.

2. Input Deadline

   a. Menggunakan DatePicker dengan placeholder "Deadline".

   b. Pengguna dapat memilih tanggal menggunakan ikon kalender.

   c. Jika tidak dipilih, aplikasi akan menggunakan deadline default.

3. Tombol “Tambah”

   a. Berfungsi untuk menambahkan tugas baru berdasarkan:

   b. Nama tugas pada TextField

   c. Deadline pada DatePicker

   d. Setelah ditekan, tugas langsung muncul di daftar di bawah.

4. Daftar Tugas (ListView)

   a. Menampilkan semua tugas yang sudah ditambahkan.

   b. Setiap baris berisi teks tugas yang sudah diformat (taskFormatter), contoh:

    ```[ ] Belajar Java - 2025-12-11```

   c. Pengguna dapat memilih salah satu tugas dari daftar untuk diberi aksi.

5. Tombol “Tandai Selesai”

   a. Menandai tugas yang dipilih sebagai selesai.

   b. Biasanya mengubah tampilan tugas menjadi:

    ```[✓] Belajar Java - 2025-12-11```

6. Tombol “Hapus”

   a. Menghapus tugas yang dipilih dari daftar.

   b. Tugas akan hilang dari ListView setelah tombol ditekan.

--- 

## 📚 Materi Sebelum UTS yang Diimplementasikan

1️⃣ Object-Oriented Programming (OOP)

**A. Class dan Object**
   <p align="justify">
   Program menggunakan sejumlah class seperti task, baseTask, taskManager, dan App untuk           membangun struktur aplikasi. Setiap tugas direpresentasikan sebagai object dari class           task, sedangkan taskManager mengelola kumpulan object tersebut.
   </p>
   
**B. Constructor**
   <p align="justify">
   Constructor digunakan untuk menginisialisasi nilai awal object. Pada class task,                constructor mengisi nama, deadline, dan status selesai. Constructor di baseTask dipanggil       melalui super().
   </p>
   
**C. Method**
   <p align="justify">
   Setiap class memiliki method untuk menjalankan fungsi tertentu. taskManager memiliki            method untuk menambah, menghapus, dan menandai tugas. Class taskFormatter menyediakan           method untuk memformat teks, dan class App memiliki method untuk memperbarui tampilan.
   </p>
   
**D. Package**
   <p align="justify">
   Kode dipisahkan ke dalam package model, controller, gui, dan utils, sehingga struktur           program lebih rapi dan sesuai prinsip modularitas.
   </p>
   
---

2️⃣ Array dan Collection

**A. ArrayList**
  <p align="justify">
   Program menggunakan ArrayList<task> untuk menyimpan daftar tugas. ArrayList dipilih karena      mendukung penambahan, penghapusan, dan pengaksesan data secara dinamis sesuai input pengguna.
   </p>
    
**B. Looping Data**
  <p align="justify">
   Looping digunakan dalam updateList() untuk mengambil seluruh object task dari ArrayList dan     menampilkannya ke dalam ListView. Dengan looping, tampilan selalu sesuai dengan data terbaru    yang tersimpan.
  </p>
  
**C. Reference Type dalam Collection**
  <p align="justify">
  ArrayList menyimpan reference ke object task, bukan nilai primitif. Hal ini membuat data        mudah diubah tanpa harus menyalin seluruh struktur.
  </p>

---

3️⃣ Konstanta, Tipe Data, Kondisional, dan Looping

**A. Konstanta**
 <p align="justify">
 Program menggunakan konstanta seperti DEFAULT_DEADLINE dalam class task. Konstanta ini          berfungsi sebagai nilai default ketika pengguna tidak menetapkan deadline. Penggunaan           konstanta  menjaga konsistensi nilai dan mencegah penulisan ulang string yang sama di banyak    tempat dalam program.
 </p>
  
**B. Primitive Types**
 <p align="justify">
 Tipe data primitif digunakan untuk menyimpan nilai yang sederhana. Contohnya adalah variabel    boolean selesai, yang menunjukkan apakah sebuah tugas sudah diselesaikan oleh pengguna. Tipe    boolean dipilih karena nilainya hanya dua kemungkinan: selesai atau belum.
 </p>
  
**C. Kondisional (if)**
 <p align="justify">
 Berbagai reference type digunakan di dalam program, seperti TextField, DatePicker, ListView,    dan ArrayList. Reference type ini digunakan untuk menyimpan objek yang lebih kompleks, seperti  elemen UI dan struktur data. Reference type memungkinkan program menangani banyak informasi     tanpa membebani memori dengan salinan data yang tidak diperlukan.
 </p>
  
**D. Looping**
 <p align="justify">
 Struktur kondisional seperti if digunakan untuk memvalidasi input pengguna dan memastikan       operasi yang dilakukan valid. Contohnya, sebelum menghapus tugas, program memastikan index      yang dipilih berada dalam rentang yang benar. Selain itu, kondisional digunakan untuk           menerapkan deadline default jika pengguna tidak mengisi nilai tersebut.
 </p>

---

## 🧠 Materi Setelah UTS (Non-GUI): Inheritance & Encapsulation

Pada project To Do List ini, saya menggunakan dua konsep OOP penting yaitu **Inheritance (Pewarisan)** dan **Encapsulation (Enkapsulasi)**. Kedua konsep ini diterapkan pada struktur class yang mengatur data tugas.

---

Impementasi kedua materi meliputi 

**🔷 1. Inheritance (Pewarisan)**

<p align="justify">
Inheritance adalah konsep dimana sebuah class dapat mewarisi atribut dan method dari class lain.
Digunakan untuk membentuk hubungan antara class dasar dan class turunan sehingga atribut dan method dapat diwarisi.
</p>

* <p align="justify">
  Berfungsi sebagai class induk yang menyimpan atribut dasar tugas, yaitu namaTugas dan           deadline, class ini menjadi fondasi bagi class turunan lainnya.
  </p>
  
* <p align="justify">
  Merupakan class anak yang mewarisi seluruh atribut dari baseTask, class ini menambahkan fitur   baru seperti status selesai, konstanta DEFAULT_DEADLINE, dan method tandaiSelesai().            Inheritance ini membuat struktur program lebih modular, menghindari pengulangan kode, dan       memudahkan pengembangan.
  </p>

Inheritance ini membuat struktur program lebih modular, menghindari pengulangan kode, dan memudahkan pengembangan.

**🔷 2. Encapsulation**

<p align="justify">       
Encapsulation adalah konsep OOP yang menyembunyikan data (data hiding) sehingga hanya dapat diakses melalui method khusus. Digunakan untuk melindungi data agar tidak dapat diakses atau diubah langsung dari luar class.
</p>

* <p align="justify"> 
  Atribut seperti namaTugas, deadline, dan selesai disembunyikan menggunakan akses modifier       private atau protected. Penyembunyian ini memastikan bahwa data tidak dapat diakses secara      langsung dari luar class, melainkan hanya melalui method yang memang disediakan untuk           keperluan tersebut.
  </p>

* <p align="justify"> 
  Penyediaan getter method seperti getNamaTugas(), getDeadline(), dan isSelesai() untuk           mengakses informasi secara aman.
  </p>

* <p align="justify">
  Perubahan terhadap status objek juga hanya dapat dilakukan melalui method khusus seperti        tandaiSelesai(), sehingga setiap perubahan tetap terkontrol dan konsisten. Pendekatan ini       menjaga keamanan data serta mencegah manipulasi yang tidak sesuai dengan aturan yang berlaku    dalam program.
  </p>

Enkapsulasi memastikan setiap perubahan data tetap terkontrol dan mencegah manipulasi langsung yang dapat memicu error.


---

Screenshot di bawah menampilkan proses aplikasi To-Do List beserta pembaruan daftar tugas yang terjadi otomatis saat pengguna melakukan aksi.

<img width="481" height="649" alt="image" src="https://github.com/user-attachments/assets/5a0c1a76-5d2a-4787-bcf8-825427b9606a" />


