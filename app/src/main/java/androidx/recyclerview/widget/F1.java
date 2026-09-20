package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class F1 implements Runnable {
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ FJCM x;

    public F1(FJCM fjcm, ArrayList arrayList) {
        this.x = fjcm;
        this.w = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.w;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FJCM fjcm = this.x;
            if (!zHasNext) {
                arrayList.clear();
                fjcm.m.remove(arrayList);
                return;
            }
            FJCM.CQf cQf = (FJCM.CQf) it.next();
            RecyclerView.qc qcVar = cQf.a;
            fjcm.getClass();
            View view = qcVar.a;
            int i = cQf.d - cQf.b;
            int i2 = cQf.e - cQf.c;
            if (i != 0) {
                view.animate().translationX(0.0f);
            }
            if (i2 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            fjcm.p.add(qcVar);
            viewPropertyAnimatorAnimate.setDuration(fjcm.e).setListener(new T23(fjcm, qcVar, i, view, i2, viewPropertyAnimatorAnimate)).start();
        }
    }
}
