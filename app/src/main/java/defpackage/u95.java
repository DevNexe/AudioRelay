package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u95 implements Cloneable {
    public static final int[] Q = {2, 1, 3, 4};
    public static final QnHx R = new QnHx();
    public static final ThreadLocal<Bt7j<Animator, CQf>> S = new ThreadLocal<>();
    public ArrayList<la5> G;
    public ArrayList<la5> H;
    public F1 O;
    public final String w = getClass().getName();
    public long x = -1;
    public long y = -1;
    public TimeInterpolator z = null;
    public final ArrayList<Integer> A = new ArrayList<>();
    public final ArrayList<View> B = new ArrayList<>();
    public ma5 C = new ma5();
    public ma5 D = new ma5();
    public ia5 E = null;
    public final int[] F = Q;
    public final ArrayList<Animator> I = new ArrayList<>();
    public int J = 0;
    public boolean K = false;
    public boolean L = false;
    public ArrayList<LPt8Fixed> M = null;
    public ArrayList<Animator> N = new ArrayList<>();
    public B8C P = R;

    public static class CQf {
        public final View a;
        public final String b;
        public final la5 c;
        public final gm5 d;
        public final u95 e;

        public CQf(View view, String str, u95 u95Var, fm5 fm5Var, la5 la5Var) {
            this.a = view;
            this.b = str;
            this.c = la5Var;
            this.d = fm5Var;
            this.e = u95Var;
        }
    }

    public static abstract class F1 {
    }

    public interface LPt8Fixed {
        void a(u95 u95Var);

        void b();

        void c(u95 u95Var);

        void d();

        void e();
    }

    public class QnHx extends B8C {
        @Override // defpackage.B8C
        public final Path A0(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static boolean C(la5 la5Var, la5 la5Var2, String str) {
        Object obj = la5Var.a.get(str);
        Object obj2 = la5Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(ma5 ma5Var, View view, la5 la5Var) {
        ((Bt7j) ma5Var.w).put(view, la5Var);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) ma5Var.y;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = bi5.a;
        String strK = bi5.byN.k(view);
        if (strK != null) {
            Bt7j bt7j = (Bt7j) ma5Var.x;
            if (bt7j.containsKey(strK)) {
                bt7j.put(strK, null);
            } else {
                bt7j.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                q62 q62Var = (q62) ma5Var.z;
                if (q62Var.w) {
                    q62Var.h();
                }
                if (o70.d(q62Var.x, q62Var.z, itemIdAtPosition) < 0) {
                    bi5.LPt8Fixed.r(view, true);
                    q62Var.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) q62Var.i(itemIdAtPosition, null);
                if (view2 != null) {
                    bi5.LPt8Fixed.r(view2, false);
                    q62Var.j(itemIdAtPosition, null);
                }
            }
        }
    }

    public static Bt7j<Animator, CQf> u() {
        ThreadLocal<Bt7j<Animator, CQf>> threadLocal = S;
        Bt7j<Animator, CQf> bt7j = threadLocal.get();
        if (bt7j != null) {
            return bt7j;
        }
        Bt7j<Animator, CQf> bt7j2 = new Bt7j<>();
        threadLocal.set(bt7j2);
        return bt7j2;
    }

    public boolean A(la5 la5Var, la5 la5Var2) {
        if (la5Var == null || la5Var2 == null) {
            return false;
        }
        String[] strArrW = w();
        if (strArrW == null) {
            Iterator it = la5Var.a.keySet().iterator();
            while (it.hasNext()) {
                if (C(la5Var, la5Var2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrW) {
            if (!C(la5Var, la5Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean B(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.A;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.B;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void D(View view) {
        if (this.L) {
            return;
        }
        ArrayList<Animator> arrayList = this.I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).pause();
        }
        ArrayList<LPt8Fixed> arrayList2 = this.M;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.M.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((LPt8Fixed) arrayList3.get(i)).b();
            }
        }
        this.K = true;
    }

    public void E(LPt8Fixed lPt8) {
        ArrayList<LPt8Fixed> arrayList = this.M;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(lPt8);
        if (this.M.size() == 0) {
            this.M = null;
        }
    }

    public void F(View view) {
        this.B.remove(view);
    }

    public void G(ViewGroup viewGroup) {
        if (this.K) {
            if (!this.L) {
                ArrayList<Animator> arrayList = this.I;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        arrayList.get(size).resume();
                    }
                }
                ArrayList<LPt8Fixed> arrayList2 = this.M;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.M.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((LPt8Fixed) arrayList3.get(i)).e();
                    }
                }
            }
            this.K = false;
        }
    }

    public void H() {
        O();
        Bt7j<Animator, CQf> bt7jU = u();
        for (Animator animator : this.N) {
            if (bt7jU.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new r95(this, bt7jU));
                    long j = this.y;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.x;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.z;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new s95(this));
                    animator.start();
                }
            }
        }
        this.N.clear();
        r();
    }

    public void I(long j) {
        this.y = j;
    }

    public void J(F1 f1) {
        this.O = f1;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.z = timeInterpolator;
    }

    public void L(B8C b8c) {
        if (b8c == null) {
            this.P = R;
        } else {
            this.P = b8c;
        }
    }

    public void M() {
    }

    public void N(long j) {
        this.x = j;
    }

    public final void O() {
        if (this.J == 0) {
            ArrayList<LPt8Fixed> arrayList = this.M;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.M.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((LPt8Fixed) arrayList2.get(i)).c(this);
                }
            }
            this.L = false;
        }
        this.J++;
    }

    public String P(String str) {
        StringBuilder sbG = Md5A.g(str);
        sbG.append(getClass().getSimpleName());
        sbG.append("@");
        sbG.append(Integer.toHexString(hashCode()));
        sbG.append(": ");
        String string = sbG.toString();
        if (this.y != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("dur(");
            string = hc2.a(sb, this.y, ") ");
        }
        if (this.x != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("dly(");
            string = hc2.a(sb2, this.x, ") ");
        }
        if (this.z != null) {
            string = string + "interp(" + this.z + ") ";
        }
        ArrayList<Integer> arrayList = this.A;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.B;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strA = rz.a(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strA = rz.a(strA, ", ");
                }
                StringBuilder sbG2 = Md5A.g(strA);
                sbG2.append(arrayList.get(i));
                strA = sbG2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strA = rz.a(strA, ", ");
                }
                StringBuilder sbG3 = Md5A.g(strA);
                sbG3.append(arrayList2.get(i2));
                strA = sbG3.toString();
            }
        }
        return rz.a(strA, ")");
    }

    public void a(LPt8Fixed lPt8) {
        if (this.M == null) {
            this.M = new ArrayList<>();
        }
        this.M.add(lPt8);
    }

    public void c(View view) {
        this.B.add(view);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.I;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                arrayList.get(size).cancel();
            }
        }
        ArrayList<LPt8Fixed> arrayList2 = this.M;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.M.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((LPt8Fixed) arrayList3.get(i)).d();
        }
    }

    public abstract void h(la5 la5Var);

    public final void i(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            la5 la5Var = new la5(view);
            if (z) {
                k(la5Var);
            } else {
                h(la5Var);
            }
            la5Var.c.add(this);
            j(la5Var);
            if (z) {
                d(this.C, view, la5Var);
            } else {
                d(this.D, view, la5Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void j(la5 la5Var) {
    }

    public abstract void k(la5 la5Var);

    public final void l(ViewGroup viewGroup, boolean z) {
        n(z);
        ArrayList<Integer> arrayList = this.A;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.B;
        if (size <= 0 && arrayList2.size() <= 0) {
            i(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                la5 la5Var = new la5(viewFindViewById);
                if (z) {
                    k(la5Var);
                } else {
                    h(la5Var);
                }
                la5Var.c.add(this);
                j(la5Var);
                if (z) {
                    d(this.C, viewFindViewById, la5Var);
                } else {
                    d(this.D, viewFindViewById, la5Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            la5 la5Var2 = new la5(view);
            if (z) {
                k(la5Var2);
            } else {
                h(la5Var2);
            }
            la5Var2.c.add(this);
            j(la5Var2);
            if (z) {
                d(this.C, view, la5Var2);
            } else {
                d(this.D, view, la5Var2);
            }
        }
    }

    public final void n(boolean z) {
        if (z) {
            ((Bt7j) this.C.w).clear();
            ((SparseArray) this.C.y).clear();
            ((q62) this.C.z).c();
        } else {
            ((Bt7j) this.D.w).clear();
            ((SparseArray) this.D.y).clear();
            ((q62) this.D.z).c();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: o */
    public u95 clone() {
        try {
            u95 u95Var = (u95) super.clone();
            u95Var.N = new ArrayList<>();
            u95Var.C = new ma5();
            u95Var.D = new ma5();
            u95Var.G = null;
            u95Var.H = null;
            return u95Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, la5 la5Var, la5 la5Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    public void q(ViewGroup viewGroup, ma5 ma5Var, ma5 ma5Var2, ArrayList<la5> arrayList, ArrayList<la5> arrayList2) {
        Animator animatorP;
        View view;
        Animator animator;
        la5 la5Var;
        Animator animator2;
        la5 la5Var2;
        Bt7j<Animator, CQf> bt7jU = u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            la5 la5Var3 = arrayList.get(i);
            la5 la5Var4 = arrayList2.get(i);
            if (la5Var3 != null && !la5Var3.c.contains(this)) {
                la5Var3 = null;
            }
            if (la5Var4 != null && !la5Var4.c.contains(this)) {
                la5Var4 = null;
            }
            if (la5Var3 != null || la5Var4 != null) {
                if ((la5Var3 == null || la5Var4 == null || A(la5Var3, la5Var4)) && (animatorP = p(viewGroup, la5Var3, la5Var4)) != null) {
                    if (la5Var4 != null) {
                        String[] strArrW = w();
                        view = la5Var4.b;
                        if (strArrW != null && strArrW.length > 0) {
                            la5Var2 = new la5(view);
                            la5 la5Var5 = (la5) ((Bt7j) ma5Var2.w).getOrDefault(view, null);
                            if (la5Var5 != null) {
                                int i2 = 0;
                                while (i2 < strArrW.length) {
                                    HashMap map = la5Var2.a;
                                    Animator animator3 = animatorP;
                                    String str = strArrW[i2];
                                    map.put(str, la5Var5.a.get(str));
                                    i2++;
                                    animatorP = animator3;
                                    strArrW = strArrW;
                                }
                            }
                            Animator animator4 = animatorP;
                            int i3 = bt7jU.y;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    animator2 = animator4;
                                    break;
                                }
                                CQf orDefault = bt7jU.getOrDefault(bt7jU.i(i4), null);
                                if (orDefault.c != null && orDefault.a == view && orDefault.b.equals(this.w) && orDefault.c.equals(la5Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator2 = animatorP;
                            la5Var2 = null;
                        }
                        animator = animator2;
                        la5Var = la5Var2;
                    } else {
                        view = la5Var3.b;
                        animator = animatorP;
                        la5Var = null;
                    }
                    if (animator != null) {
                        String str2 = this.w;
                        ak5 ak5Var = wj5.a;
                        bt7jU.put(animator, new CQf(view, str2, this, new fm5(viewGroup), la5Var));
                        this.N.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.N.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE));
            }
        }
    }

    public final void r() {
        int i = this.J - 1;
        this.J = i;
        if (i != 0) {
            return;
        }
        ArrayList<LPt8Fixed> arrayList = this.M;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.M.clone();
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((LPt8Fixed) arrayList2.get(i2)).a(this);
            }
        }
        int i3 = 0;
        while (true) {
            q62 q62Var = (q62) this.C.z;
            if (q62Var.w) {
                q62Var.h();
            }
            if (i3 >= q62Var.z) {
                break;
            }
            View view = (View) ((q62) this.C.z).k(i3);
            if (view != null) {
                Field field = bi5.a;
                bi5.LPt8Fixed.r(view, false);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            q62 q62Var2 = (q62) this.D.z;
            if (q62Var2.w) {
                q62Var2.h();
            }
            if (i4 >= q62Var2.z) {
                this.L = true;
                return;
            }
            View view2 = (View) ((q62) this.D.z).k(i4);
            if (view2 != null) {
                Field field2 = bi5.a;
                bi5.LPt8Fixed.r(view2, false);
            }
            i4++;
        }
    }

    public final la5 t(View view, boolean z) {
        ia5 ia5Var = this.E;
        if (ia5Var != null) {
            return ia5Var.t(view, z);
        }
        ArrayList<la5> arrayList = z ? this.G : this.H;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            la5 la5Var = arrayList.get(i);
            if (la5Var == null) {
                return null;
            }
            if (la5Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.H : this.G).get(i);
        }
        return null;
    }

    public final String toString() {
        return P("");
    }

    public String[] w() {
        return null;
    }

    public final la5 x(View view, boolean z) {
        ia5 ia5Var = this.E;
        if (ia5Var != null) {
            return ia5Var.x(view, z);
        }
        return (la5) ((Bt7j) (z ? this.C : this.D).w).getOrDefault(view, null);
    }
}
