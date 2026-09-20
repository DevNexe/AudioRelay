package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik5 extends u95 {
    public static final String[] U = {"android:visibility:visibility", "android:visibility:parent"};
    public int T = 3;

    public static class CQf {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public static class QnHx extends AnimatorListenerAdapter implements u95.LPt8Fixed {
        public boolean A;
        public final View w;
        public final int x;
        public final ViewGroup y;
        public boolean B = false;
        public final boolean z = true;

        public QnHx(View view, int i) {
            this.w = view;
            this.x = i;
            this.y = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // u95.LPt8Fixed
        public final void a(u95 u95Var) {
            if (!this.B) {
                wj5.a.D(this.w, this.x);
                ViewGroup viewGroup = this.y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            u95Var.E(this);
        }

        @Override // u95.LPt8Fixed
        public final void b() {
            f(false);
        }

        @Override // u95.LPt8Fixed
        public final void c(u95 u95Var) {
        }

        @Override // u95.LPt8Fixed
        public final void d() {
        }

        @Override // u95.LPt8Fixed
        public final void e() {
            f(true);
        }

        public final void f(boolean z) {
            ViewGroup viewGroup;
            if (!this.z || this.A == z || (viewGroup = this.y) == null) {
                return;
            }
            this.A = z;
            bj5.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.B = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.B) {
                wj5.a.D(this.w, this.x);
                ViewGroup viewGroup = this.y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.B) {
                return;
            }
            wj5.a.D(this.w, this.x);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.B) {
                return;
            }
            wj5.a.D(this.w, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static CQf R(la5 la5Var, la5 la5Var2) {
        CQf cQf = new CQf();
        cQf.a = false;
        cQf.b = false;
        if (la5Var != null) {
            HashMap map = la5Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                cQf.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                cQf.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                cQf.c = -1;
                cQf.e = null;
            }
        } else {
            cQf.c = -1;
            cQf.e = null;
        }
        if (la5Var2 != null) {
            HashMap map2 = la5Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                cQf.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                cQf.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                cQf.d = -1;
                cQf.f = null;
            }
        } else {
            cQf.d = -1;
            cQf.f = null;
        }
        if (la5Var != null && la5Var2 != null) {
            int i = cQf.c;
            int i2 = cQf.d;
            if (i == i2 && cQf.e == cQf.f) {
                return cQf;
            }
            if (i != i2) {
                if (i == 0) {
                    cQf.b = false;
                    cQf.a = true;
                } else if (i2 == 0) {
                    cQf.b = true;
                    cQf.a = true;
                }
            } else if (cQf.f == null) {
                cQf.b = false;
                cQf.a = true;
            } else if (cQf.e == null) {
                cQf.b = true;
                cQf.a = true;
            }
        } else if (la5Var == null && cQf.d == 0) {
            cQf.b = true;
            cQf.a = true;
        } else if (la5Var2 == null && cQf.c == 0) {
            cQf.b = false;
            cQf.a = true;
        }
        return cQf;
    }

    @Override // defpackage.u95
    public final boolean A(la5 la5Var, la5 la5Var2) {
        if (la5Var == null && la5Var2 == null) {
            return false;
        }
        if (la5Var != null && la5Var2 != null && la5Var2.a.containsKey("android:visibility:visibility") != la5Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        CQf cQfR = R(la5Var, la5Var2);
        if (cQfR.a) {
            return cQfR.c == 0 || cQfR.d == 0;
        }
        return false;
    }

    public final void Q(la5 la5Var) {
        View view = la5Var.b;
        int visibility = view.getVisibility();
        HashMap map = la5Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    @Override // defpackage.u95
    public final void h(la5 la5Var) {
        Q(la5Var);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x021d  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (R(t(r3, false), x(r3, false)).a != false) goto L30;
     */
    @Override // defpackage.u95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator p(android.view.ViewGroup r22, defpackage.la5 r23, defpackage.la5 r24) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik5.p(android.view.ViewGroup, la5, la5):android.animation.Animator");
    }

    @Override // defpackage.u95
    public final String[] w() {
        return U;
    }
}
