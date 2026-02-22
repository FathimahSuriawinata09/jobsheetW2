package restaurant;

public class Restaurant {
    private String[] nama_makanan; 
    private double[] harga_makanan; 
    private int[] stok;
    private byte id = 0;

public Restaurant() { 
    nama_makanan = new String[10]; 
    harga_makanan = new double[10]; 
    stok = new int[10];
}

public String getNamaMakanan(int index){
    if (index >= 0 && index < id) 
        return nama_makanan[index];
    return null;
}
public double getHargaMakanan(int index){
    if (index >= 0 && index < id) 
        return harga_makanan[index];
    return 0;
}
public int getStok(int index){
    if (index >= 0 && index < id) 
        return stok[index];
    return 0;
}
public byte getJumlahMenu(){
    return id;
}

private void setStok(int index, int newStok){
    if(index >= 0 && index < id && newStok >= 0){
        stok[index]=newStok;
    }
}

public void tambahMenuMakanan(String nama, double harga, int stokBaru) { 
    if(id >= nama_makanan.length){
        System.out.println("Menu habis");
    }
    if(stokBaru < 0){
        System.out.println("Silahkan pilih menu lain");
        return;
    }
        
    this.nama_makanan[id] = nama; 
    this.harga_makanan[id] = harga; 
    this.stok[id] = stokBaru;
    nextId();
}

public void tampilMenuMakanan() { 
    System.out.println("\nDaftar Menu:");
    for (int i = 0; i < id; i++) {  
        if (!isOutOfStock(i)) { System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);

        }
    }
}

private boolean isOutOfStock(int index) {
     return stok[index] == 0;
    
}
private void nextId() { 
    if (id < nama_makanan.length) id++;
}
public void pesanmakanan(int index, int jumPesanan){
    if(index < 0 || index >= id){
        System.out.println("Menu tidak valid");
        return;
    }
    if(jumPesanan <= 0){
        System.out.println("Jumlah harus lebih dari 0");
        return;
    }

    if(stok[index] >= jumPesanan){
        setStok(index, stok[index] - jumPesanan);
        System.out.println("Pesanan berhasil!");
        } else {
            System.out.println("Stok tidak mencukupi untuk " + nama_makanan[index]);
        }
    }
}


