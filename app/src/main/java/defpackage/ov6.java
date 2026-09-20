package defpackage;

import com.google.android.gms.internal.ads.zzgoz;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ov6 {
    public static final String a(ByteBuffer byteBuffer, int i, int i2) throws zzgoz {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!(b >= 0)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i >= i3) {
                        break;
                    }
                    byte b3 = byteBuffer.get(i);
                    if (!(b3 >= 0)) {
                        break;
                    }
                    i++;
                    i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                }
            } else {
                if (!(b2 < -32)) {
                    if (b2 < -16) {
                        if (i6 >= i3 - 1) {
                            throw zzgoz.b();
                        }
                        int i8 = i6 + 1;
                        g7.n(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw zzgoz.b();
                        }
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        g7.l(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        i5 += 2;
                        i = i10 + 1;
                    }
                } else {
                    if (i6 >= i3) {
                        throw zzgoz.b();
                    }
                    int i11 = i6 + 1;
                    int i12 = i5 + 1;
                    byte b4 = byteBuffer.get(i6);
                    if (b2 < -62 || g7.p(b4)) {
                        throw zzgoz.b();
                    }
                    cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                    i = i11;
                    i5 = i12;
                }
            }
        }
        return new String(cArr, 0, i5);
    }
}
