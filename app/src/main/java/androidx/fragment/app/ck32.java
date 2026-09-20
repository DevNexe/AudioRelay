package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;
import defpackage.a83;
import defpackage.bi5;
import defpackage.bn;
import defpackage.yq4;
import defpackage.zq4;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck32 {
    public final ViewGroup a;
    public final ArrayList<CQf> b = new ArrayList<>();
    public final ArrayList<CQf> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    public static class CQf {
        public int a;
        public int b;
        public final Fragment c;
        public final ArrayList d = new ArrayList();
        public final HashSet<bn> e = new HashSet<>();
        public boolean f = false;
        public boolean g = false;

        public CQf(int i, int i2, Fragment fragment, bn bnVar) {
            this.a = i;
            this.b = i2;
            this.c = fragment;
            bnVar.b(new SjP(this));
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            HashSet<bn> hashSet = this.e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((bn) it.next()).a();
            }
        }

        public void b() {
            if (this.g) {
                return;
            }
            if (RBi.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(int i, int i2) {
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            Fragment fragment = this.c;
            if (i3 == 0) {
                if (this.a != 1) {
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + a83.d(this.a) + " -> " + a83.d(i) + ". ");
                    }
                    this.a = i;
                    return;
                }
                return;
            }
            if (i3 == 1) {
                if (this.a == 1) {
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + yq4.a(this.b) + " to ADDING.");
                    }
                    this.a = 2;
                    this.b = 2;
                    return;
                }
                return;
            }
            if (i3 != 2) {
                return;
            }
            if (RBi.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + a83.d(this.a) + " -> REMOVED. mLifecycleImpact  = " + yq4.a(this.b) + " to REMOVING.");
            }
            this.a = 1;
            this.b = 3;
        }

        public void d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + a83.d(this.a) + "} {mLifecycleImpact = " + yq4.a(this.b) + "} {mFragment = " + this.c + "}";
        }
    }

    public static class QnHx extends CQf {
        public final LPt6Fixed h;

        public QnHx(int i, int i2, LPt6Fixed lPt6, bn bnVar) {
            super(i, i2, lPt6.c, bnVar);
            this.h = lPt6;
        }

        @Override // androidx.fragment.app.ck32.CQf
        public final void b() {
            super.b();
            this.h.k();
        }

        @Override // androidx.fragment.app.ck32.CQf
        public final void d() {
            if (this.b == 2) {
                LPt6Fixed lPt6 = this.h;
                Fragment fragment = lPt6.c;
                View viewFindFocus = fragment.a0.findFocus();
                if (viewFindFocus != null) {
                    fragment.h().m = viewFindFocus;
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                View viewJ = this.c.J();
                if (viewJ.getParent() == null) {
                    lPt6.b();
                    viewJ.setAlpha(0.0f);
                }
                if (viewJ.getAlpha() == 0.0f && viewJ.getVisibility() == 0) {
                    viewJ.setVisibility(4);
                }
                Fragment.CQf cQf = fragment.d0;
                viewJ.setAlpha(cQf == null ? 1.0f : cQf.l);
            }
        }
    }

    public ck32(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static ck32 f(ViewGroup viewGroup, zq4 zq4Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof ck32) {
            return (ck32) tag;
        }
        ((RBi.YKK) zq4Var).getClass();
        FJCM fjcm = new FJCM(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fjcm);
        return fjcm;
    }

    public final void a(int i, int i2, LPt6Fixed lPt6) {
        synchronized (this.b) {
            bn bnVar = new bn();
            CQf cQfD = d(lPt6.c);
            if (cQfD != null) {
                cQfD.c(i, i2);
                return;
            }
            QnHx qnHx = new QnHx(i, i2, lPt6, bnVar);
            this.b.add(qnHx);
            qnHx.d.add(new LPt9Fixed(this, qnHx));
            qnHx.d.add(new lPt3Fixed(this, qnHx));
        }
    }

    public abstract void b(boolean z, ArrayList arrayList);

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        Field field = bi5.a;
        if (!bi5.auxFixed.b(viewGroup)) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList<CQf> arrayList = new ArrayList(this.c);
                this.c.clear();
                for (CQf cQf : arrayList) {
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cQf);
                    }
                    cQf.a();
                    if (!cQf.g) {
                        this.c.add(cQf);
                    }
                }
                h();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((CQf) it.next()).d();
                }
                b(this.d, arrayList2);
                this.d = false;
            }
        }
    }

    public final CQf d(Fragment fragment) {
        for (CQf cQf : this.b) {
            if (cQf.c.equals(fragment) && !cQf.f) {
                return cQf;
            }
        }
        return null;
    }

    public final void e() {
        ViewGroup viewGroup = this.a;
        Field field = bi5.a;
        boolean zB = bi5.auxFixed.b(viewGroup);
        synchronized (this.b) {
            h();
            Iterator<CQf> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            for (CQf cQf : new ArrayList(this.c)) {
                if (RBi.H(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zB ? "" : "Container " + this.a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(cQf);
                    Log.v("FragmentManager", sb.toString());
                }
                cQf.a();
            }
            for (CQf cQf2 : new ArrayList(this.b)) {
                if (RBi.H(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zB ? "" : "Container " + this.a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(cQf2);
                    Log.v("FragmentManager", sb2.toString());
                }
                cQf2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.b) {
            h();
            this.e = false;
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                CQf cQf = this.b.get(size);
                int iC = a83.c(cQf.c.a0);
                if (cQf.a == 2 && iC != 2) {
                    cQf.c.getClass();
                    this.e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        for (CQf cQf : this.b) {
            if (cQf.b == 2) {
                cQf.c(a83.b(cQf.c.J().getVisibility()), 1);
            }
        }
    }
}
