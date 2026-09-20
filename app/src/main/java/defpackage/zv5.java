package defpackage;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzj;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zv5 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final zzed g = new zzed(255);

    public final boolean a(zzzg zzzgVar, boolean z) throws zzbu {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        zzed zzedVar = this.g;
        zzedVar.zzC(27);
        if (zzzj.zzc(zzzgVar, zzedVar.zzH(), 0, 27, z) && zzedVar.zzs() == 1332176723) {
            if (zzedVar.zzk() != 0) {
                if (z) {
                    return false;
                }
                throw zzbu.zzc("unsupported bit stream revision");
            }
            this.a = zzedVar.zzk();
            this.b = zzedVar.zzp();
            zzedVar.zzq();
            zzedVar.zzq();
            zzedVar.zzq();
            int iZzk = zzedVar.zzk();
            this.c = iZzk;
            this.d = iZzk + 27;
            zzedVar.zzC(iZzk);
            if (zzzj.zzc(zzzgVar, zzedVar.zzH(), 0, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    int iZzk2 = zzedVar.zzk();
                    this.f[i] = iZzk2;
                    this.e += iZzk2;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(zzzg zzzgVar, long j) throws EOFException, InterruptedIOException {
        zzdd.zzd(zzzgVar.zzf() == zzzgVar.zze());
        zzed zzedVar = this.g;
        zzedVar.zzC(4);
        while (true) {
            if ((j != -1 && zzzgVar.zzf() + 4 >= j) || !zzzj.zzc(zzzgVar, zzedVar.zzH(), 0, 4, true)) {
                break;
            }
            zzedVar.zzF(0);
            if (zzedVar.zzs() == 1332176723) {
                zzzgVar.zzj();
                return true;
            }
            ((zzyv) zzzgVar).zzo(1, false);
        }
        do {
            if (j != -1 && zzzgVar.zzf() >= j) {
                break;
            }
        } while (zzzgVar.zzc(1) != -1);
        return false;
    }
}
