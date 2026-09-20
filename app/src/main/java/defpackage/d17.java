package defpackage;

import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzgh;
import com.google.android.gms.internal.ads.zztz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d17 extends zzgh {
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;
    public final zzcn[] g;
    public final Object[] h;
    public final HashMap i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d17(List list, zztz zztzVar) {
        super(false, zztzVar, null);
        int iZzc = 0;
        int size = list.size();
        this.e = new int[size];
        this.f = new int[size];
        this.g = new zzcn[size];
        this.h = new Object[size];
        this.i = new HashMap();
        Iterator it = list.iterator();
        int iZzb = 0;
        int i = 0;
        while (it.hasNext()) {
            k07 k07Var = (k07) it.next();
            this.g[i] = k07Var.zza();
            this.f[i] = iZzc;
            this.e[i] = iZzb;
            iZzc += this.g[i].zzc();
            iZzb += this.g[i].zzb();
            this.h[i] = k07Var.zzb();
            this.i.put(this.h[i], Integer.valueOf(i));
            i++;
        }
        this.c = iZzc;
        this.d = iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final int a(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final int b(int i) {
        return zzel.zzc(this.e, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final int c(int i) {
        return zzel.zzc(this.f, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final int d(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final int e(int i) {
        return this.f[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final zzcn f(int i) {
        return this.g[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final Object g(int i) {
        return this.h[i];
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzb() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzc() {
        return this.c;
    }
}
