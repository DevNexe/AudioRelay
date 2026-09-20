package defpackage;

import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzj;

/* JADX INFO: loaded from: classes3.dex */
public final class yv5 {
    public final zv5 a = new zv5();
    public final zzed b = new zzed(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(zzzg zzzgVar) {
        int i;
        int i2;
        int i3;
        boolean z = this.e;
        zzed zzedVar = this.b;
        if (z) {
            this.e = false;
            zzedVar.zzC(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i4 = this.c;
            zv5 zv5Var = this.a;
            if (i4 < 0) {
                if (!zv5Var.b(zzzgVar, -1L) || !zv5Var.a(zzzgVar, true)) {
                    return false;
                }
                int i5 = zv5Var.d;
                if ((zv5Var.a & 1) == 1 && zzedVar.zzd() == 0) {
                    this.d = 0;
                    int i6 = 0;
                    do {
                        int i7 = this.d;
                        int i8 = 0 + i7;
                        if (i8 >= zv5Var.c) {
                            break;
                        }
                        this.d = i7 + 1;
                        i3 = zv5Var.f[i8];
                        i6 += i3;
                    } while (i3 == 255);
                    i5 += i6;
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                if (!zzzj.zze(zzzgVar, i5)) {
                    return false;
                }
                this.c = i2;
                i4 = i2;
            }
            this.d = 0;
            int i9 = 0;
            do {
                int i10 = this.d;
                int i11 = i4 + i10;
                if (i11 >= zv5Var.c) {
                    break;
                }
                this.d = i10 + 1;
                i = zv5Var.f[i11];
                i9 += i;
            } while (i == 255);
            int i12 = this.c + this.d;
            if (i9 > 0) {
                zzedVar.zzz(zzedVar.zzd() + i9);
                if (!zzzj.zzd(zzzgVar, zzedVar.zzH(), zzedVar.zzd(), i9)) {
                    return false;
                }
                zzedVar.zzE(zzedVar.zzd() + i9);
                this.e = zv5Var.f[i12 + (-1)] != 255;
            }
            if (i12 == zv5Var.c) {
                i12 = -1;
            }
            this.c = i12;
        }
    }
}
