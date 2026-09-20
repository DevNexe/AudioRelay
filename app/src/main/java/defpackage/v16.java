package defpackage;

import com.google.android.gms.internal.ads.zzazy;

/* JADX INFO: loaded from: classes3.dex */
public final class v16 {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public v16(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        zzazy.zzc(iArr.length == length);
        int length2 = jArr.length;
        zzazy.zzc(length2 == length);
        zzazy.zzc(iArr2.length == length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = length2;
    }
}
