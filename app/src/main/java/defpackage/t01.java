package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t01<T> implements nz0 {
    public final /* synthetic */ jl3<Object> w;
    public final /* synthetic */ y81<T, T, z80<? super T>, Object> x;
    public final /* synthetic */ nz0<T> y;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", l = {125, 127}, m = "emit")
    public static final class QnHx extends b90 {
        public jl3 A;
        public /* synthetic */ Object B;
        public final /* synthetic */ t01<T> C;
        public int D;
        public t01 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(t01<? super T> t01Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.C = t01Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return this.C.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t01(jl3<Object> jl3Var, y81<? super T, ? super T, ? super z80<? super T>, ? extends Object> y81Var, nz0<? super T> nz0Var) {
        this.w = jl3Var;
        this.x = y81Var;
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
        QnHx qnHx;
        jl3<Object> jl3Var;
        t01<T> t01Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 != 0) {
            if (i2 == 1) {
                jl3<Object> jl3Var2 = qnHx.A;
                t01Var = qnHx.z;
                C0239D.H(obj);
                jl3Var = jl3Var2;
                t = (T) obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        jl3Var = this.w;
        Object obj2 = jl3Var.w;
        if (obj2 != v3A.x) {
            qnHx.z = this;
            qnHx.A = jl3Var;
            qnHx.D = 1;
            t = (T) this.x.invoke((T) obj2, t, qnHx);
            if (t == va0Var) {
                return va0Var;
            }
        }
        t01Var = this;
        jl3Var.w = t;
        nz0<T> nz0Var = t01Var.y;
        T t2 = t01Var.w.w;
        qnHx.z = null;
        qnHx.A = null;
        qnHx.D = 2;
        if (nz0Var.f(t2, qnHx) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }
}
