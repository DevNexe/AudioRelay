package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 implements fd2 {
    public final ln2 a;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[el0.F1.values().length];
            el0.F1 f1 = el0.F1.USER_REQUESTED;
            iArr[0] = 1;
            el0.F1 f2 = el0.F1.USER_REQUESTED;
            iArr[1] = 2;
            el0.F1 f3 = el0.F1.USER_REQUESTED;
            iArr[3] = 3;
            a = iArr;
        }
    }

    public fl0(ln2 ln2Var) {
        this.a = ln2Var;
    }

    @Override // defpackage.fd2
    public final Object a(ad2 ad2Var, md2.QnHx qnHx) {
        el0.F1 f1;
        zt4 byn;
        if (!ad2Var.l0()) {
            return sd5.a;
        }
        int i = ad2Var.V().z;
        if (i == 0) {
            f1 = el0.F1.USER_REQUESTED;
        } else if (i == 1) {
            f1 = el0.F1.NEED_PREMIUM_FOR_MULTI;
        } else if (i != 2) {
            el0.F1 f2 = el0.F1.USER_REQUESTED;
            f1 = null;
        } else {
            f1 = el0.F1.NEED_PREMIUM_FOR_UNLIMITED_DURATION;
        }
        if (f1 == null) {
            f1 = el0.F1.UNRECOGNIZED;
        }
        int i2 = QnHx.a[f1.ordinal()];
        if (i2 == 1) {
            byn = new zt4.byN();
        } else if (i2 != 2) {
            byn = i2 != 3 ? new zt4.auxFixed() : new zt4.auxFixed();
        } else {
            byn = new zt4.YKK();
        }
        this.a.b(byn);
        return sd5.a;
    }
}
