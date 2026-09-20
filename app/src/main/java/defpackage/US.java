package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class US implements mz0<List<? extends String>> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ X1GO x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ X1GO x;

        /* JADX INFO: renamed from: US$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.player.AddressStore$getLastManualAddressesStream$$inlined$map$1$2", f = "AddressStore.kt", l = {224}, m = "emit")
        public static final class C0008QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0008QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, X1GO x1go) {
            this.w = nz0Var;
            this.x = x1go;
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
            C0008QnHx c0008QnHx;
            Collection collectionJ0;
            if (z80Var instanceof C0008QnHx) {
                c0008QnHx = (C0008QnHx) z80Var;
                int i = c0008QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0008QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0008QnHx = new C0008QnHx(z80Var);
                }
            } else {
                c0008QnHx = new C0008QnHx(z80Var);
            }
            Object obj2 = c0008QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0008QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                String str = (String) obj;
                X1GO x1go = this.x;
                x1go.getClass();
                if (iv4.s(str)) {
                    collectionJ0 = cs0.w;
                } else {
                    ws1 ws1Var = (ws1) x1go.a.x;
                    lb4 lb4Var = ws1Var.b;
                    int i3 = vv1.c;
                    vv1 vv1Var = new vv1(1, nl3.c(String.class));
                    ar arVarA = nl3.a(String[].class);
                    List listSingletonList = Collections.singletonList(vv1Var);
                    nl3.a.getClass();
                    collectionJ0 = oV9.j0((Object[]) ws1Var.c(ib4.serializer(lb4Var, new xb5(arVarA, listSingletonList, false)), str));
                }
                c0008QnHx.A = 1;
                if (this.w.f(collectionJ0, c0008QnHx) == va0Var) {
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

    public US(mz0 mz0Var, X1GO x1go) {
        this.w = mz0Var;
        this.x = x1go;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super List<? extends String>> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
