package defpackage;

import com.azefsw.audioconnect.network.exceptions.MessageException;
import com.google.protobuf.lPt3Fixed;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class md2 implements c73 {
    public final i60 a;
    public final h75 b;
    public final pq2 c;
    public final List<fd2> d;
    public final c2 e;
    public final c2 f;
    public final CQf g;

    public static final class CQf extends cx1 implements j81<InputStream, ad2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final ad2 invoke(InputStream inputStream) {
            try {
                ad2 ad2Var = (ad2) lPt3Fixed.P(ad2.S, inputStream);
                if (ad2Var != null) {
                    return ad2Var;
                }
                int i = MessageException.x;
                throw MessageException.QnHx.b();
            } catch (Throwable th) {
                int i2 = MessageException.x;
                throw MessageException.QnHx.a(th);
            }
        }
    }

    public static final class F1 extends cx1 implements j81<c54, qw> {
        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final qw invoke(c54 c54Var) {
            md2 md2Var = md2.this;
            w9 w9VarB = md2Var.a.b();
            j71 j71Var = new j71(4, md2Var, c54Var);
            w9VarB.getClass();
            return new xs2(w9VarB, j71Var);
        }
    }

    @if0(c = "com.azefsw.audioconnect.player.network.messages.MessageReceiverSessionTask", f = "MessageReceiverSessionTask.kt", l = {111}, m = "handleMessage")
    public static final class QnHx extends b90 {
        public ad2 A;
        public List B;
        public int C;
        public int D;
        public /* synthetic */ Object E;
        public int G;
        public md2 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return md2.this.c(null, this);
        }
    }

    public md2(i60 i60Var, Set<? extends fd2> set, h75 h75Var, pq2 pq2Var) {
        this.a = i60Var;
        this.b = h75Var;
        this.c = pq2Var;
        this.d = wu.e1(set);
        gq0.QnHx qnHx = gq0.x;
        this.e = new c2(ps0.o0(10, kq0.MINUTES));
        this.f = new c2(ps0.o0(30, kq0.SECONDS));
        this.g = CQf.w;
        a62 a62Var = a62.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(md2 md2Var, m15 m15Var, s50 s50Var, z80 z80Var) throws Throwable {
        rd2 rd2Var;
        md2Var.getClass();
        if (z80Var instanceof rd2) {
            rd2Var = (rd2) z80Var;
            int i = rd2Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd2Var.B = i - Integer.MIN_VALUE;
            } else {
                rd2Var = new rd2(md2Var, z80Var);
            }
        } else {
            rd2Var = new rd2(md2Var, z80Var);
        }
        Object obj = rd2Var.z;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = rd2Var.B;
        if (i2 == 0) {
            C0239D.H(obj);
            try {
                CQf cQf = md2Var.g;
                m15Var.getClass();
                try {
                    ad2 ad2Var = (ad2) cQf.invoke(m15Var.d);
                    rd2Var.B = 1;
                    if (md2Var.c(ad2Var, rd2Var) == obj2) {
                        return obj2;
                    }
                } catch (Throwable th) {
                    hq4.a(m15Var, th);
                    throw null;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th2) {
                if (s50Var.d) {
                    if (XTd3.q(th2, nl3.a(SocketTimeoutException.class))) {
                        a62.a.l("Timed out while reading messages");
                        md2Var.e.a(nd2.w);
                    } else {
                        md2Var.f.a(new od2(th2));
                        md2Var.e.a(new pd2(th2));
                    }
                }
                return Boolean.FALSE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        h75 h75Var = this.b;
        h75Var.i();
        h75Var.d();
        return this.c.j("Player:MessageReceiver", -1, new F1());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[Catch: all -> 0x006b, CancellationException -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x002f, B:20:0x004d), top: B:33:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0066 -> B:23:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.ad2 r9, defpackage.z80<? super defpackage.sd5> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof md2.QnHx
            if (r0 == 0) goto L13
            r0 = r10
            md2$QnHx r0 = (md2.QnHx) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            md2$QnHx r0 = new md2$QnHx
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.E
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r9 = r0.D
            int r2 = r0.C
            java.util.List r4 = r0.B
            java.util.List r4 = (java.util.List) r4
            ad2 r5 = r0.A
            md2 r6 = r0.z
            defpackage.C0239D.H(r10)     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r10 = r5
            goto L69
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            defpackage.C0239D.H(r10)
            java.util.List<fd2> r10 = r8.d     // Catch: java.lang.Throwable -> L6d java.util.concurrent.CancellationException -> L85
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L6d java.util.concurrent.CancellationException -> L85
            r4 = 0
            r6 = r8
            r4 = r10
            r10 = r9
            r9 = r2
            r2 = 0
        L4b:
            if (r2 >= r9) goto L82
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            fd2 r5 = (defpackage.fd2) r5     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r0.z = r6     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r0.A = r10     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r7 = r4
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r0.B = r7     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r0.C = r2     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r0.D = r9     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            r0.G = r3     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            java.lang.Object r5 = r5.a(r10, r0)     // Catch: java.lang.Throwable -> L6b java.util.concurrent.CancellationException -> L85
            if (r5 != r1) goto L69
            return r1
        L69:
            int r2 = r2 + r3
            goto L4b
        L6b:
            r9 = move-exception
            goto L6f
        L6d:
            r9 = move-exception
            r6 = r8
        L6f:
            r6.getClass()
            a62 r10 = defpackage.a62.a
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = "errors"
            java.lang.String r2 = "message_handle_failure"
            r10.h(r1, r2, r0)
            defpackage.qe0.g(r9)
        L82:
            sd5 r9 = defpackage.sd5.a
            return r9
        L85:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.c(ad2, z80):java.lang.Object");
    }
}
