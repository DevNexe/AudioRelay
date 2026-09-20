package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
public final class aw extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public jo A;
    public byte[] B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ mz0<Object>[] G;
    public final /* synthetic */ h81<Object[]> H;
    public final /* synthetic */ y81<nz0<Object>, Object[], z80<? super sd5>, Object> I;
    public final /* synthetic */ nz0<Object> J;

    @if0(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ mz0<Object>[] B;
        public final /* synthetic */ int C;
        public final /* synthetic */ AtomicInteger D;
        public final /* synthetic */ jo<rj1<Object>> E;

        /* JADX INFO: renamed from: aw$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0040QnHx<T> implements nz0 {
            public final /* synthetic */ jo<rj1<Object>> w;
            public final /* synthetic */ int x;

            /* JADX INFO: renamed from: aw$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {35, 36}, m = "emit")
            public static final class C0041QnHx extends b90 {
                public final /* synthetic */ C0040QnHx<T> A;
                public int B;
                public /* synthetic */ Object z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0041QnHx(C0040QnHx<? super T> c0040QnHx, z80<? super C0041QnHx> z80Var) {
                    super(z80Var);
                    this.A = c0040QnHx;
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.B |= Integer.MIN_VALUE;
                    return this.A.f(null, this);
                }
            }

            public C0040QnHx(jo<rj1<Object>> joVar, int i) {
                this.w = joVar;
                this.x = i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
                C0041QnHx c0041QnHx;
                if (z80Var instanceof C0041QnHx) {
                    c0041QnHx = (C0041QnHx) z80Var;
                    int i = c0041QnHx.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0041QnHx.B = i - Integer.MIN_VALUE;
                    } else {
                        c0041QnHx = new C0041QnHx(this, z80Var);
                    }
                } else {
                    c0041QnHx = new C0041QnHx(this, z80Var);
                }
                Object obj = c0041QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0041QnHx.B;
                if (i2 != 0) {
                    if (i2 == 1) {
                        C0239D.H(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    return sd5.a;
                }
                C0239D.H(obj);
                rj1<Object> rj1Var = new rj1<>(this.x, t);
                c0041QnHx.B = 1;
                if (this.w.p(rj1Var, c0041QnHx) == va0Var) {
                    return va0Var;
                }
                c0041QnHx.B = 2;
                if (ps0.u0(c0041QnHx) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(mz0<Object>[] mz0VarArr, int i, AtomicInteger atomicInteger, jo<rj1<Object>> joVar, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = mz0VarArr;
            this.C = i;
            this.D = atomicInteger;
            this.E = joVar;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, this.E, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            AtomicInteger atomicInteger = this.D;
            jo<rj1<Object>> joVar = this.E;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    mz0<Object>[] mz0VarArr = this.B;
                    int i2 = this.C;
                    mz0<Object> mz0Var = mz0VarArr[i2];
                    C0040QnHx c0040QnHx = new C0040QnHx(joVar, i2);
                    this.A = 1;
                    if (mz0Var.a(c0040QnHx, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    joVar.a(null);
                }
                return sd5.a;
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    joVar.a(null);
                }
                throw th;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(z80 z80Var, h81 h81Var, y81 y81Var, nz0 nz0Var, mz0[] mz0VarArr) {
        super(2, z80Var);
        this.G = mz0VarArr;
        this.H = h81Var;
        this.I = y81Var;
        this.J = nz0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        aw awVar = new aw(z80Var, this.H, this.I, this.J, this.G);
        awVar.F = obj;
        return awVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00be A[LOOP:0: B:29:0x00be->B:50:?, LOOP_START, PHI: r7 r10
  0x00be: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:26:0x00b9, B:50:?] A[DONT_GENERATE, DONT_INLINE]
  0x00be: PHI (r10v4 rj1) = (r10v3 rj1), (r10v15 rj1) binds: [B:26:0x00b9, B:50:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[EDGE_INSN: B:48:0x00dd->B:36:0x00dd BREAK  A[LOOP:0: B:29:0x00be->B:50:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0135 -> B:45:0x0138). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((aw) a(ua0Var, z80Var)).i(sd5.a);
    }
}
