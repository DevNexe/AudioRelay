package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lm0<T> implements mz0<T> {
    public final mz0<T> w;
    public final j81<T, Object> x;
    public final x81<Object, Object, Boolean> y;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ lm0<T> w;
        public final /* synthetic */ jl3<Object> x;
        public final /* synthetic */ nz0<T> y;

        /* JADX INFO: renamed from: lm0$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        public static final class C0164QnHx extends b90 {
            public final /* synthetic */ QnHx<T> A;
            public int B;
            public /* synthetic */ Object z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0164QnHx(QnHx<? super T> qnHx, z80<? super C0164QnHx> z80Var) {
                super(z80Var);
                this.A = qnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.B |= Integer.MIN_VALUE;
                return this.A.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(lm0<T> lm0Var, jl3<Object> jl3Var, nz0<? super T> nz0Var) {
            this.w = lm0Var;
            this.x = jl3Var;
            this.y = nz0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.nz0
        public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
            C0164QnHx c0164QnHx;
            if (z80Var instanceof C0164QnHx) {
                c0164QnHx = (C0164QnHx) z80Var;
                int i = c0164QnHx.B;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0164QnHx.B = i - Integer.MIN_VALUE;
                } else {
                    c0164QnHx = new C0164QnHx(this, z80Var);
                }
            } else {
                c0164QnHx = new C0164QnHx(this, z80Var);
            }
            Object obj = c0164QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0164QnHx.B;
            if (i2 == 0) {
                C0239D.H(obj);
                lm0<T> lm0Var = this.w;
                T t2 = (T) lm0Var.x.invoke(t);
                jl3<Object> jl3Var = this.x;
                Object obj2 = jl3Var.w;
                if (obj2 != v3A.x && lm0Var.y.invoke(obj2, t2).booleanValue()) {
                    return sd5.a;
                }
                jl3Var.w = t2;
                c0164QnHx.B = 1;
                if (this.y.f(t, c0164QnHx) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
    }

    public lm0(mz0 mz0Var) {
        tz0.CQf cQf = tz0.a;
        tz0.QnHx qnHx = tz0.b;
        this.w = mz0Var;
        this.x = cQf;
        this.y = qnHx;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<? super sd5> z80Var) {
        jl3 jl3Var = new jl3();
        jl3Var.w = (T) v3A.x;
        Object objA = this.w.a(new QnHx(this, jl3Var, nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
