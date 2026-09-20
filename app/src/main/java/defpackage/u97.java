package defpackage;

import com.google.android.gms.internal.ads.zzgg;

/* JADX INFO: loaded from: classes3.dex */
public final class u97 extends zzgg {
    public long c;
    public int d;
    public int e;

    public u97() {
        super(2, 0);
        this.e = 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.zzgg r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.a(r0)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = r6.a(r0)
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            r0 = 4
            boolean r0 = r6.a(r0)
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            int r0 = r5.d
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L2b
            goto L51
        L2b:
            int r3 = r5.e
            if (r0 < r3) goto L30
            goto L84
        L30:
            boolean r0 = r6.a(r4)
            boolean r3 = r5.a(r4)
            if (r0 != r3) goto L84
            java.nio.ByteBuffer r0 = r6.zzb
            if (r0 == 0) goto L51
            java.nio.ByteBuffer r3 = r5.zzb
            if (r3 == 0) goto L51
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L51
            goto L84
        L51:
            int r0 = r5.d
            int r2 = r0 + 1
            r5.d = r2
            if (r0 != 0) goto L66
            long r2 = r6.zzd
            r5.zzd = r2
            boolean r0 = r6.a(r1)
            if (r0 == 0) goto L66
            r5.zzc(r1)
        L66:
            boolean r0 = r6.a(r4)
            if (r0 == 0) goto L6f
            r5.zzc(r4)
        L6f:
            java.nio.ByteBuffer r0 = r6.zzb
            if (r0 == 0) goto L7f
            int r2 = r0.remaining()
            r5.zzi(r2)
            java.nio.ByteBuffer r2 = r5.zzb
            r2.put(r0)
        L7f:
            long r2 = r6.zzd
            r5.c = r2
            return r1
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u97.c(com.google.android.gms.internal.ads.zzgg):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzgg, com.google.android.gms.internal.ads.zzga
    public final void zzb() {
        super.zzb();
        this.d = 0;
    }
}
