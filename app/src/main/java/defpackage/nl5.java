package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nl5 extends rs {
    public final pc1 a;

    public nl5() throws Throwable {
        boolean z;
        String strQ;
        int i;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        char[] cArr = uc0.a;
        ek ekVar = new ek(null);
        while (true) {
            try {
                z = false;
                if (ekVar.j() >= 16) {
                    break;
                }
                String str = (String) ap.b(fp2.b.r());
                if (str == null) {
                    fp2.c.start();
                    str = (String) fp1.s0(xr0.w, new tc0(null));
                }
                ac.o(ekVar, str, 0, str.length(), up.a);
            } catch (Throwable th) {
                ekVar.close();
                throw th;
            }
        }
        hk hkVarS = ekVar.s();
        byte[] bArr = new byte[16];
        oq oqVarG = YKK.g(hkVarS, 1);
        int i2 = 16;
        if (oqVarG != null) {
            int i3 = 0;
            while (true) {
                try {
                    int iMin = Math.min(i2, oqVarG.c - oqVarG.b);
                    ac.i(oqVarG, bArr, i3, iMin);
                    i2 -= iMin;
                    i3 += iMin;
                    if (!(i2 > 0)) {
                        z2 = true;
                        break;
                    }
                    try {
                        oq oqVarH = YKK.h(hkVarS, oqVarG);
                        if (oqVarH == null) {
                            z2 = false;
                            break;
                        }
                        oqVarG = oqVarH;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z) {
                            YKK.b(hkVarS, oqVarG);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                }
            }
            if (z2) {
                YKK.b(hkVarS, oqVarG);
            }
        }
        if (i2 > 0) {
            ac.g(i2);
            throw null;
        }
        int i4 = l8.a;
        int i5 = 3;
        char[] cArr2 = new char[qa0.a(bArr.length, 8, 6, 3)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i6 + 3;
            if (i8 > bArr.length) {
                break;
            }
            int i9 = (bArr[i6 + 2] & 255) | ((bArr[i6] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8);
            int i10 = 3;
            while (-1 < i10) {
                cArr2[i7] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i9 >> (i10 * 6)) & 63);
                i10--;
                i7++;
            }
            i6 = i8;
        }
        int length = bArr.length - i6;
        if (length == 0) {
            strQ = iv4.q(cArr2, 0, i7);
        } else {
            int i11 = (length == 1 ? ((bArr[i6] & 255) << 16) | 0 : ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16)) | 0;
            int i12 = ((3 - length) * 8) / 6;
            if (i12 <= 3) {
                while (true) {
                    i = i7 + 1;
                    cArr2[i7] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i11 >> (i5 * 6)) & 63);
                    if (i5 == i12) {
                        break;
                    }
                    i5--;
                    i7 = i;
                }
                i7 = i;
            }
            int i13 = 0;
            while (i13 < i12) {
                cArr2[i7] = '=';
                i13++;
                i7++;
            }
            strQ = iv4.q(cArr2, 0, i7);
        }
        sb.append(strQ);
        String string = sb.toString();
        oc1 oc1Var = new oc1(0);
        List<String> list = rf1.a;
        oc1Var.e("Upgrade", "websocket");
        oc1Var.e("Connection", "upgrade");
        oc1Var.e("Sec-WebSocket-Key", string);
        oc1Var.e("Sec-WebSocket-Version", "13");
        this.a = new pc1(oc1Var.b);
    }

    @Override // defpackage.dw2
    public final mc1 c() {
        return this.a;
    }

    public final String toString() {
        return "WebSocketContent";
    }
}
