package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class t71 implements mz0<d71> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: t71$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.ads.ui.adsfragment.FullScreenAdsInputHandler$loadAd$$inlined$map$1$2", f = "FullScreenAdsInputHandler.kt", l = {224}, m = "emit")
        public static final class C0202QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0202QnHx(z80 z80Var) {
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
        /* JADX WARN: Multi-variable type inference failed */
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
            C0202QnHx c0202QnHx;
            Object nUl;
            if (z80Var instanceof C0202QnHx) {
                c0202QnHx = (C0202QnHx) z80Var;
                int i = c0202QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0202QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0202QnHx = new C0202QnHx(z80Var);
                }
            } else {
                c0202QnHx = new C0202QnHx(z80Var);
            }
            Object obj2 = c0202QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0202QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                xq0 xq0Var = (xq0) obj;
                if (xq0Var instanceof xq0.QnHx) {
                    nUl = new d71.QnHx(null);
                } else {
                    if (!(xq0Var instanceof xq0.CQf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nUl = new d71.NUlFixed((JBK6) ((xq0.CQf) xq0Var).a);
                }
                c0202QnHx.A = 1;
                if (this.w.f(nUl, c0202QnHx) == va0Var) {
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

    public t71(am amVar) {
        this.w = amVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super d71> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
