package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed implements Runnable {
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ FJCM x;

    public LPt8Fixed(FJCM fjcm, ArrayList arrayList) {
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
                fjcm.n.remove(arrayList);
                return;
            }
            FJCM.QnHx qnHx = (FJCM.QnHx) it.next();
            fjcm.getClass();
            RecyclerView.qc qcVar = qnHx.a;
            View view = qcVar == null ? null : qcVar.a;
            RecyclerView.qc qcVar2 = qnHx.b;
            View view2 = qcVar2 != null ? qcVar2.a : null;
            ArrayList<RecyclerView.qc> arrayList2 = fjcm.r;
            long j = fjcm.f;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j);
                arrayList2.add(qnHx.a);
                duration.translationX(qnHx.e - qnHx.c);
                duration.translationY(qnHx.f - qnHx.d);
                duration.alpha(0.0f).setListener(new byN(fjcm, qnHx, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(qnHx.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new EQ(fjcm, qnHx, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
