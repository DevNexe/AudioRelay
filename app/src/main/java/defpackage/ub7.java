package defpackage;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdh;
import com.google.android.gms.internal.ads.zzpm;
import com.google.android.gms.internal.ads.zzpn;
import com.google.android.gms.internal.ads.zztq;

/* JADX INFO: loaded from: classes3.dex */
public final class ub7 {
    public final zzdh c;
    public final SparseArray b = new SparseArray();
    public int a = -1;

    public ub7(zztq zztqVar) {
        this.c = zztqVar;
    }

    public final Object a(int i) {
        SparseArray sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            sparseArray = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.a + 1)) {
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public final void b(int i, mb7 mb7Var) {
        int i2 = this.a;
        SparseArray sparseArray = this.b;
        if (i2 == -1) {
            zzdd.zzf(sparseArray.size() == 0);
            this.a = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzdd.zzd(i >= iKeyAt);
            if (iKeyAt == i) {
                zzpn zzpnVar = ((mb7) sparseArray.valueAt(sparseArray.size() - 1)).b;
                int i3 = zzpm.zza;
            }
        }
        sparseArray.append(i, mb7Var);
    }
}
