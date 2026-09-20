package defpackage;

import io.ktor.http.URLDecodeException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class tt {
    public static final Set<Byte> a;
    public static final Set<Character> b;
    public static final Set<Character> c;
    public static final ArrayList d;
    public static final Set<Character> e;
    public static final ArrayList f;

    public static final class QnHx extends cx1 implements j81<Byte, sd5> {
        public final /* synthetic */ StringBuilder w;
        public final /* synthetic */ boolean x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(StringBuilder sb, boolean z) {
            super(1);
            this.w = sb;
            this.x = z;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Byte b) {
            byte bByteValue = b.byteValue();
            boolean zContains = tt.a.contains(Byte.valueOf(bByteValue));
            StringBuilder sb = this.w;
            if (zContains || tt.f.contains(Byte.valueOf(bByteValue))) {
                sb.append((char) bByteValue);
            } else if (this.x && bByteValue == ((byte) 32)) {
                sb.append('+');
            } else {
                sb.append(tt.a(bByteValue));
            }
            return sd5.a;
        }
    }

    static {
        ArrayList arrayListU0 = wu.U0(new op('0', '9'), wu.T0(new op('a', 'z'), new op('A', 'Z')));
        ArrayList arrayList = new ArrayList(mu.w0(arrayListU0, 10));
        Iterator it = arrayListU0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        a = wu.h1(arrayList);
        b = wu.h1(wu.U0(new op('0', '9'), wu.T0(new op('a', 'z'), new op('A', 'Z'))));
        c = wu.h1(wu.U0(new op('0', '9'), wu.T0(new op('a', 'f'), new op('A', 'F'))));
        Set setU = Th.u(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(mu.w0(setU, 10));
        Iterator it2 = setU.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        d = arrayList2;
        e = Th.u(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        og4.c0(b, Th.u('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        List listM = ps0.M('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(mu.w0(listM, 10));
        Iterator it3 = listM.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f = arrayList3;
    }

    public static final String a(byte b2) {
        int i = b2 & 255;
        char[] cArr = new char[3];
        boolean z = false;
        cArr[0] = '%';
        int i2 = i >> 4;
        cArr[1] = (char) (i2 >= 0 && i2 < 10 ? i2 + 48 : ((char) (i2 + 65)) - '\n');
        int i3 = i & 15;
        if (i3 >= 0 && i3 < 10) {
            z = true;
        }
        cArr[2] = (char) (z ? i3 + 48 : ((char) (i3 + 65)) - '\n');
        return new String(cArr);
    }

    public static final int b(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (!('A' <= c2 && c2 < 'G')) {
            c3 = 'a';
            if (!('a' <= c2 && c2 < 'g')) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final String c(String str, int i, int i2, boolean z, Charset charset) throws URLDecodeException {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i3, str.length()).toString() + ", in " + ((Object) str) + " at " + i3);
                            }
                            int i7 = i3 + 1;
                            int iB = b(str.charAt(i7));
                            int iB2 = b(str.charAt(i6));
                            if (iB == -1 || iB2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iB * 16) + iB2);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(new String(bArr, 0, i5, charset));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str : str.substring(i, i2);
    }

    public static String d(String str) {
        return c(str, 0, str.length(), false, up.a);
    }

    public static String e(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return c(str, i, i2, z, (i3 & 8) != 0 ? up.a : null);
    }

    public static final String f(String str, boolean z) throws Throwable {
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = up.a.newEncoder();
        int length = str.length();
        ek ekVar = new ek(null);
        try {
            ps0.B(charsetEncoderNewEncoder, ekVar, str, 0, length);
            g(ekVar.s(), new QnHx(sb, z));
            return sb.toString();
        } catch (Throwable th) {
            ekVar.close();
            throw th;
        }
    }

    public static final void g(hk hkVar, j81<? super Byte, sd5> j81Var) throws Throwable {
        boolean z = true;
        oq oqVarG = YKK.g(hkVar, 1);
        if (oqVarG == null) {
            return;
        }
        while (true) {
            try {
                int i = oqVarG.c;
                int i2 = oqVarG.b;
                if (i > i2) {
                    if (i2 == i) {
                        throw new EOFException("No readable bytes available.");
                    }
                    oqVarG.b = i2 + 1;
                    j81Var.invoke(Byte.valueOf(oqVarG.a.get(i2)));
                    if (z) {
                        YKK.b(hkVar, oqVarG);
                    }
                    throw th;
                }
                try {
                    oqVarG = YKK.h(hkVar, oqVarG);
                    if (oqVarG == null) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
