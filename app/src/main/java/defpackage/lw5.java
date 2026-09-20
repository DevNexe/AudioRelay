package defpackage;

import com.google.android.gms.internal.ads.zzaam;

/* JADX INFO: loaded from: classes3.dex */
public final class lw5 {
    public final zzaam a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public lw5(zzaam zzaamVar) {
        this.a = zzaamVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }
}
