package defpackage;

import com.google.android.gms.internal.ads.zzgoz;

/* JADX INFO: loaded from: classes3.dex */
public final class pv6 extends ov6 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r15[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r15[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        if (r15[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r12, int r13, int r14, byte[] r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv6.b(int, int, int, byte[]):int");
    }

    public final String c(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!(b >= 0)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i >= i3) {
                        break;
                    }
                    byte b3 = bArr[i];
                    if (!(b3 >= 0)) {
                        break;
                    }
                    i++;
                    i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                }
            } else {
                if (!(b2 < -32)) {
                    if (b2 < -16) {
                        if (i5 >= i3 - 1) {
                            throw zzgoz.b();
                        }
                        int i7 = i5 + 1;
                        g7.n(b2, bArr[i5], bArr[i7], cArr, i4);
                        i = i7 + 1;
                        i4++;
                    } else {
                        if (i5 >= i3 - 2) {
                            throw zzgoz.b();
                        }
                        int i8 = i5 + 1;
                        int i9 = i8 + 1;
                        g7.l(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                        i4 += 2;
                        i = i9 + 1;
                    }
                } else {
                    if (i5 >= i3) {
                        throw zzgoz.b();
                    }
                    int i10 = i5 + 1;
                    int i11 = i4 + 1;
                    byte b4 = bArr[i5];
                    if (b2 < -62 || g7.p(b4)) {
                        throw zzgoz.b();
                    }
                    cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                    i = i10;
                    i4 = i11;
                }
            }
        }
        return new String(cArr, 0, i4);
    }
}
