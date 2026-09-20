package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LPt6Fixed;
import androidx.lifecycle.MZ;
import androidx.lifecycle.T23;
import androidx.lifecycle.YKK;
import androidx.lifecycle.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class kk2 implements d32, mj5, androidx.lifecycle.LPt8Fixed, b34 {
    public final xl2 A;
    public final String B;
    public final Bundle C;
    public boolean F;
    public YKK.F1 H;
    public final Context w;
    public dl2 x;
    public final Bundle y;
    public YKK.F1 z;
    public final T23 D = new T23(this);
    public final a34 E = new a34(this);
    public final ry4 G = new ry4(new LPt8Fixed());

    public static final class CQf extends androidx.lifecycle.QnHx {
        public CQf(kk2 kk2Var) {
            super(kk2Var);
        }
    }

    public static final class F1 extends jj5 {
        public final u24 d;

        public F1(u24 u24Var) {
            this.d = u24Var;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<y> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final y invoke() {
            kk2 kk2Var = kk2.this;
            Context context = kk2Var.w;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            return new y(applicationContext instanceof Application ? (Application) applicationContext : null, kk2Var, kk2Var.y);
        }
    }

    public static final class NUlFixed extends cx1 implements h81<u24> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final u24 invoke() {
            kk2 kk2Var = kk2.this;
            if (!kk2Var.F) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            }
            if (kk2Var.D.c != YKK.F1.DESTROYED) {
                return ((F1) new LPt6Fixed(kk2Var, new CQf(kk2Var)).a(F1.class)).d;
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
    }

    public static final class QnHx {
        public static kk2 a(Context context, dl2 dl2Var, Bundle bundle, YKK.F1 f1, xk2 xk2Var) {
            return new kk2(context, dl2Var, bundle, f1, xk2Var, UUID.randomUUID().toString(), null);
        }
    }

    static {
        new QnHx();
    }

    public kk2(Context context, dl2 dl2Var, Bundle bundle, YKK.F1 f1, xl2 xl2Var, String str, Bundle bundle2) {
        this.w = context;
        this.x = dl2Var;
        this.y = bundle;
        this.z = f1;
        this.A = xl2Var;
        this.B = str;
        this.C = bundle2;
        new ry4(new NUlFixed());
        this.H = YKK.F1.INITIALIZED;
    }

    @Override // defpackage.mj5
    public final lj5 M() {
        if (!this.F) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(this.D.c != YKK.F1.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        xl2 xl2Var = this.A;
        if (xl2Var != null) {
            return xl2Var.a(this.B);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    @Override // defpackage.b34
    public final z24 U() {
        return this.E.b;
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final LPt6Fixed.CQf a() {
        return (y) this.G.getValue();
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final nc0 b() {
        bi2 bi2Var = new bi2(0);
        Context context = this.w;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            bi2Var.b(MZ.a, application);
        }
        bi2Var.b(v24.a, this);
        bi2Var.b(v24.b, this);
        Bundle bundle = this.y;
        if (bundle != null) {
            bi2Var.b(v24.c, bundle);
        }
        return bi2Var;
    }

    @Override // defpackage.d32
    public final YKK c() {
        return this.D;
    }

    public final void d(YKK.F1 f1) {
        this.H = f1;
        f();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    public final boolean equals(Object obj) {
        boolean z;
        Set<String> setKeySet;
        boolean z2;
        if (obj == null || !(obj instanceof kk2)) {
            return false;
        }
        kk2 kk2Var = (kk2) obj;
        if (!ur1.a(this.B, kk2Var.B) || !ur1.a(this.x, kk2Var.x) || !ur1.a(this.D, kk2Var.D) || !ur1.a(this.E.b, kk2Var.E.b)) {
            return false;
        }
        Bundle bundle = this.y;
        Bundle bundle2 = kk2Var.y;
        if (!ur1.a(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z = false;
            } else {
                Set<String> set = setKeySet;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        String str = (String) it.next();
                        if (!ur1.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (!this.F) {
            a34 a34Var = this.E;
            a34Var.a();
            this.F = true;
            if (this.A != null) {
                v24.b(this);
            }
            a34Var.b(this.C);
        }
        int iOrdinal = this.z.ordinal();
        int iOrdinal2 = this.H.ordinal();
        T23 t23 = this.D;
        if (iOrdinal < iOrdinal2) {
            t23.h(this.z);
        } else {
            t23.h(this.H);
        }
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.x.hashCode() + (this.B.hashCode() * 31);
        Bundle bundle = this.y;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.E.b.hashCode() + ((this.D.hashCode() + (iHashCode * 31)) * 31);
    }
}
