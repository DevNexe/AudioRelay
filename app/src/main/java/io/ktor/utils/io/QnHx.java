package io.ktor.utils.io;

import defpackage.C0239D;
import defpackage.Th;
import defpackage.b90;
import defpackage.cx1;
import defpackage.di3;
import defpackage.ek;
import defpackage.ex0;
import defpackage.fg;
import defpackage.fk;
import defpackage.fq3;
import defpackage.gk;
import defpackage.hk;
import defpackage.if0;
import defpackage.il3;
import defpackage.j81;
import defpackage.mj;
import defpackage.ms1;
import defpackage.nk;
import defpackage.nq2;
import defpackage.oj;
import defpackage.oq;
import defpackage.oq2;
import defpackage.ot;
import defpackage.ps0;
import defpackage.pw2;
import defpackage.px4;
import defpackage.sd5;
import defpackage.ur1;
import defpackage.va0;
import defpackage.vs1;
import defpackage.xm;
import defpackage.yt2;
import defpackage.z80;
import defpackage.zm;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements oj, fk, nk {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_closed");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_readOp");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile ms1 attachedJob;
    public final boolean b;
    public final nq2<di3.F1> c;
    public final int d;
    public int e;
    public int f;
    public final zm<Boolean> g;
    public final zm<sd5> h;
    public final EQ i;
    private volatile vs1 joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1498, 1499}, m = "awaitFreeSpaceOrDelegate")
    public static final class CQf extends b90 {
        public j81 A;
        public /* synthetic */ Object B;
        public int D;
        public QnHx z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.j(0, null, this);
        }
    }

    public static final class EQ extends cx1 implements j81<z80<? super sd5>, Object> {
        public EQ() {
            super(1);
        }

        @Override // defpackage.j81
        public final Object invoke(z80<? super sd5> z80Var) throws Throwable {
            boolean z;
            boolean z2;
            boolean z3;
            z80<? super sd5> z80Var2 = z80Var;
            int i = QnHx.this.writeSuspensionSize;
            do {
                ot otVarG = QnHx.g(QnHx.this);
                if (otVarG != null) {
                    C0239D.h(otVarG.a());
                    throw null;
                }
                if (!QnHx.this.a0(i)) {
                    z80Var2.x(sd5.a);
                    break;
                }
                QnHx qnHx = QnHx.this;
                z80 z80VarL = ps0.L(z80Var2);
                QnHx qnHx2 = QnHx.this;
                while (true) {
                    z = true;
                    if (!(((z80) qnHx._writeOp) == null)) {
                        throw new IllegalStateException("Operation is already in progress".toString());
                    }
                    if (qnHx2.a0(i)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.m;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(qnHx, null, z80VarL)) {
                                z2 = true;
                                break;
                            }
                            if (atomicReferenceFieldUpdater.get(qnHx) != null) {
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            if (!qnHx2.a0(i)) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = QnHx.m;
                                while (true) {
                                    if (atomicReferenceFieldUpdater2.compareAndSet(qnHx, z80VarL, null)) {
                                        z3 = true;
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(qnHx) != z80VarL) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (!z3) {
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    z = false;
                    break;
                }
            } while (!z);
            QnHx.this.v(i);
            if (QnHx.this.N()) {
                QnHx.this.J();
            }
            return va0.COROUTINE_SUSPENDED;
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {713, 717}, m = "readAvailableSuspend")
    public static final class F1 extends b90 {
        public byte[] A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public int F;
        public QnHx z;

        public F1(z80<? super F1> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.A(null, 0, 0, this);
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {729, 733}, m = "readAvailableSuspend")
    public static final class LPt8Fixed extends b90 {
        public oq A;
        public /* synthetic */ Object B;
        public int D;
        public QnHx z;

        public LPt8Fixed(z80<? super LPt8Fixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.z(null, this);
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2110}, m = "readRemainingSuspend")
    public static final class NUlFixed extends b90 {
        public ek A;
        public il3 B;
        public pw2 C;
        public oq D;
        public /* synthetic */ Object E;
        public int G;
        public QnHx z;

        public NUlFixed(z80<? super NUlFixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.B(0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.QnHx$QnHx, reason: collision with other inner class name */
    public static final class C0146QnHx extends cx1 implements j81<Throwable, sd5> {
        public C0146QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            QnHx qnHx = QnHx.this;
            qnHx.attachedJob = null;
            if (th2 != null) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 instanceof CancellationException) {
                        if (ur1.a(th3, th3.getCause())) {
                            break;
                        }
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            th3 = cause;
                        }
                    }
                    th2 = th3;
                    break;
                }
                qnHx.l(th2);
            }
            return sd5.a;
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1425, 1427}, m = "writeSuspend")
    public static final class T23 extends b90 {
        public byte[] A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public int F;
        public QnHx z;

        public T23(z80<? super T23> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.Z(null, 0, 0, this);
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2253}, m = "readSuspendImpl")
    public static final class YKK extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public QnHx z;

        public YKK(z80<? super YKK> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.D(0, this);
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1408}, m = "writeFullySuspend")
    public static final class auxFixed extends b90 {
        public byte[] A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public int F;
        public QnHx z;

        public auxFixed(z80<? super auxFixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.X(null, 0, 0, this);
        }
    }

    @if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2425}, m = "writeSuspend")
    public static final class byN extends b90 {
        public int A;
        public /* synthetic */ Object B;
        public int D;
        public QnHx z;

        public byN(z80<? super byN> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
            return QnHx.this.Y(0, this);
        }
    }

    public QnHx(ByteBuffer byteBuffer) {
        this(false, oq2.d, 0);
        di3.F1 f1 = new di3.F1(byteBuffer.slice(), 0);
        f1.b.e();
        this._state = f1.g;
        I();
        a(null);
        R();
    }

    public static void G(QnHx qnHx, vs1 vs1Var) {
        if (((di3) qnHx._state) == di3.YKK.c) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.ktor.utils.io.QnHx] */
    /* JADX WARN: Type inference failed for: r12v12, types: [io.ktor.utils.io.QnHx] */
    /* JADX WARN: Type inference failed for: r12v5, types: [io.ktor.utils.io.QnHx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [yt2$QnHx] */
    /* JADX WARN: Type inference failed for: r14v1, types: [j81] */
    /* JADX WARN: Type inference failed for: r14v6, types: [j81] */
    public static Object T(QnHx qnHx, int i, yt2.QnHx qnHx2, z80 z80Var) throws Throwable {
        mj mjVar;
        int i2;
        boolean z;
        int i3;
        int i4;
        if (z80Var instanceof mj) {
            mjVar = (mj) z80Var;
            int i5 = mjVar.E;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mjVar.E = i5 - Integer.MIN_VALUE;
            } else {
                mjVar = new mj(qnHx, z80Var);
            }
        } else {
            mjVar = new mj(qnHx, z80Var);
        }
        Object obj = mjVar.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i6 = mjVar.E;
        if (i6 == 0) {
            C0239D.H(obj);
            if (!(i > 0)) {
                throw new IllegalArgumentException("min should be positive".toString());
            }
            if (!(i <= 4088)) {
                throw new IllegalArgumentException(ex0.b("Min(", i, ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = mjVar.B;
            qnHx2 = mjVar.A;
            qnHx = mjVar.z;
            C0239D.H(obj);
        }
        do {
            qnHx.getClass();
            if (!(i > 0)) {
                throw new IllegalArgumentException("min should be positive".toString());
            }
            if (!(i <= 4088)) {
                throw new IllegalArgumentException(ex0.b("Min(", i, ") shouldn't be greater than 4088").toString());
            }
            vs1 vs1Var = ((QnHx) qnHx).joining;
            if (vs1Var != null) {
                G(qnHx, vs1Var);
            }
            ByteBuffer byteBufferM = qnHx.M();
            if (byteBufferM == null) {
                z = false;
                i4 = 0;
            } else {
                io.ktor.utils.io.internal.QnHx qnHx3 = ((di3) ((QnHx) qnHx)._state).b;
                try {
                    ot otVar = (ot) ((QnHx) qnHx)._closed;
                    if (otVar != null) {
                        C0239D.h(otVar.a());
                        throw null;
                    }
                    do {
                        i2 = qnHx3._availableForWrite$internal;
                        if (i2 < i) {
                            i2 = 0;
                            break;
                        }
                    } while (!io.ktor.utils.io.internal.QnHx.c.compareAndSet(qnHx3, i2, 0));
                    if (i2 <= 0) {
                        z = false;
                        i3 = 0;
                    } else {
                        qnHx.w(byteBufferM, qnHx.f, i2);
                        int iPosition = byteBufferM.position();
                        int iLimit = byteBufferM.limit();
                        qnHx2.invoke(byteBufferM);
                        if (!(iLimit == byteBufferM.limit())) {
                            throw new IllegalStateException("Buffer limit modified".toString());
                        }
                        int iPosition2 = byteBufferM.position() - iPosition;
                        if (!(iPosition2 >= 0)) {
                            throw new IllegalStateException("Position has been moved backward: pushback is not supported".toString());
                        }
                        if (iPosition2 < 0) {
                            throw new IllegalStateException();
                        }
                        qnHx.s(byteBufferM, qnHx3, iPosition2);
                        if (iPosition2 < i2) {
                            qnHx3.a(i2 - iPosition2);
                        }
                        z = true;
                        i3 = iPosition2;
                    }
                    if (qnHx3.d() || qnHx.b) {
                        qnHx.v(1);
                    }
                    qnHx.I();
                    qnHx.R();
                    i4 = i3;
                } catch (Throwable th) {
                    if (qnHx3.d() || qnHx.b) {
                        qnHx.v(1);
                    }
                    qnHx.I();
                    qnHx.R();
                    throw th;
                }
            }
            if (!z) {
                i4 = -1;
            }
            if (i4 >= 0) {
                return sd5.a;
            }
            mjVar.z = qnHx;
            mjVar.A = qnHx2;
            mjVar.B = i;
            mjVar.E = 1;
        } while (qnHx.j(i, qnHx2, mjVar) != va0Var);
        return va0Var;
    }

    public static final ot g(QnHx qnHx) {
        return (ot) qnHx._closed;
    }

    public static int y(QnHx qnHx, fg fgVar) throws Throwable {
        boolean z;
        int iMin;
        int i = fgVar.e - fgVar.c;
        int i2 = 0;
        do {
            ByteBuffer byteBufferL = qnHx.L();
            if (byteBufferL == null) {
                z = false;
                iMin = 0;
            } else {
                io.ktor.utils.io.internal.QnHx qnHx2 = ((di3) qnHx._state).b;
                try {
                    if (qnHx2._availableForRead$internal == 0) {
                        qnHx.H();
                        qnHx.R();
                        z = false;
                        iMin = 0;
                    } else {
                        int i3 = fgVar.e - fgVar.c;
                        int iMin2 = Math.min(byteBufferL.remaining(), Math.min(i3, i));
                        while (true) {
                            int i4 = qnHx2._availableForRead$internal;
                            int iMin3 = Math.min(iMin2, i4);
                            if (iMin3 == 0) {
                                iMin = 0;
                                break;
                            }
                            if (io.ktor.utils.io.internal.QnHx.b.compareAndSet(qnHx2, i4, i4 - iMin3)) {
                                iMin = Math.min(iMin2, i4);
                                break;
                            }
                        }
                        if (iMin <= 0) {
                            z = false;
                        } else {
                            if (i3 < byteBufferL.remaining()) {
                                byteBufferL.limit(byteBufferL.position() + i3);
                            }
                            ps0.s0(fgVar, byteBufferL);
                            qnHx.k(byteBufferL, qnHx2, iMin);
                            z = true;
                        }
                        qnHx.H();
                        qnHx.R();
                    }
                } catch (Throwable th) {
                    qnHx.H();
                    qnHx.R();
                    throw th;
                }
            }
            i2 += iMin;
            i -= iMin;
            if (!z) {
                break;
            }
            if (!(fgVar.e > fgVar.c)) {
                break;
            }
        } while (((di3) qnHx._state).b._availableForRead$internal > 0);
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(byte[] bArr, int i, int i2, z80<? super Integer> z80Var) throws Throwable {
        F1 f1;
        QnHx qnHx;
        if (z80Var instanceof F1) {
            f1 = (F1) z80Var;
            int i3 = f1.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f1.F = i3 - Integer.MIN_VALUE;
            } else {
                f1 = new F1(z80Var);
            }
        } else {
            f1 = new F1(z80Var);
        }
        Object objC = f1.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i4 = f1.F;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = f1.C;
                i = f1.B;
                bArr = f1.A;
                qnHx = f1.z;
                C0239D.H(objC);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objC);
            }
        }
        C0239D.H(objC);
        f1.z = this;
        f1.A = bArr;
        f1.B = i;
        f1.C = i2;
        f1.F = 1;
        objC = C(f1);
        if (objC == va0Var) {
            return va0Var;
        }
        qnHx = this;
        if (!((Boolean) objC).booleanValue()) {
            return new Integer(-1);
        }
        f1.z = null;
        f1.A = null;
        f1.F = 2;
        objC = qnHx.q(bArr, i, i2, f1);
        return objC == va0Var ? va0Var : objC;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[PHI: r2 r4 r5 r11 r12
  0x009c: PHI (r2v3 il3) = (r2v4 il3), (r2v4 il3), (r2v6 il3) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r4v3 ek) = (r4v13 ek), (r4v14 ek), (r4v15 ek) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r5v1 io.ktor.utils.io.QnHx) = (r5v2 io.ktor.utils.io.QnHx), (r5v2 io.ktor.utils.io.QnHx), (r5v4 io.ktor.utils.io.QnHx) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r11v6 oq) = (r11v7 oq), (r11v7 oq), (r11v12 oq) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r12v2 pw2) = (r12v14 pw2), (r12v15 pw2), (r12v16 pw2) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:31:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009c -> B:35:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object B(long r11, defpackage.z80<? super defpackage.hk> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.QnHx.NUlFixed
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.QnHx$NUl r0 = (io.ktor.utils.io.QnHx.NUlFixed) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            io.ktor.utils.io.QnHx$NUl r0 = new io.ktor.utils.io.QnHx$NUl
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.E
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            oq r11 = r0.D
            pw2 r12 = r0.C
            il3 r2 = r0.B
            ek r4 = r0.A
            io.ktor.utils.io.QnHx r5 = r0.z
            defpackage.C0239D.H(r13)     // Catch: java.lang.Throwable -> L31
            goto L92
        L31:
            r11 = move-exception
            goto Lb3
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            defpackage.C0239D.H(r13)
            ek r13 = new ek
            r2 = 0
            r13.<init>(r2)
            il3 r4 = new il3     // Catch: java.lang.Throwable -> Lba
            r4.<init>()     // Catch: java.lang.Throwable -> Lba
            r4.w = r11     // Catch: java.lang.Throwable -> Lba
            oq r11 = defpackage.YKK.i(r13, r3, r2)     // Catch: java.lang.Throwable -> Lba
            r5 = r10
            r12 = r13
            r2 = r4
            r4 = r12
        L54:
            int r13 = r11.e     // Catch: java.lang.Throwable -> L31
            int r6 = r11.c     // Catch: java.lang.Throwable -> L31
            int r13 = r13 - r6
            long r6 = (long) r13     // Catch: java.lang.Throwable -> L31
            long r8 = r2.w     // Catch: java.lang.Throwable -> L31
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L69
            int r13 = (int) r8     // Catch: java.lang.Throwable -> L31
            int r6 = r11.d     // Catch: java.lang.Throwable -> L31
            r11.b = r6     // Catch: java.lang.Throwable -> L31
            r11.c = r6     // Catch: java.lang.Throwable -> L31
            r11.e = r13     // Catch: java.lang.Throwable -> L31
        L69:
            int r13 = y(r5, r11)     // Catch: java.lang.Throwable -> L31
            long r6 = r2.w     // Catch: java.lang.Throwable -> L31
            long r8 = (long) r13     // Catch: java.lang.Throwable -> L31
            long r6 = r6 - r8
            r2.w = r6     // Catch: java.lang.Throwable -> L31
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L9c
            boolean r13 = r5.r()     // Catch: java.lang.Throwable -> L31
            if (r13 != 0) goto L9c
            r0.z = r5     // Catch: java.lang.Throwable -> L31
            r0.A = r4     // Catch: java.lang.Throwable -> L31
            r0.B = r2     // Catch: java.lang.Throwable -> L31
            r0.C = r12     // Catch: java.lang.Throwable -> L31
            r0.D = r11     // Catch: java.lang.Throwable -> L31
            r0.G = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = r5.C(r0)     // Catch: java.lang.Throwable -> L31
            if (r13 != r1) goto L92
            return r1
        L92:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L31
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r13 == 0) goto L9c
            r13 = 1
            goto L9d
        L9c:
            r13 = 0
        L9d:
            if (r13 == 0) goto La4
            oq r11 = defpackage.YKK.i(r12, r3, r11)     // Catch: java.lang.Throwable -> L31
            goto L54
        La4:
            r12.b()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Throwable r11 = r5.n()     // Catch: java.lang.Throwable -> Lb7
            if (r11 != 0) goto Lb2
            hk r11 = r4.s()     // Catch: java.lang.Throwable -> Lb7
            return r11
        Lb2:
            throw r11     // Catch: java.lang.Throwable -> Lb7
        Lb3:
            r12.b()     // Catch: java.lang.Throwable -> Lb7
            throw r11     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r11 = move-exception
            r13 = r4
            goto Lbb
        Lba:
            r11 = move-exception
        Lbb:
            r13.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.QnHx.B(long, z80):java.lang.Object");
    }

    public final Object C(b90 b90Var) throws Throwable {
        if (((di3) this._state).b._availableForRead$internal >= 1) {
            return Boolean.TRUE;
        }
        ot otVar = (ot) this._closed;
        if (otVar == null) {
            return D(1, b90Var);
        }
        Throwable th = otVar.a;
        if (th != null) {
            C0239D.h(th);
            throw null;
        }
        io.ktor.utils.io.internal.QnHx qnHx = ((di3) this._state).b;
        boolean z = qnHx.c() && qnHx._availableForRead$internal >= 1;
        if (((z80) this._readOp) == null) {
            return Boolean.valueOf(z);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(int i, z80<? super Boolean> z80Var) throws Throwable {
        YKK ykk;
        Throwable th;
        QnHx qnHx;
        if (z80Var instanceof YKK) {
            ykk = (YKK) z80Var;
            int i2 = ykk.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ykk.C = i2 - Integer.MIN_VALUE;
            } else {
                ykk = new YKK(z80Var);
            }
        } else {
            ykk = new YKK(z80Var);
        }
        Object objD = ykk.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = ykk.C;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qnHx = ykk.z;
            try {
                C0239D.H(objD);
            } catch (Throwable th2) {
                th = th2;
                qnHx._readOp = null;
                throw th;
            }
        }
        C0239D.H(objD);
        di3 di3Var = (di3) this._state;
        if (!(di3Var.b._availableForRead$internal < i && (this.joining == null || ((z80) this._writeOp) == null || !(di3Var == di3.QnHx.c || (di3Var instanceof di3.CQf))))) {
            return Boolean.TRUE;
        }
        try {
            ykk.z = this;
            ykk.C = 1;
            zm<Boolean> zmVar = this.g;
            O(i, zmVar);
            objD = zmVar.d(ps0.L(ykk));
            return objD == va0Var ? va0Var : objD;
        } catch (Throwable th3) {
            th = th3;
            qnHx = this;
            qnHx._readOp = null;
            throw th;
        }
    }

    public final void E(di3.F1 f1) {
        this.c.p0(f1);
    }

    public final void F() {
        vs1 vs1Var = this.joining;
        if (vs1Var != null) {
            G(this, vs1Var);
        }
    }

    public final void H() {
        di3 di3VarE;
        boolean z;
        boolean z2;
        di3 di3Var = null;
        do {
            Object obj = this._state;
            di3 di3Var2 = (di3) obj;
            di3.CQf cQf = (di3.CQf) di3Var;
            if (cQf != null) {
                cQf.b.f();
                K();
                di3Var = null;
            }
            di3VarE = di3Var2.e();
            if ((di3VarE instanceof di3.CQf) && ((di3) this._state) == di3Var2 && di3VarE.b.g()) {
                di3VarE = di3.QnHx.c;
                di3Var = di3VarE;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (true) {
                z = true;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, di3VarE)) {
                    z2 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z2 = false;
                    break;
                }
            }
        } while (!z2);
        di3.QnHx qnHx = di3.QnHx.c;
        if (di3VarE == qnHx) {
            di3.CQf cQf2 = (di3.CQf) di3Var;
            if (cQf2 != null) {
                E(cQf2.c);
            }
            K();
            return;
        }
        if (di3VarE instanceof di3.CQf) {
            io.ktor.utils.io.internal.QnHx qnHx2 = di3VarE.b;
            if ((qnHx2._availableForWrite$internal == qnHx2.a) && di3VarE.b.g()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, di3VarE, qnHx)) {
                    if (atomicReferenceFieldUpdater2.get(this) != di3VarE) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    di3VarE.b.f();
                    E(((di3.CQf) di3VarE).c);
                    K();
                }
            }
        }
    }

    public final void I() {
        di3 di3VarF;
        boolean z;
        di3.CQf cQf;
        di3 di3Var = null;
        do {
            Object obj = this._state;
            di3VarF = ((di3) obj).f();
            z = true;
            if (di3VarF instanceof di3.CQf) {
                io.ktor.utils.io.internal.QnHx qnHx = di3VarF.b;
                if (qnHx._availableForWrite$internal == qnHx.a) {
                    di3VarF = di3.QnHx.c;
                    di3Var = di3VarF;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, di3VarF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (di3VarF != di3.QnHx.c || (cQf = (di3.CQf) di3Var) == null) {
            return;
        }
        E(cQf.c);
    }

    public final void J() {
        z80 z80Var = (z80) l.getAndSet(this, null);
        if (z80Var != null) {
            ot otVar = (ot) this._closed;
            Throwable th = otVar != null ? otVar.a : null;
            if (th != null) {
                z80Var.x(new fq3.QnHx(th));
            } else {
                z80Var.x(Boolean.TRUE);
            }
        }
    }

    public final void K() {
        z80 z80Var;
        ot otVar;
        boolean z;
        do {
            z80Var = (z80) this._writeOp;
            if (z80Var == null) {
                return;
            }
            otVar = (ot) this._closed;
            if (otVar == null && this.joining != null) {
                di3 di3Var = (di3) this._state;
                if (!(di3Var instanceof di3.auxFixed) && !(di3Var instanceof di3.NUlFixed) && di3Var != di3.YKK.c) {
                    return;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, z80Var, null)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != z80Var) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (otVar == null) {
            z80Var.x(sd5.a);
        } else {
            z80Var.x(new fq3.QnHx(otVar.a()));
        }
    }

    public final ByteBuffer L() throws Throwable {
        boolean z;
        Throwable th;
        di3 di3VarC;
        Throwable th2;
        do {
            Object obj = this._state;
            di3 di3Var = (di3) obj;
            z = true;
            if (ur1.a(di3Var, di3.YKK.c) ? true : ur1.a(di3Var, di3.QnHx.c)) {
                ot otVar = (ot) this._closed;
                if (otVar == null || (th = otVar.a) == null) {
                    return null;
                }
                C0239D.h(th);
                throw null;
            }
            ot otVar2 = (ot) this._closed;
            if (otVar2 != null && (th2 = otVar2.a) != null) {
                C0239D.h(th2);
                throw null;
            }
            if (di3Var.b._availableForRead$internal == 0) {
                return null;
            }
            di3VarC = di3Var.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, di3VarC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        ByteBuffer byteBufferA = di3VarC.a();
        w(byteBufferA, this.e, di3VarC.b._availableForRead$internal);
        return byteBufferA;
    }

    public final ByteBuffer M() throws Throwable {
        di3 di3VarD;
        boolean z;
        z80 z80Var = (z80) this._writeOp;
        if (z80Var != null) {
            throw new IllegalStateException("Write operation is already in progress: " + z80Var);
        }
        di3.F1 f1B = null;
        while (true) {
            Object obj = this._state;
            di3 di3Var = (di3) obj;
            if (this.joining != null) {
                if (f1B != null) {
                    E(f1B);
                }
                return null;
            }
            if (((ot) this._closed) != null) {
                if (f1B != null) {
                    E(f1B);
                }
                C0239D.h(((ot) this._closed).a());
                throw null;
            }
            if (di3Var == di3.QnHx.c) {
                if (f1B == null) {
                    f1B = this.c.B();
                    f1B.b.f();
                }
                di3VarD = f1B.g;
            } else {
                if (di3Var == di3.YKK.c) {
                    if (f1B != null) {
                        E(f1B);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    C0239D.h(((ot) this._closed).a());
                    throw null;
                }
                di3VarD = di3Var.d();
            }
            di3 di3Var2 = di3VarD;
            di3.F1 f1 = f1B;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, di3Var2)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z = false;
                    break;
                }
            }
            if (z) {
                if (((ot) this._closed) != null) {
                    I();
                    R();
                    C0239D.h(((ot) this._closed).a());
                    throw null;
                }
                ByteBuffer byteBufferB = di3Var2.b();
                if (f1 != null) {
                    if (di3Var == null) {
                        ur1.e("old");
                        throw null;
                    }
                    if (di3Var != di3.QnHx.c) {
                        E(f1);
                    }
                }
                w(byteBufferB, this.f, di3Var2.b._availableForWrite$internal);
                return byteBufferB;
            }
            f1B = f1;
        }
    }

    public final boolean N() {
        return this.joining != null && (((di3) this._state) == di3.QnHx.c || (((di3) this._state) instanceof di3.CQf));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    public final void O(int i, zm zmVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        do {
            di3 di3Var = (di3) this._state;
            z = true;
            if (!(di3Var.b._availableForRead$internal < i && (this.joining == null || ((z80) this._writeOp) == null || !(di3Var == di3.QnHx.c || (di3Var instanceof di3.CQf))))) {
                zmVar.x(Boolean.TRUE);
                return;
            }
            ot otVar = (ot) this._closed;
            if (otVar != null) {
                Throwable th = otVar.a;
                if (th != null) {
                    zmVar.x(new fq3.QnHx(th));
                    return;
                } else {
                    zmVar.x(Boolean.valueOf(((di3) this._state).b.c() && (((di3) this._state).b._availableForRead$internal >= i)));
                    return;
                }
            }
            while (true) {
                if (!(((z80) this._readOp) == null)) {
                    throw new IllegalStateException("Operation is already in progress".toString());
                }
                if (((ot) this._closed) == null) {
                    di3 di3Var2 = (di3) this._state;
                    if (di3Var2.b._availableForRead$internal < i && (this.joining == null || ((z80) this._writeOp) == null || !(di3Var2 == di3.QnHx.c || (di3Var2 instanceof di3.CQf)))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, zmVar)) {
                            z3 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != null) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        if (((ot) this._closed) == null) {
                            di3 di3Var3 = (di3) this._state;
                            if (di3Var3.b._availableForRead$internal < i && (this.joining == null || ((z80) this._writeOp) == null || !(di3Var3 == di3.QnHx.c || (di3Var3 instanceof di3.CQf)))) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(this, zmVar, null)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater2.get(this) != zmVar) {
                                    z5 = false;
                                    break;
                                }
                            }
                            if (!z5) {
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                }
                z = false;
                break;
            }
        } while (!z);
    }

    public final boolean P(vs1 vs1Var) {
        if (!Q(true)) {
            return false;
        }
        if (((ot) this._closed) != null) {
            this.joining = null;
            vs1Var.getClass();
            throw null;
        }
        z80 z80Var = (z80) l.getAndSet(this, null);
        if (z80Var != null) {
            z80Var.x(new fq3.QnHx(new IllegalStateException("Joining is in progress")));
        }
        K();
        return true;
    }

    public final boolean Q(boolean z) {
        boolean z2;
        di3.F1 f1 = null;
        do {
            Object obj = this._state;
            di3 di3Var = (di3) obj;
            ot otVar = (ot) this._closed;
            if (f1 != null) {
                if ((otVar != null ? otVar.a : null) == null) {
                    f1.b.f();
                }
                K();
                f1 = null;
            }
            di3.YKK ykk = di3.YKK.c;
            if (di3Var == ykk) {
                return true;
            }
            z2 = false;
            if (di3Var != di3.QnHx.c) {
                if (otVar != null && (di3Var instanceof di3.CQf) && (di3Var.b.g() || otVar.a != null)) {
                    if (otVar.a != null) {
                        io.ktor.utils.io.internal.QnHx qnHx = di3Var.b;
                        qnHx.getClass();
                        io.ktor.utils.io.internal.QnHx.c.getAndSet(qnHx, 0);
                    }
                    f1 = ((di3.CQf) di3Var).c;
                } else {
                    if (!z || !(di3Var instanceof di3.CQf) || !di3Var.b.g()) {
                        return false;
                    }
                    f1 = ((di3.CQf) di3Var).c;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, ykk)) {
                    z2 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        } while (!z2);
        if (f1 != null && ((di3) this._state) == di3.YKK.c) {
            E(f1);
        }
        return true;
    }

    public final void R() {
        if (((ot) this._closed) == null || !Q(false)) {
            return;
        }
        if (this.joining != null && ((ot) this._closed) != null) {
            this.joining = null;
            throw null;
        }
        J();
        K();
    }

    public final Object S(b90 b90Var) throws Throwable {
        if (!a0(1)) {
            ot otVar = (ot) this._closed;
            if (otVar == null) {
                return sd5.a;
            }
            C0239D.h(otVar.a());
            throw null;
        }
        this.writeSuspensionSize = 1;
        ms1 ms1Var = this.attachedJob;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (ms1Var != null) {
            this.i.invoke(b90Var);
            return va0Var;
        }
        zm<sd5> zmVar = this.h;
        this.i.invoke(zmVar);
        Object objD = zmVar.d(ps0.L(b90Var));
        return objD == va0Var ? objD : sd5.a;
    }

    public final int U(byte[] bArr, int i, int i2) throws Throwable {
        vs1 vs1Var = this.joining;
        if (vs1Var != null) {
            G(this, vs1Var);
        }
        ByteBuffer byteBufferM = M();
        if (byteBufferM == null) {
            return 0;
        }
        io.ktor.utils.io.internal.QnHx qnHx = ((di3) this._state).b;
        try {
            ot otVar = (ot) this._closed;
            if (otVar != null) {
                C0239D.h(otVar.a());
                throw null;
            }
            int i3 = 0;
            while (true) {
                int iH = qnHx.h(Math.min(i2 - i3, byteBufferM.remaining()));
                if (iH == 0) {
                    s(byteBufferM, qnHx, i3);
                    if (qnHx.d() || this.b) {
                        v(1);
                    }
                    I();
                    R();
                    return i3;
                }
                if (!(iH > 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                byteBufferM.put(bArr, i + i3, iH);
                i3 += iH;
                w(byteBufferM, t(byteBufferM, this.f + i3), qnHx._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (qnHx.d() || this.b) {
                v(1);
            }
            I();
            R();
            throw th;
        }
    }

    public final void V(fg fgVar) throws Throwable {
        vs1 vs1Var = this.joining;
        if (vs1Var != null) {
            G(this, vs1Var);
        }
        ByteBuffer byteBufferM = M();
        if (byteBufferM == null) {
            return;
        }
        io.ktor.utils.io.internal.QnHx qnHx = ((di3) this._state).b;
        try {
            ot otVar = (ot) this._closed;
            if (otVar != null) {
                C0239D.h(otVar.a());
                throw null;
            }
            int i = 0;
            while (true) {
                int iH = qnHx.h(Math.min(fgVar.c - fgVar.b, byteBufferM.remaining()));
                if (iH == 0) {
                    break;
                }
                Th.r(fgVar, byteBufferM, iH);
                i += iH;
                w(byteBufferM, t(byteBufferM, this.f + i), qnHx._availableForWrite$internal);
            }
            s(byteBufferM, qnHx, i);
            if (qnHx.d() || this.b) {
                v(1);
            }
            I();
            R();
        } catch (Throwable th) {
            if (qnHx.d() || this.b) {
                v(1);
            }
            I();
            R();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:27:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W(defpackage.oq r6, defpackage.z80 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nj
            if (r0 == 0) goto L13
            r0 = r7
            nj r0 = (defpackage.nj) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            nj r0 = new nj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.B
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            r6 = 2
            if (r2 != r6) goto L2c
            defpackage.C0239D.H(r7)
            sd5 r6 = defpackage.sd5.a
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            fg r6 = r0.A
            io.ktor.utils.io.QnHx r2 = r0.z
            defpackage.C0239D.H(r7)
            goto L58
        L3c:
            defpackage.C0239D.H(r7)
            r2 = r5
        L40:
            int r7 = r6.c
            int r4 = r6.b
            if (r7 <= r4) goto L48
            r7 = 1
            goto L49
        L48:
            r7 = 0
        L49:
            if (r7 == 0) goto L63
            r0.z = r2
            r0.A = r6
            r0.D = r3
            java.lang.Object r7 = r2.S(r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            vs1 r7 = r2.joining
            if (r7 == 0) goto L5f
            G(r2, r7)
        L5f:
            r2.V(r6)
            goto L40
        L63:
            sd5 r6 = defpackage.sd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.QnHx.W(oq, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X(byte[] r7, int r8, int r9, defpackage.z80<? super defpackage.sd5> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.QnHx.auxFixed
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.QnHx$aux r0 = (io.ktor.utils.io.QnHx.auxFixed) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            io.ktor.utils.io.QnHx$aux r0 = new io.ktor.utils.io.QnHx$aux
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.D
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r7 = r0.C
            int r8 = r0.B
            byte[] r9 = r0.A
            io.ktor.utils.io.QnHx r2 = r0.z
            defpackage.C0239D.H(r10)
            goto L65
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.C0239D.H(r10)
            r2 = r6
        L3b:
            if (r9 <= 0) goto L71
            r0.z = r2
            r0.A = r7
            r0.B = r8
            r0.C = r9
            r0.F = r3
            vs1 r10 = r2.joining
            if (r10 == 0) goto L4e
            G(r2, r10)
        L4e:
            int r10 = r2.U(r7, r8, r9)
            if (r10 <= 0) goto L5b
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = r4
            goto L5f
        L5b:
            java.lang.Object r10 = r2.Z(r7, r8, r9, r0)
        L5f:
            if (r10 != r1) goto L62
            return r1
        L62:
            r5 = r9
            r9 = r7
            r7 = r5
        L65:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r8 = r8 + r10
            int r7 = r7 - r10
            r5 = r9
            r9 = r7
            r7 = r5
            goto L3b
        L71:
            sd5 r7 = defpackage.sd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.QnHx.X(byte[], int, int, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(int i, z80<? super sd5> z80Var) throws Throwable {
        byN byn;
        QnHx qnHx;
        boolean z;
        boolean z2;
        boolean z3;
        if (z80Var instanceof byN) {
            byn = (byN) z80Var;
            int i2 = byn.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byn.D = i2 - Integer.MIN_VALUE;
            } else {
                byn = new byN(z80Var);
            }
        } else {
            byn = new byN(z80Var);
        }
        Object obj = byn.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = byn.D;
        if (i3 == 0) {
            C0239D.H(obj);
            qnHx = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = byn.A;
            qnHx = byn.z;
            C0239D.H(obj);
        }
        while (qnHx.a0(i)) {
            byn.z = qnHx;
            byn.A = i;
            byn.D = 1;
            xm xmVar = new xm(1, ps0.L(byn));
            xmVar.r();
            do {
                ot otVar = (ot) qnHx._closed;
                if (otVar != null) {
                    C0239D.h(otVar.a());
                    throw null;
                }
                if (!qnHx.a0(i)) {
                    xmVar.x(sd5.a);
                    break;
                }
                while (true) {
                    z = false;
                    if (!(((z80) qnHx._writeOp) == null)) {
                        throw new IllegalStateException("Operation is already in progress".toString());
                    }
                    if (!qnHx.a0(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(qnHx, null, xmVar)) {
                            z2 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(qnHx) != null) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        if (!qnHx.a0(i)) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(qnHx, xmVar, null)) {
                                    z3 = true;
                                    break;
                                }
                                if (atomicReferenceFieldUpdater2.get(qnHx) != xmVar) {
                                    z3 = false;
                                    break;
                                }
                            }
                            if (!z3) {
                                z = true;
                                break;
                            }
                            break;
                        }
                        z = true;
                        break;
                        break;
                    }
                }
            } while (!z);
            qnHx.v(i);
            if (qnHx.N()) {
                qnHx.J();
            }
            if (xmVar.p() == va0Var) {
                return va0Var;
            }
        }
        ot otVar2 = (ot) qnHx._closed;
        if (otVar2 == null) {
            return sd5.a;
        }
        C0239D.h(otVar2.a());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Z(byte[] r6, int r7, int r8, defpackage.z80<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.QnHx.T23
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.QnHx$T23 r0 = (io.ktor.utils.io.QnHx.T23) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            io.ktor.utils.io.QnHx$T23 r0 = new io.ktor.utils.io.QnHx$T23
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.D
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L32
            r6 = 2
            if (r2 != r6) goto L2a
            defpackage.C0239D.H(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.C
            int r7 = r0.B
            byte[] r8 = r0.A
            io.ktor.utils.io.QnHx r2 = r0.z
            defpackage.C0239D.H(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L56
        L41:
            defpackage.C0239D.H(r9)
            r2 = r5
        L45:
            r0.z = r2
            r0.A = r6
            r0.B = r7
            r0.C = r8
            r0.F = r3
            java.lang.Object r9 = r2.S(r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            vs1 r9 = r2.joining
            if (r9 == 0) goto L5d
            G(r2, r9)
        L5d:
            int r9 = r2.U(r6, r7, r8)
            if (r9 <= 0) goto L45
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.QnHx.Z(byte[], int, int, z80):java.lang.Object");
    }

    @Override // defpackage.nk
    public final boolean a(Throwable th) {
        boolean z;
        if (((ot) this._closed) != null) {
            return false;
        }
        ot otVar = th == null ? ot.b : new ot(th);
        ((di3) this._state).b.c();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, otVar)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != null) {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        ((di3) this._state).b.c();
        io.ktor.utils.io.internal.QnHx qnHx = ((di3) this._state).b;
        if ((qnHx._availableForWrite$internal == qnHx.a) || th != null) {
            R();
        }
        z80 z80Var = (z80) l.getAndSet(this, null);
        if (z80Var != null) {
            if (th != null) {
                z80Var.x(new fq3.QnHx(th));
            } else {
                z80Var.x(Boolean.valueOf(((di3) this._state).b._availableForRead$internal > 0));
            }
        }
        z80 z80Var2 = (z80) m.getAndSet(this, null);
        if (z80Var2 != null) {
            z80Var2.x(new fq3.QnHx(th == null ? new ClosedWriteChannelException("Byte channel was closed") : th));
        }
        if (((di3) this._state) == di3.YKK.c && this.joining != null && ((ot) this._closed) != null) {
            this.joining = null;
            throw null;
        }
        if (th != null) {
            ms1 ms1Var = this.attachedJob;
            if (ms1Var != null) {
                ms1Var.m(null);
            }
            this.g.b(th);
            this.h.b(th);
            return true;
        }
        this.h.b(new ClosedWriteChannelException("Byte channel was closed"));
        zm<Boolean> zmVar = this.g;
        zmVar.x(Boolean.valueOf(((di3) this._state).b.c()));
        zm.QnHx qnHx2 = (zm.QnHx) zm.x.getAndSet(zmVar, null);
        if (qnHx2 != null) {
            qnHx2.a();
        }
        return true;
    }

    public final boolean a0(int i) {
        vs1 vs1Var = this.joining;
        di3 di3Var = (di3) this._state;
        if (((ot) this._closed) != null) {
            return false;
        }
        if (vs1Var == null) {
            if (di3Var.b._availableForWrite$internal >= i || di3Var == di3.QnHx.c) {
                return false;
            }
        } else if (di3Var == di3.YKK.c || (di3Var instanceof di3.auxFixed) || (di3Var instanceof di3.NUlFixed)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.oj
    public final void b(ms1 ms1Var) {
        ms1 ms1Var2 = this.attachedJob;
        if (ms1Var2 != null) {
            ms1Var2.m(null);
        }
        this.attachedJob = ms1Var;
        ms1.QnHx.a(ms1Var, true, new C0146QnHx(), 2);
    }

    @Override // defpackage.nk
    public final Object c(oq oqVar, gk.QnHx qnHx) throws Throwable {
        V(oqVar);
        if (!(oqVar.c > oqVar.b)) {
            return sd5.a;
        }
        Object objW = W(oqVar, qnHx);
        return objW == va0.COROUTINE_SUSPENDED ? objW : sd5.a;
    }

    @Override // defpackage.nk
    public final Object d(byte[] bArr, int i, px4 px4Var) throws Throwable {
        vs1 vs1Var = this.joining;
        if (vs1Var != null) {
            G(this, vs1Var);
        }
        int i2 = 0;
        while (i > 0) {
            int iU = U(bArr, i2, i);
            if (iU == 0) {
                break;
            }
            i2 += iU;
            i -= iU;
        }
        if (i == 0) {
            return sd5.a;
        }
        Object objX = X(bArr, i2, i, px4Var);
        return objX == va0.COROUTINE_SUSPENDED ? objX : sd5.a;
    }

    @Override // defpackage.nk
    public final Object e(int i, yt2.QnHx qnHx, yt2 yt2Var) {
        return T(this, i, qnHx, yt2Var);
    }

    @Override // defpackage.nk
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.nk
    public final void flush() {
        v(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(int i, j81<? super ByteBuffer, sd5> j81Var, z80<? super sd5> z80Var) throws Throwable {
        CQf cQf;
        QnHx qnHx;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i2 = cQf.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cQf.D = i2 - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object obj = cQf.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = cQf.D;
        if (i3 == 0) {
            C0239D.H(obj);
            cQf.z = this;
            cQf.A = j81Var;
            cQf.D = 1;
            if (Y(i, cQf) == va0Var) {
                return va0Var;
            }
            qnHx = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
                return sd5.a;
            }
            qnHx = cQf.z;
            C0239D.H(obj);
        }
        vs1 vs1Var = qnHx.joining;
        if (vs1Var != null) {
            G(qnHx, vs1Var);
        }
        return sd5.a;
    }

    public final void k(ByteBuffer byteBuffer, io.ktor.utils.io.internal.QnHx qnHx, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.e = t(byteBuffer, this.e + i);
        qnHx.a(i);
        this.totalBytesRead += (long) i;
        K();
    }

    @Override // defpackage.fk
    public final boolean l(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel has been cancelled");
        }
        return a(th);
    }

    @Override // defpackage.fk
    public final Object m(oq oqVar, z80<? super Integer> z80Var) throws Throwable {
        int iY = y(this, oqVar);
        if (iY == 0 && ((ot) this._closed) != null) {
            iY = ((di3) this._state).b.c() ? y(this, oqVar) : -1;
        } else if (iY <= 0) {
            if (oqVar.e > oqVar.c) {
                return z(oqVar, z80Var);
            }
        }
        return new Integer(iY);
    }

    @Override // defpackage.fk
    public final Throwable n() {
        ot otVar = (ot) this._closed;
        if (otVar != null) {
            return otVar.a;
        }
        return null;
    }

    @Override // defpackage.fk
    public final int o() {
        return ((di3) this._state).b._availableForRead$internal;
    }

    @Override // defpackage.fk
    public final Object p(long j2, z80<? super hk> z80Var) throws Throwable {
        if (!(((ot) this._closed) != null)) {
            return B(j2, z80Var);
        }
        Throwable thN = n();
        if (thN != null) {
            C0239D.h(thN);
            throw null;
        }
        ek ekVar = new ek(null);
        try {
            oq oqVarI = defpackage.YKK.i(ekVar, 1, null);
            while (true) {
                try {
                    if (oqVarI.e - oqVarI.c > j2) {
                        int i = oqVarI.d;
                        oqVarI.b = i;
                        oqVarI.c = i;
                        oqVarI.e = (int) j2;
                    }
                    j2 -= (long) y(this, oqVarI);
                    if (!(j2 > 0 && !r())) {
                        ekVar.b();
                        return ekVar.s();
                    }
                    oqVarI = defpackage.YKK.i(ekVar, 1, oqVarI);
                } catch (Throwable th) {
                    ekVar.b();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            ekVar.close();
            throw th2;
        }
    }

    @Override // defpackage.fk
    public final Object q(byte[] bArr, int i, int i2, b90 b90Var) throws Throwable {
        int iX = x(bArr, i, i2);
        if (iX == 0 && ((ot) this._closed) != null) {
            iX = ((di3) this._state).b.c() ? x(bArr, i, i2) : -1;
        } else if (iX <= 0 && i2 != 0) {
            return A(bArr, i, i2, b90Var);
        }
        return new Integer(iX);
    }

    @Override // defpackage.fk
    public final boolean r() {
        return ((di3) this._state) == di3.YKK.c && ((ot) this._closed) != null;
    }

    public final void s(ByteBuffer byteBuffer, io.ktor.utils.io.internal.QnHx qnHx, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f = t(byteBuffer, this.f + i);
        qnHx.b(i);
        this.totalBytesWritten += (long) i;
    }

    public final int t(ByteBuffer byteBuffer, int i) {
        int iCapacity = byteBuffer.capacity();
        int i2 = this.d;
        return i >= iCapacity - i2 ? i - (byteBuffer.capacity() - i2) : i;
    }

    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((di3) this._state) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02da A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02e0 A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02ea A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x030d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x0316  */
    /* JADX WARN: Code duplicated, block: B:155:0x0318 A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x031f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321 A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x032a  */
    /* JADX WARN: Code duplicated, block: B:165:0x032f A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0351 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x0352  */
    /* JADX WARN: Code duplicated, block: B:169:0x0353  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1 A[Catch: all -> 0x00d5, TryCatch #8 {all -> 0x00d5, blocks: (B:14:0x0039, B:37:0x00c7, B:39:0x00cd, B:41:0x00d1, B:44:0x00d8, B:139:0x02c2, B:142:0x02c9, B:144:0x02d5, B:145:0x02da, B:147:0x02e0, B:149:0x02ea, B:152:0x030e, B:155:0x0318, B:163:0x032b, B:165:0x032f, B:159:0x0321, B:47:0x00e7, B:129:0x028b, B:131:0x0291, B:135:0x029b, B:137:0x02b0, B:133:0x0295, B:178:0x0372, B:180:0x0378, B:184:0x0382, B:185:0x038a, B:186:0x0390, B:182:0x037c, B:188:0x0393, B:189:0x0397, B:19:0x005a), top: B:211:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x02d5 -> B:15:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(io.ktor.utils.io.QnHx r26, long r27, defpackage.z80 r29) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.QnHx.u(io.ktor.utils.io.QnHx, long, z80):java.lang.Object");
    }

    public final void v(int i) {
        di3 di3Var;
        di3.YKK ykk;
        do {
            di3Var = (di3) this._state;
            ykk = di3.YKK.c;
            if (di3Var == ykk) {
                return;
            } else {
                di3Var.b.c();
            }
        } while (di3Var != ((di3) this._state));
        int i2 = di3Var.b._availableForWrite$internal;
        if (di3Var.b._availableForRead$internal >= 1) {
            J();
        }
        vs1 vs1Var = this.joining;
        if (i2 >= i) {
            if (vs1Var == null || ((di3) this._state) == ykk) {
                K();
            }
        }
    }

    public final void w(ByteBuffer byteBuffer, int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iCapacity = byteBuffer.capacity() - this.d;
        int i3 = i2 + i;
        if (i3 <= iCapacity) {
            iCapacity = i3;
        }
        byteBuffer.limit(iCapacity);
        byteBuffer.position(i);
    }

    public final int x(byte[] bArr, int i, int i2) throws Throwable {
        int iMin;
        ByteBuffer byteBufferL = L();
        int i3 = 0;
        if (byteBufferL != null) {
            io.ktor.utils.io.internal.QnHx qnHx = ((di3) this._state).b;
            try {
                if (qnHx._availableForRead$internal != 0) {
                    int iCapacity = byteBufferL.capacity() - this.d;
                    int i4 = 0;
                    while (true) {
                        int i5 = i2 - i4;
                        if (i5 == 0) {
                            break;
                        }
                        int i6 = this.e;
                        int iMin2 = Math.min(iCapacity - i6, i5);
                        while (true) {
                            int i7 = qnHx._availableForRead$internal;
                            int iMin3 = Math.min(iMin2, i7);
                            if (iMin3 == 0) {
                                iMin = 0;
                                break;
                            }
                            if (io.ktor.utils.io.internal.QnHx.b.compareAndSet(qnHx, i7, i7 - iMin3)) {
                                iMin = Math.min(iMin2, i7);
                                break;
                            }
                        }
                        if (iMin == 0) {
                            break;
                        }
                        byteBufferL.limit(i6 + iMin);
                        byteBufferL.position(i6);
                        byteBufferL.get(bArr, i + i4, iMin);
                        k(byteBufferL, qnHx, iMin);
                        i4 += iMin;
                    }
                    i3 = i4;
                }
                H();
                R();
            } catch (Throwable th) {
                H();
                R();
                throw th;
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(oq oqVar, z80<? super Integer> z80Var) throws Throwable {
        LPt8Fixed lPt8;
        QnHx qnHx;
        if (z80Var instanceof LPt8Fixed) {
            lPt8 = (LPt8Fixed) z80Var;
            int i = lPt8.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                lPt8.D = i - Integer.MIN_VALUE;
            } else {
                lPt8 = new LPt8Fixed(z80Var);
            }
        } else {
            lPt8 = new LPt8Fixed(z80Var);
        }
        Object objC = lPt8.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = lPt8.D;
        if (i2 != 0) {
            if (i2 == 1) {
                oqVar = lPt8.A;
                qnHx = lPt8.z;
                C0239D.H(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objC);
            }
        }
        C0239D.H(objC);
        lPt8.z = this;
        lPt8.A = oqVar;
        lPt8.D = 1;
        objC = C(lPt8);
        if (objC == va0Var) {
            return va0Var;
        }
        qnHx = this;
        if (!((Boolean) objC).booleanValue()) {
            return new Integer(-1);
        }
        lPt8.z = null;
        lPt8.A = null;
        lPt8.D = 2;
        objC = qnHx.m(oqVar, lPt8);
        return objC == va0Var ? va0Var : objC;
    }

    public QnHx(boolean z, nq2<di3.F1> nq2Var, int i) {
        this.b = z;
        this.c = nq2Var;
        this.d = i;
        this._state = di3.QnHx.c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oq.i;
        F();
        ByteBuffer byteBuffer = oq.m.a;
        io.ktor.utils.io.internal.QnHx qnHx = ((di3) this._state).b;
        this.g = new zm<>();
        this.h = new zm<>();
        this.i = new EQ();
    }
}
