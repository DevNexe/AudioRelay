package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sKP implements mz0<List<? extends String>> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ X1GO x;
    public final /* synthetic */ String y;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ X1GO x;
        public final /* synthetic */ String y;

        /* JADX INFO: renamed from: sKP$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.player.AddressStore$saveManualAddress$$inlined$map$1$2", f = "AddressStore.kt", l = {224}, m = "emit")
        public static final class C0196QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0196QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, X1GO x1go, String str) {
            this.w = nz0Var;
            this.x = x1go;
            this.y = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0196QnHx c0196QnHx;
            if (z80Var instanceof C0196QnHx) {
                c0196QnHx = (C0196QnHx) z80Var;
                int i = c0196QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0196QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0196QnHx = new C0196QnHx(z80Var);
                }
            } else {
                c0196QnHx = new C0196QnHx(z80Var);
            }
            Object obj2 = c0196QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0196QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                this.x.getClass();
                String str = this.y;
                List listA1 = wu.a1(wu.U0(wu.S0((List) obj, str), Collections.singletonList(str)), 10);
                c0196QnHx.A = 1;
                if (this.w.f(listA1, c0196QnHx) == va0Var) {
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

    public sKP(e01 e01Var, X1GO x1go, String str) {
        this.w = e01Var;
        this.x = x1go;
        this.y = str;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super List<? extends String>> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x, this.y), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
