package defpackage;

import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ay1 implements mz0<Locale> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: ay1$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.locale.LanguageStore$DefaultImpls$getLocaleStream$$inlined$map$1$2", f = "LanguageStore.kt", l = {224}, m = "emit")
        public static final class C0043QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0043QnHx(z80 z80Var) {
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
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0043QnHx c0043QnHx;
            Locale locale;
            if (z80Var instanceof C0043QnHx) {
                c0043QnHx = (C0043QnHx) z80Var;
                int i = c0043QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0043QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0043QnHx = new C0043QnHx(z80Var);
                }
            } else {
                c0043QnHx = new C0043QnHx(z80Var);
            }
            Object obj2 = c0043QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0043QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                zx1 zx1Var = (zx1) obj;
                if (ur1.a(zx1Var, zx1.CQf.a)) {
                    locale = Locale.getDefault();
                } else {
                    if (!(zx1Var instanceof zx1.QnHx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    locale = ((zx1.QnHx) zx1Var).a.d;
                }
                c0043QnHx.A = 1;
                if (this.w.f(locale, c0043QnHx) == va0Var) {
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

    public ay1(mz0 mz0Var) {
        this.w = mz0Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Locale> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
