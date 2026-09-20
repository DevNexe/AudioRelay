package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s65 implements mz0<p65.F1> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ List x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ List x;

        /* JADX INFO: renamed from: s65$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.settings.ui.theme.ThemePickerInputHandler$getInitializeFlows$$inlined$map$1$2", f = "ThemePickerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0194QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0194QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, List list) {
            this.w = nz0Var;
            this.x = list;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0194QnHx c0194QnHx;
            if (z80Var instanceof C0194QnHx) {
                c0194QnHx = (C0194QnHx) z80Var;
                int i = c0194QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0194QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0194QnHx = new C0194QnHx(z80Var);
                }
            } else {
                c0194QnHx = new C0194QnHx(z80Var);
            }
            Object obj2 = c0194QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0194QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                l65 l65Var = (l65) obj;
                List<r65> list = this.x;
                ArrayList arrayList = new ArrayList(mu.w0(list, 10));
                for (r65 r65Var : list) {
                    l65 l65Var2 = r65Var.c;
                    arrayList.add(new r65(r65Var.a, r65Var.b, l65Var2, l65Var2 == l65Var));
                }
                p65.F1 f1 = new p65.F1(arrayList);
                c0194QnHx.A = 1;
                if (this.w.f(f1, c0194QnHx) == va0Var) {
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

    public s65(am amVar, List list) {
        this.w = amVar;
        this.x = list;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super p65.F1> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
