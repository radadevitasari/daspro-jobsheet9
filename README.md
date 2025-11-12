pertanyaan percobaan 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
Apa yang terjadi? Mengapa bisa demikian?
Jawab= Program akan error karena array bertipe int, sedangkan nilai 5.0 dan 7.5 bertipe double (ada koma).Java tidak bisa mencampur tipe data berbeda di satu array.Namun, 12867 dan 2000000 tetap bisa karena masih termasuk bilangan bulat (int).

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

3. Ubah statement pada langkah No 4 menjadi seperti berikut
for (int i = 0; i < 4; i++) 
      { System.out.println(bil(i));
}
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
Jawab= Program akan error karena cara akses array salah.Java memakai tanda kurung siku [ ], bukan kurung biasa ( ).

4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
Jawab= Program akan error saat dijalankan (ArrayIndexOutOfBoundsException) karena array hanya punya indeks 0–3. Saat i = 4, program mencoba mengambil bil[4] yang tidak ada.Jadi batas loop harus tetap i < 4.

pertanyaan percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i=0; i < nilaiAkhir.length; i++) ( System.out.print("Masukkan nilai akhir ke-"+i+": "); nilaiAkhir[i] sc.nextInt();
}
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Jawab= Tidak ada perubahan hasil.
Karena nilaiAkhir.length otomatis menunjukkan jumlah elemen array (yaitu 10).
Bedanya, ini lebih aman dan fleksibel.Kalau nanti jumlah elemen array diubah, program tetap jalan tanpa perlu ubah angka 10 di dalam perulangan.

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length?
Jawab= Artinya program akan mengulang selama nilai i masih lebih kecil dari jumlah elemen array.
Misalnya array berisi 10 data, maka i bernilai dari 0 sampai 9.Dengan begitu, program tidak akan melewati batas array (menghindari error).

3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
for (int i=0; i < nilaiAkhir.length; i++) {
if (nilaiAkhir[i] > 70) {
System.out.println("Mahasiswa ke-"+i+" lulus!");
}
}
Jalankan program dan jelaskan alur program!
Jawab= Dalam perulangan, setiap nilai dicek:
Jika lebih dari 70, maka program menampilkan “Mahasiswa ke-i lulus!”
Jika tidak, program tidak menampilkan apa pun.

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

pertanyaan percobaan 4
 1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
      Jawab= Statement break; berfungsi untuk menghentikan perulangan segera setelah nilai yang dicari ditemukan, agar program tidak lanjut memeriksa elemen lainnya yang tidak perlu.

