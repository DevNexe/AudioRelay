package defpackage;

import androidx.work.CQf;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class tn5 implements Runnable {
    public final /* synthetic */ UUID w;
    public final /* synthetic */ CQf x;
    public final /* synthetic */ pg4 y;
    public final /* synthetic */ un5 z;

    public tn5(un5 un5Var, UUID uuid, CQf cQf, pg4 pg4Var) {
        this.z = un5Var;
        this.w = uuid;
        this.x = cQf;
        this.y = pg4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg4 pg4Var = this.y;
        UUID uuid = this.w;
        String string = uuid.toString();
        s52 s52VarC = s52.c();
        String str = un5.c;
        CQf cQf = this.x;
        s52VarC.a(str, String.format("Updating progress for %s (%s)", uuid, cQf), new Throwable[0]);
        un5 un5Var = this.z;
        WorkDatabase workDatabase = un5Var.a;
        WorkDatabase workDatabase2 = un5Var.a;
        workDatabase.c();
        try {
            WorkSpec workSpecI = ((androidx.work.impl.model.CQf) workDatabase2.n()).i(string);
            if (workSpecI == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (workSpecI.b == kn5.RUNNING) {
                WorkProgress workProgress = new WorkProgress(string, cQf);
                sn5 sn5Var = (sn5) workDatabase2.m();
                at3 at3Var = sn5Var.a;
                at3Var.b();
                at3Var.c();
                try {
                    sn5Var.b.e(workProgress);
                    at3Var.h();
                    at3Var.f();
                } catch (Throwable th) {
                    at3Var.f();
                    throw th;
                }
            } else {
                s52.c().f(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            pg4Var.i(null);
            workDatabase2.h();
        } catch (Throwable th2) {
            try {
                s52.c().b(un5.c, "Error updating Worker progress", th2);
                pg4Var.j(th2);
            } finally {
                workDatabase2.f();
            }
        }
    }
}
