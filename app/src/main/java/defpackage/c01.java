package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c01<T> implements nz0 {
    public final /* synthetic */ fl3 w;
    public final /* synthetic */ nz0<T> x;
    public final /* synthetic */ x81<T, z80<? super Boolean>, Object> y;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
    public static final class QnHx extends b90 {
        public Object A;
        public /* synthetic */ Object B;
        public final /* synthetic */ c01<T> C;
        public int D;
        public c01 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(c01<? super T> c01Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.C = c01Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return this.C.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c01(fl3 fl3Var, nz0<? super T> nz0Var, x81<? super T, ? super z80<? super Boolean>, ? extends Object> x81Var) {
        this.w = fl3Var;
        this.x = nz0Var;
        this.y = x81Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
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
        c01<T> c01Var;
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
        Object objInvoke = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 == 0) {
            C0239D.H(objInvoke);
            if (this.w.w) {
                qnHx.D = 1;
                if (this.x.f(t, qnHx) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
            qnHx.z = this;
            qnHx.A = t;
            qnHx.D = 2;
            objInvoke = this.y.invoke(t, qnHx);
            if (objInvoke == va0Var) {
                return va0Var;
            }
            c01Var = this;
            if (!((Boolean) objInvoke).booleanValue()) {
                return sd5.a;
            }
            c01Var.w.w = true;
            qnHx.z = null;
            qnHx.A = null;
            qnHx.D = 3;
            if (c01Var.x.f(t, qnHx) == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 == 1) {
                C0239D.H(objInvoke);
                return sd5.a;
            }
            if (i2 == 2) {
                t = (T) qnHx.A;
                c01Var = qnHx.z;
                C0239D.H(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    return sd5.a;
                }
                c01Var.w.w = true;
                qnHx.z = null;
                qnHx.A = null;
                qnHx.D = 3;
                if (c01Var.x.f(t, qnHx) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objInvoke);
            }
        }
        return sd5.a;
    }
}
