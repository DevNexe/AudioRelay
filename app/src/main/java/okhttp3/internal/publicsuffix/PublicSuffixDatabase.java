package okhttp3.internal.publicsuffix;

import defpackage.Th;
import defpackage.aj3;
import defpackage.aq0;
import defpackage.bq0;
import defpackage.cs0;
import defpackage.db1;
import defpackage.ddf;
import defpackage.eu2;
import defpackage.ex0;
import defpackage.mv4;
import defpackage.qf5;
import defpackage.sd5;
import defpackage.so1;
import defpackage.ur1;
import defpackage.uu;
import defpackage.wu;
import defpackage.x43;
import defpackage.x94;
import defpackage.z75;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e;
    public static final List<String> f;
    public static final PublicSuffixDatabase g;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static final class QnHx {
        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            byte[] bArr3 = PublicSuffixDatabase.e;
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i10][i11];
                        byte[] bArr4 = qf5.a;
                        int i13 = b & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte b2 = bArr[i7 + i12];
                    byte[] bArr5 = qf5.a;
                    i4 = i3 - (b2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int length2 = bArr2[i10].length - i11;
                        int length3 = bArr2.length;
                        for (int i15 = i10 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                length = i7 - 1;
            }
            return null;
        }
    }

    static {
        new QnHx();
        e = new byte[]{42};
        f = Collections.singletonList("*");
        g = new PublicSuffixDatabase();
    }

    public static List c(String str) {
        List listP = mv4.P(str, new char[]{'.'});
        return ur1.a(wu.N0(listP), "") ? wu.E0(listP) : listP;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List<String> listP;
        int size;
        int size2;
        List listC = c(IDN.toUnicode(str));
        int i = 0;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            b();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z = true;
                        }
                    } catch (IOException e2) {
                        x43 x43Var = x43.a;
                        x43.a.getClass();
                        x43.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (!(this.c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            bArr[i2] = ((String) listC.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strA = null;
                break;
            }
            int i4 = i3 + 1;
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                ur1.e("publicSuffixListBytes");
                throw null;
            }
            strA = QnHx.a(bArr2, bArr, i3);
            if (strA != null) {
                break;
            }
            i3 = i4;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                strA2 = null;
                break;
            }
            int i6 = i5 + 1;
            bArr3[i5] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                ur1.e("publicSuffixListBytes");
                throw null;
            }
            strA2 = QnHx.a(bArr4, bArr3, i5);
            if (strA2 != null) {
                break;
            }
            i5 = i6;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i7 = size3 - 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                strA3 = null;
                break;
            }
            int i9 = i8 + 1;
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                ur1.e("publicSuffixExceptionListBytes");
                throw null;
            }
            strA3 = QnHx.a(bArr5, bArr, i8);
            if (strA3 != null) {
                break;
            }
            i8 = i9;
        }
        if (strA3 != null) {
            listP = mv4.P(ur1.d(strA3, "!"), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listP = f;
        } else {
            List<String> listP2 = strA == null ? null : mv4.P(strA, new char[]{'.'});
            cs0 cs0Var = cs0.w;
            if (listP2 == null) {
                listP2 = cs0Var;
            }
            listP = strA2 == null ? null : mv4.P(strA2, new char[]{'.'});
            if (listP == null) {
                listP = cs0Var;
            }
            if (listP2.size() > listP.size()) {
                listP = listP2;
            }
        }
        if (listC.size() == listP.size() && listP.get(0).charAt(0) != '!') {
            return null;
        }
        if (listP.get(0).charAt(0) == '!') {
            size = listC.size();
            size2 = listP.size();
        } else {
            size = listC.size();
            size2 = listP.size() + 1;
        }
        int i10 = size - size2;
        x94 uuVar = new uu(c(str));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(ex0.b("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 != 0) {
            uuVar = uuVar instanceof bq0 ? ((bq0) uuVar).a(i10) : new aq0(uuVar, i10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : uuVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            ddf.e(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = eu2.a;
        aj3 aj3Var = new aj3(new db1(new so1(resourceAsStream, new z75())));
        try {
            long j = aj3Var.readInt();
            aj3Var.v0(j);
            byte[] bArrN = aj3Var.x.n(j);
            long j2 = aj3Var.readInt();
            aj3Var.v0(j2);
            byte[] bArrN2 = aj3Var.x.n(j2);
            sd5 sd5Var = sd5.a;
            Th.d(aj3Var, null);
            synchronized (this) {
                this.c = bArrN;
                this.d = bArrN2;
            }
            this.b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Th.d(aj3Var, th);
                throw th2;
            }
        }
    }
}
