package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed implements Runnable {
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ FJCM x;

    public NUlFixed(FJCM fjcm, ArrayList arrayList) {
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
                fjcm.l.remove(arrayList);
                return;
            }
            RecyclerView.qc qcVar = (RecyclerView.qc) it.next();
            fjcm.getClass();
            View view = qcVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            fjcm.o.add(qcVar);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(fjcm.c).setListener(new auxFixed(view, viewPropertyAnimatorAnimate, fjcm, qcVar)).start();
        }
    }
}
