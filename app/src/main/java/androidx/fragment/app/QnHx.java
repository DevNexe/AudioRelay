package androidx.fragment.app;

import android.util.Log;
import defpackage.r52;
import defpackage.x51;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx extends Xn1 implements RBi.PRnFixed {
    public final RBi p;
    public boolean q;
    public int r;

    public QnHx(RBi rBi) {
        rBi.E();
        x51<?> x51Var = rBi.p;
        if (x51Var != null) {
            x51Var.x.getClassLoader();
        }
        this.r = -1;
        this.p = rBi;
    }

    @Override // androidx.fragment.app.RBi.PRnFixed
    public final boolean a(ArrayList<QnHx> arrayList, ArrayList<Boolean> arrayList2) {
        if (RBi.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        RBi rBi = this.p;
        if (rBi.d == null) {
            rBi.d = new ArrayList<>();
        }
        rBi.d.add(this);
        return true;
    }

    public final void c(int i) {
        if (this.g) {
            if (RBi.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<Xn1.QnHx> arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Xn1.QnHx qnHx = arrayList.get(i2);
                Fragment fragment = qnHx.b;
                if (fragment != null) {
                    fragment.M += i;
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + qnHx.b + " to " + qnHx.b.M);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.q) {
            throw new IllegalStateException("commit already called");
        }
        if (RBi.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new r52());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        RBi rBi = this.p;
        if (z2) {
            this.r = rBi.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        rBi.v(this, z);
        return this.r;
    }

    public final void e(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.T;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.T + " now " + str);
            }
            fragment.T = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.R;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.R + " now " + i);
            }
            fragment.R = i;
            fragment.S = i;
        }
        b(new Xn1.QnHx(i2, fragment));
        fragment.N = this.p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList<Xn1.QnHx> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Xn1.QnHx qnHx = arrayList.get(i);
            switch (qnHx.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + qnHx.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(qnHx.b);
            if (z) {
                if (qnHx.c != 0 || qnHx.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(qnHx.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(qnHx.d));
                }
                if (qnHx.e != 0 || qnHx.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(qnHx.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(qnHx.f));
                }
            }
        }
    }

    public final void g() {
        ArrayList<Xn1.QnHx> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Xn1.QnHx qnHx = arrayList.get(i);
            Fragment fragment = qnHx.b;
            if (fragment != null) {
                if (fragment.d0 != null) {
                    fragment.h().a = false;
                }
                int i2 = this.f;
                if (fragment.d0 != null || i2 != 0) {
                    fragment.h();
                    fragment.d0.f = i2;
                }
                ArrayList<String> arrayList2 = this.m;
                ArrayList<String> arrayList3 = this.n;
                fragment.h();
                Fragment.CQf cQf = fragment.d0;
                cQf.g = arrayList2;
                cQf.h = arrayList3;
            }
            int i3 = qnHx.a;
            RBi rBi = this.p;
            switch (i3) {
                case 1:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.U(fragment, false);
                    rBi.a(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + qnHx.a);
                case 3:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.P(fragment);
                    break;
                case 4:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.G(fragment);
                    break;
                case 5:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.U(fragment, false);
                    RBi.Y(fragment);
                    break;
                case 6:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.g(fragment);
                    break;
                case 7:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.U(fragment, false);
                    rBi.c(fragment);
                    break;
                case 8:
                    rBi.W(fragment);
                    break;
                case 9:
                    rBi.W(null);
                    break;
                case 10:
                    rBi.V(fragment, qnHx.h);
                    break;
            }
        }
    }

    public final void h() {
        ArrayList<Xn1.QnHx> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Xn1.QnHx qnHx = arrayList.get(size);
            Fragment fragment = qnHx.b;
            if (fragment != null) {
                if (fragment.d0 != null) {
                    fragment.h().a = true;
                }
                int i = this.f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (fragment.d0 != null || i2 != 0) {
                    fragment.h();
                    fragment.d0.f = i2;
                }
                ArrayList<String> arrayList2 = this.n;
                ArrayList<String> arrayList3 = this.m;
                fragment.h();
                Fragment.CQf cQf = fragment.d0;
                cQf.g = arrayList2;
                cQf.h = arrayList3;
            }
            int i3 = qnHx.a;
            RBi rBi = this.p;
            switch (i3) {
                case 1:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.U(fragment, true);
                    rBi.P(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + qnHx.a);
                case 3:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.a(fragment);
                    break;
                case 4:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.getClass();
                    RBi.Y(fragment);
                    break;
                case 5:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.U(fragment, true);
                    rBi.G(fragment);
                    break;
                case 6:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.c(fragment);
                    break;
                case 7:
                    fragment.K(qnHx.c, qnHx.d, qnHx.e, qnHx.f);
                    rBi.U(fragment, true);
                    rBi.g(fragment);
                    break;
                case 8:
                    rBi.W(null);
                    break;
                case 9:
                    rBi.W(fragment);
                    break;
                case 10:
                    rBi.V(fragment, qnHx.g);
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
