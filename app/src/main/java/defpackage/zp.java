package defpackage;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zp implements mz0<yp> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ cq4 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ cq4 x;

        /* JADX INFO: renamed from: zp$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.player.ui.running.interactors.ChartDataFormatterFactory$chartFormatterStream$$inlined$map$1$2", f = "ChartDataFormatterFactory.kt", l = {224}, m = "emit")
        public static final class C0235QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0235QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, cq4 cq4Var) {
            this.w = nz0Var;
            this.x = cq4Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0235QnHx c0235QnHx;
            if (z80Var instanceof C0235QnHx) {
                c0235QnHx = (C0235QnHx) z80Var;
                int i = c0235QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0235QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0235QnHx = new C0235QnHx(z80Var);
                }
            } else {
                c0235QnHx = new C0235QnHx(z80Var);
            }
            Object obj2 = c0235QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0235QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                yp ypVar = new yp((Context) this.x.x, (Locale) obj);
                c0235QnHx.A = 1;
                if (this.w.f(ypVar, c0235QnHx) == va0Var) {
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

    public zp(mz0 mz0Var, cq4 cq4Var) {
        this.w = mz0Var;
        this.x = cq4Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super yp> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
