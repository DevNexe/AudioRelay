package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.UT;
import defpackage.ZJ;
import defpackage.d_OZ;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WE extends d_OZ {
    public final RecyclerView d;
    public final QnHx e;

    public static class QnHx extends d_OZ {
        public final WE d;
        public final WeakHashMap e = new WeakHashMap();

        public QnHx(WE we) {
            this.d = we;
        }

        @Override // defpackage.d_OZ
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            d_OZ d_oz = (d_OZ) this.e.get(view);
            return d_oz != null ? d_oz.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // defpackage.d_OZ
        public final ZJ b(View view) {
            d_OZ d_oz = (d_OZ) this.e.get(view);
            return d_oz != null ? d_oz.b(view) : super.b(view);
        }

        @Override // defpackage.d_OZ
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            d_OZ d_oz = (d_OZ) this.e.get(view);
            if (d_oz != null) {
                d_oz.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // defpackage.d_OZ
        public final void d(View view, UT ut) {
            WE we = this.d;
            RecyclerView recyclerView = we.d;
            boolean z = !recyclerView.N || recyclerView.U || recyclerView.z.g();
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            if (!z) {
                RecyclerView recyclerView2 = we.d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().P(view, ut);
                    d_OZ d_oz = (d_OZ) this.e.get(view);
                    if (d_oz != null) {
                        d_oz.d(view, ut);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // defpackage.d_OZ
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            d_OZ d_oz = (d_OZ) this.e.get(view);
            if (d_oz != null) {
                d_oz.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // defpackage.d_OZ
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            d_OZ d_oz = (d_OZ) this.e.get(viewGroup);
            return d_oz != null ? d_oz.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.d_OZ
        public final boolean g(View view, int i, Bundle bundle) {
            WE we = this.d;
            RecyclerView recyclerView = we.d;
            if (!(!recyclerView.N || recyclerView.U || recyclerView.z.g())) {
                RecyclerView recyclerView2 = we.d;
                if (recyclerView2.getLayoutManager() != null) {
                    d_OZ d_oz = (d_OZ) this.e.get(view);
                    if (d_oz != null) {
                        if (d_oz.g(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i, bundle)) {
                        return true;
                    }
                    RecyclerView.ta taVar = recyclerView2.getLayoutManager().b.x;
                    return false;
                }
            }
            return super.g(view, i, bundle);
        }

        @Override // defpackage.d_OZ
        public final void h(View view, int i) {
            d_OZ d_oz = (d_OZ) this.e.get(view);
            if (d_oz != null) {
                d_oz.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // defpackage.d_OZ
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            d_OZ d_oz = (d_OZ) this.e.get(view);
            if (d_oz != null) {
                d_oz.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public WE(RecyclerView recyclerView) {
        this.d = recyclerView;
        QnHx qnHx = this.e;
        if (qnHx != null) {
            this.e = qnHx;
        } else {
            this.e = new QnHx(this);
        }
    }

    @Override // defpackage.d_OZ
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.d;
            if (!recyclerView.N || recyclerView.U || recyclerView.z.g()) {
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) view;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().O(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.d_OZ
    public final void d(View view, UT ut) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if ((!recyclerView.N || recyclerView.U || recyclerView.z.g()) || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.PRnFixed layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        RecyclerView.ta taVar = recyclerView2.x;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            ut.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            ut.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        RecyclerView.Aa aa = recyclerView2.y0;
        ut.j(UT.CQf.a(layoutManager.F(taVar, aa), layoutManager.x(taVar, aa), 0));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[PHI: r0
  0x0090: PHI (r0v10 int) = (r0v6 int), (r0v14 int) binds: [B:34:0x0081, B:27:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.d_OZ
    public final boolean g(View view, int i, Bundle bundle) {
        int iC;
        int iA;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if ((!recyclerView.N || recyclerView.U || recyclerView.z.g()) || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.PRnFixed layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        RecyclerView.ta taVar = recyclerView2.x;
        if (i == 4096) {
            iC = recyclerView2.canScrollVertically(1) ? (layoutManager.o - layoutManager.C()) - layoutManager.z() : 0;
            if (layoutManager.b.canScrollHorizontally(1)) {
                iA = (layoutManager.n - layoutManager.A()) - layoutManager.B();
            } else {
                iA = 0;
            }
        } else if (i != 8192) {
            iA = 0;
            iC = 0;
        } else {
            iC = recyclerView2.canScrollVertically(-1) ? -((layoutManager.o - layoutManager.C()) - layoutManager.z()) : 0;
            if (layoutManager.b.canScrollHorizontally(-1)) {
                iA = -((layoutManager.n - layoutManager.A()) - layoutManager.B());
            } else {
                iA = 0;
            }
        }
        if (iC == 0 && iA == 0) {
            return false;
        }
        layoutManager.b.Z(iA, iC, true);
        return true;
    }
}
