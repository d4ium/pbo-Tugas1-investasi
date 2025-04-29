# PBO Tugas 1 – Program Investasi Sederhana

## Mata Kuliah

Pemrograman Berorientasi Objek D – Semester 2

Dosen Pengampu: **Wayan Oger Vihikan, S.T.I, M.I.T.**

## Nama / Kelompok

Putu Davrian Rockaditha (@d4ium)  [2405551097]

I Wayan Wirya Adi Ajnyana (@IWAYANWIRAYAADIAJNYANA) [2405551165]

## PBO Investasi

Proyek ini adalah Tugas 1 untuk mata kuliah **Pemrograman Berorientasi Objek** (PBO) Semester 2 di Universitas Udayana.

Aplikasi ini memungkinkan pengguna untuk melakukan simulasi investasi sederhana pada **saham dan surat berharga negara (SBN)** menggunakan antarmuka command line (CLI). Aplikasi dibuat menggunakan bahasa pemrograman **Java** dan menerapkan konsep **Object-Oriented Programming (OOP)**.

---

## Fitur Utama

- Login sebagai **Admin** atau **Customer**.
- **Admin:**
  - Tambah saham.
  - Ubah harga saham.
  - Tambah produk SBN.
- **Customer:**
  - Beli & jual saham.
  - Beli SBN.
  - Simulasi kupon SBN per bulan.
  - Lihat portofolio investasi.

---

## Cara Menjalankan Program

