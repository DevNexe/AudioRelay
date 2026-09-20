package defpackage;

import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lu5 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(boolean z, int i, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long b(zzzg zzzgVar, boolean z, boolean z2, int i) throws EOFException, InterruptedIOException {
        long j;
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i2 == 0) {
            if (!zzzgVar.zzn(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            do {
                if (i4 >= 8) {
                    i4 = -1;
                    break;
                }
                j = d[i4] & ((long) i3);
                i4++;
            } while (j == 0);
            this.c = i4;
            if (i4 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            ((zzyv) zzzgVar).zzn(bArr, 1, i5 - 1, false);
        }
        this.b = 0;
        return a(z2, this.c, bArr);
    }
}
