package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dm implements mz0<String> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ X1GO x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ X1GO x;

        /* JADX INFO: renamed from: dm$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.player.AddressStore$saveManualAddress$$inlined$map$2$2", f = "AddressStore.kt", l = {224}, m = "emit")
        public static final class C0116QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0116QnHx(z80 z80Var) {
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
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0116QnHx c0116QnHx;
            if (z80Var instanceof C0116QnHx) {
                c0116QnHx = (C0116QnHx) z80Var;
                int i = c0116QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0116QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0116QnHx = new C0116QnHx(z80Var);
                }
            } else {
                c0116QnHx = new C0116QnHx(z80Var);
            }
            Object obj2 = c0116QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0116QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                ta2 ta2Var = this.x.a;
                Object[] array = ((List) obj).toArray(new String[0]);
                ws1 ws1Var = (ws1) ta2Var.x;
                lb4 lb4Var = ws1Var.b;
                int i3 = vv1.c;
                vv1 vv1Var = new vv1(1, nl3.c(String.class));
                ar arVarA = nl3.a(String[].class);
                List listSingletonList = Collections.singletonList(vv1Var);
                nl3.a.getClass();
                String strB = ws1Var.b(ib4.serializer(lb4Var, new xb5(arVarA, listSingletonList, false)), array);
                c0116QnHx.A = 1;
                if (this.w.f(strB, c0116QnHx) == va0Var) {
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

    public dm(sKP skp, X1GO x1go) {
        this.w = skp;
        this.x = x1go;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super String> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
