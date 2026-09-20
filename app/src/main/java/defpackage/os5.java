package defpackage;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class os5 {
    public final zzaam a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public os5(int i, int i2, long j, int i3, zzaam zzaamVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.d = j;
        this.e = i3;
        this.a = zzaamVar;
        int i4 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.l = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    public final zzaag a(long j) {
        int i = (int) (j / ((this.d * ((long) 1)) / ((long) this.e)));
        int iZzc = zzel.zzc(this.l, i, true, true);
        if (this.l[iZzc] == i) {
            zzaaj zzaajVarB = b(iZzc);
            return new zzaag(zzaajVarB, zzaajVarB);
        }
        zzaaj zzaajVarB2 = b(iZzc);
        int i2 = iZzc + 1;
        return i2 < this.k.length ? new zzaag(zzaajVarB2, b(i2)) : new zzaag(zzaajVarB2, zzaajVarB2);
    }

    public final zzaaj b(int i) {
        return new zzaaj(((this.d * ((long) 1)) / ((long) this.e)) * ((long) this.l[i]), this.k[i]);
    }
}
