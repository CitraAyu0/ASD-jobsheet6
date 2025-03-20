public class DataDosen05 {
    Dosen05[] dataDosen05 = new Dosen05[10];
    int idx;

    void tambah(Dosen05 dsn) {
        if(idx < dataDosen05.length) {
            dataDosen05[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        for(int i = 0; i<idx; i++) {
            dataDosen05[i].tampil();
        }
    }

    void sortingASC() {
        for(int i = 0; i<idx; i++) {
            for(int j = 0; j<idx-1; j++) {
                if(dataDosen05[j].usia > dataDosen05[j+1].usia) {
                    Dosen05 temp = dataDosen05[j];
                    dataDosen05[j] = dataDosen05[j+1];
                    dataDosen05[j+1] = temp;
                }
            }
        }
    }

    void sortingDESC() {
        for(int i = 0; i<idx; i++) {
            int idxMax = i;
            for(int j = i+1; j<idx; j++) {
                if(dataDosen05[j].usia > dataDosen05[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen05 temp = dataDosen05[idxMax];
            dataDosen05[idxMax] = dataDosen05[i];
            dataDosen05[i] = temp;
        }
    }

    void insertionSort() {
        for(int i = 1; i<idx; i++) {
            Dosen05 temp = dataDosen05[i];
            int j = i;
            while (j>0 && dataDosen05[j-1].usia < temp.usia) {
                dataDosen05[j] = dataDosen05[j-1];
                j--;
            }
            dataDosen05[j] = temp;
        }
    }
}