1. Pastikan Java sudah terinstall.
2. Clone repository ini:
   ```bash
   git clone https://github.com/username/pbo-Tugas1-investasi.git

---

## Login Akun (Hardcoded)
Username: admin
Pass    : admin123

Username: user
Pass    : user123

# Struktur Program
Berikut ialah Struktur Program dari proyek yang telah dibuat 

**model/**
- Class utama seperti User, Saham, SBN

**data/**
- Penyimpanan data memori (Database)

**menu/** 
- Navigasi antarmuka dan logika menu

**menu/admin/**
- Handler fitur admin

**menu/customer/**
- Handler fitur customer

**utility/**
- Validasi input (angka)

**Main.java**
- Entry point aplikasi

# Diagram UML

<img width="743" alt="Screen Shot 2025-04-29 at 21 22 17" src="https://github.com/user-attachments/assets/fdd2e877-00c7-4937-8ace-c7bad71c7bbe" />

Diagram UML berikut menunjukkan struktur class utama dari program investasi saham dan SBN berbasis Java. Program menerapkan prinsip OOP melalui pewarisan, asosiasi, dan enkapsulasi.


- User adalah superclass abstrak yang diturunkan oleh Admin dan Customer.
- Admin memiliki akses untuk menambah dan mengubah data saham dan SBN.
- Customer menyimpan portofolio saham dan SBN dalam bentuk Map.
- Saham dan SBN merupakan objek investasi yang dapat dikelola oleh admin dan dibeli customer.
- Database berfungsi sebagai penyimpanan data runtime untuk seluruh entitas penting.
- InputValidation menangani input numerik agar program aman dari kesalahan user.

--- 

# Studi Kasus & Screenshot

## Login

**Login Admin**

<img width="186" alt="Screen Shot 2025-04-29 at 19 38 22" src="https://github.com/user-attachments/assets/155a1278-7142-4f8b-b271-ed11043f3b1b" />

Screenshot menunjukkan admin berhasil login dan diarahkan ke menu admin. Ini membuktikan proses autentikasi berfungsi.

**Login User**

<img width="200" alt="Screen Shot 2025-04-29 at 19 40 16" src="https://github.com/user-attachments/assets/e8af396c-224e-460a-a759-bc59f1c72011" />

Customer berhasil masuk dan diarahkan ke menu customer dengan pilihan lengkap.

**Login Gagal**

<img width="336" alt="Screen Shot 2025-04-29 at 19 41 28" src="https://github.com/user-attachments/assets/1ccf4b42-6905-4ef8-85a3-a01c81331942" />

Saat username atau password salah, sistem menampilkan pesan error dan kembali ke menu utama.

## Admin – Tambah Saham

<img width="293" alt="Screen Shot 2025-04-29 at 19 45 35" src="https://github.com/user-attachments/assets/b22149ab-16c1-4ef4-8773-01dff48cb26b" />

<img width="276" alt="Screen Shot 2025-04-29 at 19 47 15" src="https://github.com/user-attachments/assets/ace4ec98-3423-4d07-9048-7e40646f46b1" />

Admin mengisi kode, nama, dan harga saham baru.
Screenshot memperlihatkan bahwa kedua saham berhasil ditambahkan dan akan muncul di daftar saat diuji customer nanti.

## Admin – Ubah Harga Saham

<img width="338" alt="Screen Shot 2025-04-29 at 19 48 22" src="https://github.com/user-attachments/assets/a6b64993-a707-4286-b986-26293615da12" />

Admin memilih saham yang sudah ada dan memasukkan harga baru.
Screenshot menampilkan harga saham sebelumnya dan sesudah diubah.

## Admin – Tambah SBN

<img width="355" alt="Screen Shot 2025-04-29 at 19 51 24" src="https://github.com/user-attachments/assets/745904d7-9496-42f7-bd87-fbf22bde9b0f" />

Admin memasukkan nama, bunga, jangka waktu, jatuh tempo, dan kuota.
Screenshot menunjukkan SBN berhasil ditambahkan ke sistem dan muncul di daftar customer.

## Customer – Beli Saham

<img width="341" alt="Screen Shot 2025-04-29 at 19 54 09" src="https://github.com/user-attachments/assets/7d33223e-75a6-41aa-b87b-c9761e9d77eb" />

<img width="337" alt="Screen Shot 2025-04-29 at 19 54 48" src="https://github.com/user-attachments/assets/359765c6-0189-4b4f-aad7-81c15c25d0e7" />

Customer memilih saham dari daftar dan membeli sejumlah lembar.
Screenshot menampilkan konfirmasi bahwa pembelian berhasil dan saham masuk ke portofolio.

## Customer – Jual Saham

<img width="327" alt="Screen Shot 2025-04-29 at 19 55 47" src="https://github.com/user-attachments/assets/cb15ed92-52d5-4aaa-95f9-77cb1d5c3694" />

Customer memilih saham yang dimiliki dan menjual sebagian atau seluruhnya.
Screenshot menunjukkan hasil pengurangan lembar saham atau penghapusan saham jika habis.

## Customer – Beli SBN

<img width="317" alt="Screen Shot 2025-04-29 at 19 57 24" src="https://github.com/user-attachments/assets/6be34b75-7a0d-436b-9f79-51cabef280df" />

Customer memilih SBN dan memasukkan nominal pembelian.
Screenshot menunjukkan pembelian berhasil dan kuota nasional SBN berkurang.

## Customer – Simulasi Kupon SBN

<img width="486" alt="Screen Shot 2025-04-29 at 19 58 51" src="https://github.com/user-attachments/assets/d4ee1f84-f65f-4c72-9076-948538c51d92" />

Program menghitung dan menampilkan bunga bulanan berdasarkan SBN yang dimiliki.
Screenshot menampilkan perhitungan bunga sesuai rumus: (bunga/12)×90

## Customer – Portofolio

<img width="462" alt="Screen Shot 2025-04-29 at 19 59 37" src="https://github.com/user-attachments/assets/84940839-9236-4a86-b0f4-4c8291db1d5b" />

Menampilkan semua saham dan SBN yang dimiliki user lengkap dengan nilai dan bunga.
Screenshot memperlihatkan portofolio yang komprehensif dan terupdate.

## Validasi Input

**Menu Utama**

<img width="320" alt="Screen Shot 2025-04-29 at 20 02 35" src="https://github.com/user-attachments/assets/e465cc5c-6e59-4389-9b41-8d4a5b7fceaf" />

Saat user memasukkan karakter non-angka (misalnya huruf, simbol) saat memilih menu utama, program tidak crash.
Pesan error seperti “Input tidak valid, harap masukkan angka.” akan muncul, lalu pengguna diminta mengisi ulang.

**Menu Admin**

<img width="326" alt="Screen Shot 2025-04-29 at 20 03 45" src="https://github.com/user-attachments/assets/3f4ac48a-ba3f-4986-862c-076d79b42528" />

**Menu Customer**

<img width="319" alt="Screen Shot 2025-04-29 at 20 01 44" src="https://github.com/user-attachments/assets/5b8d2bfc-8484-4727-b796-4e211a95d618" />

---

# Konsep OOP yang Diterapkan

- **Inheritance**: Admin dan Customer mewarisi/Extends User
- **Encapsulation**: Private field + getter/setter
- **Single Responsibility**: Setiap class punya tugas spesifik
- **Modular** : Menu dan fitur dipisah ke handler
- **Utility Class**: Validasi input dengan InputValidation

