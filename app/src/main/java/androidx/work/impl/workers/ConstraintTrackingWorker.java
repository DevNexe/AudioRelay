package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.WorkSpec;
import defpackage.Xn1;
import defpackage.bn5;
import defpackage.c15;
import defpackage.cn5;
import defpackage.d70;
import defpackage.j42;
import defpackage.nn5;
import defpackage.pg4;
import defpackage.s52;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements bn5 {
    public static final String G = s52.e("ConstraintTrkngWrkr");
    public final WorkerParameters B;
    public final Object C;
    public volatile boolean D;
    public final pg4<ListenableWorker.QnHx> E;
    public ListenableWorker F;

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.getInputData().a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj instanceof String ? (String) obj : null;
            if (TextUtils.isEmpty(str)) {
                s52.c().b(ConstraintTrackingWorker.G, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.E.i(new ListenableWorker.QnHx.C0031QnHx());
                return;
            }
            ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.B);
            constraintTrackingWorker.F = listenableWorkerA;
            if (listenableWorkerA == null) {
                s52.c().a(ConstraintTrackingWorker.G, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.E.i(new ListenableWorker.QnHx.C0031QnHx());
                return;
            }
            WorkSpec workSpecI = ((CQf) nn5.W0(constraintTrackingWorker.getApplicationContext()).y.n()).i(constraintTrackingWorker.getId().toString());
            if (workSpecI == null) {
                constraintTrackingWorker.E.i(new ListenableWorker.QnHx.C0031QnHx());
                return;
            }
            cn5 cn5Var = new cn5(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            cn5Var.b(Collections.singletonList(workSpecI));
            if (!cn5Var.a(constraintTrackingWorker.getId().toString())) {
                s52.c().a(ConstraintTrackingWorker.G, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
                constraintTrackingWorker.E.i(new ListenableWorker.QnHx.CQf());
                return;
            }
            s52.c().a(ConstraintTrackingWorker.G, String.format("Constraints met for delegate %s", str), new Throwable[0]);
            try {
                j42<ListenableWorker.QnHx> j42VarStartWork = constraintTrackingWorker.F.startWork();
                ((Xn1) j42VarStartWork).b(new d70(constraintTrackingWorker, j42VarStartWork), constraintTrackingWorker.getBackgroundExecutor());
            } catch (Throwable th) {
                s52 s52VarC = s52.c();
                String str2 = ConstraintTrackingWorker.G;
                s52VarC.a(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
                synchronized (constraintTrackingWorker.C) {
                    if (constraintTrackingWorker.D) {
                        s52.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.E.i(new ListenableWorker.QnHx.CQf());
                    } else {
                        constraintTrackingWorker.E.i(new ListenableWorker.QnHx.C0031QnHx());
                    }
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.B = workerParameters;
        this.C = new Object();
        this.D = false;
        this.E = new pg4<>();
    }

    @Override // defpackage.bn5
    public final void e(ArrayList arrayList) {
        s52.c().a(G, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.C) {
            this.D = true;
        }
    }

    @Override // defpackage.bn5
    public final void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public final c15 getTaskExecutor() {
        return nn5.W0(getApplicationContext()).z;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.F;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.F;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.F.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final j42<ListenableWorker.QnHx> startWork() {
        getBackgroundExecutor().execute(new QnHx());
        return this.E;
    }
}
