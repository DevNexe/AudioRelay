package com.google.protobuf;

import defpackage.GM;
import defpackage.lk;
import defpackage.y45;
import defpackage.z45;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class TextFormat {
    public static final Logger a = Logger.getLogger(TextFormat.class.getName());

    public static final class CQf {
        public final Appendable a;
        public final StringBuilder b = new StringBuilder();
        public boolean c = false;

        public CQf(StringBuilder sb) {
            this.a = sb;
        }

        public final void a() throws IOException {
            this.a.append("\n");
            this.c = true;
        }

        public final void b() {
            StringBuilder sb = this.b;
            int length = sb.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            sb.setLength(length - 2);
        }

        public final void c(String str) throws IOException {
            boolean z = this.c;
            Appendable appendable = this.a;
            if (z) {
                this.c = false;
                appendable.append(this.b);
            }
            appendable.append(str);
        }
    }

    public static class InvalidEscapeSequenceException extends IOException {
        public InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    public static class ParseException extends IOException {
    }

    public static final class QnHx {
        public static final QnHx b;
        public final wnED a;

        /* JADX INFO: renamed from: com.google.protobuf.TextFormat$QnHx$QnHx, reason: collision with other inner class name */
        public static class C0100QnHx implements Comparable<C0100QnHx> {
            public final Object w;
            public final Com1Fixed x;
            public final Descriptors.NUlFixed.CQf y;

            public C0100QnHx(Descriptors.NUlFixed nUl, Object obj) {
                if (obj instanceof Com1Fixed) {
                    this.x = (Com1Fixed) obj;
                } else {
                    this.w = obj;
                }
                this.y = nUl.n().n().get(0).C.w;
            }

            public final Object a() {
                Com1Fixed com1 = this.x;
                if (com1 != null) {
                    return com1.y;
                }
                return null;
            }

            @Override // java.lang.Comparable
            public final int compareTo(C0100QnHx c0100QnHx) {
                C0100QnHx c0100QnHx2 = c0100QnHx;
                if (a() != null && c0100QnHx2.a() != null) {
                    int iOrdinal = this.y.ordinal();
                    if (iOrdinal == 0) {
                        return Integer.valueOf(((Integer) a()).intValue()).compareTo(Integer.valueOf(((Integer) c0100QnHx2.a()).intValue()));
                    }
                    if (iOrdinal == 1) {
                        return Long.valueOf(((Long) a()).longValue()).compareTo(Long.valueOf(((Long) c0100QnHx2.a()).longValue()));
                    }
                    if (iOrdinal == 4) {
                        return Boolean.valueOf(((Boolean) a()).booleanValue()).compareTo(Boolean.valueOf(((Boolean) c0100QnHx2.a()).booleanValue()));
                    }
                    if (iOrdinal == 5) {
                        String str = (String) a();
                        String str2 = (String) c0100QnHx2.a();
                        if (str != null || str2 != null) {
                            if (str != null || str2 == null) {
                                if (str == null || str2 != null) {
                                    return str.compareTo(str2);
                                }
                                return 1;
                            }
                        }
                    }
                    return 0;
                }
                TextFormat.a.info("Invalid key for map field.");
                return -1;
            }
        }

        static {
            int i = wnED.b;
            b = new QnHx(wnED.QnHx.a);
        }

        public QnHx(wnED wned) {
            this.a = wned;
        }

        public static void c(int i, int i2, List<?> list, CQf cQf) throws IOException {
            int iZ;
            for (Object obj : list) {
                cQf.c(String.valueOf(i));
                cQf.c(": ");
                int i3 = i2 & 7;
                if (i3 == 0) {
                    cQf.c(TextFormat.e(((Long) obj).longValue()));
                } else if (i3 == 1) {
                    cQf.c(String.format(null, "0x%016x", (Long) obj));
                } else if (i3 == 2) {
                    try {
                        lk lkVar = (lk) obj;
                        k kVar = k.x;
                        k.QnHx qnHx = new k.QnHx();
                        try {
                            NUlFixed.QnHx qnHxH = lkVar.h();
                            do {
                                iZ = qnHxH.z();
                                if (iZ == 0) {
                                    break;
                                }
                            } while (qnHx.u(iZ, qnHxH));
                            qnHxH.a(0);
                            k kVarBuild = qnHx.build();
                            cQf.c("{");
                            cQf.a();
                            cQf.b.append("  ");
                            d(kVarBuild, cQf);
                            cQf.b();
                            cQf.c("}");
                        } catch (InvalidProtocolBufferException e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        cQf.c("\"");
                        Logger logger = TextFormat.a;
                        cQf.c(y45.a((lk) obj));
                        cQf.c("\"");
                    }
                } else if (i3 == 3) {
                    d((k) obj, cQf);
                } else {
                    if (i3 != 5) {
                        throw new IllegalArgumentException(GM.a("Bad tag: ", i2));
                    }
                    cQf.c(String.format(null, "0x%08x", (Integer) obj));
                }
                cQf.a();
            }
        }

        public static void d(k kVar, CQf cQf) {
            for (Map.Entry entry : ((Map) kVar.w.clone()).entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                k.CQf cQf2 = (k.CQf) entry.getValue();
                c(iIntValue, 0, cQf2.a, cQf);
                c(iIntValue, 5, cQf2.b, cQf);
                c(iIntValue, 1, cQf2.c, cQf);
                c(iIntValue, 2, cQf2.d, cQf);
                for (k kVar2 : cQf2.e) {
                    cQf.c(((Integer) entry.getKey()).toString());
                    cQf.c(" {");
                    cQf.a();
                    cQf.b.append("  ");
                    d(kVar2, cQf);
                    cQf.b();
                    cQf.c("}");
                    cQf.a();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
        public final void a(roZB rozb, CQf cQf) throws IOException {
            if (rozb.e().x.equals("google.protobuf.Any")) {
                Descriptors.QnHx qnHxE = rozb.e();
                boolean z = true;
                Descriptors.NUlFixed nUlM = qnHxE.m(1);
                Descriptors.NUlFixed nUlM2 = qnHxE.m(2);
                if (nUlM == null || nUlM.C != Descriptors.NUlFixed.F1.x || nUlM2 == null || nUlM2.C != Descriptors.NUlFixed.F1.A) {
                    z = false;
                } else {
                    String str = (String) rozb.l(nUlM);
                    if (str.isEmpty()) {
                        z = false;
                    } else {
                        Object objL = rozb.l(nUlM2);
                        try {
                            wnED wned = this.a;
                            wned.getClass();
                            String[] strArrSplit = str.split("/");
                            if (strArrSplit.length == 1) {
                                throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
                            }
                            Descriptors.QnHx qnHx = wned.a.get(strArrSplit[strArrSplit.length - 1]);
                            if (qnHx != null) {
                                FJCM.CQf cQf2 = new FJCM.CQf(FJCM.F(qnHx).y);
                                try {
                                    NUlFixed.QnHx qnHxH = ((lk) objL).h();
                                    cQf2.A(qnHxH);
                                    qnHxH.a(0);
                                    cQf.c("[");
                                    cQf.c(str);
                                    cQf.c("] {");
                                    cQf.a();
                                    cQf.b.append("  ");
                                    a(cQf2, cQf);
                                    cQf.b();
                                    cQf.c("}");
                                    cQf.a();
                                } catch (InvalidProtocolBufferException e) {
                                    throw e;
                                } catch (IOException e2) {
                                    throw new RuntimeException(cQf2.q(), e2);
                                }
                            }
                        } catch (InvalidProtocolBufferException unused) {
                        }
                        z = false;
                    }
                }
                if (z) {
                    return;
                }
            }
            for (Map.Entry<Descriptors.NUlFixed, Object> entry : rozb.o().entrySet()) {
                Descriptors.NUlFixed key = entry.getKey();
                Object value = entry.getValue();
                if (key.p()) {
                    ArrayList<C0100QnHx> arrayList = new ArrayList();
                    Iterator it = ((List) value).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C0100QnHx(key, it.next()));
                    }
                    Collections.sort(arrayList);
                    for (C0100QnHx c0100QnHx : arrayList) {
                        Object obj = c0100QnHx.x;
                        if (obj == null) {
                            obj = c0100QnHx.w;
                        }
                        b(key, obj, cQf);
                    }
                } else if (key.f()) {
                    Iterator it2 = ((List) value).iterator();
                    while (it2.hasNext()) {
                        b(key, it2.next(), cQf);
                    }
                } else {
                    b(key, value, cQf);
                }
            }
            d(rozb.k(), cQf);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004d  */
        public final void b(Descriptors.NUlFixed nUl, Object obj, CQf cQf) throws IOException {
            if (nUl.o()) {
                cQf.c("[");
                boolean z = nUl.D.q().B;
                String str = nUl.y;
                if (!z || nUl.C != Descriptors.NUlFixed.F1.z || !nUl.q()) {
                    cQf.c(str);
                } else {
                    if (!nUl.o()) {
                        throw new UnsupportedOperationException(String.format("This field is not an extension. (%s)", str));
                    }
                    if (nUl.A == nUl.n()) {
                        cQf.c(nUl.n().x);
                    } else {
                        cQf.c(str);
                    }
                }
                cQf.c("]");
            } else if (nUl.C == Descriptors.NUlFixed.F1.y) {
                cQf.c(nUl.n().d());
            } else {
                cQf.c(nUl.d());
            }
            Descriptors.NUlFixed.CQf cQf2 = nUl.C.w;
            Descriptors.NUlFixed.CQf cQf3 = Descriptors.NUlFixed.CQf.F;
            if (cQf2 == cQf3) {
                cQf.c(" {");
                cQf.a();
                cQf.b.append("  ");
            } else {
                cQf.c(": ");
            }
            switch (nUl.C.ordinal()) {
                case 0:
                    cQf.c(((Double) obj).toString());
                    break;
                case 1:
                    cQf.c(((Float) obj).toString());
                    break;
                case 2:
                case 15:
                case 17:
                    cQf.c(((Long) obj).toString());
                    break;
                case 3:
                case 5:
                    cQf.c(TextFormat.e(((Long) obj).longValue()));
                    break;
                case 4:
                case 14:
                case 16:
                    cQf.c(((Integer) obj).toString());
                    break;
                case 6:
                case 12:
                    int iIntValue = ((Integer) obj).intValue();
                    Logger logger = TextFormat.a;
                    cQf.c(iIntValue >= 0 ? Integer.toString(iIntValue) : Long.toString(((long) iIntValue) & 4294967295L));
                    break;
                case 7:
                    cQf.c(((Boolean) obj).toString());
                    break;
                case 8:
                    cQf.c("\"");
                    lk.YKK ykk = lk.x;
                    cQf.c(y45.a(new lk.YKK(((String) obj).getBytes(SjP.a))));
                    cQf.c("\"");
                    break;
                case 9:
                case 10:
                    a((roZB) obj, cQf);
                    break;
                case 11:
                    cQf.c("\"");
                    if (obj instanceof lk) {
                        Logger logger2 = TextFormat.a;
                        cQf.c(y45.a((lk) obj));
                    } else {
                        Logger logger3 = TextFormat.a;
                        cQf.c(y45.b(new z45((byte[]) obj)));
                    }
                    cQf.c("\"");
                    break;
                case 13:
                    cQf.c(((Descriptors.LPt8Fixed) obj).d());
                    break;
            }
            if (nUl.C.w == cQf3) {
                cQf.b();
                cQf.c("}");
            }
            cQf.a();
        }
    }

    public static class UnknownFieldParseException extends ParseException {
    }

    static {
        int i = wnED.b;
        wnED wned = wnED.QnHx.a;
    }

    public static int a(byte b) {
        if (48 > b || b > 57) {
            return ((97 > b || b > 122) ? b - 65 : b - 97) + 10;
        }
        return b - 48;
    }

    public static boolean b(byte b) {
        return (48 <= b && b <= 57) || (97 <= b && b <= 102) || (65 <= b && b <= 70);
    }

    public static long c(String str, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2 = 0;
        if (!str.startsWith("-", 0)) {
            z3 = false;
        } else {
            if (!z) {
                throw new NumberFormatException("Number must be positive: ".concat(str));
            }
            i2 = 1;
            z3 = true;
        }
        if (str.startsWith("0x", i2)) {
            i2 += 2;
            i = 16;
        } else {
            i = str.startsWith("0", i2) ? 8 : 10;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.length() < 16) {
            long j = Long.parseLong(strSubstring, i);
            if (z3) {
                j = -j;
            }
            if (z2) {
                return j;
            }
            if (z) {
                if (j > 2147483647L || j < -2147483648L) {
                    throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
                }
                return j;
            }
            if (j >= 4294967296L || j < 0) {
                throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
            }
            return j;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i);
        if (z3) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: ".concat(str));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: ".concat(str));
            }
        } else if (z) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
        }
        return bigInteger.longValue();
    }

    public static lk.YKK d(String str) throws InvalidEscapeSequenceException {
        int i;
        int i2;
        int i3;
        int length;
        String string = str.toString();
        lk.YKK ykk = lk.x;
        lk.YKK ykk2 = new lk.YKK(string.getBytes(SjP.a));
        byte[] bArr = ykk2.z;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            byte b = bArr[i4];
            if (b == 92) {
                i4++;
                if (i4 >= bArr.length) {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
                byte b2 = bArr[i4];
                if (48 <= b2 && b2 <= 55) {
                    int iA = a(b2);
                    int i6 = i4 + 1;
                    if (i6 < bArr.length) {
                        byte b3 = bArr[i6];
                        if (48 <= b3 && b3 <= 55) {
                            iA = (iA * 8) + a(b3);
                            i4 = i6;
                        }
                    }
                    int i7 = i4 + 1;
                    if (i7 < bArr.length) {
                        byte b4 = bArr[i7];
                        if (48 <= b4 && b4 <= 55) {
                            iA = (iA * 8) + a(b4);
                            i4 = i7;
                        }
                    }
                    i = i5 + 1;
                    bArr2[i5] = (byte) iA;
                } else {
                    if (b2 == 34) {
                        i2 = i5 + 1;
                        bArr2[i5] = 34;
                    } else if (b2 == 39) {
                        i2 = i5 + 1;
                        bArr2[i5] = 39;
                    } else if (b2 != 63) {
                        if (b2 == 85) {
                            int i8 = i4 + 1;
                            i3 = i8 + 7;
                            if (i3 >= bArr.length) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int i9 = i8;
                            int iA2 = 0;
                            while (true) {
                                int i10 = i8 + 8;
                                if (i9 < i10) {
                                    byte b5 = bArr[i9];
                                    if (!b(b5)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iA2 = (iA2 << 4) | a(b5);
                                    i9++;
                                } else {
                                    if (!Character.isValidCodePoint(iA2)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + ykk2.p(i8, i10).s() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iA2);
                                    if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + ykk2.p(i8, i10).s() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iA2}, 0, 1).getBytes(SjP.a);
                                    System.arraycopy(bytes, 0, bArr2, i5, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (b2 == 92) {
                            i2 = i5 + 1;
                            bArr2[i5] = 92;
                        } else if (b2 == 102) {
                            i2 = i5 + 1;
                            bArr2[i5] = 12;
                        } else if (b2 == 110) {
                            i2 = i5 + 1;
                            bArr2[i5] = 10;
                        } else if (b2 == 114) {
                            i2 = i5 + 1;
                            bArr2[i5] = 13;
                        } else if (b2 == 120) {
                            i4++;
                            if (i4 >= bArr.length || !b(bArr[i4])) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iA3 = a(bArr[i4]);
                            int i11 = i4 + 1;
                            if (i11 < bArr.length && b(bArr[i11])) {
                                iA3 = (iA3 * 16) + a(bArr[i11]);
                                i4 = i11;
                            }
                            i = i5 + 1;
                            bArr2[i5] = (byte) iA3;
                        } else if (b2 == 97) {
                            i2 = i5 + 1;
                            bArr2[i5] = 7;
                        } else if (b2 != 98) {
                            switch (b2) {
                                case 116:
                                    i2 = i5 + 1;
                                    bArr2[i5] = 9;
                                    break;
                                case 117:
                                    int i12 = i4 + 1;
                                    i3 = i12 + 3;
                                    if (i3 < bArr.length && b(bArr[i12])) {
                                        int i13 = i12 + 1;
                                        if (b(bArr[i13])) {
                                            int i14 = i12 + 2;
                                            if (b(bArr[i14]) && b(bArr[i3])) {
                                                char cA = (char) ((a(bArr[i12]) << 12) | (a(bArr[i13]) << 8) | (a(bArr[i14]) << 4) | a(bArr[i3]));
                                                if (cA >= 55296 && cA <= 57343) {
                                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(cA).getBytes(SjP.a);
                                                System.arraycopy(bytes2, 0, bArr2, i5, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i2 = i5 + 1;
                                    bArr2[i5] = 11;
                                    break;
                                default:
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) b2) + '\'');
                            }
                        } else {
                            i2 = i5 + 1;
                            bArr2[i5] = 8;
                        }
                        i5 += length;
                        i4 = i3;
                        i4++;
                    } else {
                        i2 = i5 + 1;
                        bArr2[i5] = 63;
                    }
                    i5 = i2;
                    i4++;
                }
            } else {
                i = i5 + 1;
                bArr2[i5] = b;
            }
            i5 = i;
            i4++;
        }
        return length2 == i5 ? new lk.YKK(bArr2) : lk.d(bArr2, 0, i5);
    }

    public static String e(long j) {
        return j >= 0 ? Long.toString(j) : BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }
}
