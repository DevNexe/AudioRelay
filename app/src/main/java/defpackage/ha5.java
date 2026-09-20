package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ha5 {
    public static final i2 a = new i2();
    public static final ThreadLocal<WeakReference<Bt7j<ViewGroup, ArrayList<u95>>>> b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static class QnHx implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public final u95 w;
        public final ViewGroup x;

        /* JADX INFO: renamed from: ha5$QnHx$QnHx, reason: collision with other inner class name */
        public class C0137QnHx extends ga5 {
            public final /* synthetic */ Bt7j w;

            public C0137QnHx(Bt7j bt7j) {
                this.w = bt7j;
            }

            @Override // u95.LPt8Fixed
            public final void a(u95 u95Var) {
                ((ArrayList) this.w.getOrDefault(QnHx.this.x, null)).remove(u95Var);
                u95Var.E(this);
            }
        }

        public QnHx(ViewGroup viewGroup, u95 u95Var) {
            this.w = u95Var;
            this.x = viewGroup;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0202  */
        /* JADX WARN: Code duplicated, block: B:105:0x0215  */
        /* JADX WARN: Code duplicated, block: B:107:0x0223  */
        /* JADX WARN: Code duplicated, block: B:111:0x0241  */
        /* JADX WARN: Code duplicated, block: B:143:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:148:0x01ee A[EDGE_INSN: B:148:0x01ee->B:95:0x01ee BREAK  A[LOOP:1: B:19:0x0087->B:94:0x01e4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:186:0x020d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:189:0x022e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x008c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0090  */
        /* JADX WARN: Code duplicated, block: B:25:0x0093  */
        /* JADX WARN: Code duplicated, block: B:27:0x0096  */
        /* JADX WARN: Code duplicated, block: B:30:0x009c  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:52:0x0108  */
        /* JADX WARN: Code duplicated, block: B:54:0x0118  */
        /* JADX WARN: Code duplicated, block: B:67:0x015c  */
        /* JADX WARN: Code duplicated, block: B:69:0x016a  */
        /* JADX WARN: Code duplicated, block: B:82:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:85:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            u95 u95Var;
            ma5 ma5Var;
            ma5 ma5Var2;
            Bt7j bt7j;
            Bt7j bt7j2;
            int i;
            int[] iArr;
            u95 u95Var2;
            int i2;
            int i3;
            Bt7j<Animator, u95.CQf> bt7jU;
            int i4;
            Animator animatorI;
            u95.CQf orDefault;
            View view;
            la5 la5Var;
            la5 la5Var2;
            int i5;
            u95 u95Var3;
            int i6;
            View view2;
            la5 la5Var3;
            Bt7j bt7j3;
            int i7;
            int i8;
            View view3;
            View view4;
            SparseArray sparseArray;
            int size;
            int i9;
            View view5;
            View view6;
            q62 q62Var;
            int i10;
            int i11;
            View view7;
            u95 u95Var4;
            Iterator it;
            ViewGroup viewGroup = this.x;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            int i12 = 1;
            if (!ha5.c.remove(viewGroup)) {
                return true;
            }
            Bt7j<ViewGroup, ArrayList<u95>> bt7jA = ha5.a();
            Long l = null;
            ArrayList<u95> orDefault2 = bt7jA.getOrDefault(viewGroup, null);
            if (orDefault2 != null) {
                arrayList = orDefault2.size() > 0 ? new ArrayList(orDefault2) : null;
                u95Var = this.w;
                orDefault2.add(u95Var);
                u95Var.a(new C0137QnHx(bt7jA));
                u95Var.l(viewGroup, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((u95) it.next()).G(viewGroup);
                    }
                }
                u95Var.G = new ArrayList<>();
                u95Var.H = new ArrayList<>();
                ma5Var = u95Var.C;
                ma5Var2 = u95Var.D;
                bt7j = new Bt7j((Bt7j) ma5Var.w);
                bt7j2 = new Bt7j((Bt7j) ma5Var2.w);
                i = 0;
                while (true) {
                    iArr = u95Var.F;
                    if (i < iArr.length) {
                        break;
                    }
                    i5 = iArr[i];
                    if (i5 != i12) {
                        u95Var3 = u95Var;
                        i6 = bt7j.y;
                        while (true) {
                            i6--;
                            if (i6 >= 0) {
                                view2 = (View) bt7j.i(i6);
                                if (view2 == null && u95Var3.B(view2) && (la5Var3 = (la5) bt7j2.remove(view2)) != null && u95Var3.B(la5Var3.b)) {
                                    u95Var3.G.add((la5) bt7j.j(i6));
                                    u95Var3.H.add(la5Var3);
                                }
                            }
                        }
                    } else if (i5 != 2) {
                        u95Var3 = u95Var;
                        bt7j3 = (Bt7j) ma5Var.x;
                        Bt7j bt7j4 = (Bt7j) ma5Var2.x;
                        i7 = bt7j3.y;
                        for (i8 = 0; i8 < i7; i8++) {
                            view3 = (View) bt7j3.k(i8);
                            if (view3 == null && u95Var3.B(view3) && (view4 = (View) bt7j4.getOrDefault(bt7j3.i(i8), null)) != null && u95Var3.B(view4)) {
                                la5 la5Var4 = (la5) bt7j.getOrDefault(view3, null);
                                la5 la5Var5 = (la5) bt7j2.getOrDefault(view4, null);
                                if (la5Var4 != null && la5Var5 != null) {
                                    u95Var3.G.add(la5Var4);
                                    u95Var3.H.add(la5Var5);
                                    bt7j.remove(view3);
                                    bt7j2.remove(view4);
                                }
                            }
                        }
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            q62Var = (q62) ma5Var.z;
                            q62 q62Var2 = (q62) ma5Var2.z;
                            if (q62Var.w) {
                                q62Var.h();
                            }
                            i10 = q62Var.z;
                            i11 = 0;
                            while (i11 < i10) {
                                view7 = (View) q62Var.k(i11);
                                if (view7 == null && u95Var.B(view7)) {
                                    if (q62Var.w) {
                                        q62Var.h();
                                    }
                                    View view8 = (View) q62Var2.i(q62Var.x[i11], l);
                                    u95Var4 = u95Var;
                                    if (view8 != null && u95Var4.B(view8)) {
                                        la5 la5Var6 = (la5) bt7j.getOrDefault(view7, l);
                                        la5 la5Var7 = (la5) bt7j2.getOrDefault(view8, l);
                                        if (la5Var6 != null && la5Var7 != null) {
                                            u95Var4.G.add(la5Var6);
                                            u95Var4.H.add(la5Var7);
                                            bt7j.remove(view7);
                                            bt7j2.remove(view8);
                                        }
                                    }
                                } else {
                                    u95Var4 = u95Var;
                                }
                                i11++;
                                u95Var = u95Var4;
                                l = null;
                            }
                        }
                        u95Var3 = u95Var;
                    } else {
                        u95Var3 = u95Var;
                        sparseArray = (SparseArray) ma5Var.y;
                        SparseArray sparseArray2 = (SparseArray) ma5Var2.y;
                        size = sparseArray.size();
                        for (i9 = 0; i9 < size; i9++) {
                            view5 = (View) sparseArray.valueAt(i9);
                            if (view5 == null && u95Var3.B(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i9))) != null && u95Var3.B(view6)) {
                                la5 la5Var8 = (la5) bt7j.getOrDefault(view5, null);
                                la5 la5Var9 = (la5) bt7j2.getOrDefault(view6, null);
                                if (la5Var8 != null && la5Var9 != null) {
                                    u95Var3.G.add(la5Var8);
                                    u95Var3.H.add(la5Var9);
                                    bt7j.remove(view5);
                                    bt7j2.remove(view6);
                                }
                            }
                        }
                    }
                    i++;
                    u95Var = u95Var3;
                    l = null;
                    i12 = 1;
                }
                u95Var2 = u95Var;
                for (i2 = 0; i2 < bt7j.y; i2++) {
                    la5Var2 = (la5) bt7j.k(i2);
                    if (u95Var2.B(la5Var2.b)) {
                        u95Var2.G.add(la5Var2);
                        u95Var2.H.add(null);
                    }
                }
                for (i3 = 0; i3 < bt7j2.y; i3++) {
                    la5Var = (la5) bt7j2.k(i3);
                    if (u95Var2.B(la5Var.b)) {
                        u95Var2.H.add(la5Var);
                        u95Var2.G.add(null);
                    }
                }
                bt7jU = u95.u();
                int i13 = bt7jU.y;
                ak5 ak5Var = wj5.a;
                WindowId windowId = viewGroup.getWindowId();
                for (i4 = i13 - 1; i4 >= 0; i4--) {
                    animatorI = bt7jU.i(i4);
                    if (animatorI == null && (orDefault = bt7jU.getOrDefault(animatorI, null)) != null && (view = orDefault.a) != null) {
                        gm5 gm5Var = orDefault.d;
                        if ((gm5Var instanceof fm5) && ((fm5) gm5Var).a.equals(windowId)) {
                            la5 la5VarX = u95Var2.x(view, true);
                            la5 la5VarT = u95Var2.t(view, true);
                            if (la5VarX == null && la5VarT == null) {
                                la5VarT = (la5) ((Bt7j) u95Var2.D.w).getOrDefault(view, null);
                            }
                            if (!(la5VarX == null && la5VarT == null) && orDefault.e.A(orDefault.c, la5VarT)) {
                                if (animatorI.isRunning() || animatorI.isStarted()) {
                                    animatorI.cancel();
                                } else {
                                    bt7jU.remove(animatorI);
                                }
                            }
                        }
                    }
                }
                u95Var2.q(viewGroup, u95Var2.C, u95Var2.D, u95Var2.G, u95Var2.H);
                u95Var2.H();
                return true;
            }
            orDefault2 = new ArrayList<>();
            bt7jA.put(viewGroup, orDefault2);
            u95Var = this.w;
            orDefault2.add(u95Var);
            u95Var.a(new C0137QnHx(bt7jA));
            u95Var.l(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u95) it.next()).G(viewGroup);
                }
            }
            u95Var.G = new ArrayList<>();
            u95Var.H = new ArrayList<>();
            ma5Var = u95Var.C;
            ma5Var2 = u95Var.D;
            bt7j = new Bt7j((Bt7j) ma5Var.w);
            bt7j2 = new Bt7j((Bt7j) ma5Var2.w);
            i = 0;
            while (true) {
                iArr = u95Var.F;
                if (i < iArr.length) {
                    break;
                    break;
                }
                i5 = iArr[i];
                if (i5 != i12) {
                    u95Var3 = u95Var;
                    i6 = bt7j.y;
                    while (true) {
                        i6--;
                        if (i6 >= 0) {
                            view2 = (View) bt7j.i(i6);
                            if (view2 == null) {
                            }
                        }
                    }
                } else if (i5 != 2) {
                    u95Var3 = u95Var;
                    bt7j3 = (Bt7j) ma5Var.x;
                    Bt7j bt7j5 = (Bt7j) ma5Var2.x;
                    i7 = bt7j3.y;
                    while (i8 < i7) {
                        view3 = (View) bt7j3.k(i8);
                        if (view3 == null) {
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        q62Var = (q62) ma5Var.z;
                        q62 q62Var3 = (q62) ma5Var2.z;
                        if (q62Var.w) {
                            q62Var.h();
                        }
                        i10 = q62Var.z;
                        i11 = 0;
                        while (i11 < i10) {
                            view7 = (View) q62Var.k(i11);
                            if (view7 == null) {
                                u95Var4 = u95Var;
                            } else {
                                u95Var4 = u95Var;
                            }
                            i11++;
                            u95Var = u95Var4;
                            l = null;
                        }
                    }
                    u95Var3 = u95Var;
                } else {
                    u95Var3 = u95Var;
                    sparseArray = (SparseArray) ma5Var.y;
                    SparseArray sparseArray3 = (SparseArray) ma5Var2.y;
                    size = sparseArray.size();
                    while (i9 < size) {
                        view5 = (View) sparseArray.valueAt(i9);
                        if (view5 == null) {
                        }
                    }
                }
                i++;
                u95Var = u95Var3;
                l = null;
                i12 = 1;
            }
            u95Var2 = u95Var;
            while (i2 < bt7j.y) {
                la5Var2 = (la5) bt7j.k(i2);
                if (u95Var2.B(la5Var2.b)) {
                    u95Var2.G.add(la5Var2);
                    u95Var2.H.add(null);
                }
            }
            while (i3 < bt7j2.y) {
                la5Var = (la5) bt7j2.k(i3);
                if (u95Var2.B(la5Var.b)) {
                    u95Var2.H.add(la5Var);
                    u95Var2.G.add(null);
                }
            }
            bt7jU = u95.u();
            int i14 = bt7jU.y;
            ak5 ak5Var2 = wj5.a;
            WindowId windowId2 = viewGroup.getWindowId();
            while (i4 >= 0) {
                animatorI = bt7jU.i(i4);
                if (animatorI == null) {
                }
            }
            u95Var2.q(viewGroup, u95Var2.C, u95Var2.D, u95Var2.G, u95Var2.H);
            u95Var2.H();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.x;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ha5.c.remove(viewGroup);
            ArrayList<u95> orDefault = ha5.a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<u95> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().G(viewGroup);
                }
            }
            this.w.n(true);
        }
    }

    public static Bt7j<ViewGroup, ArrayList<u95>> a() {
        Bt7j<ViewGroup, ArrayList<u95>> bt7j;
        ThreadLocal<WeakReference<Bt7j<ViewGroup, ArrayList<u95>>>> threadLocal = b;
        WeakReference<Bt7j<ViewGroup, ArrayList<u95>>> weakReference = threadLocal.get();
        if (weakReference != null && (bt7j = weakReference.get()) != null) {
            return bt7j;
        }
        Bt7j<ViewGroup, ArrayList<u95>> bt7j2 = new Bt7j<>();
        threadLocal.set(new WeakReference<>(bt7j2));
        return bt7j2;
    }
}
