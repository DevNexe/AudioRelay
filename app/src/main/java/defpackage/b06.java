package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzasy;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzazd;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzcjt;

/* JADX INFO: loaded from: classes3.dex */
public final class b06 {
    public final zzaxy a;
    public final Object b;
    public final int c;
    public final zzayk[] d;
    public final boolean[] e;
    public final long f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public b06 l;
    public zzaze m;
    public final zzasx[] n;
    public final zzasy[] o;
    public final zzazd p;
    public final zzaya q;
    public zzaze r;
    public final zzcjt s;

    public b06(zzasx[] zzasxVarArr, zzasy[] zzasyVarArr, long j, zzazd zzazdVar, zzcjt zzcjtVar, zzaya zzayaVar, Object obj, int i, int i2, boolean z, long j2) {
        this.n = zzasxVarArr;
        this.o = zzasyVarArr;
        this.f = j;
        this.p = zzazdVar;
        this.s = zzcjtVar;
        this.q = zzayaVar;
        obj.getClass();
        this.b = obj;
        this.c = i;
        this.g = i2;
        this.i = z;
        this.h = j2;
        this.d = new zzayk[2];
        this.e = new boolean[2];
        this.a = zzayaVar.zze(i2, zzcjtVar.zzl());
    }

    public final long a(long j, boolean z, boolean[] zArr) {
        zzazb zzazbVar = this.m.zzb;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            if (z || !this.m.zza(this.r, i)) {
                z2 = false;
            }
            this.e[i] = z2;
            i++;
        }
        long jZzB = this.a.zzB(zzazbVar.zzb(), this.e, this.d, zArr, j);
        this.r = this.m;
        this.k = false;
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.d[i2] != null) {
                zzazy.zze(zzazbVar.zza(i2) != null);
                this.k = true;
            } else {
                zzazy.zze(zzazbVar.zza(i2) == null);
            }
        }
        this.s.zzd(this.n, this.m.zza, zzazbVar);
        return jZzB;
    }

    public final void b() {
        try {
            this.q.zzc(this.a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    public final boolean c() {
        zzaze zzazeVarZzc = this.p.zzc(this.o, this.a.zzn());
        zzaze zzazeVar = this.r;
        if (zzazeVar != null) {
            for (int i = 0; i < 2; i++) {
                if (zzazeVarZzc.zza(zzazeVar, i)) {
                }
            }
            return false;
        }
        this.m = zzazeVarZzc;
        return true;
    }
}
