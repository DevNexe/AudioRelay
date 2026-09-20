package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n75 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ y81<T, g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ T w;
        public final /* synthetic */ T x;
        public final /* synthetic */ long y;
        public final /* synthetic */ x81<T, T, Boolean> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(T t, T t2, long j, x81<? super T, ? super T, Boolean> x81Var, y81<? super T, ? super g30, ? super Integer, sd5> y81Var, int i) {
            super(2);
            this.w = t;
            this.x = t2;
            this.y = j;
            this.z = x81Var;
            this.A = y81Var;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            n75.a(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.compose.ThrottleStateChangeKt$ThrottleStateChange$1", f = "ThrottleStateChange.kt", l = {31}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ x81<T, T, Boolean> B;
        public final /* synthetic */ ri2<T> C;
        public final /* synthetic */ T D;
        public final /* synthetic */ long E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(x81<? super T, ? super T, Boolean> x81Var, ri2<T> ri2Var, T t, long j, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = x81Var;
            this.C = ri2Var;
            this.D = t;
            this.E = j;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, this.E, z80Var);
        }

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
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            T t = this.D;
            ri2<T> ri2Var = this.C;
            if (i == 0) {
                C0239D.H(obj);
                if (this.B.invoke(ri2Var.getValue(), t).booleanValue()) {
                    this.A = 1;
                    if (S12N.e(this.E, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    ri2Var.setValue(t);
                }
                return sd5.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            ri2Var.setValue(t);
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final <T> void a(T t, T t2, long j, x81<? super T, ? super T, Boolean> x81Var, y81<? super T, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(619371540);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(t) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(t2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.j(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(y81Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                objB0 = ps0.R(t);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var = (ri2) objB0;
            wq0.d(t2, new QnHx(x81Var, ri2Var, t2, j, null), j30VarQ);
            y81Var.invoke((Object) ri2Var.getValue(), j30VarQ, Integer.valueOf((i3 & 8) | ((i3 >> 9) & 112)));
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(t, t2, j, x81Var, y81Var, i);
    }
}
