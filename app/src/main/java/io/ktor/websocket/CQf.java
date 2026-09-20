package io.ktor.websocket;

import defpackage.AY;
import defpackage.C0239D;
import defpackage.NUlFixed;
import defpackage.a33;
import defpackage.ap;
import defpackage.b90;
import defpackage.ddf;
import defpackage.dp2;
import defpackage.ek;
import defpackage.fp1;
import defpackage.hi0;
import defpackage.iZUl;
import defpackage.if0;
import defpackage.ii0;
import defpackage.ki0;
import defpackage.la0;
import defpackage.li0;
import defpackage.lt;
import defpackage.md5;
import defpackage.ms1;
import defpackage.mw0t;
import defpackage.nk3;
import defpackage.ol5;
import defpackage.os1;
import defpackage.p61;
import defpackage.q94;
import defpackage.rl0;
import defpackage.sd5;
import defpackage.ta0;
import defpackage.tl5;
import defpackage.ul5;
import defpackage.va0;
import defpackage.x23;
import defpackage.y23;
import defpackage.yw;
import defpackage.z23;
import defpackage.z80;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf implements hi0, tl5 {
    public final os1 A;
    public final ArrayList B;
    public final la0 C;
    public final long D;
    public final long E;
    private volatile /* synthetic */ int started;
    public final tl5 w;
    public static final p61.NUlFixed I = new p61.NUlFixed(new byte[0], dp2.w);
    public static final /* synthetic */ AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(CQf.class, Object.class, "pinger");
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(CQf.class, "closed");
    public static final /* synthetic */ AtomicIntegerFieldUpdater H = AtomicIntegerFieldUpdater.newUpdater(CQf.class, "started");
    volatile /* synthetic */ Object pinger = null;
    public final yw x = ddf.c();
    public final NUlFixed y = AY.a(8, null, 6);
    public final NUlFixed z = AY.a(8, null, 6);
    private volatile /* synthetic */ int closed = 0;

    @if0(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {259}, m = "sendCloseSequence")
    public static final class QnHx extends b90 {
        public lt A;
        public /* synthetic */ Object B;
        public int D;
        public CQf z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CQf.F;
            return CQf.this.e(null, this);
        }
    }

    public CQf(tl5 tl5Var, long j, long j2) {
        this.w = tl5Var;
        os1 os1Var = new os1((ms1) tl5Var.g().j(ms1.CQf.w));
        this.A = os1Var;
        this.B = new ArrayList();
        this.started = 0;
        this.C = tl5Var.g().g0(os1Var).g0(new ta0("ws-default"));
        this.D = j;
        this.E = j2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(CQf cQf, ek ekVar, p61 p61Var, z80 z80Var) throws Throwable {
        ii0 ii0Var;
        int i;
        cQf.getClass();
        if (z80Var instanceof ii0) {
            ii0Var = (ii0) z80Var;
            int i2 = ii0Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ii0Var.C = i2 - Integer.MIN_VALUE;
            } else {
                ii0Var = new ii0(cQf, z80Var);
            }
        } else {
            ii0Var = new ii0(cQf, z80Var);
        }
        Object obj = ii0Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = ii0Var.C;
        if (i3 == 0) {
            C0239D.H(obj);
            int length = p61Var.c.length + (ekVar != null ? ekVar.j() : 0);
            if (length <= cQf.x0()) {
                return sd5.a;
            }
            if (ekVar != null) {
                ekVar.close();
            }
            lt.QnHx qnHx = lt.QnHx.TOO_BIG;
            StringBuilder sbC = iZUl.c("Frame is too big: ", length, ". Max size is ");
            sbC.append(cQf.x0());
            lt ltVar = new lt(qnHx, sbC.toString());
            ii0Var.z = length;
            ii0Var.C = 1;
            if (ul5.a(cQf, ltVar, ii0Var) == va0Var) {
                return va0Var;
            }
            i = length;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = ii0Var.z;
            C0239D.H(obj);
        }
        throw new FrameTooBigException(i);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[LOOP:0: B:37:0x009f->B:39:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c0 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(io.ktor.websocket.CQf r9, defpackage.z80 r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.ji0
            if (r0 == 0) goto L16
            r0 = r10
            ji0 r0 = (defpackage.ji0) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.D = r1
            goto L1b
        L16:
            ji0 r0 = new ji0
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.B
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            wo r9 = r0.A
            io.ktor.websocket.CQf r2 = r0.z
            defpackage.C0239D.H(r10)
        L33:
            r8 = r2
            r2 = r9
            r9 = r8
            goto L59
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            defpackage.C0239D.H(r10)
            goto Lc3
        L44:
            wo r9 = r0.A
            io.ktor.websocket.CQf r2 = r0.z
            defpackage.C0239D.H(r10)
            goto L69
        L4c:
            defpackage.C0239D.H(r10)
            NUlFixed r10 = r9.z
            r10.getClass()
            NUl$QnHx r2 = new NUl$QnHx
            r2.<init>(r10)
        L59:
            r0.z = r9
            r0.A = r2
            r0.D = r5
            java.lang.Object r10 = r2.a(r0)
            if (r10 != r1) goto L66
            goto Lc5
        L66:
            r8 = r2
            r2 = r9
            r9 = r8
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc3
            java.lang.Object r10 = r9.next()
            p61 r10 = (defpackage.p61) r10
            boolean r6 = r10 instanceof p61.CQf
            if (r6 == 0) goto L8f
            p61$CQf r10 = (p61.CQf) r10
            lt r9 = defpackage.Th.s(r10)
            r10 = 0
            r0.z = r10
            r0.A = r10
            r0.D = r4
            java.lang.Object r9 = r2.e(r9, r0)
            if (r9 != r1) goto Lc3
            goto Lc5
        L8f:
            boolean r6 = r10 instanceof p61.YKK
            if (r6 == 0) goto L95
            r6 = 1
            goto L97
        L95:
            boolean r6 = r10 instanceof p61.QnHx
        L97:
            if (r6 == 0) goto Lb0
            java.util.ArrayList r6 = r2.B
            java.util.Iterator r6 = r6.iterator()
        L9f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb0
            java.lang.Object r10 = r6.next()
            ol5 r10 = (defpackage.ol5) r10
            p61 r10 = r10.c()
            goto L9f
        Lb0:
            tl5 r6 = r2.w
            q94 r6 = r6.T()
            r0.z = r2
            r0.A = r9
            r0.D = r3
            java.lang.Object r10 = r6.p(r10, r0)
            if (r10 != r1) goto L33
            goto Lc5
        Lc3:
            sd5 r1 = defpackage.sd5.a
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.CQf.c(io.ktor.websocket.CQf, z80):java.lang.Object");
    }

    @Override // defpackage.tl5
    public final Object I(ul5.QnHx qnHx) {
        Object objI = this.w.I(qnHx);
        return objI == va0.COROUTINE_SUSPENDED ? objI : sd5.a;
    }

    @Override // defpackage.tl5
    public final q94<p61> T() {
        return this.z;
    }

    public final void d() {
        NUlFixed nUlA;
        long j = this.D;
        if (this.closed == 0 && j > 0) {
            q94<p61> q94VarT = this.w.T();
            long j2 = this.E;
            ta0 ta0Var = a33.a;
            os1 os1VarE = AY.e();
            nUlA = AY.a(Integer.MAX_VALUE, null, 6);
            fp1.k0(this, la0.QnHx.a(os1VarE, a33.b), 0, new x23(j, j2, q94VarT, nUlA, null), 2);
            ((ms1) this.C.j(ms1.CQf.w)).r0(new y23(os1VarE));
        } else {
            nUlA = null;
        }
        q94 q94Var = (q94) F.getAndSet(this, nUlA);
        if (q94Var != null) {
            q94Var.a(null);
        }
        if (nUlA != null) {
            boolean z = nUlA.H(I) instanceof ap.CQf;
        }
        if (this.closed == 0 || nUlA == null) {
            return;
        }
        d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(lt ltVar, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        CQf cQf;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ltVar = qnHx.A;
            cQf = qnHx.z;
            try {
                C0239D.H(obj);
                cQf.x.G0(ltVar);
                return sd5.a;
            } catch (Throwable th) {
                th = th;
                cQf.x.G0(ltVar);
                throw th;
            }
        }
        C0239D.H(obj);
        if (!G.compareAndSet(this, 0, 1)) {
            return sd5.a;
        }
        this.A.h();
        if (ltVar == null) {
            ltVar = new lt(lt.QnHx.NORMAL, "");
        }
        try {
            d();
            short s = ltVar.a;
            LinkedHashMap linkedHashMap = lt.QnHx.x;
            if (s != 1006) {
                q94<p61> q94VarT = this.w.T();
                p61.CQf cQf2 = new p61.CQf(ltVar);
                qnHx.z = this;
                qnHx.A = ltVar;
                qnHx.D = 1;
                if (q94VarT.p(cQf2, qnHx) == va0Var) {
                    return va0Var;
                }
            }
            cQf = this;
            cQf.x.G0(ltVar);
            return sd5.a;
        } catch (Throwable th2) {
            th = th2;
            cQf = this;
            cQf.x.G0(ltVar);
            throw th;
        }
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.C;
    }

    @Override // defpackage.hi0
    public final void h0(List<? extends ol5<?>> list) {
        if (!H.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("WebSocket session is already started.".toString());
        }
        this.B.addAll(list);
        d();
        ta0 ta0Var = a33.a;
        NUlFixed nUlA = AY.a(5, null, 6);
        fp1.k0(this, a33.a, 0, new z23(nUlA, this.z, null), 2);
        ta0 ta0Var2 = li0.a;
        md5 md5Var = rl0.b;
        fp1.k0(this, la0.QnHx.a(ta0Var2, md5Var), 0, new io.ktor.websocket.QnHx(this, nUlA, null), 2);
        fp1.j0(this, la0.QnHx.a(li0.b, md5Var), 4, new ki0(this, null));
    }

    @Override // defpackage.tl5
    public final Object i0(p61 p61Var, z80<? super sd5> z80Var) {
        Object objP = ((mw0t) T()).p(p61Var, z80Var);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objP != va0Var) {
            objP = sd5.a;
        }
        return objP == va0Var ? objP : sd5.a;
    }

    @Override // defpackage.tl5
    public final void q0(long j) {
        this.w.q0(j);
    }

    @Override // defpackage.tl5
    public final nk3<p61> v() {
        return this.y;
    }

    @Override // defpackage.tl5
    public final long x0() {
        return this.w.x0();
    }
}
