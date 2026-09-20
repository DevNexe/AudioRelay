package defpackage;

import com.facebook.ads.AdError;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class jk3 implements ll5, sl5.QnHx {
    public static final List<kg3> w = Collections.singletonList(kg3.HTTP_1_1);
    public final rl5 a;
    public final Random b;
    public final long c;
    public final long e;
    public final String f;
    public bj3 g;
    public LPt8Fixed h;
    public sl5 i;
    public vl5 j;
    public final g15 k;
    public String l;
    public F1 m;
    public long p;
    public boolean q;
    public String s;
    public boolean t;
    public int u;
    public boolean v;
    public pl5 d = null;
    public final ArrayDeque<mk> n = new ArrayDeque<>();
    public final ArrayDeque<Object> o = new ArrayDeque<>();
    public int r = -1;

    public static final class CQf {
        public final int a;
        public final mk b;

        public CQf(int i, mk mkVar) {
            this.a = i;
            this.b = mkVar;
        }
    }

    public static abstract class F1 implements Closeable {
        public final boolean w = true;
        public final yh x;
        public final xh y;

        public F1(yh yhVar, xh xhVar) {
            this.x = yhVar;
            this.y = xhVar;
        }
    }

    public final class LPt8Fixed extends v05 {
        public LPt8Fixed() {
            super(ur1.d(" writer", jk3.this.l), true);
        }

        @Override // defpackage.v05
        public final long a() {
            jk3 jk3Var = jk3.this;
            try {
                return jk3Var.o() ? 0L : -1L;
            } catch (IOException e) {
                jk3Var.j(e, null);
                return -1L;
            }
        }
    }

    public static final class NUlFixed extends v05 {
        public final /* synthetic */ jk3 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(String str, jk3 jk3Var) {
            super(str, true);
            this.e = jk3Var;
        }

        @Override // defpackage.v05
        public final long a() {
            this.e.cancel();
            return -1L;
        }
    }

    public static final class QnHx {
        public final int a;
        public final mk b;
        public final long c = 60000;

        public QnHx(int i, mk mkVar) {
            this.a = i;
            this.b = mkVar;
        }
    }

    public jk3(h15 h15Var, cp3 cp3Var, rl5 rl5Var, Random random, long j, long j2) {
        this.a = rl5Var;
        this.b = random;
        this.c = j;
        this.e = j2;
        this.k = h15Var.f();
        String str = cp3Var.b;
        if (!ur1.a("GET", str)) {
            throw new IllegalArgumentException(ur1.d(str, "Request must be GET: ").toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        sd5 sd5Var = sd5.a;
        cp5.a(16, 0, 16);
        this.f = new mk(NPO.b0(bArr, 0, 16)).a();
    }

    @Override // defpackage.ll5
    public final boolean a(String str) {
        mk mkVar = new mk(kd.a(str));
        mkVar.y = str;
        return n(1, mkVar);
    }

    @Override // sl5.QnHx
    public final void b(String str) {
        this.a.h(str);
    }

    @Override // defpackage.ll5
    public final boolean c(mk mkVar) {
        return n(2, mkVar);
    }

    @Override // defpackage.ll5
    public final void cancel() {
        this.g.cancel();
    }

    @Override // sl5.QnHx
    public final synchronized void d(mk mkVar) {
        if (!this.t && (!this.q || !this.o.isEmpty())) {
            this.n.add(mkVar);
            m();
        }
    }

    @Override // defpackage.ll5
    public final boolean e(int i, String str) {
        mk mkVar;
        synchronized (this) {
            try {
                String strF = XTd3.f(i);
                if (!(strF == null)) {
                    throw new IllegalArgumentException(strF.toString());
                }
                if (str != null) {
                    byte[] bArrA = kd.a(str);
                    mkVar = new mk(bArrA);
                    mkVar.y = str;
                    if (!(((long) bArrA.length) <= 123)) {
                        throw new IllegalArgumentException(ur1.d(str, "reason.size() > 123: ").toString());
                    }
                } else {
                    mkVar = null;
                }
                if (!this.t && !this.q) {
                    this.q = true;
                    this.o.add(new QnHx(i, mkVar));
                    m();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sl5.QnHx
    public final synchronized void f() {
        this.v = false;
    }

    @Override // sl5.QnHx
    public final void g(mk mkVar) {
        this.a.e(mkVar);
    }

    @Override // sl5.QnHx
    public final void h(int i, String str) {
        F1 f1;
        sl5 sl5Var;
        vl5 vl5Var;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (!(this.r == -1)) {
                throw new IllegalStateException("already closed".toString());
            }
            this.r = i;
            this.s = str;
            f1 = null;
            if (this.q && this.o.isEmpty()) {
                F1 f2 = this.m;
                this.m = null;
                sl5Var = this.i;
                this.i = null;
                vl5Var = this.j;
                this.j = null;
                this.k.e();
                f1 = f2;
            } else {
                sl5Var = null;
                vl5Var = null;
            }
            sd5 sd5Var = sd5.a;
        }
        try {
            this.a.c(i, str);
            if (f1 != null) {
                this.a.a(i, str);
            }
        } finally {
            if (f1 != null) {
                qf5.d(f1);
            }
            if (sl5Var != null) {
                qf5.d(sl5Var);
            }
            if (vl5Var != null) {
                qf5.d(vl5Var);
            }
        }
    }

    public final void i(xp3 xp3Var, av0 av0Var) throws ProtocolException, NoSuchAlgorithmException {
        int i = xp3Var.z;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(bl2.c(sb, xp3Var.y, '\''));
        }
        nc1 nc1Var = xp3Var.B;
        String strA = nc1Var.a("Connection");
        if (strA == null) {
            strA = null;
        }
        if (!iv4.r("Upgrade", strA)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strA) + '\'');
        }
        String strA2 = nc1Var.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!iv4.r("websocket", strA2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strA2) + '\'');
        }
        String strA3 = nc1Var.a("Sec-WebSocket-Accept");
        String str = strA3 != null ? strA3 : null;
        byte[] bArrA = kd.a(ur1.d("258EAFA5-E914-47DA-95CA-C5AB0DC85B11", this.f));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bArrA, 0, bArrA.length);
        String strA4 = new mk(messageDigest.digest()).a();
        if (ur1.a(strA4, str)) {
            if (av0Var == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + ((Object) str) + '\'');
    }

    public final void j(Exception exc, xp3 xp3Var) {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            F1 f1 = this.m;
            this.m = null;
            sl5 sl5Var = this.i;
            this.i = null;
            vl5 vl5Var = this.j;
            this.j = null;
            this.k.e();
            sd5 sd5Var = sd5.a;
            try {
                this.a.d(exc);
            } finally {
                if (f1 != null) {
                    qf5.d(f1);
                }
                if (sl5Var != null) {
                    qf5.d(sl5Var);
                }
                if (vl5Var != null) {
                    qf5.d(vl5Var);
                }
            }
        }
    }

    public final void k(String str, hj3 hj3Var) {
        pl5 pl5Var = this.d;
        synchronized (this) {
            this.l = str;
            this.m = hj3Var;
            boolean z = hj3Var.w;
            this.j = new vl5(z, hj3Var.y, this.b, pl5Var.a, z ? pl5Var.c : pl5Var.e, this.e);
            this.h = new LPt8Fixed();
            long j = this.c;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.k.c(new lk3(ur1.d(" ping", str), this, nanos), nanos);
            }
            if (!this.o.isEmpty()) {
                m();
            }
            sd5 sd5Var = sd5.a;
        }
        boolean z2 = hj3Var.w;
        this.i = new sl5(z2, hj3Var.x, this, pl5Var.a, z2 ^ true ? pl5Var.c : pl5Var.e);
    }

    public final void l() throws IOException {
        while (this.r == -1) {
            sl5 sl5Var = this.i;
            sl5Var.c();
            if (sl5Var.F) {
                sl5Var.b();
            } else {
                int i = sl5Var.C;
                if (i != 1 && i != 2) {
                    byte[] bArr = qf5.a;
                    throw new ProtocolException(ur1.d(Integer.toHexString(i), "Unknown opcode: "));
                }
                while (true) {
                    if (sl5Var.B) {
                        throw new IOException("closed");
                    }
                    long j = sl5Var.D;
                    gg ggVar = sl5Var.I;
                    if (j > 0) {
                        sl5Var.x.Y(ggVar, j);
                        if (!sl5Var.w) {
                            gg.QnHx qnHx = sl5Var.L;
                            ggVar.j(qnHx);
                            qnHx.c(ggVar.x - sl5Var.D);
                            XTd3.x(qnHx, sl5Var.K);
                            qnHx.close();
                        }
                    }
                    if (sl5Var.E) {
                        if (sl5Var.G) {
                            gd2 gd2Var = sl5Var.J;
                            if (gd2Var == null) {
                                gd2Var = new gd2(sl5Var.A);
                                sl5Var.J = gd2Var;
                            }
                            gg ggVar2 = gd2Var.x;
                            if (!(ggVar2.x == 0)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            Inflater inflater = gd2Var.y;
                            if (gd2Var.w) {
                                inflater.reset();
                            }
                            ggVar2.K(ggVar);
                            ggVar2.P(65535);
                            long bytesRead = inflater.getBytesRead() + ggVar2.x;
                            do {
                                gd2Var.z.b(ggVar, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        sl5.QnHx qnHx2 = sl5Var.y;
                        if (i != 1) {
                            qnHx2.g(ggVar.o());
                            break;
                        } else {
                            qnHx2.b(ggVar.A());
                            break;
                        }
                    }
                    while (!sl5Var.B) {
                        sl5Var.c();
                        if (!sl5Var.F) {
                            break;
                        } else {
                            sl5Var.b();
                        }
                    }
                    if (sl5Var.C != 0) {
                        int i2 = sl5Var.C;
                        byte[] bArr2 = qf5.a;
                        throw new ProtocolException(ur1.d(Integer.toHexString(i2), "Expected continuation opcode. Got: "));
                    }
                }
            }
        }
    }

    public final void m() {
        byte[] bArr = qf5.a;
        LPt8Fixed lPt8 = this.h;
        if (lPt8 != null) {
            this.k.c(lPt8, 0L);
        }
    }

    public final synchronized boolean n(int i, mk mkVar) {
        if (!this.t && !this.q) {
            long j = this.p;
            byte[] bArr = mkVar.w;
            if (((long) bArr.length) + j > 16777216) {
                e(AdError.NO_FILL_ERROR_CODE, null);
                return false;
            }
            this.p = j + ((long) bArr.length);
            this.o.add(new CQf(i, mkVar));
            m();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[Catch: all -> 0x00f3, TRY_ENTER, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008d A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:27:0x0066, B:28:0x006e, B:30:0x0072, B:31:0x007b, B:33:0x0088, B:36:0x008b, B:37:0x008c, B:38:0x008d, B:40:0x0091, B:57:0x00cd, B:59:0x00d1, B:71:0x00ea, B:72:0x00ec, B:44:0x009f, B:49:0x00a9, B:50:0x00b2, B:51:0x00b3, B:53:0x00bd, B:54:0x00c4, B:73:0x00ed, B:74:0x00f2, B:56:0x00ca, B:32:0x007c), top: B:89:0x0064, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean o() {
        Object objPoll;
        String str;
        sl5 sl5Var;
        vl5 vl5Var;
        int i;
        mk mkVar;
        mk mkVarO;
        gg ggVar;
        String strF;
        CQf cQf;
        synchronized (this) {
            if (this.t) {
                return false;
            }
            vl5 vl5Var2 = this.j;
            mk mkVarPoll = this.n.poll();
            int i2 = -1;
            F1 f1 = null;
            try {
                if (mkVarPoll == null) {
                    objPoll = this.o.poll();
                    if (objPoll instanceof QnHx) {
                        int i3 = this.r;
                        str = this.s;
                        if (i3 != -1) {
                            F1 f2 = this.m;
                            this.m = null;
                            sl5Var = this.i;
                            this.i = null;
                            vl5Var = this.j;
                            this.j = null;
                            this.k.e();
                            f1 = f2;
                        } else {
                            this.k.c(new NUlFixed(ur1.d(" cancel", this.l), this), TimeUnit.MILLISECONDS.toNanos(((QnHx) objPoll).c));
                            sl5Var = null;
                            vl5Var = null;
                        }
                        i2 = i3;
                    } else if (objPoll == null) {
                        return false;
                    }
                    sd5 sd5Var = sd5.a;
                    if (mkVarPoll != null) {
                        vl5Var2.b(10, mkVarPoll);
                    } else if (objPoll instanceof CQf) {
                        cQf = (CQf) objPoll;
                        vl5Var2.c(cQf.a, cQf.b);
                        synchronized (this) {
                            this.p -= (long) cQf.b.c();
                        }
                    } else {
                        if (objPoll instanceof QnHx) {
                            throw new AssertionError();
                        }
                        QnHx qnHx = (QnHx) objPoll;
                        i = qnHx.a;
                        mkVar = qnHx.b;
                        mkVarO = mk.z;
                        if (i == 0 || mkVar != null) {
                            if (i != 0) {
                                strF = XTd3.f(i);
                                if (!(strF == null)) {
                                    throw new IllegalArgumentException(strF.toString());
                                }
                            }
                            ggVar = new gg();
                            ggVar.R(i);
                            if (mkVar != null) {
                                mkVar.q(ggVar, mkVar.c());
                            }
                            mkVarO = ggVar.o();
                        }
                        try {
                            vl5Var2.b(8, mkVarO);
                            vl5Var2.E = true;
                            if (f1 != null) {
                                this.a.a(i2, str);
                            }
                        } catch (Throwable th) {
                            vl5Var2.E = true;
                            throw th;
                        }
                    }
                    if (f1 != null) {
                        qf5.d(f1);
                    }
                    if (sl5Var != null) {
                        qf5.d(sl5Var);
                    }
                    if (vl5Var != null) {
                        qf5.d(vl5Var);
                    }
                    return true;
                }
                objPoll = null;
                if (mkVarPoll != null) {
                    vl5Var2.b(10, mkVarPoll);
                } else if (objPoll instanceof CQf) {
                    cQf = (CQf) objPoll;
                    vl5Var2.c(cQf.a, cQf.b);
                    synchronized (this) {
                        this.p -= (long) cQf.b.c();
                    }
                } else {
                    if (objPoll instanceof QnHx) {
                        throw new AssertionError();
                    }
                    QnHx qnHx2 = (QnHx) objPoll;
                    i = qnHx2.a;
                    mkVar = qnHx2.b;
                    mkVarO = mk.z;
                    if (i == 0) {
                        if (i != 0) {
                            strF = XTd3.f(i);
                            if (!(strF == null)) {
                                throw new IllegalArgumentException(strF.toString());
                            }
                        }
                        ggVar = new gg();
                        ggVar.R(i);
                        if (mkVar != null) {
                            mkVar.q(ggVar, mkVar.c());
                        }
                        mkVarO = ggVar.o();
                    } else {
                        if (i != 0) {
                            strF = XTd3.f(i);
                            if (!(strF == null)) {
                                throw new IllegalArgumentException(strF.toString());
                            }
                        }
                        ggVar = new gg();
                        ggVar.R(i);
                        if (mkVar != null) {
                            mkVar.q(ggVar, mkVar.c());
                        }
                        mkVarO = ggVar.o();
                    }
                    vl5Var2.b(8, mkVarO);
                    vl5Var2.E = true;
                    if (f1 != null) {
                        this.a.a(i2, str);
                    }
                }
                if (f1 != null) {
                    qf5.d(f1);
                }
                if (sl5Var != null) {
                    qf5.d(sl5Var);
                }
                if (vl5Var != null) {
                    qf5.d(vl5Var);
                }
                return true;
            } catch (Throwable th2) {
                if (f1 != null) {
                    qf5.d(f1);
                }
                if (sl5Var != null) {
                    qf5.d(sl5Var);
                }
                if (vl5Var != null) {
                    qf5.d(vl5Var);
                }
                throw th2;
            }
            str = null;
            sl5Var = null;
            vl5Var = null;
            sd5 sd5Var2 = sd5.a;
        }
    }
}
