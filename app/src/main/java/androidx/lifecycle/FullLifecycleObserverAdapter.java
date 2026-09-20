package androidx.lifecycle;

import defpackage.d32;
import defpackage.w61;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements auxFixed {
    public final w61 w;
    public final auxFixed x;

    public static /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[YKK.CQf.values().length];
            a = iArr;
            try {
                iArr[YKK.CQf.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[YKK.CQf.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[YKK.CQf.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[YKK.CQf.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[YKK.CQf.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[YKK.CQf.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[YKK.CQf.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(w61 w61Var, auxFixed auxVar) {
        this.w = w61Var;
        this.x = auxVar;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        int i = QnHx.a[cQf.ordinal()];
        w61 w61Var = this.w;
        switch (i) {
            case 1:
                w61Var.onCreate(d32Var);
                break;
            case 2:
                w61Var.onStart(d32Var);
                break;
            case 3:
                w61Var.onResume(d32Var);
                break;
            case 4:
                w61Var.onPause(d32Var);
                break;
            case 5:
                w61Var.onStop(d32Var);
                break;
            case 6:
                w61Var.onDestroy(d32Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        auxFixed auxVar = this.x;
        if (auxVar != null) {
            auxVar.h(d32Var, cQf);
        }
    }
}
