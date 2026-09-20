package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class wv3 implements mz0<cv3> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: wv3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$1$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0219QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0219QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var) {
            this.w = nz0Var;
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
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0219QnHx c0219QnHx;
            cv3 qnHx;
            if (z80Var instanceof C0219QnHx) {
                c0219QnHx = (C0219QnHx) z80Var;
                int i = c0219QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0219QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0219QnHx = new C0219QnHx(z80Var);
                }
            } else {
                c0219QnHx = new C0219QnHx(z80Var);
            }
            Object obj2 = c0219QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0219QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                oMl oml = (oMl) obj;
                if (oml instanceof ey1) {
                    qnHx = new cv3.QnHx(((ey1) oml).b);
                } else if (ur1.a(oml, ro2.a)) {
                    qnHx = cv3.CQf.a;
                } else {
                    if (!ur1.a(oml, so2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qnHx = cv3.F1.a;
                }
                c0219QnHx.A = 1;
                if (this.w.f(qnHx, c0219QnHx) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj2);
            }
            return sd5.a;
        }
    }

    public wv3(am amVar) {
        this.w = amVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super cv3> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
