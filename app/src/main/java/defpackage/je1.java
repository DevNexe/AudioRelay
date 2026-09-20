package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class je1 implements Closeable {
    public static final Logger A = Logger.getLogger(wd1.class.getName());
    public final yh w;
    public final boolean x;
    public final CQf y;
    public final rd1.QnHx z;

    public static final class CQf implements nq4 {
        public int A;
        public int B;
        public final yh w;
        public int x;
        public int y;
        public int z;

        public CQf(yh yhVar) {
            this.w = yhVar;
        }

        @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() {
        }

        @Override // defpackage.nq4
        public final z75 d() {
            return this.w.d();
        }

        @Override // defpackage.nq4
        public final long p(gg ggVar, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.A;
                yh yhVar = this.w;
                if (i3 != 0) {
                    long jP = yhVar.p(ggVar, Math.min(j, i3));
                    if (jP == -1) {
                        return -1L;
                    }
                    this.A -= (int) jP;
                    return jP;
                }
                yhVar.skip(this.B);
                this.B = 0;
                if ((this.y & 4) != 0) {
                    return -1L;
                }
                i = this.z;
                byte[] bArr = qf5.a;
                int i4 = ((yhVar.readByte() & 255) << 16) | ((yhVar.readByte() & 255) << 8) | (yhVar.readByte() & 255);
                this.A = i4;
                this.x = i4;
                int i5 = yhVar.readByte() & 255;
                this.y = yhVar.readByte() & 255;
                Logger logger = je1.A;
                if (logger.isLoggable(Level.FINE)) {
                    wd1 wd1Var = wd1.a;
                    int i6 = this.z;
                    int i7 = this.x;
                    int i8 = this.y;
                    wd1Var.getClass();
                    logger.fine(wd1.a(true, i6, i7, i5, i8));
                }
                i2 = yhVar.readInt() & Integer.MAX_VALUE;
                this.z = i2;
                if (i5 != 9) {
                    throw new IOException(i5 + " != TYPE_CONTINUATION");
                }
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    public interface F1 {
        void a(int i, List list);

        void b();

        void c(rg4 rg4Var);

        void d(int i, rt0 rt0Var);

        void e(int i, long j);

        void f(int i, int i2, boolean z);

        void g(int i, mk mkVar);

        void h(int i, int i2, yh yhVar, boolean z);

        void i();

        void j(int i, List list, boolean z);
    }

    public static final class QnHx {
        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(Md5A.e("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        }
    }

    public je1(yh yhVar, boolean z) {
        this.w = yhVar;
        this.x = z;
        CQf cQf = new CQf(yhVar);
        this.y = cQf;
        this.z = new rd1.QnHx(cQf);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0235  */
    /* JADX WARN: Code duplicated, block: B:128:0x023a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    public final boolean b(boolean z, F1 f1) throws IOException {
        mk mkVarU;
        yh yhVar = this.w;
        try {
            yhVar.v0(9L);
            byte[] bArr = qf5.a;
            int i = ((yhVar.readByte() & 255) << 16) | ((yhVar.readByte() & 255) << 8) | (yhVar.readByte() & 255);
            if (i > 16384) {
                throw new IOException(ur1.d(Integer.valueOf(i), "FRAME_SIZE_ERROR: "));
            }
            int i2 = yhVar.readByte() & 255;
            int i3 = yhVar.readByte() & 255;
            int i4 = yhVar.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = A;
            if (logger.isLoggable(level)) {
                wd1.a.getClass();
                logger.fine(wd1.a(true, i4, i, i2, i3));
            }
            if (z && i2 != 4) {
                wd1.a.getClass();
                String[] strArr = wd1.c;
                throw new IOException(ur1.d(i2 < strArr.length ? strArr[i2] : qf5.i("0x%02x", Integer.valueOf(i2)), "Expected a SETTINGS frame but was "));
            }
            rt0 rt0Var = null;
            switch (i2) {
                case 0:
                    if (i4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (i3 & 1) != 0;
                    if ((i3 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i5 = (i3 & 8) != 0 ? yhVar.readByte() & 255 : 0;
                    f1.h(i4, QnHx.a(i, i3, i5), yhVar, z2);
                    yhVar.skip(i5);
                    return true;
                case 1:
                    if (i4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (i3 & 1) != 0;
                    int i6 = (i3 & 8) != 0 ? yhVar.readByte() & 255 : 0;
                    if ((i3 & 32) != 0) {
                        f(f1, i4);
                        i -= 5;
                    }
                    f1.j(i4, e(QnHx.a(i, i3, i6), i6, i3, i4), z3);
                    return true;
                case 2:
                    if (i != 5) {
                        throw new IOException(ex0.b("TYPE_PRIORITY length: ", i, " != 5"));
                    }
                    if (i4 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    f(f1, i4);
                    return true;
                case 3:
                    if (i != 4) {
                        throw new IOException(ex0.b("TYPE_RST_STREAM length: ", i, " != 4"));
                    }
                    if (i4 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i7 = yhVar.readInt();
                    for (rt0 rt0Var2 : rt0.values()) {
                        if (rt0Var2.w == i7) {
                            rt0Var = rt0Var2;
                            if (rt0Var != null) {
                                throw new IOException(ur1.d(Integer.valueOf(i7), "TYPE_RST_STREAM unexpected error code: "));
                            }
                            f1.d(i4, rt0Var);
                            return true;
                        }
                    }
                    if (rt0Var != null) {
                        throw new IOException(ur1.d(Integer.valueOf(i7), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    f1.d(i4, rt0Var);
                    return true;
                case 4:
                    if (i4 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i3 & 1) != 0) {
                        if (i != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        f1.b();
                    } else {
                        if (i % 6 != 0) {
                            throw new IOException(ur1.d(Integer.valueOf(i), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        rg4 rg4Var = new rg4();
                        np1 np1VarM = AY.M(AY.V(0, i), 6);
                        int i8 = np1VarM.w;
                        int i9 = np1VarM.x;
                        int i10 = np1VarM.y;
                        if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                            while (true) {
                                int i11 = i8 + i10;
                                short s = yhVar.readShort();
                                byte[] bArr2 = qf5.a;
                                int i12 = s & 65535;
                                int i13 = yhVar.readInt();
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        i12 = 4;
                                    } else if (i12 == 4) {
                                        if (i13 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i12 = 7;
                                    } else if (i12 == 5 && (i13 < 16384 || i13 > 16777215)) {
                                        throw new IOException(ur1.d(Integer.valueOf(i13), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    }
                                } else if (i13 != 0 && i13 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                rg4Var.b(i12, i13);
                                if (i8 != i9) {
                                    i8 = i11;
                                }
                            }
                        }
                        f1.c(rg4Var);
                    }
                    return true;
                case 5:
                    if (i4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i14 = (i3 & 8) != 0 ? yhVar.readByte() & 255 : 0;
                    f1.a(yhVar.readInt() & Integer.MAX_VALUE, e(QnHx.a(i - 4, i3, i14), i14, i3, i4));
                    return true;
                case 6:
                    if (i != 8) {
                        throw new IOException(ur1.d(Integer.valueOf(i), "TYPE_PING length != 8: "));
                    }
                    if (i4 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    f1.f(yhVar.readInt(), yhVar.readInt(), (i3 & 1) != 0);
                    return true;
                case 7:
                    if (i < 8) {
                        throw new IOException(ur1.d(Integer.valueOf(i), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i4 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i15 = yhVar.readInt();
                    int i16 = yhVar.readInt();
                    int i17 = i - 8;
                    for (rt0 rt0Var3 : rt0.values()) {
                        if (rt0Var3.w == i16) {
                            rt0Var = rt0Var3;
                            if (rt0Var != null) {
                                throw new IOException(ur1.d(Integer.valueOf(i16), "TYPE_GOAWAY unexpected error code: "));
                            }
                            mkVarU = mk.z;
                            if (i17 > 0) {
                                mkVarU = yhVar.u(i17);
                            }
                            f1.g(i15, mkVarU);
                            return true;
                        }
                    }
                    if (rt0Var != null) {
                        throw new IOException(ur1.d(Integer.valueOf(i16), "TYPE_GOAWAY unexpected error code: "));
                    }
                    mkVarU = mk.z;
                    if (i17 > 0) {
                        mkVarU = yhVar.u(i17);
                    }
                    f1.g(i15, mkVarU);
                    return true;
                case 8:
                    if (i != 4) {
                        throw new IOException(ur1.d(Integer.valueOf(i), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = ((long) yhVar.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    f1.e(i4, j);
                    return true;
                default:
                    yhVar.skip(i);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(F1 f1) throws IOException {
        if (this.x) {
            if (!b(true, f1)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        mk mkVar = wd1.b;
        mk mkVarU = this.w.u(mkVar.w.length);
        Level level = Level.FINE;
        Logger logger = A;
        if (logger.isLoggable(level)) {
            logger.fine(qf5.i(ur1.d(mkVarU.d(), "<< CONNECTION "), new Object[0]));
        }
        if (!ur1.a(mkVar, mkVarU)) {
            throw new IOException(ur1.d(mkVarU.p(), "Expected a connection header but was "));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }

    public final List<cc1> e(int i, int i2, int i3, int i4) throws IOException {
        CQf cQf = this.y;
        cQf.A = i;
        cQf.x = i;
        cQf.B = i2;
        cQf.y = i3;
        cQf.z = i4;
        while (true) {
            rd1.QnHx qnHx = this.z;
            aj3 aj3Var = qnHx.c;
            boolean zE = aj3Var.E();
            ArrayList arrayList = qnHx.b;
            if (zE) {
                List<cc1> listE1 = wu.e1(arrayList);
                arrayList.clear();
                return listE1;
            }
            byte b = aj3Var.readByte();
            byte[] bArr = qf5.a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            boolean z = false;
            if ((i5 & 128) == 128) {
                int iE = qnHx.e(i5, 127) - 1;
                if (iE >= 0 && iE <= rd1.a.length - 1) {
                    z = true;
                }
                if (!z) {
                    int length = qnHx.e + 1 + (iE - rd1.a.length);
                    if (length >= 0) {
                        cc1[] cc1VarArr = qnHx.d;
                        if (length < cc1VarArr.length) {
                            arrayList.add(cc1VarArr[length]);
                        }
                    }
                    throw new IOException(ur1.d(Integer.valueOf(iE + 1), "Header index too large "));
                }
                arrayList.add(rd1.a[iE]);
            } else if (i5 == 64) {
                cc1[] cc1VarArr2 = rd1.a;
                mk mkVarD = qnHx.d();
                rd1.a(mkVarD);
                qnHx.c(new cc1(mkVarD, qnHx.d()));
            } else if ((i5 & 64) == 64) {
                qnHx.c(new cc1(qnHx.b(qnHx.e(i5, 63) - 1), qnHx.d()));
            } else if ((i5 & 32) == 32) {
                int iE2 = qnHx.e(i5, 31);
                qnHx.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException(ur1.d(Integer.valueOf(qnHx.a), "Invalid dynamic table size update "));
                }
                int i6 = qnHx.g;
                if (iE2 < i6) {
                    if (iE2 == 0) {
                        NPO.d0(qnHx.d, null);
                        qnHx.e = qnHx.d.length - 1;
                        qnHx.f = 0;
                        qnHx.g = 0;
                    } else {
                        qnHx.a(i6 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                cc1[] cc1VarArr3 = rd1.a;
                mk mkVarD2 = qnHx.d();
                rd1.a(mkVarD2);
                arrayList.add(new cc1(mkVarD2, qnHx.d()));
            } else {
                arrayList.add(new cc1(qnHx.b(qnHx.e(i5, 15) - 1), qnHx.d()));
            }
        }
    }

    public final void f(F1 f1, int i) {
        yh yhVar = this.w;
        yhVar.readInt();
        yhVar.readByte();
        byte[] bArr = qf5.a;
        f1.i();
    }
}
