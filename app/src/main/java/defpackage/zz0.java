package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zz0<T> implements nz0 {
    public final /* synthetic */ nz0<T> w;
    public final /* synthetic */ jl3<Throwable> x;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public final /* synthetic */ zz0<T> B;
        public int C;
        public zz0 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(zz0<? super T> zz0Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.B = zz0Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zz0(nz0<? super T> nz0Var, jl3<Throwable> jl3Var) {
        this.w = nz0Var;
        this.x = jl3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        Object obj;
        zz0<T> zz0Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj2 = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zz0Var = qnHx.z;
            try {
                C0239D.H(obj2);
                return sd5.a;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            /*
                this = this;
                boolean r0 = r6 instanceof zz0.QnHx
                if (r0 == 0) goto L13
                r0 = r6
                zz0$QnHx r0 = (zz0.QnHx) r0
                int r1 = r0.C
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.C = r1
                goto L18
            L13:
                zz0$QnHx r0 = new zz0$QnHx
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.A
                va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
                int r2 = r0.C
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                zz0 r5 = r0.z
                defpackage.C0239D.H(r6)     // Catch: java.lang.Throwable -> L29
                goto L43
            L29:
                r6 = move-exception
                goto L49
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                defpackage.C0239D.H(r6)
                nz0<T> r6 = r4.w     // Catch: java.lang.Throwable -> L46
                r0.z = r4     // Catch: java.lang.Throwable -> L46
                r0.C = r3     // Catch: java.lang.Throwable -> L46
                java.lang.Object r5 = r6.f(r5, r0)     // Catch: java.lang.Throwable -> L46
                if (r5 != r1) goto L43
                return r1
            L43:
                sd5 r5 = defpackage.sd5.a
                return r5
            L46:
                r5 = move-exception
                r6 = r5
                r5 = r4
            L49:
                jl3<java.lang.Throwable> r5 = r5.x
                r5.w = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zz0.f(java.lang.Object, z80):java.lang.Object");
        }
    }
