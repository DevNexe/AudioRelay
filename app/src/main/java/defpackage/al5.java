package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class al5 implements mz0<zk5.QnHx> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ cl5 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ cl5 x;

        /* JADX INFO: renamed from: al5$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.audio.volume.VolumeShaperStore$getConfigStream$$inlined$map$1$2", f = "VolumeShaperStore.kt", l = {224}, m = "emit")
        public static final class C0013QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0013QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, cl5 cl5Var) {
            this.w = nz0Var;
            this.x = cl5Var;
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
            C0013QnHx c0013QnHx;
            zk5.QnHx qnHx;
            if (z80Var instanceof C0013QnHx) {
                c0013QnHx = (C0013QnHx) z80Var;
                int i = c0013QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0013QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0013QnHx = new C0013QnHx(z80Var);
                }
            } else {
                c0013QnHx = new C0013QnHx(z80Var);
            }
            Object obj2 = c0013QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0013QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                String str = (String) obj;
                this.x.getClass();
                if (ur1.a(str, "capture_gain_volume")) {
                    qnHx = zk5.QnHx.C0234QnHx.a;
                } else {
                    qnHx = ur1.a(str, "normalize_volume") ? zk5.QnHx.CQf.a : zk5.QnHx.CQf.a;
                }
                c0013QnHx.A = 1;
                if (this.w.f(qnHx, c0013QnHx) == va0Var) {
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

    public al5(mz0 mz0Var, cl5 cl5Var) {
        this.w = mz0Var;
        this.x = cl5Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super zk5.QnHx> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
