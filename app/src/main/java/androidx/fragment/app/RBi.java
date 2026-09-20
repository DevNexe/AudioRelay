package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import com.azefsw.audioconnect.R;
import defpackage.B8C;
import defpackage.FLr;
import defpackage.PE_;
import defpackage.a61;
import defpackage.b61;
import defpackage.b70;
import defpackage.bn;
import defpackage.c5;
import defpackage.c61;
import defpackage.com9Fixed;
import defpackage.d32;
import defpackage.d61;
import defpackage.e61;
import defpackage.fc2;
import defpackage.g4j;
import defpackage.g9D;
import defpackage.hu2;
import defpackage.i5;
import defpackage.iZUl;
import defpackage.iu2;
import defpackage.mj5;
import defpackage.nH;
import defpackage.r52;
import defpackage.rz;
import defpackage.up1;
import defpackage.v51;
import defpackage.x51;
import defpackage.y51;
import defpackage.yy;
import defpackage.z51;
import defpackage.zq4;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class RBi {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList<androidx.fragment.app.QnHx> E;
    public ArrayList<Boolean> F;
    public ArrayList<Fragment> G;
    public b61 H;
    public final auxFixed I;
    public boolean b;
    public ArrayList<androidx.fragment.app.QnHx> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public final z51 m;
    public final CopyOnWriteArrayList<c61> n;
    public int o;
    public x51<?> p;
    public B8C q;
    public Fragment r;
    public Fragment s;
    public final NUlFixed t;
    public final YKK u;
    public g9D v;
    public g9D w;
    public g9D x;
    public ArrayDeque<FJCM> y;
    public boolean z;
    public final ArrayList<PRnFixed> a = new ArrayList<>();
    public final e61 c = new e61();
    public final y51 f = new y51(this);
    public final F1 h = new F1();
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, Bundle> j = DesugarCollections.synchronizedMap(new HashMap());
    public final Map<String, Object> k = DesugarCollections.synchronizedMap(new HashMap());
    public final Map<Fragment, HashSet<bn>> l = DesugarCollections.synchronizedMap(new HashMap());

    public class CQf implements PE_<Map<String, Boolean>> {
        public CQf() {
        }

        @Override // defpackage.PE_
        @SuppressLint({"SyntheticAccessor"})
        public final void b(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            RBi rBi = RBi.this;
            FJCM fjcmPollFirst = rBi.y.pollFirst();
            if (fjcmPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            e61 e61Var = rBi.c;
            String str = fjcmPollFirst.w;
            if (e61Var.d(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    public static class EQ extends FLr<up1, com9Fixed> {
        @Override // defpackage.FLr
        public final Intent a(Object obj) {
            Bundle bundleExtra;
            up1 up1Var = (up1) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = up1Var.x;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    up1Var = new up1(up1Var.w, null, up1Var.y, up1Var.z);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", up1Var);
            if (RBi.H(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // defpackage.FLr
        public final Object c(Intent intent, int i) {
            return new com9Fixed(intent, i);
        }
    }

    public class F1 extends hu2 {
        public F1() {
            super(false);
        }

        @Override // defpackage.hu2
        public final void a() {
            RBi rBi = RBi.this;
            rBi.x(true);
            if (rBi.h.a) {
                rBi.N();
            } else {
                rBi.g.b();
            }
        }
    }

    public class LPt8Fixed {
        public LPt8Fixed(RBi rBi) {
        }
    }

    public class NUlFixed extends androidx.fragment.app.y {
        public NUlFixed() {
        }

        @Override // androidx.fragment.app.y
        public final Fragment a(String str) {
            Context context = RBi.this.p.x;
            Object obj = Fragment.n0;
            try {
                return androidx.fragment.app.y.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new Fragment.InstantiationException(fc2.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new Fragment.InstantiationException(fc2.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.InstantiationException(fc2.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.InstantiationException(fc2.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    public interface PRnFixed {
        boolean a(ArrayList<androidx.fragment.app.QnHx> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class QnHx implements PE_<com9Fixed> {
        public QnHx() {
        }

        @Override // defpackage.PE_
        public final void b(com9Fixed com9Var) {
            com9Fixed com9Var2 = com9Var;
            RBi rBi = RBi.this;
            FJCM fjcmPollFirst = rBi.y.pollFirst();
            if (fjcmPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            e61 e61Var = rBi.c;
            String str = fjcmPollFirst.w;
            Fragment fragmentD = e61Var.d(str);
            if (fragmentD != null) {
                fragmentD.p(fjcmPollFirst.x, com9Var2.w, com9Var2.x);
            } else {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    public class T23 implements c61 {
        public final /* synthetic */ Fragment w;

        public T23(Fragment fragment) {
            this.w = fragment;
        }

        @Override // defpackage.c61
        public final void H() {
            this.w.getClass();
        }
    }

    public class YKK implements zq4 {
    }

    public class auxFixed implements Runnable {
        public auxFixed() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RBi.this.x(true);
        }
    }

    public class byN implements PE_<com9Fixed> {
        public byN() {
        }

        @Override // defpackage.PE_
        public final void b(com9Fixed com9Var) {
            com9Fixed com9Var2 = com9Var;
            RBi rBi = RBi.this;
            FJCM fjcmPollFirst = rBi.y.pollFirst();
            if (fjcmPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            e61 e61Var = rBi.c;
            String str = fjcmPollFirst.w;
            Fragment fragmentD = e61Var.d(str);
            if (fragmentD != null) {
                fragmentD.p(fjcmPollFirst.x, com9Var2.w, com9Var2.x);
            } else {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    public class y implements PRnFixed {
        public final int a;
        public final int b = 1;

        public y(int i) {
            this.a = i;
        }

        @Override // androidx.fragment.app.RBi.PRnFixed
        public final boolean a(ArrayList<androidx.fragment.app.QnHx> arrayList, ArrayList<Boolean> arrayList2) {
            RBi rBi = RBi.this;
            Fragment fragment = rBi.s;
            int i = this.a;
            if (fragment == null || i >= 0 || !fragment.i().N()) {
                return rBi.O(arrayList, arrayList2, i, this.b);
            }
            return false;
        }
    }

    public RBi() {
        new LPt8Fixed(this);
        this.m = new z51(this);
        this.n = new CopyOnWriteArrayList<>();
        this.o = -1;
        this.t = new NUlFixed();
        this.u = new YKK();
        this.y = new ArrayDeque<>();
        this.I = new auxFixed();
    }

    public static boolean H(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean I(Fragment fragment) {
        fragment.getClass();
        boolean zI = false;
        for (Fragment fragment2 : fragment.P.c.f()) {
            if (fragment2 != null) {
                zI = I(fragment2);
            }
            if (zI) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.X && (fragment.N == null || J(fragment.Q));
    }

    public static boolean K(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        RBi rBi = fragment.N;
        return fragment.equals(rBi.s) && K(rBi.r);
    }

    public static void Y(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.U) {
            fragment.U = false;
            fragment.e0 = !fragment.e0;
        }
    }

    public final void A(ArrayList<androidx.fragment.app.QnHx> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public final Fragment B(String str) {
        return this.c.c(str);
    }

    public final Fragment C(int i) {
        e61 e61Var = this.c;
        ArrayList arrayList = (ArrayList) e61Var.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (LPt6Fixed lPt6 : ((HashMap) e61Var.b).values()) {
                    if (lPt6 != null) {
                        Fragment fragment = lPt6.c;
                        if (fragment.R == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = (Fragment) arrayList.get(size);
            if (fragment2 != null && fragment2.R == i) {
                return fragment2;
            }
        }
    }

    public final ViewGroup D(Fragment fragment) {
        ViewGroup viewGroup = fragment.Z;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.S > 0 && this.q.L0()) {
            View viewI0 = this.q.I0(fragment.S);
            if (viewI0 instanceof ViewGroup) {
                return (ViewGroup) viewI0;
            }
        }
        return null;
    }

    public final androidx.fragment.app.y E() {
        Fragment fragment = this.r;
        return fragment != null ? fragment.N.E() : this.t;
    }

    public final zq4 F() {
        Fragment fragment = this.r;
        return fragment != null ? fragment.N.F() : this.u;
    }

    public final void G(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.U) {
            return;
        }
        fragment.U = true;
        fragment.e0 = true ^ fragment.e0;
        X(fragment);
    }

    public final void L(int i, boolean z) {
        Object obj;
        x51<?> x51Var;
        if (this.p == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.o) {
            this.o = i;
            e61 e61Var = this.c;
            Iterator it = ((ArrayList) e61Var.a).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                obj = e61Var.b;
                if (!zHasNext) {
                    break;
                }
                LPt6Fixed lPt6 = (LPt6Fixed) ((HashMap) obj).get(((Fragment) it.next()).A);
                if (lPt6 != null) {
                    lPt6.k();
                }
            }
            Iterator it2 = ((HashMap) obj).values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                LPt6Fixed lPt7 = (LPt6Fixed) it2.next();
                if (lPt7 != null) {
                    lPt7.k();
                    Fragment fragment = lPt7.c;
                    if (fragment.H) {
                        if (!(fragment.M > 0)) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        e61Var.i(lPt7);
                    }
                }
            }
            Z();
            if (this.z && (x51Var = this.p) != null && this.o == 7) {
                x51Var.X0();
                this.z = false;
            }
        }
    }

    public final void M() {
        if (this.p == null) {
            return;
        }
        this.A = false;
        this.B = false;
        this.H.i = false;
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.P.M();
            }
        }
    }

    public final boolean N() {
        x(false);
        w(true);
        Fragment fragment = this.s;
        if (fragment != null && fragment.i().N()) {
            return true;
        }
        boolean zO = O(this.E, this.F, -1, 0);
        if (zO) {
            this.b = true;
            try {
                Q(this.E, this.F);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        a0();
        t();
        this.c.b();
        return zO;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        androidx.fragment.app.QnHx qnHx;
        ArrayList<androidx.fragment.app.QnHx> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (i >= 0 || (i2 & 1) != 0) {
            int i3 = -1;
            if (i >= 0) {
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.QnHx qnHx2 = this.d.get(size);
                    if (i >= 0 && i == qnHx2.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    do {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        qnHx = this.d.get(size);
                        if (i < 0) {
                            break;
                        }
                    } while (i == qnHx.r);
                }
                i3 = size;
            }
            if (i3 == this.d.size() - 1) {
                return false;
            }
            for (int size2 = this.d.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.d.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.M);
        }
        boolean z = !(fragment.M > 0);
        if (!fragment.V || z) {
            e61 e61Var = this.c;
            synchronized (((ArrayList) e61Var.a)) {
                ((ArrayList) e61Var.a).remove(fragment);
            }
            fragment.G = false;
            if (I(fragment)) {
                this.z = true;
            }
            fragment.H = true;
            X(fragment);
        }
    }

    public final void Q(ArrayList<androidx.fragment.app.QnHx> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        A(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).o) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void R(Parcelable parcelable) {
        z51 z51Var;
        LPt6Fixed lPt6;
        if (parcelable == null) {
            return;
        }
        MZ mz = (MZ) parcelable;
        if (mz.w == null) {
            return;
        }
        e61 e61Var = this.c;
        ((HashMap) e61Var.b).clear();
        Iterator<d61> it = mz.w.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            z51Var = this.m;
            if (!zHasNext) {
                break;
            }
            d61 next = it.next();
            if (next != null) {
                Fragment fragment = this.H.d.get(next.x);
                if (fragment != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    lPt6 = new LPt6Fixed(z51Var, e61Var, fragment, next);
                } else {
                    lPt6 = new LPt6Fixed(this.m, this.c, this.p.x.getClassLoader(), E(), next);
                }
                Fragment fragment2 = lPt6.c;
                fragment2.N = this;
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.A + "): " + fragment2);
                }
                lPt6.m(this.p.x.getClassLoader());
                e61Var.h(lPt6);
                lPt6.e = this.o;
            }
        }
        b61 b61Var = this.H;
        b61Var.getClass();
        for (Fragment fragment3 : new ArrayList(b61Var.d.values())) {
            if (!(((HashMap) e61Var.b).get(fragment3.A) != null)) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + mz.w);
                }
                this.H.e(fragment3);
                fragment3.N = this;
                LPt6Fixed lPt7 = new LPt6Fixed(z51Var, e61Var, fragment3);
                lPt7.e = 1;
                lPt7.k();
                fragment3.H = true;
                lPt7.k();
            }
        }
        ArrayList<String> arrayList = mz.x;
        ((ArrayList) e61Var.a).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment fragmentC = e61Var.c(str);
                if (fragmentC == null) {
                    throw new IllegalStateException(fc2.a("No instantiated fragment for (", str, ")"));
                }
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentC);
                }
                e61Var.a(fragmentC);
            }
        }
        if (mz.y != null) {
            this.d = new ArrayList<>(mz.y.length);
            int i = 0;
            while (true) {
                androidx.fragment.app.CQf[] cQfArr = mz.y;
                if (i >= cQfArr.length) {
                    break;
                }
                androidx.fragment.app.CQf cQf = cQfArr[i];
                cQf.getClass();
                androidx.fragment.app.QnHx qnHx = new androidx.fragment.app.QnHx(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = cQf.w;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    Xn1.QnHx qnHx2 = new Xn1.QnHx();
                    int i4 = i2 + 1;
                    qnHx2.a = iArr[i2];
                    if (H(2)) {
                        Log.v("FragmentManager", "Instantiate " + qnHx + " op #" + i3 + " base fragment #" + iArr[i4]);
                    }
                    String str2 = cQf.x.get(i3);
                    if (str2 != null) {
                        qnHx2.b = B(str2);
                    } else {
                        qnHx2.b = null;
                    }
                    qnHx2.g = androidx.lifecycle.YKK.F1.values()[cQf.y[i3]];
                    qnHx2.h = androidx.lifecycle.YKK.F1.values()[cQf.z[i3]];
                    int i5 = i4 + 1;
                    int i6 = iArr[i4];
                    qnHx2.c = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    qnHx2.d = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    qnHx2.e = i10;
                    int i11 = iArr[i9];
                    qnHx2.f = i11;
                    qnHx.b = i6;
                    qnHx.c = i8;
                    qnHx.d = i10;
                    qnHx.e = i11;
                    qnHx.b(qnHx2);
                    i3++;
                    i2 = i9 + 1;
                }
                qnHx.f = cQf.A;
                qnHx.h = cQf.B;
                qnHx.r = cQf.C;
                qnHx.g = true;
                qnHx.i = cQf.D;
                qnHx.j = cQf.E;
                qnHx.k = cQf.F;
                qnHx.l = cQf.G;
                qnHx.m = cQf.H;
                qnHx.n = cQf.I;
                qnHx.o = cQf.J;
                qnHx.c(1);
                if (H(2)) {
                    StringBuilder sbC = iZUl.c("restoreAllState: back stack #", i, " (index ");
                    sbC.append(qnHx.r);
                    sbC.append("): ");
                    sbC.append(qnHx);
                    Log.v("FragmentManager", sbC.toString());
                    PrintWriter printWriter = new PrintWriter(new r52());
                    qnHx.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(qnHx);
                i++;
            }
        } else {
            this.d = null;
        }
        this.i.set(mz.z);
        String str3 = mz.A;
        if (str3 != null) {
            Fragment fragmentB = B(str3);
            this.s = fragmentB;
            p(fragmentB);
        }
        ArrayList<String> arrayList2 = mz.B;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                Bundle bundle = mz.C.get(i12);
                bundle.setClassLoader(this.p.x.getClassLoader());
                this.j.put(arrayList2.get(i12), bundle);
            }
        }
        this.y = new ArrayDeque<>(mz.D);
    }

    public final MZ S() {
        int i;
        androidx.fragment.app.CQf[] cQfArr;
        ArrayList<String> arrayList;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ck32 ck32Var = (ck32) it.next();
            if (ck32Var.e) {
                ck32Var.e = false;
                ck32Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((ck32) it2.next()).e();
        }
        x(true);
        this.A = true;
        this.H.i = true;
        e61 e61Var = this.c;
        e61Var.getClass();
        HashMap map = (HashMap) e61Var.b;
        ArrayList<d61> arrayList2 = new ArrayList<>(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            cQfArr = null;
            cQfArr = null;
            if (!it3.hasNext()) {
                break;
            }
            LPt6Fixed lPt6 = (LPt6Fixed) it3.next();
            if (lPt6 != null) {
                Fragment fragment = lPt6.c;
                d61 d61Var = new d61(fragment);
                if (fragment.w <= -1 || d61Var.I != null) {
                    d61Var.I = fragment.x;
                } else {
                    Bundle bundle = new Bundle();
                    fragment.y(bundle);
                    fragment.l0.c(bundle);
                    MZ mzS = fragment.P.S();
                    if (mzS != null) {
                        bundle.putParcelable("android:support:fragments", mzS);
                    }
                    lPt6.a.j(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (fragment.a0 != null) {
                        lPt6.o();
                    }
                    if (fragment.y != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", fragment.y);
                    }
                    if (fragment.z != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", fragment.z);
                    }
                    if (!fragment.c0) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", fragment.c0);
                    }
                    d61Var.I = bundle2;
                    if (fragment.D != null) {
                        if (bundle2 == null) {
                            d61Var.I = new Bundle();
                        }
                        d61Var.I.putString("android:target_state", fragment.D);
                        int i2 = fragment.E;
                        if (i2 != 0) {
                            d61Var.I.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(d61Var);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + d61Var.I);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (H(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        e61 e61Var2 = this.c;
        synchronized (((ArrayList) e61Var2.a)) {
            if (((ArrayList) e61Var2.a).isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(((ArrayList) e61Var2.a).size());
                for (Fragment fragment2 : (ArrayList) e61Var2.a) {
                    arrayList.add(fragment2.A);
                    if (H(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.A + "): " + fragment2);
                    }
                }
            }
        }
        ArrayList<androidx.fragment.app.QnHx> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            cQfArr = new androidx.fragment.app.CQf[size];
            for (i = 0; i < size; i++) {
                cQfArr[i] = new androidx.fragment.app.CQf(this.d.get(i));
                if (H(2)) {
                    StringBuilder sbC = iZUl.c("saveAllState: adding back stack #", i, ": ");
                    sbC.append(this.d.get(i));
                    Log.v("FragmentManager", sbC.toString());
                }
            }
        }
        MZ mz = new MZ();
        mz.w = arrayList2;
        mz.x = arrayList;
        mz.y = cQfArr;
        mz.z = this.i.get();
        Fragment fragment3 = this.s;
        if (fragment3 != null) {
            mz.A = fragment3.A;
        }
        mz.B.addAll(this.j.keySet());
        mz.C.addAll(this.j.values());
        mz.D = new ArrayList<>(this.y);
        return mz;
    }

    public final void T() {
        synchronized (this.a) {
            boolean z = true;
            if (this.a.size() != 1) {
                z = false;
            }
            if (z) {
                this.p.y.removeCallbacks(this.I);
                this.p.y.post(this.I);
                a0();
            }
        }
    }

    public final void U(Fragment fragment, boolean z) {
        ViewGroup viewGroupD = D(fragment);
        if (viewGroupD == null || !(viewGroupD instanceof v51)) {
            return;
        }
        ((v51) viewGroupD).setDrawDisappearingViewsLast(!z);
    }

    public final void V(Fragment fragment, androidx.lifecycle.YKK.F1 f1) {
        if (fragment.equals(B(fragment.A)) && (fragment.O == null || fragment.N == this)) {
            fragment.g0 = f1;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void W(Fragment fragment) {
        if (fragment == null || (fragment.equals(B(fragment.A)) && (fragment.O == null || fragment.N == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            p(fragment2);
            p(this.s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void X(Fragment fragment) {
        ViewGroup viewGroupD = D(fragment);
        if (viewGroupD != null) {
            Fragment.CQf cQf = fragment.d0;
            if ((cQf == null ? 0 : cQf.e) + (cQf == null ? 0 : cQf.d) + (cQf == null ? 0 : cQf.c) + (cQf == null ? 0 : cQf.b) > 0) {
                if (viewGroupD.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupD.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                Fragment fragment2 = (Fragment) viewGroupD.getTag(R.id.visible_removing_fragment_view_tag);
                Fragment.CQf cQf2 = fragment.d0;
                boolean z = cQf2 != null ? cQf2.a : false;
                if (fragment2.d0 == null) {
                    return;
                }
                fragment2.h().a = z;
            }
        }
    }

    public final void Z() {
        for (LPt6Fixed lPt6 : this.c.e()) {
            Fragment fragment = lPt6.c;
            if (fragment.b0) {
                if (this.b) {
                    this.D = true;
                } else {
                    fragment.b0 = false;
                    lPt6.k();
                }
            }
        }
    }

    public final LPt6Fixed a(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        LPt6Fixed lPt6F = f(fragment);
        fragment.N = this;
        e61 e61Var = this.c;
        e61Var.h(lPt6F);
        if (!fragment.V) {
            e61Var.a(fragment);
            fragment.H = false;
            if (fragment.a0 == null) {
                fragment.e0 = false;
            }
            if (I(fragment)) {
                this.z = true;
            }
        }
        return lPt6F;
    }

    public final void a0() {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                this.h.a = true;
                return;
            }
            F1 f1 = this.h;
            ArrayList<androidx.fragment.app.QnHx> arrayList = this.d;
            f1.a = (arrayList != null ? arrayList.size() : 0) > 0 && K(this.r);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(x51<?> x51Var, B8C b8c, Fragment fragment) {
        d32 d32Var;
        if (this.p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.p = x51Var;
        this.q = b8c;
        this.r = fragment;
        CopyOnWriteArrayList<c61> copyOnWriteArrayList = this.n;
        if (fragment != null) {
            copyOnWriteArrayList.add(new T23(fragment));
        } else if (x51Var instanceof c61) {
            copyOnWriteArrayList.add((c61) x51Var);
        }
        if (this.r != null) {
            a0();
        }
        if (x51Var instanceof iu2) {
            iu2 iu2Var = (iu2) x51Var;
            OnBackPressedDispatcher onBackPressedDispatcherE = iu2Var.e();
            this.g = onBackPressedDispatcherE;
            if (fragment != null) {
                d32Var = iu2Var;
                d32Var = fragment;
            }
            d32Var = iu2Var;
            onBackPressedDispatcherE.a(d32Var, this.h);
        }
        if (fragment != null) {
            b61 b61Var = fragment.N.H;
            HashMap<String, b61> map = b61Var.e;
            b61 b61Var2 = map.get(fragment.A);
            if (b61Var2 == null) {
                b61Var2 = new b61(b61Var.g);
                map.put(fragment.A, b61Var2);
            }
            this.H = b61Var2;
        } else if (x51Var instanceof mj5) {
            this.H = (b61) new androidx.lifecycle.LPt6Fixed(((mj5) x51Var).M(), b61.j, 0).a(b61.class);
        } else {
            this.H = new b61(false);
        }
        b61 b61Var3 = this.H;
        b61Var3.i = this.A || this.B;
        this.c.c = b61Var3;
        yy yyVar = this.p;
        if (yyVar instanceof nH) {
            androidx.activity.result.QnHx qnHxE = ((nH) yyVar).E();
            String strA = b70.a("FragmentManager:", fragment != null ? i5.b(new StringBuilder(), fragment.A, ":") : "");
            this.v = qnHxE.c(rz.a(strA, "StartActivityForResult"), new g4j(), new byN());
            this.w = qnHxE.c(rz.a(strA, "StartIntentSenderForResult"), new EQ(), new QnHx());
            this.x = qnHxE.c(rz.a(strA, "RequestPermissions"), new c5(), new CQf());
        }
    }

    public final void c(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.V) {
            fragment.V = false;
            if (fragment.G) {
                return;
            }
            this.c.a(fragment);
            if (H(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (I(fragment)) {
                this.z = true;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.F.clear();
        this.E.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((LPt6Fixed) it.next()).c.Z;
            if (viewGroup != null) {
                hashSet.add(ck32.f(viewGroup, F()));
            }
        }
        return hashSet;
    }

    public final LPt6Fixed f(Fragment fragment) {
        String str = fragment.A;
        e61 e61Var = this.c;
        LPt6Fixed lPt6 = (LPt6Fixed) ((HashMap) e61Var.b).get(str);
        if (lPt6 != null) {
            return lPt6;
        }
        LPt6Fixed lPt7 = new LPt6Fixed(this.m, e61Var, fragment);
        lPt7.m(this.p.x.getClassLoader());
        lPt7.e = this.o;
        return lPt7;
    }

    public final void g(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.V) {
            return;
        }
        fragment.V = true;
        if (fragment.G) {
            if (H(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            e61 e61Var = this.c;
            synchronized (((ArrayList) e61Var.a)) {
                ((ArrayList) e61Var.a).remove(fragment);
            }
            fragment.G = false;
            if (I(fragment)) {
                this.z = true;
            }
            X(fragment);
        }
    }

    public final void h(Configuration configuration) {
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                fragment.P.h(configuration);
            }
        }
    }

    public final boolean i() {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                if (!fragment.U ? fragment.P.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && J(fragment)) {
                if (!fragment.U ? fragment.P.j() | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        this.C = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((ck32) it.next()).e();
        }
        s(-1);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.g != null) {
            this.h.b();
            this.g = null;
        }
        g9D g9d = this.v;
        if (g9d != null) {
            g9d.Q0();
            this.w.Q0();
            this.x.Q0();
        }
    }

    public final void l() {
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.E();
            }
        }
    }

    public final void m(boolean z) {
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.F(z);
            }
        }
    }

    public final boolean n() {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                if (!fragment.U ? fragment.P.n() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o() {
        if (this.o < 1) {
            return;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && !fragment.U) {
                fragment.P.o();
            }
        }
    }

    public final void p(Fragment fragment) {
        if (fragment == null || !fragment.equals(B(fragment.A))) {
            return;
        }
        fragment.N.getClass();
        boolean zK = K(fragment);
        Boolean bool = fragment.F;
        if (bool == null || bool.booleanValue() != zK) {
            fragment.F = Boolean.valueOf(zK);
            a61 a61Var = fragment.P;
            a61Var.a0();
            a61Var.p(a61Var.s);
        }
    }

    public final void q(boolean z) {
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.G(z);
            }
        }
    }

    public final boolean r() {
        boolean z = false;
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && J(fragment) && fragment.H()) {
                z = true;
            }
        }
        return z;
    }

    public final void s(int i) {
        try {
            this.b = true;
            for (LPt6Fixed lPt6 : ((HashMap) this.c.b).values()) {
                if (lPt6 != null) {
                    lPt6.e = i;
                }
            }
            L(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((ck32) it.next()).e();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void t() {
        if (this.D) {
            this.D = false;
            Z();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.r;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.r)));
            sb.append("}");
        } else {
            x51<?> x51Var = this.p;
            if (x51Var != null) {
                sb.append(x51Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.p)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strA = rz.a(str, "    ");
        e61 e61Var = this.c;
        e61Var.getClass();
        String str2 = str + "    ";
        HashMap map = (HashMap) e61Var.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (LPt6Fixed lPt6 : map.values()) {
                printWriter.print(str);
                if (lPt6 != null) {
                    Fragment fragment = lPt6.c;
                    printWriter.println(fragment);
                    fragment.g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) e61Var.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.QnHx> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.QnHx qnHx = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(qnHx.toString());
                qnHx.f(strA, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (PRnFixed) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.z);
        }
    }

    public final void v(PRnFixed pRn, boolean z) {
        if (!z) {
            if (this.p == null) {
                if (!this.C) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.A || this.B) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.p == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.a.add(pRn);
                T();
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.p == null) {
            if (!this.C) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.p.y.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            if (this.A || this.B) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        if (this.E == null) {
            this.E = new ArrayList<>();
            this.F = new ArrayList<>();
        }
        this.b = false;
    }

    public final boolean x(boolean z) {
        boolean zA;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.QnHx> arrayList = this.E;
            ArrayList<Boolean> arrayList2 = this.F;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    int size = this.a.size();
                    zA = false;
                    for (int i = 0; i < size; i++) {
                        zA |= this.a.get(i).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.p.y.removeCallbacks(this.I);
                }
            }
            if (!zA) {
                a0();
                t();
                this.c.b();
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                Q(this.E, this.F);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
    }

    public final void y(androidx.fragment.app.QnHx qnHx, boolean z) {
        if (z && (this.p == null || this.C)) {
            return;
        }
        w(z);
        qnHx.a(this.E, this.F);
        this.b = true;
        try {
            Q(this.E, this.F);
            d();
            a0();
            t();
            this.c.b();
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    public final void z(ArrayList<androidx.fragment.app.QnHx> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        e61 e61Var;
        e61 e61Var2;
        e61 e61Var3;
        int i3;
        ArrayList<androidx.fragment.app.QnHx> arrayList3 = arrayList;
        boolean z = arrayList3.get(i).o;
        ArrayList<Fragment> arrayList4 = this.G;
        if (arrayList4 == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        ArrayList<Fragment> arrayList5 = this.G;
        e61 e61Var4 = this.c;
        arrayList5.addAll(e61Var4.g());
        Fragment fragment = this.s;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i2) {
                e61 e61Var5 = e61Var4;
                this.G.clear();
                if (!z && this.o >= 1) {
                    for (int i6 = i; i6 < i2; i6++) {
                        Iterator<Xn1.QnHx> it = arrayList.get(i6).a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().b;
                            if (fragment2 == null || fragment2.N == null) {
                                e61Var = e61Var5;
                            } else {
                                e61Var = e61Var5;
                                e61Var.h(f(fragment2));
                            }
                            e61Var5 = e61Var;
                        }
                    }
                }
                for (int i7 = i; i7 < i2; i7++) {
                    androidx.fragment.app.QnHx qnHx = arrayList.get(i7);
                    if (arrayList2.get(i7).booleanValue()) {
                        qnHx.c(-1);
                        qnHx.h();
                    } else {
                        qnHx.c(1);
                        qnHx.g();
                    }
                }
                boolean zBooleanValue = arrayList2.get(i2 - 1).booleanValue();
                for (int i8 = i; i8 < i2; i8++) {
                    androidx.fragment.app.QnHx qnHx2 = arrayList.get(i8);
                    if (zBooleanValue) {
                        for (int size = qnHx2.a.size() - 1; size >= 0; size--) {
                            Fragment fragment3 = qnHx2.a.get(size).b;
                            if (fragment3 != null) {
                                f(fragment3).k();
                            }
                        }
                    } else {
                        Iterator<Xn1.QnHx> it2 = qnHx2.a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment4 = it2.next().b;
                            if (fragment4 != null) {
                                f(fragment4).k();
                            }
                        }
                    }
                }
                L(this.o, true);
                HashSet<ck32> hashSet = new HashSet();
                for (int i9 = i; i9 < i2; i9++) {
                    Iterator<Xn1.QnHx> it3 = arrayList.get(i9).a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment5 = it3.next().b;
                        if (fragment5 != null && (viewGroup = fragment5.Z) != null) {
                            hashSet.add(ck32.f(viewGroup, F()));
                        }
                    }
                }
                for (ck32 ck32Var : hashSet) {
                    ck32Var.d = zBooleanValue;
                    ck32Var.g();
                    ck32Var.c();
                }
                for (int i10 = i; i10 < i2; i10++) {
                    androidx.fragment.app.QnHx qnHx3 = arrayList.get(i10);
                    if (arrayList2.get(i10).booleanValue() && qnHx3.r >= 0) {
                        qnHx3.r = -1;
                    }
                    qnHx3.getClass();
                }
                return;
            }
            androidx.fragment.app.QnHx qnHx4 = arrayList3.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e61Var2 = e61Var4;
                int i11 = 1;
                ArrayList<Fragment> arrayList6 = this.G;
                ArrayList<Xn1.QnHx> arrayList7 = qnHx4.a;
                int size2 = arrayList7.size() - 1;
                while (size2 >= 0) {
                    Xn1.QnHx qnHx5 = arrayList7.get(size2);
                    int i12 = qnHx5.a;
                    if (i12 != i11) {
                        if (i12 != 3) {
                            switch (i12) {
                                case 6:
                                    arrayList6.add(qnHx5.b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = qnHx5.b;
                                    break;
                                case 10:
                                    qnHx5.h = qnHx5.g;
                                    break;
                            }
                        } else {
                            arrayList6.add(qnHx5.b);
                        }
                        size2--;
                        i11 = 1;
                    }
                    arrayList6.remove(qnHx5.b);
                    size2--;
                    i11 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList8 = this.G;
                int i13 = 0;
                while (true) {
                    ArrayList<Xn1.QnHx> arrayList9 = qnHx4.a;
                    if (i13 < arrayList9.size()) {
                        Xn1.QnHx qnHx6 = arrayList9.get(i13);
                        int i14 = qnHx6.a;
                        if (i14 == i5) {
                            e61Var3 = e61Var4;
                            i3 = 1;
                            arrayList8.add(qnHx6.b);
                        } else if (i14 != 2) {
                            if (i14 == 3 || i14 == 6) {
                                arrayList8.remove(qnHx6.b);
                                Fragment fragment6 = qnHx6.b;
                                if (fragment6 == fragment) {
                                    arrayList9.add(i13, new Xn1.QnHx(9, fragment6));
                                    i13++;
                                    e61Var3 = e61Var4;
                                    i3 = 1;
                                    fragment = null;
                                }
                            } else if (i14 == 7) {
                                e61Var3 = e61Var4;
                                i3 = 1;
                                arrayList8.add(qnHx6.b);
                            } else if (i14 == 8) {
                                arrayList9.add(i13, new Xn1.QnHx(9, fragment));
                                i13++;
                                fragment = qnHx6.b;
                            }
                            e61Var3 = e61Var4;
                            i3 = 1;
                        } else {
                            Fragment fragment7 = qnHx6.b;
                            int i15 = fragment7.S;
                            int size3 = arrayList8.size() - 1;
                            boolean z3 = false;
                            while (size3 >= 0) {
                                e61 e61Var6 = e61Var4;
                                Fragment fragment8 = arrayList8.get(size3);
                                if (fragment8.S == i15) {
                                    if (fragment8 == fragment7) {
                                        z3 = true;
                                    } else {
                                        if (fragment8 == fragment) {
                                            arrayList9.add(i13, new Xn1.QnHx(9, fragment8));
                                            i13++;
                                            fragment = null;
                                        }
                                        Xn1.QnHx qnHx7 = new Xn1.QnHx(3, fragment8);
                                        qnHx7.c = qnHx6.c;
                                        qnHx7.e = qnHx6.e;
                                        qnHx7.d = qnHx6.d;
                                        qnHx7.f = qnHx6.f;
                                        arrayList9.add(i13, qnHx7);
                                        arrayList8.remove(fragment8);
                                        i13++;
                                        fragment = fragment;
                                    }
                                }
                                size3--;
                                e61Var4 = e61Var6;
                            }
                            e61Var3 = e61Var4;
                            i3 = 1;
                            if (z3) {
                                arrayList9.remove(i13);
                                i13--;
                            } else {
                                qnHx6.a = 1;
                                arrayList8.add(fragment7);
                            }
                        }
                        i13 += i3;
                        e61Var4 = e61Var3;
                        i5 = 1;
                    } else {
                        e61Var2 = e61Var4;
                    }
                }
            }
            z2 = z2 || qnHx4.g;
            i4++;
            arrayList3 = arrayList;
            e61Var4 = e61Var2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class FJCM implements Parcelable {
        public static final Parcelable.Creator<FJCM> CREATOR = new QnHx();
        public final String w;
        public final int x;

        public class QnHx implements Parcelable.Creator<FJCM> {
            @Override // android.os.Parcelable.Creator
            public final FJCM createFromParcel(Parcel parcel) {
                return new FJCM(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FJCM[] newArray(int i) {
                return new FJCM[i];
            }
        }

        public FJCM(String str, int i) {
            this.w = str;
            this.x = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
        }

        public FJCM(Parcel parcel) {
            this.w = parcel.readString();
            this.x = parcel.readInt();
        }
    }
}
