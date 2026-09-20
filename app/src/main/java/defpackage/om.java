package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class om extends qm {
    public final /* synthetic */ nn5 x;
    public final /* synthetic */ String y = "offline_ping_sender_work";

    public om(nn5 nn5Var) {
        this.x = nn5Var;
    }

    @Override // defpackage.qm
    public final void b() {
        nn5 nn5Var = this.x;
        WorkDatabase workDatabase = nn5Var.y;
        workDatabase.c();
        try {
            Iterator it = ((CQf) workDatabase.n()).h(this.y).iterator();
            while (it.hasNext()) {
                qm.a(nn5Var, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            k54.a(nn5Var.x, nn5Var.y, nn5Var.A);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
