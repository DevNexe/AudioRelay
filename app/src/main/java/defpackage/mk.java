package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class mk implements Serializable, Comparable<mk> {
    public static final mk z = new mk(new byte[0]);
    public final byte[] w;
    public transient int x;
    public transient String y;

    public static final class QnHx {
        public static mk a(String str) {
            int i = 0;
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(ur1.d(str, "Unexpected hex string: ").toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i2 = length - 1;
            if (i2 >= 0) {
                while (true) {
                    int i3 = i + 1;
                    int i4 = i * 2;
                    bArr[i] = (byte) (m57.c(str.charAt(i4 + 1)) + (m57.c(str.charAt(i4)) << 4));
                    if (i3 > i2) {
                        break;
                    }
                    i = i3;
                }
            }
            return new mk(bArr);
        }

        public static mk b(String str) {
            mk mkVar = new mk(kd.a(str));
            mkVar.y = str;
            return mkVar;
        }
    }

    public mk(byte[] bArr) {
        this.w = bArr;
    }

    public String a() {
        byte[] bArr = ap5.a;
        byte[] bArr2 = this.w;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr2[i];
            int i4 = i3 + 1;
            byte b2 = bArr2[i3];
            int i5 = i4 + 1;
            byte b3 = bArr2[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr[b3 & 63];
            i = i5;
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr2[i];
            byte b7 = bArr2[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i13] = bArr[(b7 & 15) << 2];
            bArr3[i13 + 1] = (byte) 61;
        }
        return new String(bArr3, up.a);
    }

    public int c() {
        return this.w.length;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(mk mkVar) {
        mk mkVar2 = mkVar;
        int iC = c();
        int iC2 = mkVar2.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iG = g(i) & 255;
            int iG2 = mkVar2.g(i) & 255;
            if (iG != iG2) {
                if (iG < iG2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        if (iC < iC2) {
            return -1;
        }
        return 1;
    }

    public String d() {
        byte[] bArr = this.w;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            int i3 = i2 + 1;
            char[] cArr2 = m57.D;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mk) {
            mk mkVar = (mk) obj;
            int iC = mkVar.c();
            byte[] bArr = this.w;
            if (iC == bArr.length && mkVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte g(int i) {
        return this.w[i];
    }

    public int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.w);
        this.x = iHashCode;
        return iHashCode;
    }

    public boolean l(int i, int i2, int i3, byte[] bArr) {
        boolean z2;
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.w;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        gg.QnHx qnHx = cp5.a;
        if (i3 <= 0) {
            z2 = true;
            break;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (bArr2[i4 + i] != bArr[i4 + i2]) {
                z2 = false;
                break;
            }
            if (i5 >= i3) {
                z2 = true;
                break;
            }
            i4 = i5;
        }
        return z2;
    }

    public boolean m(mk mkVar, int i) {
        return mkVar.l(0, 0, i, this.w);
    }

    public mk n() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.w;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new mk(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] o() {
        byte[] bArr = this.w;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String p() {
        String str = this.y;
        if (str != null) {
            return str;
        }
        String str2 = new String(e(), up.a);
        this.y = str2;
        return str2;
    }

    public void q(gg ggVar, int i) {
        ggVar.write(this.w, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:103:0x00da  */
    /* JADX WARN: Code duplicated, block: B:106:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:108:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:109:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x0166  */
    /* JADX WARN: Code duplicated, block: B:164:0x0169  */
    /* JADX WARN: Code duplicated, block: B:167:0x0170  */
    /* JADX WARN: Code duplicated, block: B:169:0x0174  */
    /* JADX WARN: Code duplicated, block: B:170:0x0176  */
    /* JADX WARN: Code duplicated, block: B:235:0x020b  */
    /* JADX WARN: Code duplicated, block: B:237:0x020e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0214  */
    /* JADX WARN: Code duplicated, block: B:242:0x0218  */
    /* JADX WARN: Code duplicated, block: B:243:0x021a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0226 A[EDGE_INSN: B:247:0x0226->B:248:0x0227 BREAK  A[LOOP:0: B:9:0x0014->B:318:0x0014]] */
    /* JADX WARN: Code duplicated, block: B:284:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0055  */
    /* JADX WARN: Code duplicated, block: B:59:0x0081  */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x008a  */
    /* JADX WARN: Code duplicated, block: B:65:0x008c  */
    public String toString() {
        int i;
        byte b;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        byte[] bArr = this.w;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        loop0: while (true) {
            if (i6 < length) {
                byte b2 = bArr[i6];
                if (b2 < 0) {
                    if ((b2 >> 5) != -2) {
                        if ((b2 >> 4) != -2) {
                            if ((b2 >> 3) != -2) {
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            int i9 = i6 + 3;
                            if (length > i9) {
                                byte b3 = bArr[i6 + 1];
                                if (!((b3 & 192) == 128)) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i8 = -1;
                                    break;
                                }
                                byte b4 = bArr[i6 + 2];
                                if (!((b4 & 192) == 128)) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i8 = -1;
                                    break;
                                }
                                byte b5 = bArr[i9];
                                if (!((b5 & 192) == 128)) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i8 = -1;
                                    break;
                                }
                                int i10 = (b2 << 18) ^ (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12));
                                if (i10 <= 1114111) {
                                    if (!(55296 <= i10 && i10 <= 57343)) {
                                        if (i10 >= 65536) {
                                            int i11 = i7 + 1;
                                            if (i7 == 64) {
                                                break;
                                            }
                                            if (i10 != 10 && i10 != 13) {
                                                if (i10 >= 0 && i10 <= 31) {
                                                    z6 = true;
                                                } else {
                                                    if (127 <= i10 && i10 <= 159) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                }
                                                if (!z6) {
                                                    if (i10 == 65533) {
                                                        if (i10 < 65536) {
                                                            i5 = 1;
                                                        } else {
                                                            i5 = 2;
                                                        }
                                                        i8 += i5;
                                                        sd5 sd5Var = sd5.a;
                                                        i6 += 4;
                                                        i7 = i11;
                                                    }
                                                }
                                            } else if (i10 == 65533) {
                                                if (i10 < 65536) {
                                                    i5 = 1;
                                                } else {
                                                    i5 = 2;
                                                }
                                                i8 += i5;
                                                sd5 sd5Var2 = sd5.a;
                                                i6 += 4;
                                                i7 = i11;
                                            }
                                            i8 = -1;
                                            break;
                                        }
                                        if (i7 == 64) {
                                            break;
                                        }
                                        i8 = -1;
                                        break;
                                    }
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i8 = -1;
                                    break;
                                }
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        int i12 = i6 + 2;
                        if (length > i12) {
                            byte b6 = bArr[i6 + 1];
                            if (!((b6 & 192) == 128)) {
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            byte b7 = bArr[i12];
                            if (!((b7 & 192) == 128)) {
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            int i13 = (b2 << 12) ^ ((b7 ^ (-123008)) ^ (b6 << 6));
                            if (i13 >= 2048) {
                                if (!(55296 <= i13 && i13 <= 57343)) {
                                    int i14 = i7 + 1;
                                    if (i7 == 64) {
                                        break;
                                    }
                                    if (i13 != 10 && i13 != 13) {
                                        if (i13 >= 0 && i13 <= 31) {
                                            z5 = true;
                                        } else {
                                            if (127 <= i13 && i13 <= 159) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                        }
                                        if (!z5) {
                                            if (i13 == 65533) {
                                                if (i13 < 65536) {
                                                    i4 = 1;
                                                } else {
                                                    i4 = 2;
                                                }
                                                i8 += i4;
                                                sd5 sd5Var3 = sd5.a;
                                                i6 += 3;
                                                i7 = i14;
                                            }
                                        }
                                    } else if (i13 == 65533) {
                                        if (i13 < 65536) {
                                            i4 = 1;
                                        } else {
                                            i4 = 2;
                                        }
                                        i8 += i4;
                                        sd5 sd5Var4 = sd5.a;
                                        i6 += 3;
                                        i7 = i14;
                                    }
                                    i8 = -1;
                                    break;
                                }
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        if (i7 == 64) {
                            break;
                        }
                        i8 = -1;
                        break;
                    }
                    int i15 = i6 + 1;
                    if (length > i15) {
                        byte b8 = bArr[i15];
                        if (!((b8 & 192) == 128)) {
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        int i16 = (b2 << 6) ^ (b8 ^ 3968);
                        if (i16 >= 128) {
                            int i17 = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if (i16 != 10 && i16 != 13) {
                                if (i16 >= 0 && i16 <= 31) {
                                    z4 = true;
                                } else {
                                    if (127 <= i16 && i16 <= 159) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                if (!z4) {
                                    if (i16 == 65533) {
                                        if (i16 < 65536) {
                                            i3 = 1;
                                        } else {
                                            i3 = 2;
                                        }
                                        i8 += i3;
                                        sd5 sd5Var5 = sd5.a;
                                        i6 += 2;
                                        i7 = i17;
                                    }
                                }
                            } else if (i16 == 65533) {
                                if (i16 < 65536) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                i8 += i3;
                                sd5 sd5Var6 = sd5.a;
                                i6 += 2;
                                i7 = i17;
                            }
                            i8 = -1;
                            break;
                        }
                        if (i7 == 64) {
                            break;
                        }
                        i8 = -1;
                        break;
                    }
                    if (i7 == 64) {
                        break;
                    }
                    i8 = -1;
                    break;
                }
                int i18 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if (b2 != 10 && b2 != 13) {
                    if (b2 >= 0 && b2 <= 31) {
                        z3 = true;
                    } else {
                        if (127 <= b2 && b2 <= 159) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (!z3) {
                        if (b2 != 65533) {
                            if (b2 < 65536) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            i8 += i;
                            i6++;
                            while (true) {
                                i7 = i18;
                                if (i6 < length) {
                                    continue;
                                }
                                i8 += i2;
                            }
                        }
                    }
                    i8 = -1;
                    break;
                }
                if (b2 != 65533) {
                    if (b2 < 65536) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    i8 += i;
                    i6++;
                    while (true) {
                        i7 = i18;
                        if (i6 < length && (b = bArr[i6]) >= 0) {
                            i6++;
                            i18 = i7 + 1;
                            if (i7 == 64) {
                                break loop0;
                            }
                            if (b != 10 && b != 13) {
                                if (b >= 0 && b <= 31) {
                                    z2 = true;
                                } else {
                                    if (127 <= b && b <= 159) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                }
                                if (!z2) {
                                    if (b == 65533) {
                                        if (b < 65536) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        i8 += i2;
                                    }
                                }
                            } else if (b == 65533) {
                                if (b < 65536) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                i8 += i2;
                            }
                        }
                    }
                }
                i8 = -1;
                break;
            }
            break;
        }
        if (i8 != -1) {
            String strP = p();
            String strV = iv4.v(iv4.v(iv4.v(strP.substring(0, i8), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i8 >= strP.length()) {
                return "[text=" + strV + ']';
            }
            return "[size=" + bArr.length + " text=" + strV + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        int iC = 64 == cp5.b ? c() : 64;
        if (!(iC <= bArr.length)) {
            throw new IllegalArgumentException(qc0.a(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (!(iC + 0 >= 0)) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        sb.append((iC == bArr.length ? this : new mk(NPO.b0(bArr, 0, iC))).d());
        sb.append("…]");
        return sb.toString();
    }
}
