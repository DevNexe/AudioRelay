package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;
import defpackage.B8C;
import defpackage.a34;
import defpackage.a61;
import defpackage.b34;
import defpackage.d32;
import defpackage.fi2;
import defpackage.lj5;
import defpackage.mj5;
import defpackage.n42;
import defpackage.nc0;
import defpackage.o61;
import defpackage.r80;
import defpackage.rz;
import defpackage.tj5;
import defpackage.u51;
import defpackage.wq4;
import defpackage.ww4;
import defpackage.x51;
import defpackage.z24;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, d32, mj5, androidx.lifecycle.LPt8Fixed, b34 {
    public static final Object n0 = new Object();
    public Bundle B;
    public Fragment C;
    public int E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public RBi N;
    public x51<?> O;
    public Fragment Q;
    public int R;
    public int S;
    public String T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean Y;
    public ViewGroup Z;
    public View a0;
    public boolean b0;
    public CQf d0;
    public boolean e0;
    public boolean f0;
    public androidx.lifecycle.T23 h0;
    public o61 i0;
    public androidx.lifecycle.y k0;
    public a34 l0;
    public final ArrayList<F1> m0;
    public Bundle x;
    public SparseArray<Parcelable> y;
    public Bundle z;
    public int w = -1;
    public String A = UUID.randomUUID().toString();
    public String D = null;
    public Boolean F = null;
    public a61 P = new a61();
    public final boolean X = true;
    public boolean c0 = true;
    public androidx.lifecycle.YKK.F1 g0 = androidx.lifecycle.YKK.F1.RESUMED;
    public final fi2<d32> j0 = new fi2<>();

    public static class CQf {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ArrayList<String> g;
        public ArrayList<String> h;
        public final Object i;
        public final Object j;
        public final Object k;
        public float l;
        public View m;

        public CQf() {
            Object obj = Fragment.n0;
            this.i = obj;
            this.j = obj;
            this.k = obj;
            this.l = 1.0f;
            this.m = null;
        }
    }

    public static abstract class F1 {
        public abstract void a();
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public class QnHx extends B8C {
        public QnHx() {
        }

        @Override // defpackage.B8C
        public final View I0(int i) {
            Fragment fragment = Fragment.this;
            View view = fragment.a0;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a view");
        }

        @Override // defpackage.B8C
        public final boolean L0() {
            return Fragment.this.a0 != null;
        }
    }

    public Fragment() {
        new AtomicInteger();
        this.m0 = new ArrayList<>();
        this.h0 = new androidx.lifecycle.T23(this);
        this.l0 = new a34(this);
        this.k0 = null;
    }

    public void A() {
        this.Y = true;
    }

    public void B(Bundle bundle) {
        this.Y = true;
    }

    public void C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.P.M();
        this.L = true;
        this.i0 = new o61(this, M());
        View viewS = s(layoutInflater, viewGroup, bundle);
        this.a0 = viewS;
        if (viewS == null) {
            if (this.i0.z != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.i0 = null;
        } else {
            this.i0.f();
            this.a0.setTag(R.id.view_tree_lifecycle_owner, this.i0);
            this.a0.setTag(R.id.view_tree_view_model_store_owner, this.i0);
            tj5.b(this.a0, this.i0);
            this.j0.h(this.i0);
        }
    }

    public final void D() {
        this.P.s(1);
        if (this.a0 != null) {
            o61 o61Var = this.i0;
            o61Var.f();
            if (o61Var.z.c.a(androidx.lifecycle.YKK.F1.CREATED)) {
                this.i0.d(androidx.lifecycle.YKK.CQf.ON_DESTROY);
            }
        }
        this.w = 1;
        int i = 0;
        this.Y = false;
        u();
        if (!this.Y) {
            throw new ww4("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        wq4<n42.QnHx> wq4Var = ((n42.CQf) new androidx.lifecycle.LPt6Fixed(M(), n42.CQf.e, i).a(n42.CQf.class)).d;
        int iK = wq4Var.k();
        for (int i2 = 0; i2 < iK; i2++) {
            wq4Var.l(i2).getClass();
        }
        this.L = false;
    }

    public final void E() {
        onLowMemory();
        this.P.l();
    }

    public final void F(boolean z) {
        this.P.m(z);
    }

    public final void G(boolean z) {
        this.P.q(z);
    }

    public final boolean H() {
        if (this.U) {
            return false;
        }
        return false | this.P.r();
    }

    public final Context I() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View J() {
        View view = this.a0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void K(int i, int i2, int i3, int i4) {
        if (this.d0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        h().b = i;
        h().c = i2;
        h().d = i3;
        h().e = i4;
    }

    public final void L(Bundle bundle) {
        RBi rBi = this.N;
        if (rBi != null) {
            if (rBi.A || rBi.B) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.B = bundle;
    }

    @Override // defpackage.mj5
    public final lj5 M() {
        if (this.N == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (k() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, lj5> map = this.N.H.f;
        lj5 lj5Var = map.get(this.A);
        if (lj5Var != null) {
            return lj5Var;
        }
        lj5 lj5Var2 = new lj5();
        map.put(this.A, lj5Var2);
        return lj5Var2;
    }

    @Override // defpackage.b34
    public final z24 U() {
        return this.l0.b;
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final androidx.lifecycle.LPt6Fixed.CQf a() {
        Application application;
        if (this.N == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.k0 == null) {
            Context applicationContext = I().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && RBi.H(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + I().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.k0 = new androidx.lifecycle.y(application, this, this.B);
        }
        return this.k0;
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final nc0 b() {
        return nc0.QnHx.b;
    }

    @Override // defpackage.d32
    public final androidx.lifecycle.YKK c() {
        return this.h0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public B8C f() {
        return new QnHx();
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.R));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.S));
        printWriter.print(" mTag=");
        printWriter.println(this.T);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.w);
        printWriter.print(" mWho=");
        printWriter.print(this.A);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.G);
        printWriter.print(" mRemoving=");
        printWriter.print(this.H);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.I);
        printWriter.print(" mInLayout=");
        printWriter.println(this.J);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.U);
        printWriter.print(" mDetached=");
        printWriter.print(this.V);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.X);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.W);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.c0);
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.N);
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.O);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.Q);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.B);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.x);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.y);
        }
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.z);
        }
        Fragment fragmentB = this.C;
        if (fragmentB == null) {
            RBi rBi = this.N;
            fragmentB = (rBi == null || (str2 = this.D) == null) ? null : rBi.B(str2);
        }
        if (fragmentB != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentB);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.E);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        CQf cQf = this.d0;
        printWriter.println(cQf == null ? false : cQf.a);
        CQf cQf2 = this.d0;
        if ((cQf2 == null ? 0 : cQf2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            CQf cQf3 = this.d0;
            printWriter.println(cQf3 == null ? 0 : cQf3.b);
        }
        CQf cQf4 = this.d0;
        if ((cQf4 == null ? 0 : cQf4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            CQf cQf5 = this.d0;
            printWriter.println(cQf5 == null ? 0 : cQf5.c);
        }
        CQf cQf6 = this.d0;
        if ((cQf6 == null ? 0 : cQf6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            CQf cQf7 = this.d0;
            printWriter.println(cQf7 == null ? 0 : cQf7.d);
        }
        CQf cQf8 = this.d0;
        if ((cQf8 == null ? 0 : cQf8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            CQf cQf9 = this.d0;
            printWriter.println(cQf9 != null ? cQf9.e : 0);
        }
        if (this.Z != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.Z);
        }
        if (this.a0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.a0);
        }
        CQf cQf10 = this.d0;
        if (cQf10 != null) {
            cQf10.getClass();
        }
        if (j() != null) {
            new n42(this, M()).V0(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.P + ":");
        this.P.u(rz.a(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final CQf h() {
        if (this.d0 == null) {
            this.d0 = new CQf();
        }
        return this.d0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final RBi i() {
        if (this.O != null) {
            return this.P;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context j() {
        x51<?> x51Var = this.O;
        if (x51Var == null) {
            return null;
        }
        return x51Var.x;
    }

    public final int k() {
        androidx.lifecycle.YKK.F1 f1 = this.g0;
        return (f1 == androidx.lifecycle.YKK.F1.INITIALIZED || this.Q == null) ? f1.ordinal() : Math.min(f1.ordinal(), this.Q.k());
    }

    public final RBi l() {
        RBi rBi = this.N;
        if (rBi != null) {
            return rBi;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object m() {
        Object obj;
        CQf cQf = this.d0;
        if (cQf == null || (obj = cQf.j) == n0) {
            return null;
        }
        return obj;
    }

    public final Object n() {
        Object obj;
        CQf cQf = this.d0;
        if (cQf == null || (obj = cQf.i) == n0) {
            return null;
        }
        return obj;
    }

    public final Object o() {
        Object obj;
        CQf cQf = this.d0;
        if (cQf == null || (obj = cQf.k) == n0) {
            return null;
        }
        return obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Y = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        x51<?> x51Var = this.O;
        u51 u51Var = x51Var == null ? null : (u51) x51Var.w;
        if (u51Var != null) {
            u51Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.Y = true;
    }

    @Deprecated
    public void p(int i, int i2, Intent intent) {
        if (RBi.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void q(Context context) {
        this.Y = true;
        x51<?> x51Var = this.O;
        if ((x51Var == null ? null : x51Var.w) != null) {
            this.Y = true;
        }
    }

    public void r(Bundle bundle) {
        Parcelable parcelable;
        this.Y = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.P.R(parcelable);
            a61 a61Var = this.P;
            a61Var.A = false;
            a61Var.B = false;
            a61Var.H.i = false;
            a61Var.s(1);
        }
        a61 a61Var2 = this.P;
        if (a61Var2.o >= 1) {
            return;
        }
        a61Var2.A = false;
        a61Var2.B = false;
        a61Var2.H.i = false;
        a61Var2.s(1);
    }

    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (this.O == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        RBi rBiL = l();
        if (rBiL.v != null) {
            rBiL.y.addLast(new RBi.FJCM(this.A, i));
            rBiL.v.H0(intent);
        } else {
            x51<?> x51Var = rBiL.p;
            x51Var.getClass();
            if (i != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            Object obj = r80.a;
            r80.QnHx.b(x51Var.x, intent, null);
        }
    }

    public void t() {
        this.Y = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.A);
        if (this.R != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.R));
        }
        if (this.T != null) {
            sb.append(" tag=");
            sb.append(this.T);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.Y = true;
    }

    public void v() {
        this.Y = true;
    }

    public LayoutInflater w(Bundle bundle) {
        x51<?> x51Var = this.O;
        if (x51Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterW0 = x51Var.W0();
        layoutInflaterW0.setFactory2(this.P.f);
        return layoutInflaterW0;
    }

    public void x() {
        this.Y = true;
    }

    public void y(Bundle bundle) {
    }

    public void z() {
        this.Y = true;
    }
}
