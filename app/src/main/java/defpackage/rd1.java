package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rd1 {
    public static final cc1[] a;
    public static final Map<mk, Integer> b;

    public static final class CQf {
        public final gg b;
        public boolean d;
        public int h;
        public int i;
        public final boolean a = true;
        public int c = Integer.MAX_VALUE;
        public int e = 4096;
        public cc1[] f = new cc1[8];
        public int g = 7;

        public CQf(gg ggVar) {
            this.b = ggVar;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.f.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.g;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f[length].c;
                    i -= i4;
                    this.i -= i4;
                    this.h--;
                    i3++;
                    length--;
                }
                cc1[] cc1VarArr = this.f;
                int i5 = i2 + 1;
                System.arraycopy(cc1VarArr, i5, cc1VarArr, i5 + i3, this.h);
                cc1[] cc1VarArr2 = this.f;
                int i6 = this.g + 1;
                Arrays.fill(cc1VarArr2, i6, i6 + i3, (Object) null);
                this.g += i3;
            }
        }

        public final void b(cc1 cc1Var) {
            int i = this.e;
            int i2 = cc1Var.c;
            if (i2 > i) {
                NPO.d0(this.f, null);
                this.g = this.f.length - 1;
                this.h = 0;
                this.i = 0;
                return;
            }
            a((this.i + i2) - i);
            int i3 = this.h + 1;
            cc1[] cc1VarArr = this.f;
            if (i3 > cc1VarArr.length) {
                cc1[] cc1VarArr2 = new cc1[cc1VarArr.length * 2];
                System.arraycopy(cc1VarArr, 0, cc1VarArr2, cc1VarArr.length, cc1VarArr.length);
                this.g = this.f.length - 1;
                this.f = cc1VarArr2;
            }
            int i4 = this.g;
            this.g = i4 - 1;
            this.f[i4] = cc1Var;
            this.h++;
            this.i += i2;
        }

        public final void c(mk mkVar) {
            boolean z = this.a;
            gg ggVar = this.b;
            int i = 0;
            if (z) {
                int[] iArr = dh1.a;
                int iC = mkVar.c();
                long j = 0;
                int i2 = 0;
                while (i2 < iC) {
                    int i3 = i2 + 1;
                    byte bG = mkVar.g(i2);
                    byte[] bArr = qf5.a;
                    j += (long) dh1.b[bG & 255];
                    i2 = i3;
                }
                if (((int) ((j + ((long) 7)) >> 3)) < mkVar.c()) {
                    gg ggVar2 = new gg();
                    int[] iArr2 = dh1.a;
                    int iC2 = mkVar.c();
                    long j2 = 0;
                    int i4 = 0;
                    while (i < iC2) {
                        int i5 = i + 1;
                        byte bG2 = mkVar.g(i);
                        byte[] bArr2 = qf5.a;
                        int i6 = bG2 & 255;
                        int i7 = dh1.a[i6];
                        byte b = dh1.b[i6];
                        j2 = (j2 << b) | ((long) i7);
                        i4 += b;
                        while (i4 >= 8) {
                            i4 -= 8;
                            ggVar2.L((int) (j2 >> i4));
                        }
                        i = i5;
                    }
                    if (i4 > 0) {
                        ggVar2.L((int) ((255 >>> i4) | (j2 << (8 - i4))));
                    }
                    mk mkVarO = ggVar2.o();
                    e(mkVarO.c(), 127, 128);
                    ggVar.getClass();
                    mkVarO.q(ggVar, mkVarO.c());
                    return;
                }
            }
            e(mkVar.c(), 127, 0);
            ggVar.getClass();
            mkVar.q(ggVar, mkVar.c());
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0072  */
        public final void d(ArrayList arrayList) {
            int length;
            int length2;
            if (this.d) {
                int i = this.c;
                if (i < this.e) {
                    e(i, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                e(this.e, 31, 32);
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                cc1 cc1Var = (cc1) arrayList.get(i2);
                mk mkVarN = cc1Var.a.n();
                Integer num = rd1.b.get(mkVarN);
                mk mkVar = cc1Var.b;
                if (num != null) {
                    length = num.intValue() + 1;
                    if (2 <= length && length < 8) {
                        cc1[] cc1VarArr = rd1.a;
                        if (ur1.a(cc1VarArr[length - 1].b, mkVar)) {
                            length2 = length;
                        } else if (ur1.a(cc1VarArr[length].b, mkVar)) {
                            length2 = length;
                            length++;
                        } else {
                            length2 = length;
                            length = -1;
                        }
                    } else {
                        length2 = length;
                        length = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int i4 = this.g + 1;
                    int length3 = this.f.length;
                    while (i4 < length3) {
                        int i5 = i4 + 1;
                        if (ur1.a(this.f[i4].a, mkVarN)) {
                            if (ur1.a(this.f[i4].b, mkVar)) {
                                length = rd1.a.length + (i4 - this.g);
                                break;
                            } else if (length2 == -1) {
                                length2 = rd1.a.length + (i4 - this.g);
                            }
                        }
                        i4 = i5;
                    }
                }
                if (length != -1) {
                    e(length, 127, 128);
                } else if (length2 == -1) {
                    this.b.L(64);
                    c(mkVarN);
                    c(mkVar);
                    b(cc1Var);
                } else {
                    mk mkVar2 = cc1.d;
                    mkVarN.getClass();
                    if (!mkVarN.m(mkVar2, mkVar2.c()) || ur1.a(cc1.i, mkVarN)) {
                        e(length2, 63, 64);
                        c(mkVar);
                        b(cc1Var);
                    } else {
                        e(length2, 15, 0);
                        c(mkVar);
                    }
                }
                i2 = i3;
            }
        }

        public final void e(int i, int i2, int i3) {
            gg ggVar = this.b;
            if (i < i2) {
                ggVar.L(i | i3);
                return;
            }
            ggVar.L(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                ggVar.L(128 | (i4 & 127));
                i4 >>>= 7;
            }
            ggVar.L(i4);
        }
    }

    public static final class QnHx {
        public final aj3 c;
        public int f;
        public int g;
        public int a = 4096;
        public final ArrayList b = new ArrayList();
        public cc1[] d = new cc1[8];
        public int e = 7;

        public QnHx(je1.CQf cQf) {
            this.c = new aj3(cQf);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.d[length].c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                cc1[] cc1VarArr = this.d;
                System.arraycopy(cc1VarArr, i2 + 1, cc1VarArr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final mk b(int i) throws IOException {
            if (i >= 0 && i <= rd1.a.length - 1) {
                return rd1.a[i].a;
            }
            int length = this.e + 1 + (i - rd1.a.length);
            if (length >= 0) {
                cc1[] cc1VarArr = this.d;
                if (length < cc1VarArr.length) {
                    return cc1VarArr[length].a;
                }
            }
            throw new IOException(ur1.d(Integer.valueOf(i + 1), "Header index too large "));
        }

        public final void c(cc1 cc1Var) {
            this.b.add(cc1Var);
            int i = this.a;
            int i2 = cc1Var.c;
            if (i2 > i) {
                NPO.d0(this.d, null);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i2) - i);
            int i3 = this.f + 1;
            cc1[] cc1VarArr = this.d;
            if (i3 > cc1VarArr.length) {
                cc1[] cc1VarArr2 = new cc1[cc1VarArr.length * 2];
                System.arraycopy(cc1VarArr, 0, cc1VarArr2, cc1VarArr.length, cc1VarArr.length);
                this.e = this.d.length - 1;
                this.d = cc1VarArr2;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = cc1Var;
            this.f++;
            this.g += i2;
        }

        public final mk d() {
            int i;
            aj3 aj3Var = this.c;
            byte b = aj3Var.readByte();
            byte[] bArr = qf5.a;
            int i2 = b & 255;
            int i3 = 0;
            boolean z = (i2 & 128) == 128;
            long jE = e(i2, 127);
            if (!z) {
                return aj3Var.u(jE);
            }
            gg ggVar = new gg();
            dh1.QnHx qnHx = dh1.c;
            long j = 0;
            dh1.QnHx qnHx2 = qnHx;
            int i4 = 0;
            while (j < jE) {
                j++;
                byte b2 = aj3Var.readByte();
                byte[] bArr2 = qf5.a;
                i3 = (i3 << 8) | (b2 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    qnHx2 = qnHx2.a[(i3 >>> i5) & 255];
                    if (qnHx2.a == null) {
                        ggVar.L(qnHx2.b);
                        i4 -= qnHx2.c;
                        qnHx2 = qnHx;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                dh1.QnHx qnHx3 = qnHx2.a[(i3 << (8 - i4)) & 255];
                if (qnHx3.a != null || (i = qnHx3.c) > i4) {
                    break;
                }
                ggVar.L(qnHx3.b);
                i4 -= i;
                qnHx2 = qnHx;
            }
            return ggVar.o();
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.c.readByte();
                byte[] bArr = qf5.a;
                int i5 = b & 255;
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    static {
        cc1 cc1Var = new cc1(cc1.i, "");
        int i = 0;
        mk mkVar = cc1.f;
        mk mkVar2 = cc1.g;
        mk mkVar3 = cc1.h;
        mk mkVar4 = cc1.e;
        cc1[] cc1VarArr = {cc1Var, new cc1(mkVar, "GET"), new cc1(mkVar, "POST"), new cc1(mkVar2, "/"), new cc1(mkVar2, "/index.html"), new cc1(mkVar3, "http"), new cc1(mkVar3, "https"), new cc1(mkVar4, "200"), new cc1(mkVar4, "204"), new cc1(mkVar4, "206"), new cc1(mkVar4, "304"), new cc1(mkVar4, "400"), new cc1(mkVar4, "404"), new cc1(mkVar4, "500"), new cc1("accept-charset", ""), new cc1("accept-encoding", "gzip, deflate"), new cc1("accept-language", ""), new cc1("accept-ranges", ""), new cc1("accept", ""), new cc1("access-control-allow-origin", ""), new cc1("age", ""), new cc1("allow", ""), new cc1("authorization", ""), new cc1("cache-control", ""), new cc1("content-disposition", ""), new cc1("content-encoding", ""), new cc1("content-language", ""), new cc1("content-length", ""), new cc1("content-location", ""), new cc1("content-range", ""), new cc1("content-type", ""), new cc1("cookie", ""), new cc1("date", ""), new cc1("etag", ""), new cc1("expect", ""), new cc1("expires", ""), new cc1("from", ""), new cc1("host", ""), new cc1("if-match", ""), new cc1("if-modified-since", ""), new cc1("if-none-match", ""), new cc1("if-range", ""), new cc1("if-unmodified-since", ""), new cc1("last-modified", ""), new cc1("link", ""), new cc1("location", ""), new cc1("max-forwards", ""), new cc1("proxy-authenticate", ""), new cc1("proxy-authorization", ""), new cc1("range", ""), new cc1("referer", ""), new cc1("refresh", ""), new cc1("retry-after", ""), new cc1("server", ""), new cc1("set-cookie", ""), new cc1("strict-transport-security", ""), new cc1("transfer-encoding", ""), new cc1("user-agent", ""), new cc1("vary", ""), new cc1("via", ""), new cc1("www-authenticate", "")};
        a = cc1VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i < 61) {
            int i2 = i + 1;
            if (!linkedHashMap.containsKey(cc1VarArr[i].a)) {
                linkedHashMap.put(cc1VarArr[i].a, Integer.valueOf(i));
            }
            i = i2;
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(mk mkVar) {
        int iC = mkVar.c();
        int i = 0;
        while (i < iC) {
            int i2 = i + 1;
            byte bG = mkVar.g(i);
            if (65 <= bG && bG <= 90) {
                throw new IOException(ur1.d(mkVar.p(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i = i2;
        }
    }
}
