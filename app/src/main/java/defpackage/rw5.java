package defpackage;

import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzej;

/* JADX INFO: loaded from: classes3.dex */
public final class rw5 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final zzej a = new zzej(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final zzed b = new zzed();

    public static long a(zzed zzedVar) {
        int iZzc = zzedVar.zzc();
        if (zzedVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzedVar.zzB(bArr, 0, 9);
        zzedVar.zzF(iZzc);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((((long) bArr[1]) & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static final int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
