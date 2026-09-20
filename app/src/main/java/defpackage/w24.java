package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w24 implements z24.CQf {
    public final z24 a;
    public boolean b;
    public Bundle c;
    public final ry4 d;

    public static final class QnHx extends cx1 implements h81<x24> {
        public final /* synthetic */ mj5 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(mj5 mj5Var) {
            super(0);
            this.w = mj5Var;
        }

        @Override // defpackage.h81
        public final x24 invoke() {
            return v24.c(this.w);
        }
    }

    public w24(z24 z24Var, mj5 mj5Var) {
        this.a = z24Var;
        this.d = new ry4(new QnHx(mj5Var));
    }

    @Override // z24.CQf
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((x24) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((u24) entry.getValue()).e.a();
            if (!ur1.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }
}
