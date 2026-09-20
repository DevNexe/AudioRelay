package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.azefsw.audioconnect.R;
import defpackage.a34;
import defpackage.a61;
import defpackage.a83;
import defpackage.b61;
import defpackage.bi5;
import defpackage.c61;
import defpackage.d32;
import defpackage.d61;
import defpackage.e61;
import defpackage.i5;
import defpackage.lj5;
import defpackage.mj5;
import defpackage.ww4;
import defpackage.x51;
import defpackage.z51;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class LPt6Fixed {
    public final z51 a;
    public final e61 b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public class QnHx implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View w;

        public QnHx(View view) {
            this.w = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.w;
            view2.removeOnAttachStateChangeListener(this);
            Field field = bi5.a;
            bi5.T23.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public LPt6Fixed(z51 z51Var, e61 e61Var, Fragment fragment) {
        this.a = z51Var;
        this.b = e61Var;
        this.c = fragment;
    }

    public final void a() {
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.x;
        fragment.P.M();
        fragment.w = 3;
        fragment.Y = true;
        if (RBi.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + fragment);
        }
        View view = fragment.a0;
        if (view != null) {
            Bundle bundle2 = fragment.x;
            SparseArray<Parcelable> sparseArray = fragment.y;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                fragment.y = null;
            }
            if (fragment.a0 != null) {
                fragment.i0.A.b(fragment.z);
                fragment.z = null;
            }
            fragment.Y = false;
            fragment.B(bundle2);
            if (!fragment.Y) {
                throw new ww4("Fragment " + fragment + " did not call through to super.onViewStateRestored()");
            }
            if (fragment.a0 != null) {
                fragment.i0.d(androidx.lifecycle.YKK.CQf.ON_CREATE);
            }
        }
        fragment.x = null;
        a61 a61Var = fragment.P;
        a61Var.A = false;
        a61Var.B = false;
        a61Var.H.i = false;
        a61Var.s(4);
        this.a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        e61 e61Var = this.b;
        e61Var.getClass();
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.Z;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) e61Var.a;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                if (fragment2.Z == viewGroup && (view2 = fragment2.a0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = (Fragment) arrayList.get(iIndexOf);
                if (fragment3.Z == viewGroup && (view = fragment3.a0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.Z.addView(fragment.a0, iIndexOfChild);
    }

    public final void c() {
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.C;
        LPt6Fixed lPt6 = null;
        e61 e61Var = this.b;
        if (fragment2 != null) {
            LPt6Fixed lPt7 = (LPt6Fixed) ((HashMap) e61Var.b).get(fragment2.A);
            if (lPt7 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.C + " that does not belong to this FragmentManager!");
            }
            fragment.D = fragment.C.A;
            fragment.C = null;
            lPt6 = lPt7;
        } else {
            String str = fragment.D;
            if (str != null && (lPt6 = (LPt6Fixed) ((HashMap) e61Var.b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(i5.b(sb, fragment.D, " that does not belong to this FragmentManager!"));
            }
        }
        if (lPt6 != null) {
            lPt6.k();
        }
        RBi rBi = fragment.N;
        fragment.O = rBi.p;
        fragment.Q = rBi.r;
        z51 z51Var = this.a;
        z51Var.g(false);
        ArrayList<Fragment.F1> arrayList = fragment.m0;
        Iterator<Fragment.F1> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        fragment.P.b(fragment.O, fragment.f(), fragment);
        fragment.w = 0;
        fragment.Y = false;
        fragment.q(fragment.O.x);
        if (!fragment.Y) {
            throw new ww4("Fragment " + fragment + " did not call through to super.onAttach()");
        }
        Iterator<c61> it2 = fragment.N.n.iterator();
        while (it2.hasNext()) {
            it2.next().H();
        }
        a61 a61Var = fragment.P;
        a61Var.A = false;
        a61Var.B = false;
        a61Var.H.i = false;
        a61Var.s(0);
        z51Var.b(false);
    }

    public final int d() {
        int i;
        ck32.CQf next;
        Fragment fragment = this.c;
        if (fragment.N == null) {
            return fragment.w;
        }
        int iMin = this.e;
        int iOrdinal = fragment.g0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.I) {
            if (fragment.J) {
                iMin = Math.max(this.e, 2);
                View view = fragment.a0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment.w) : Math.min(iMin, 1);
            }
        }
        if (!fragment.G) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.Z;
        if (viewGroup != null) {
            ck32 ck32VarF = ck32.f(viewGroup, fragment.l().F());
            ck32VarF.getClass();
            ck32.CQf cQfD = ck32VarF.d(fragment);
            i = cQfD != null ? cQfD.b : 0;
            Iterator<ck32.CQf> it = ck32VarF.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.c.equals(fragment) && !next.f) {
                    break;
                }
            }
            if (next != null && (i == 0 || i == 1)) {
                i = next.b;
            }
        } else {
            i = 0;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.H) {
            iMin = fragment.M > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.b0 && fragment.w < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (RBi.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        Parcelable parcelable;
        boolean zH = RBi.H(3);
        final Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        if (fragment.f0) {
            Bundle bundle = fragment.x;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                fragment.P.R(parcelable);
                a61 a61Var = fragment.P;
                a61Var.A = false;
                a61Var.B = false;
                a61Var.H.i = false;
                a61Var.s(1);
            }
            fragment.w = 1;
            return;
        }
        z51 z51Var = this.a;
        z51Var.h(false);
        Bundle bundle2 = fragment.x;
        fragment.P.M();
        fragment.w = 1;
        fragment.Y = false;
        fragment.h0.a(new androidx.lifecycle.auxFixed() { // from class: androidx.fragment.app.Fragment.5
            public AnonymousClass5() {
            }

            @Override // androidx.lifecycle.auxFixed
            public final void h(d32 d32Var, androidx.lifecycle.YKK.CQf cQf) {
                View view;
                if (cQf != androidx.lifecycle.YKK.CQf.ON_STOP || (view = Fragment.this.a0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        fragment.l0.b(bundle2);
        fragment.r(bundle2);
        fragment.f0 = true;
        if (fragment.Y) {
            fragment.h0.f(androidx.lifecycle.YKK.CQf.ON_CREATE);
            z51Var.c(false);
        } else {
            throw new ww4("Fragment " + fragment + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.c;
        if (fragment.I) {
            return;
        }
        if (RBi.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater layoutInflaterW = fragment.w(fragment.x);
        ViewGroup viewGroup = fragment.Z;
        if (viewGroup == null) {
            int i = fragment.S;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.N.q.I0(i);
                if (viewGroup == null && !fragment.K) {
                    try {
                        resourceName = fragment.I().getResources().getResourceName(fragment.S);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.S) + " (" + resourceName + ") for fragment " + fragment);
                }
            }
        }
        fragment.Z = viewGroup;
        fragment.C(layoutInflaterW, viewGroup, fragment.x);
        View view = fragment.a0;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.a0.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.U) {
                fragment.a0.setVisibility(8);
            }
            View view2 = fragment.a0;
            Field field = bi5.a;
            if (bi5.auxFixed.b(view2)) {
                bi5.T23.c(fragment.a0);
            } else {
                View view3 = fragment.a0;
                view3.addOnAttachStateChangeListener(new QnHx(view3));
            }
            fragment.P.s(2);
            this.a.m(false);
            int visibility = fragment.a0.getVisibility();
            fragment.h().l = fragment.a0.getAlpha();
            if (fragment.Z != null && visibility == 0) {
                View viewFindFocus = fragment.a0.findFocus();
                if (viewFindFocus != null) {
                    fragment.h().m = viewFindFocus;
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.a0.setAlpha(0.0f);
            }
        }
        fragment.w = 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    public final void g() {
        boolean z;
        boolean z2;
        Fragment fragmentC;
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        if (!fragment.H) {
            z = false;
        } else if (fragment.M > 0) {
            z = false;
        } else {
            z = true;
        }
        e61 e61Var = this.b;
        if (z) {
            z2 = true;
        } else {
            b61 b61Var = (b61) e61Var.c;
            if ((b61Var.d.containsKey(fragment.A) && b61Var.g) ? b61Var.h : true) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z2) {
            String str = fragment.D;
            if (str != null && (fragmentC = e61Var.c(str)) != null && fragmentC.W) {
                fragment.C = fragmentC;
            }
            fragment.w = 0;
            return;
        }
        x51<?> x51Var = fragment.O;
        if (x51Var instanceof mj5) {
            zIsChangingConfigurations = ((b61) e61Var.c).h;
        } else {
            Context context = x51Var.x;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            b61 b61Var2 = (b61) e61Var.c;
            b61Var2.getClass();
            if (RBi.H(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + fragment);
            }
            HashMap<String, b61> map = b61Var2.e;
            b61 b61Var3 = map.get(fragment.A);
            if (b61Var3 != null) {
                b61Var3.c();
                map.remove(fragment.A);
            }
            HashMap<String, lj5> map2 = b61Var2.f;
            lj5 lj5Var = map2.get(fragment.A);
            if (lj5Var != null) {
                lj5Var.a();
                map2.remove(fragment.A);
            }
        }
        fragment.P.k();
        fragment.h0.f(androidx.lifecycle.YKK.CQf.ON_DESTROY);
        fragment.w = 0;
        fragment.Y = false;
        fragment.f0 = false;
        fragment.t();
        if (!fragment.Y) {
            throw new ww4("Fragment " + fragment + " did not call through to super.onDestroy()");
        }
        this.a.d(false);
        for (LPt6Fixed lPt6 : e61Var.e()) {
            if (lPt6 != null) {
                String str2 = fragment.A;
                Fragment fragment2 = lPt6.c;
                if (str2.equals(fragment2.D)) {
                    fragment2.C = fragment;
                    fragment2.D = null;
                }
            }
        }
        String str3 = fragment.D;
        if (str3 != null) {
            fragment.C = e61Var.c(str3);
        }
        e61Var.i(this);
    }

    public final void h() {
        View view;
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.Z;
        if (viewGroup != null && (view = fragment.a0) != null) {
            viewGroup.removeView(view);
        }
        fragment.D();
        this.a.n(false);
        fragment.Z = null;
        fragment.a0 = null;
        fragment.i0 = null;
        fragment.j0.h(null);
        fragment.J = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    public final void i() {
        boolean z;
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.w = -1;
        fragment.Y = false;
        fragment.v();
        if (!fragment.Y) {
            throw new ww4("Fragment " + fragment + " did not call through to super.onDetach()");
        }
        a61 a61Var = fragment.P;
        if (!a61Var.C) {
            a61Var.k();
            fragment.P = new a61();
        }
        this.a.e(false);
        fragment.w = -1;
        fragment.O = null;
        fragment.Q = null;
        fragment.N = null;
        boolean z2 = true;
        if (fragment.H) {
            if (fragment.M > 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            b61 b61Var = (b61) this.b.c;
            if (b61Var.d.containsKey(fragment.A) && b61Var.g) {
                z2 = b61Var.h;
            }
            if (!z2) {
                return;
            }
        }
        if (RBi.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.h0 = new androidx.lifecycle.T23(fragment);
        fragment.l0 = new a34(fragment);
        fragment.k0 = null;
        fragment.A = UUID.randomUUID().toString();
        fragment.G = false;
        fragment.H = false;
        fragment.I = false;
        fragment.J = false;
        fragment.K = false;
        fragment.M = 0;
        fragment.N = null;
        fragment.P = new a61();
        fragment.O = null;
        fragment.R = 0;
        fragment.S = 0;
        fragment.T = null;
        fragment.U = false;
        fragment.V = false;
    }

    public final void j() {
        Fragment fragment = this.c;
        if (fragment.I && fragment.J && !fragment.L) {
            if (RBi.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            fragment.C(fragment.w(fragment.x), null, fragment.x);
            View view = fragment.a0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.a0.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.U) {
                    fragment.a0.setVisibility(8);
                }
                fragment.P.s(2);
                this.a.m(false);
                fragment.w = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (RBi.H(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int iD = d();
                int i = fragment.w;
                if (iD == i) {
                    if (fragment.e0) {
                        if (fragment.a0 != null && (viewGroup = fragment.Z) != null) {
                            ck32 ck32VarF = ck32.f(viewGroup, fragment.l().F());
                            if (fragment.U) {
                                ck32VarF.getClass();
                                if (RBi.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                ck32VarF.a(3, 1, this);
                            } else {
                                ck32VarF.getClass();
                                if (RBi.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                ck32VarF.a(2, 1, this);
                            }
                        }
                        RBi rBi = fragment.N;
                        if (rBi != null && fragment.G && RBi.I(fragment)) {
                            rBi.z = true;
                        }
                        fragment.e0 = false;
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            fragment.w = 1;
                            break;
                        case 2:
                            fragment.J = false;
                            fragment.w = 2;
                            break;
                        case 3:
                            if (RBi.H(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.a0 != null && fragment.y == null) {
                                o();
                            }
                            if (fragment.a0 != null && (viewGroup3 = fragment.Z) != null) {
                                ck32 ck32VarF2 = ck32.f(viewGroup3, fragment.l().F());
                                ck32VarF2.getClass();
                                if (RBi.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                ck32VarF2.a(1, 3, this);
                            }
                            fragment.w = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            fragment.w = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.a0 != null && (viewGroup2 = fragment.Z) != null) {
                                ck32 ck32VarF3 = ck32.f(viewGroup2, fragment.l().F());
                                int iB = a83.b(fragment.a0.getVisibility());
                                ck32VarF3.getClass();
                                if (RBi.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                ck32VarF3.a(iB, 2, this);
                            }
                            fragment.w = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            fragment.w = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } finally {
            this.d = false;
        }
    }

    public final void l() {
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
        }
        fragment.P.s(5);
        if (fragment.a0 != null) {
            fragment.i0.d(androidx.lifecycle.YKK.CQf.ON_PAUSE);
        }
        fragment.h0.f(androidx.lifecycle.YKK.CQf.ON_PAUSE);
        fragment.w = 6;
        fragment.Y = true;
        this.a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.x;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.y = fragment.x.getSparseParcelableArray("android:view_state");
        fragment.z = fragment.x.getBundle("android:view_registry_state");
        String string = fragment.x.getString("android:target_state");
        fragment.D = string;
        if (string != null) {
            fragment.E = fragment.x.getInt("android:target_req_state", 0);
        }
        boolean z = fragment.x.getBoolean("android:user_visible_hint", true);
        fragment.c0 = z;
        if (z) {
            return;
        }
        fragment.b0 = true;
    }

    public final void n() {
        boolean z;
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        Fragment.CQf cQf = fragment.d0;
        View view = cQf == null ? null : cQf.m;
        if (view != null) {
            if (view != fragment.a0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else {
                        if (parent == fragment.a0) {
                            z = true;
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                boolean zRequestFocus = view.requestFocus();
                if (RBi.H(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(fragment);
                    sb.append(" resulting in focused view ");
                    sb.append(fragment.a0.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        fragment.h().m = null;
        fragment.P.M();
        fragment.P.x(true);
        fragment.w = 7;
        fragment.Y = false;
        fragment.x();
        if (!fragment.Y) {
            throw new ww4("Fragment " + fragment + " did not call through to super.onResume()");
        }
        androidx.lifecycle.T23 t23 = fragment.h0;
        androidx.lifecycle.YKK.CQf cQf2 = androidx.lifecycle.YKK.CQf.ON_RESUME;
        t23.f(cQf2);
        if (fragment.a0 != null) {
            fragment.i0.d(cQf2);
        }
        a61 a61Var = fragment.P;
        a61Var.A = false;
        a61Var.B = false;
        a61Var.H.i = false;
        a61Var.s(7);
        this.a.i(false);
        fragment.x = null;
        fragment.y = null;
        fragment.z = null;
    }

    public final void o() {
        Fragment fragment = this.c;
        if (fragment.a0 == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.a0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.y = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.i0.A.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.z = bundle;
    }

    public final void p() {
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto STARTED: " + fragment);
        }
        fragment.P.M();
        fragment.P.x(true);
        fragment.w = 5;
        fragment.Y = false;
        fragment.z();
        if (!fragment.Y) {
            throw new ww4("Fragment " + fragment + " did not call through to super.onStart()");
        }
        androidx.lifecycle.T23 t23 = fragment.h0;
        androidx.lifecycle.YKK.CQf cQf = androidx.lifecycle.YKK.CQf.ON_START;
        t23.f(cQf);
        if (fragment.a0 != null) {
            fragment.i0.d(cQf);
        }
        a61 a61Var = fragment.P;
        a61Var.A = false;
        a61Var.B = false;
        a61Var.H.i = false;
        a61Var.s(5);
        this.a.k(false);
    }

    public final void q() {
        boolean zH = RBi.H(3);
        Fragment fragment = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom STARTED: " + fragment);
        }
        a61 a61Var = fragment.P;
        a61Var.B = true;
        a61Var.H.i = true;
        a61Var.s(4);
        if (fragment.a0 != null) {
            fragment.i0.d(androidx.lifecycle.YKK.CQf.ON_STOP);
        }
        fragment.h0.f(androidx.lifecycle.YKK.CQf.ON_STOP);
        fragment.w = 4;
        fragment.Y = false;
        fragment.A();
        if (fragment.Y) {
            this.a.l(false);
            return;
        }
        throw new ww4("Fragment " + fragment + " did not call through to super.onStop()");
    }

    public LPt6Fixed(z51 z51Var, e61 e61Var, ClassLoader classLoader, y yVar, d61 d61Var) {
        this.a = z51Var;
        this.b = e61Var;
        Fragment fragmentA = yVar.a(d61Var.w);
        this.c = fragmentA;
        Bundle bundle = d61Var.F;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.L(bundle);
        fragmentA.A = d61Var.x;
        fragmentA.I = d61Var.y;
        fragmentA.K = true;
        fragmentA.R = d61Var.z;
        fragmentA.S = d61Var.A;
        fragmentA.T = d61Var.B;
        fragmentA.W = d61Var.C;
        fragmentA.H = d61Var.D;
        fragmentA.V = d61Var.E;
        fragmentA.U = d61Var.G;
        fragmentA.g0 = androidx.lifecycle.YKK.F1.values()[d61Var.H];
        Bundle bundle2 = d61Var.I;
        if (bundle2 != null) {
            fragmentA.x = bundle2;
        } else {
            fragmentA.x = new Bundle();
        }
        if (RBi.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public LPt6Fixed(z51 z51Var, e61 e61Var, Fragment fragment, d61 d61Var) {
        this.a = z51Var;
        this.b = e61Var;
        this.c = fragment;
        fragment.y = null;
        fragment.z = null;
        fragment.M = 0;
        fragment.J = false;
        fragment.G = false;
        Fragment fragment2 = fragment.C;
        fragment.D = fragment2 != null ? fragment2.A : null;
        fragment.C = null;
        Bundle bundle = d61Var.I;
        if (bundle != null) {
            fragment.x = bundle;
        } else {
            fragment.x = new Bundle();
        }
    }
}
