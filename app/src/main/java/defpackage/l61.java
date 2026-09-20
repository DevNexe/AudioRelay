package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class l61 extends j61 {

    public class CQf extends ga5 {
        public final /* synthetic */ Object A;
        public final /* synthetic */ ArrayList B;
        public final /* synthetic */ Object w;
        public final /* synthetic */ ArrayList x;
        public final /* synthetic */ Object y;
        public final /* synthetic */ ArrayList z;

        public CQf(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.w = obj;
            this.x = arrayList;
            this.y = obj2;
            this.z = arrayList2;
            this.A = obj3;
            this.B = arrayList3;
        }

        @Override // u95.LPt8Fixed
        public final void a(u95 u95Var) {
            u95Var.E(this);
        }

        @Override // defpackage.ga5, u95.LPt8Fixed
        public final void c(u95 u95Var) {
            l61 l61Var = l61.this;
            Object obj = this.w;
            if (obj != null) {
                l61Var.u(obj, this.x, null);
            }
            Object obj2 = this.y;
            if (obj2 != null) {
                l61Var.u(obj2, this.z, null);
            }
            Object obj3 = this.A;
            if (obj3 != null) {
                l61Var.u(obj3, this.B, null);
            }
        }
    }

    public class F1 extends u95.F1 {
    }

    public class QnHx implements u95.LPt8Fixed {
        public final /* synthetic */ View w;
        public final /* synthetic */ ArrayList x;

        public QnHx(View view, ArrayList arrayList) {
            this.w = view;
            this.x = arrayList;
        }

        @Override // u95.LPt8Fixed
        public final void a(u95 u95Var) {
            u95Var.E(this);
            this.w.setVisibility(8);
            ArrayList arrayList = this.x;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // u95.LPt8Fixed
        public final void b() {
        }

        @Override // u95.LPt8Fixed
        public final void c(u95 u95Var) {
            u95Var.E(this);
            u95Var.a(this);
        }

        @Override // u95.LPt8Fixed
        public final void d() {
        }

        @Override // u95.LPt8Fixed
        public final void e() {
        }
    }

    @Override // defpackage.j61
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((u95) obj).c(view);
        }
    }

    @Override // defpackage.j61
    public final void b(Object obj, ArrayList<View> arrayList) {
        u95 u95Var = (u95) obj;
        if (u95Var == null) {
            return;
        }
        int i = 0;
        if (u95Var instanceof ia5) {
            ia5 ia5Var = (ia5) u95Var;
            int size = ia5Var.T.size();
            while (i < size) {
                b((i < 0 || i >= ia5Var.T.size()) ? null : ia5Var.T.get(i), arrayList);
                i++;
            }
            return;
        }
        if (((j61.h(u95Var.A) && j61.h(null) && j61.h(null)) ? false : true) || !j61.h(u95Var.B)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            u95Var.c(arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.j61
    public final void c(ViewGroup viewGroup, Object obj) {
        u95 u95Var = (u95) obj;
        ArrayList<ViewGroup> arrayList = ha5.c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        Field field = bi5.a;
        if (bi5.auxFixed.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (u95Var == null) {
                u95Var = ha5.a;
            }
            u95 u95VarO = u95Var.clone();
            ArrayList<u95> orDefault = ha5.a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<u95> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().D(viewGroup);
                }
            }
            if (u95VarO != null) {
                u95VarO.l(viewGroup, true);
            }
            if (((x44) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (u95VarO != null) {
                ha5.QnHx qnHx = new ha5.QnHx(viewGroup, u95VarO);
                viewGroup.addOnAttachStateChangeListener(qnHx);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(qnHx);
            }
        }
    }

    @Override // defpackage.j61
    public final boolean e(Object obj) {
        return obj instanceof u95;
    }

    @Override // defpackage.j61
    public final Object f(Object obj) {
        if (obj != null) {
            return ((u95) obj).clone();
        }
        return null;
    }

    @Override // defpackage.j61
    public final Object i(Object obj, Object obj2, Object obj3) {
        u95 u95Var = (u95) obj;
        u95 u95Var2 = (u95) obj2;
        u95 u95Var3 = (u95) obj3;
        if (u95Var != null && u95Var2 != null) {
            ia5 ia5Var = new ia5();
            ia5Var.Q(u95Var);
            ia5Var.Q(u95Var2);
            ia5Var.U = false;
            u95Var = ia5Var;
        } else if (u95Var == null) {
            u95Var = u95Var2 != null ? u95Var2 : null;
        }
        if (u95Var3 == null) {
            return u95Var;
        }
        ia5 ia5Var2 = new ia5();
        if (u95Var != null) {
            ia5Var2.Q(u95Var);
        }
        ia5Var2.Q(u95Var3);
        return ia5Var2;
    }

    @Override // defpackage.j61
    public final Object j(Object obj, Object obj2, Object obj3) {
        ia5 ia5Var = new ia5();
        if (obj != null) {
            ia5Var.Q((u95) obj);
        }
        if (obj2 != null) {
            ia5Var.Q((u95) obj2);
        }
        if (obj3 != null) {
            ia5Var.Q((u95) obj3);
        }
        return ia5Var;
    }

    @Override // defpackage.j61
    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((u95) obj).a(new QnHx(view, arrayList));
    }

    @Override // defpackage.j61
    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((u95) obj).a(new CQf(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.j61
    public final void n(View view, Object obj) {
        if (view != null) {
            j61.g(view, new Rect());
            ((u95) obj).J(new k61());
        }
    }

    @Override // defpackage.j61
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((u95) obj).J(new F1());
        }
    }

    @Override // defpackage.j61
    public final void p(Object obj, bn bnVar, Runnable runnable) {
        u95 u95Var = (u95) obj;
        bnVar.b(new m61(u95Var));
        u95Var.a(new n61(runnable));
    }

    @Override // defpackage.j61
    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        ia5 ia5Var = (ia5) obj;
        ArrayList<View> arrayList2 = ia5Var.B;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j61.d(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(ia5Var, arrayList);
    }

    @Override // defpackage.j61
    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        ia5 ia5Var = (ia5) obj;
        if (ia5Var != null) {
            ArrayList<View> arrayList3 = ia5Var.B;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(ia5Var, arrayList, arrayList2);
        }
    }

    @Override // defpackage.j61
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        ia5 ia5Var = new ia5();
        ia5Var.Q((u95) obj);
        return ia5Var;
    }

    public final void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        u95 u95Var = (u95) obj;
        int i = 0;
        if (u95Var instanceof ia5) {
            ia5 ia5Var = (ia5) u95Var;
            int size = ia5Var.T.size();
            while (i < size) {
                u((i < 0 || i >= ia5Var.T.size()) ? null : ia5Var.T.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if ((j61.h(u95Var.A) && j61.h(null) && j61.h(null)) ? false : true) {
            return;
        }
        ArrayList<View> arrayList3 = u95Var.B;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            u95Var.c(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                u95Var.F(arrayList.get(size3));
            }
        }
    }
}
